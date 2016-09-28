package edu.upc.eetac.dsa;

import java.util.Arrays;
import java.util.Comparator;

public class MainFigures
{
    public static void main( String[] args )
    {
        Figure [] ll = new Figure[5];
        ll[0] = new Square(10);
        ll[1] = new Triangle(4,3);
        ll[2] = new Rectangle(10,7);
        ll[3] = new Circle(10);
        ll[4] = new Rectangle(50,7);

        Arrays.sort(ll);

        double sum=0;
        for (Figure f:ll){
            sum=sum+f.area();
            System.out.println("The " + f.getClass().getSimpleName() + "'s area is " + f.area());
        }
        System.out.println();
        System.out.println("The sum of areas is " + sum);
    }
}