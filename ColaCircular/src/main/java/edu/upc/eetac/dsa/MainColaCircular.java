package edu.upc.eetac.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class MainColaCircular extends Cola{

    //Crear un constructor para llamar a la clase Cola
    static ColaCircular Cola = new ColaCircular();

    public static void main(String[] args) throws IOException {
        int consulta =-1;
        while (consulta!=0) {
            System.out.println("\nMenú Cola Circular:");
            System.out.println("\n1- Insertar dato");
            System.out.println("2- Eliminar dato");
            System.out.println("3- Consultar Cola");
            System.out.println("0- Salir de la cola");

            System.out.println("\n --> Introduce una opción: ");
            consulta = getInt();
            switch (consulta) {
                //hay que leer lo que se quiere insertar antes de llamar a la funcion
                case 1:Insercion();
                    break;
                case 2: Cola.Eliminar();
                    break;
                case 3: Cola.Mostrar();
                    break;

            }

        }
    }
    public static void Insercion() throws IOException {
        int info;
        System.out.println(" *Inserción*");
        System.out.println("\n --> Introduzca el valor a insertar en la cola :");
        info = getInt();
        Cola.Insertar(info);

    }
    // Funcion para capturar una cadena desde el teclado
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    // Funcion para capturar un entero desde el teclado
    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }

}
