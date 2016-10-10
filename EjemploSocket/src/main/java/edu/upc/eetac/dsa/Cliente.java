package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 06/10/2016.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

//El cliente obtiene el flujo de salida de datos hacia el Servidor con el metodo
//getOutputStream y lo usa para enviarle un par de mensaje con el método writeUTF()
//finalmente cierra la conexión con close()
//para enviar más mensajes hay que cambiar el for (i<100)

public class Cliente extends Conexion {

    public String frase = new String();
    public Scanner scan = new Scanner(System.in);
    public String respuesta = "";


    public Cliente() throws IOException{
        super("cliente");
    }

    public void startClient(){

        try {
        //Flujo de datos hacia el servidor
        salidaSevidor = new DataOutputStream(cs.getOutputStream());
        entradaServidor = new DataInputStream(cs.getInputStream());

        //Se escribe en el servidor usando su flujo de datos

     /*   for(i=0;i<10;i++) {*/
            System.out.print("Escriba aquí: ");
            this.frase = scan.nextLine();
            salidaSevidor.writeUTF(frase + "\n");

            //Leemos la respuesta del servidor y la escribimos por pantalla
            respuesta = entradaServidor.readUTF();
            System.out.println(respuesta);
       // }
        cs.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
