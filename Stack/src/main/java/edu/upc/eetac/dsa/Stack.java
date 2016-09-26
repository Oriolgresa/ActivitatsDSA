package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 26/9/16.
 */
public interface Stack <E> {

    public void push(E e) throws PilaPlena;
    public E pop() throws PilaBuida;
    public int size();

}
