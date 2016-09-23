package edu.upd.eetac.dsa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Thread th1 = new MiEscribidor(1);
        th1.start();
        Thread th2 = new MiEscribidor(2);
        th2.start();
        Thread th3 = new MiEscribidor(3);
        th3.start();
        Thread th4 = new MiEscribidor(4);
        th4.start();
        Thread th5 = new MiEscribidor(5);
        th5.start();
        Thread th6 = new MiEscribidor(6);
        th6.start();
    }
}

