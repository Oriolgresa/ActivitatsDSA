package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 06/10/2016.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {
    private final int PUERTO = 1234; //Puerto para la conexión
    private final String HOST = "localhost"; //Host para la conexión
    protected String mensajeServidor;
    protected ServerSocket ss; //Socket del servidor
    protected Socket cs; //Socket del cliente
    protected DataOutputStream salidaSevidor, salidaCliente;
    protected DataInputStream entradaServidor;

    //Contructor
    public Conexion(String tipo) throws IOException{

        if(tipo.equalsIgnoreCase("servidor")){
            ss = new ServerSocket((PUERTO));
            cs = new Socket();
        }
        else{
            cs = new Socket(HOST, PUERTO);
        }
    }
}
