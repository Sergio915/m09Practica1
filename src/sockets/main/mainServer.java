package sockets.main;

import java.io.IOException;
import sockets.servidor.Servidor;
public class mainServer {

    public static void main(String[] args) throws IOException
    {
        Servidor serv = new Servidor(); //Se crea el sockets.servidor.servidor

        System.out.println("Iniciando sockets.servidor.servidor\n");
        serv.startServer(); //Se inicia el sockets.servidor.servidor
    }
}
