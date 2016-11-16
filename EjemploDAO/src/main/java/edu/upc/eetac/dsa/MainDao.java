package edu.upc.eetac.dsa;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class MainDao
{
    public static void main( String[] args ) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, SQLException {
        User user = new User(0,"","");
        User user1 = new User(1,"aitor","upc");
        User user2 = new User(2,"oriol","andorra");
        User user3 = new User(3,"copito","lloret de dalt");
        User user4 = new User(4,"rosa","lloret");
        User user5 = new User(6,"marina","fenals");



       /* System.out.println("funció insertar:\n");
        //user.insert();
        //user4.insert();
        System.out.println("\n**********************************************************");
        System.out.println("\nFunció seleccionar:");
        user.select(2);
        Dept departamento = new Dept(1,4,"finances","departament de comptabilitat");
        System.out.println("\n**********************************************************");

        //departamento.insert();
        user4.select(3);*/
        //user5.update(6);
        //user.delete(7);
        List<User> lista = new ArrayList<User>();
        user.getAllUsers();
    }
}
