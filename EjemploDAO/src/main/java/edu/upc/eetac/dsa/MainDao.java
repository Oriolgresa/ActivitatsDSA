package edu.upc.eetac.dsa;

/**
 * Hello world!
 *
 */
public class MainDao
{
    public static void main( String[] args )
    {
        UserDao usuario = new UserDao(1,"toni","address");
        usuario.insert();
    }
}
