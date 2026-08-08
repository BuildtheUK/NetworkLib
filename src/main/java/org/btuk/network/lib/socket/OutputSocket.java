package org.btuk.network.lib.socket;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;

import org.btuk.network.lib.dto.AbstractTransferObject;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

@Log
public class OutputSocket {

    private final String ip;

    private final int port;

    public OutputSocket(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public boolean sendSocketMessage(AbstractTransferObject transferObject) {
        try (
                Socket socket = new Socket(ip, port);
                OutputStream output = socket.getOutputStream()
        ) {

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(output, transferObject);
            output.flush();

        } catch (IOException ex) {
            log.warning("Could not broadcast message to server socket!");
            return false;
        }
        return true;
    }
}
