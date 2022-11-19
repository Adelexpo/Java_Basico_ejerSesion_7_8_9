package Ejer_T_7_8_9;

import java.util.Vector;

public class P4_VectorCapacity {
    public static void main(String[] args) {
         /* 4 Indica cuál es el problema de utilizar un Vector con la capacidad
        por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        * Por defecto, el vector dobla la capacidad, en el IncrementCapacity.

        */

        // Declarar el Vector
        Vector<Integer> myVector = new Vector<>();

        //Añadir elementos

        myVector.add(1);
        myVector.add(2);
        myVector.add(3);
        myVector.add(4);
        myVector.add(5);


        System.out.println("contenido del vector: " + myVector);

        System.out.println("Tamaño: " + myVector.size() + " - Capacidad: " + myVector.capacity());
        myVector.add(1000);

        for (int i : myVector) {
            System.out.println("Valor actual del vector: " + i);

        }
        System.out.println("Tamaño: " + myVector.size() + " - Capacidad: " + myVector.capacity());

    }
}
