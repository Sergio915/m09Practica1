package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class thread extends Thread implements Runnable{

    Socket socket;
    public thread(Socket clientSocket){
        this.socket = socket;
    }
    @Override
    public void run(){

        try (
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.println("Pong responde " + inputLine);

            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + socket.getLocalPort() + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
    }

