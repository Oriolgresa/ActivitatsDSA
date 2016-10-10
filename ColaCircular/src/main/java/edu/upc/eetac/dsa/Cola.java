package edu.upc.eetac.dsa;

/**
 * Created by OriolGresa on 6/10/16.
 */
public class Cola {
    public static class ColaCircular{
        static int max = 5; //posiciones maximas de la cola
        static int colacirc[] = new int [max]; //creamos la cola
        static int inicio, fin; // Punteros que indicaran el inicio y fin de la cola
        //inicio sera mi primera posicion escrita
        //final sera mi ultima posicion escrita

        ColaCircular(){
            inicio = -1; //inicializamos en -1 pq 0 sera la primera posicion a ocupar
            fin = -1;
            System.out.println("La cola circular está inicializada");
        }
        //Añadiremos un menú para seleccionar que queremos hacer: Insertar, eliminar o consultar la cola
        public static void Mostrar(){
            int i=0;
            System.out.println(" --> ESTADO cola circular: \n");
            if(inicio == -1) {
                System.out.println("\n La cola circular está vacía");
            }
            else {
                i = inicio;
                for(i=inicio; i!=fin+1; i++){
                    System.out.println("Posicion de colacirc[" + i + "] = " + colacirc[i]);
                    if (i==max && inicio>fin) i=0; //reiniciamos el contador para volver a empezar
                }
            }
            System.out.println("\nLos valores actuales de Inicio, Fin y max son:");
            System.out.println("Inicio = "+inicio);
            System.out.println("Fin ="+fin);
            System.out.println("Max ="+max);
        }
        public static void Insertar(int info){
            //Casos en que la cola estaria llena y no se podria escribir
            if((fin==max-1 && inicio ==0)||(fin+1 == inicio)) {
                System.out.println(" La cola está llena");
                return;
            }
            //Casos en que si se podrian insertar datos
            if(fin==max-1 && inicio!=0) fin=0; //la posicion 0 estaria vacia y fin gana una posicion
            else fin++;
            colacirc[fin]=info;
            if (inicio==-1) {
                inicio = 0;
            }
            System.out.println("\nEl valor "+info+" se ha insertado en la posición "+fin);
        }
        public static void Eliminar(){
            //Eliminara la info escrita primero (FIFO)
            System.out.println(" *Eliminar Dato*\n");
            //Casos en que no podremos eliminar = cola vacia
            if (inicio==-1){
                System.out.println(" La cola está vacia");
                return;
            }
            //Cuando podamos eliminar, la posicion que eliminamos es INICIO
            System.out.println("Dato eliminado: " +colacirc[inicio]);
            if(inicio==fin){
                inicio=-1;
                fin=-1;
                return;
            }
            if(inicio==max)
                inicio=0;
            else
                inicio++;
        }

    }
}
