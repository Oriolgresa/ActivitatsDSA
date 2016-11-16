package edu.upc.eetac.dsa;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by OriolGresa on 10/11/16.
 */
public class Cliente {
    private final int PUERTO=1234;
    private final String HOST="localhost";
    public Socket cs; //socket cliente




    public void startClient() throws IOException {
        cs= new Socket(HOST, PUERTO);
        LecturaCliente threadlectura =new LecturaCliente(cs);
        EscrituraCliente threadescritura = new EscrituraCliente(cs);
        threadlectura.start();
        threadescritura.start();
    }

}
