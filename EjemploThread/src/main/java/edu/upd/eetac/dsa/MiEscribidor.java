package edu.upd.eetac.dsa;

/**
 * Created by OriolGresa on 21/9/16.
 */
public class MiEscribidor extends Thread {

    private int e;

    public MiEscribidor(int i){
        this.e=i;
    }
    public void run(){
        for(int j =1;j<11;j++){
            System.out.println("soy el thread "+ e + ", y el contador es " + j);
        }
    }
}
