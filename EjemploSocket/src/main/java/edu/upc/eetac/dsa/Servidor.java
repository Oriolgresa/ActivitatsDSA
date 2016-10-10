package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 06/10/2016.
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//En este código el servidor espera la conexión del cliente con el método accept(), una vez ocurre
//envía un mensaje de confimación con el writeUTF() y lee todos los mensajes desde el cliente con readLine()
//cierra la conexión con el close()

public class Servidor extends Conexion{

    public Servidor() throws IOException{
        super ("servidor");
    }

    //Iniciamos el servidor
    public void startServer(){
        try{
            System.out.println("Esperando...");
            cs = ss.accept();
            System.out.println("Cliente en linea");

            //Se obtiene el flujo de salida del cliente para enviarle mensajes
            salidaCliente = new DataOutputStream((cs.getOutputStream()));
            //Se obtiene el flujo entrante desde el cliente
            BufferedReader entrada = new BufferedReader((new InputStreamReader(cs.getInputStream())));

            while ((mensajeServidor = entrada.readLine()) != null){
                //Ponemos el mensaje recibido en mayúsculas
                salidaCliente.writeUTF(mensajeServidor.toUpperCase());
            }

            System.out.println("Fin de la conexión");
            ss.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
