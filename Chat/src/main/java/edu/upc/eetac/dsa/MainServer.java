package edu.upc.eetac.dsa;

import java.io.IOException;

/**
 * Created by OriolGresa on 10/11/16.
 */
public class MainServer {
    public static void main(String[] args) throws IOException {
        Servidor server = new Servidor();
        System.out.println("Iniciando el servidor\n");
        server.startServer();
    }
}