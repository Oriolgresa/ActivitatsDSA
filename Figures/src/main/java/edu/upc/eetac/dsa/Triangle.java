package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 15/9/16.
 */
public class Triangle extends BasicFigure{
    private double b;
    private double h;

    public Triangle (double b, double h){
        this.b=b;
        this.h=h;
    }

    public double area(){
        return b*h/2;
    }
}