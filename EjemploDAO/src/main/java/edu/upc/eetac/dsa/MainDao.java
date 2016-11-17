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
        User user = new User(9,"","");
        User user1 = new User(1,"aitor","upc");
        User user2 = new User(2,"oriol","andorra");
        User user3 = new User(3,"copitingui","lloret de dalt");
        User user4 = new User(4,"rosa","lloret");
        User user5 = new User(6,"marina","fenals");
        User user6 = new User(8,"oriol","barcelona");
        User user7 = new User(7,"ivan","barcelona");
        User user9 = new User(10,"roberto","A coruña");
        User user10 = new User(11,"marti","reus");




        //user10.insert();
       /*System.out.println("funció insertar:\n");
        user9.insert();
        //user2.select2("ivan","barcelona");
        user3.update();
        user.delete();
        /*user4.insert();
        System.out.println("\n**********************************************************");
        System.out.println("\nFunció seleccionar:");
        user.select(2);
        Dept departamento = new Dept(1,4,"finances","departament de comptabilitat");
        System.out.println("\n**********************************************************");

        //departamento.insert();
        //user4.select(3);
        //user5.update(6);
        //user.delete(7);*/
        //List<User> lista = new ArrayList<User>();
         List<User> l = DAO.getAllUsers();

         //for (User u: l) {
        //     System.out.println(u);
        // }


    }

}



