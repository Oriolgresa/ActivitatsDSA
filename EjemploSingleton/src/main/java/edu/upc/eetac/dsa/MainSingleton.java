package edu.upc.eetac.dsa;

public class MainSingleton
{
    public static void main( String[] args )
    {

        try {
            Factory.getInstance().getCommand("C1").execute();
            Factory.getInstance().getCommand("C2").execute();
            Factory.getInstance().getCommand("C3").execute();
            Factory.getInstance().getCommand("C1").execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
}
