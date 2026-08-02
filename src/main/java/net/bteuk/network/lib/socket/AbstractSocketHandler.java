package net.bteuk.network.lib.socket;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.bteuk.network.lib.dto.AbstractTransferObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class AbstractSocketHandler implements Runnable {

    private final Socket clientSocket;

    private final SocketHandler handler;

    public AbstractSocketHandler(Socket clientSocket, SocketHandler handler) {
        this.clientSocket = clientSocket;
        this.handler = handler;
    }

    public void run() {
        try (
                InputStream input = clientSocket.getInputStream();
        ) {

            ObjectMapper mapper = new ObjectMapper();
            AbstractTransferObject object = mapper.readValue(input, AbstractTransferObject.class);

            // Handle the different objects.
            handler.handle(object);

            // Close the socket;
            clientSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
