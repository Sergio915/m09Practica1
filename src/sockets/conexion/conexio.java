package sockets.conexion;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class conexio {
    private final int PUERTO = 1234; //Puerto para la conexión
    private final String HOST = "localhost"; //Host para la conexión
    protected String mensajeServidor; //Mensajes entrantes (recibidos) en el sockets.servidor.servidor
    protected ServerSocket ss; //Socket del sockets.servidor.servidor
    protected Socket cs; //Socket del cliente
    protected DataOutputStream salidaServidor, salidaCliente; //Flujo de datos de salida

    public conexio(String tipo) throws IOException //Constructor
    {
        if(tipo.equalsIgnoreCase("sockets.servidor.servidor"))
        {
            ss = new ServerSocket(PUERTO);//Se crea el socket para el sockets.servidor.servidor en puerto 1234
            cs = new Socket(); //Socket para el cliente
        }
        else
        {
            cs = new Socket(HOST, PUERTO); //Socket para el cliente en localhost en puerto 1234
        }
    }
}

