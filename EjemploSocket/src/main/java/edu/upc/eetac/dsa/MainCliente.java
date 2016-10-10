package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 06/10/2016.
 */

import java.io.IOException;

public class MainCliente {

    public static void main(String[] args) throws IOException{

        Cliente cliente = new Cliente();//Creamos el cliente

        System.out.println("Iniciando cliente\n");
        cliente.startClient();
    }
}
