package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 06/10/2016.
 */

import java.io.IOException;

public class MainServidor {

    public static void main(String[] args) throws IOException{

        Servidor servidor = new Servidor();

        System.out.println("Iniciando servidor\n");
        servidor.startServer();
    }
}
