package org.sick.tcp.connector.server;

import java.net.*;
import java.io.*;

public class TcpServer {


    public static final int SERVER_PORT = 2008;

    public void run() {
        try (final ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            while (true) {
                System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");

                Socket server = serverSocket.accept();
                System.out.println("Just connected to " + server.getRemoteSocketAddress());

                BufferedReader fromClient =
                        new BufferedReader(
                                new InputStreamReader(server.getInputStream()));
                String line = fromClient.readLine();
                System.out.println("Server received: " + line);
//                toClient.println("Thank you for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("server closed");
    }

    public static void main(String[] args) {
        TcpServer srv = new TcpServer();
        srv.run();
    }
}
