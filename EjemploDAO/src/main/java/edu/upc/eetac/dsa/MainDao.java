package edu.upc.eetac.dsa;

import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class MainDao
{
    public static void main( String[] args ) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        User usuario = new User(1,"toni","upc");
        System.out.println("funció insertar:\n");
        usuario.insert();
        System.out.println("\n**********************************************************");
        System.out.println("\nFunció seleccionar:");
        usuario.select(1);
        Dept departamento = new Dept(1,4,"finances","departament de comptabilitat");
        System.out.println("\n**********************************************************");

        departamento.insert();
    }
}
