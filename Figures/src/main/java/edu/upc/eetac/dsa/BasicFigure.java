package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 20/9/16.
 */
public abstract class BasicFigure implements Figure, Comparable<Figure>{

    public int compareTo(Figure f) {
        return (int) (this.area() - f.area())*-1;
    }
}