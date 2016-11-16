package edu.upc.eetac.dsa;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by OriolGresa on 10/11/16.
 */
public class EscrituraCliente extends Thread {
    Socket cs;
    public EscrituraCliente (Socket cs){
        this.cs=cs;
    }
    protected DataOutputStream salidaCliente;
    String mensaje;
    Scanner scanner = new Scanner(System.in);

    public void run() { //se escriben mensajes y se envian al servidor
        while (true) {
            try {
                salidaCliente = new DataOutputStream(cs.getOutputStream());
                mensaje = scanner.nextLine();
                salidaCliente.writeBytes(mensaje + "\n"); //envío mensaje al servidor
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
