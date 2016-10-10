package edu.upc.eetac.dsa;

/**
 * Hello world!
 *
 */
public class MainTestStack
{
    public static void main( String[] args )
    {
        StackImpl <Integer> st1 = new StackImpl<Integer>(10);
        try{
            for (int i=1; i<11; i++) {
                st1.push(i);
            }
        } catch(PilaPlena e) {
            System.out.println(e.getMessage());
        }
        try {
            for (int j = 1; j<11; j++) {
                System.out.println(st1.pop());
            }
        }catch(PilaBuida e){
            System.out.println(e.getMessage());
        }
    }
}