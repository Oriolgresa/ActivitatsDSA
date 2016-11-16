package edu.upc.eetac.dsa;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by OriolGresa on 10/11/16.
 */
public class Servidor {
    private int puerto=1234;
    ServerSocket ss=new ServerSocket(puerto);
    Socket cs=null;
    DataOutputStream salidaCliente;
    List<Socket> listaSockets=new ArrayList<Socket>();
    public int numClientes=0;

    public Servidor() throws IOException {
    }

    public void startServer() throws IOException {
        System.out.println("Esperando conexiones...");
        while (true) {
            numClientes++;
            cs = ss.accept(); //compienza el socket
            if(numClientes==1)
                System.out.println("Nuevo cliente. "+numClientes+ " cliente conectado!");
            else
                System.out.println("Nuevo cliente. "+numClientes+ " clientes conectados!");
            listaSockets.add(cs);
            ThreadServidor th1 = new ThreadServidor(cs, listaSockets);

            th1.start();
        }
    }
}
