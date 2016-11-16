package edu.upc.eetac.dsa;

import java.io.IOException;

/**
 * Created by OriolGresa on 10/11/16.
 */
public class MainClient {
    public static void main(String[] args) throws IOException {
        Cliente client = new Cliente();
        System.out.println("Iniciando cliente.\n\nEscribe aquí:");
        client.startClient();
    }
}
