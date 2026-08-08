package org.btuk.network.lib.socket;

import lombok.extern.java.Log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Log
public class InputSocket {

    private final int port;

    private ServerSocket serverSocket;
    private ExecutorService acceptExecutor;
    private ExecutorService workerExecutor;

    public InputSocket(int port) {
        this.port = port;
    }

    public void start(SocketHandler handler) {
        workerExecutor = Executors.newCachedThreadPool();
        acceptExecutor = Executors.newSingleThreadExecutor();
        acceptExecutor.submit(() -> {
            try {
                serverSocket = new ServerSocket(port);
                while (!serverSocket.isClosed()) {
                    Socket socket = serverSocket.accept();
                    workerExecutor.submit(new AbstractSocketHandler(socket, handler));
                }
            } catch (IOException ex) {
                if (serverSocket == null || !serverSocket.isClosed()) {
                    log.severe("InputSocket error on port " + port + ": " + ex.getMessage());
                }
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
        if (workerExecutor != null) {
            workerExecutor.shutdown();
            try {
                if (!workerExecutor.awaitTermination(5, TimeUnit.SECONDS)) {
                    workerExecutor.shutdownNow();
                }
            } catch (InterruptedException e) {
                workerExecutor.shutdownNow();
            }
        }
    }
}
