package edu.upc.eetac.dsa;

import java.io.DataInputStream;
import java.net.Socket;

/**
 * Created by OriolGresa on 10/11/16.
 */
public class LecturaCliente extends Thread {

    DataInputStream entradaCliente;
    Socket cs;
    String mensaje;

    public LecturaCliente(Socket cs) {

        this.cs = cs;
    }


    public void run() { //se leen mensajes del servidor y se muestran por pantalla

        while (true) {
            try {
                entradaCliente = new DataInputStream((cs.getInputStream()));
                mensaje = entradaCliente.readUTF();
                System.out.println(mensaje);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
