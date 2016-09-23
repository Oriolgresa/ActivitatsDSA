package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 15/9/16.
 */
public class Rectangle extends BasicFigure{

    private double l1;
    private double l2;

    public Rectangle(double l1, double l2){

        this.l1=l1;
        this.l2=l2;
    }

    public double area(){
        return l1*l2;
    }
}