package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class pongServer {
    public static void main(String[] args) throws IOException{
        if (args.length != 1) {
            System.err.println("Usage: java EchoServer ");
        }
        int portNumber = 1234;
        try (

                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
        ) {
            while (true) {
                thread thread = new thread(clientSocket);
                thread.start();
            }
        }
    }
}

