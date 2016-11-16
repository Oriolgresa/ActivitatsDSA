package edu.upc.eetac.dsa;

import java.io.*;
import java.net.Socket;
import java.util.List;

/**
 * Created by OriolGresa on 10/11/16.
 */
public class ThreadServidor extends Thread {
    Socket cs;
    List<Socket> listaSockets;
    protected DataOutputStream salidaCliente;
    BufferedReader entrada;
    String mensajeCliente;
    int cliente1;

    public ThreadServidor (Socket cs, List<Socket> listaSockets){
        this.cs=cs;
        this.listaSockets=listaSockets;
    }
    private int cliente () {
        for (int i = 0; i < listaSockets.size(); i++) {
            if (cs == listaSockets.get(i)) {
                cliente1 = i+1;
            }
        }
        return cliente1;
    }
    public void run() {
        try {
            entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                int cliente;
                int a=1;
                mensajeCliente= entrada.readLine();
                for(int i=0;i<listaSockets.size();i++) {
                        cliente = cliente();
                    if (cs == listaSockets.get(i)) {
                        continue;
                    }
                        String st = Integer.toString(cliente);
                        salidaCliente = new DataOutputStream(listaSockets.get(i).getOutputStream());
                        salidaCliente.writeUTF("Cliente " + st + ": " + mensajeCliente);
                        if(a==1){
                            System.out.println("Cliente " + st + ": " + mensajeCliente);
                            a++;}
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
