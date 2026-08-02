package org.btuk.network.lib.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class InputSocket {

    private final int port;

    private ServerSocket serverSocket;
    private ExecutorService executorService;

    public InputSocket(int port) {
        this.port = port;
    }

    public void start(SocketHandler handler) {
        executorService = Executors.newCachedThreadPool();
        CompletableFuture.runAsync(() -> {
            try {
                serverSocket = new ServerSocket(port);
                while (!serverSocket.isClosed()) {
                    Socket socket = serverSocket.accept();
                    executorService.submit(new AbstractSocketHandler(socket, handler));
                }
            } catch (IOException ex) {
                //if (serverSocket == null) Proxy.getInstance().getLogger().warn("Could not bind port to socket!");
            }
        });
    }

    public void close() {
        if (serverSocket != null && !serverSocket.isClosed()) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                // Ignored, the server is closing anyway.
            }
        }
        if (executorService != null) {
            executorService.shutdown();
            try {
                if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException e) {
                executorService.shutdownNow();
            }
        }
    }
}
