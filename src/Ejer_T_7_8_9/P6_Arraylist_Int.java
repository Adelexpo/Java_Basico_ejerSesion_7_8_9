package Ejer_T_7_8_9;

import java.util.ArrayList;

public class P6_Arraylist_Int {
    public static void main(String[] args) {

        /*

        6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo
        y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos,
        siempre y cuando cumplas el primer "for" de relleno.
         */

        // Declarar el ArrayList

        ArrayList<Integer> mylist = new ArrayList<Integer>();

        // Añadir el elemento

        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        mylist.add(6);
        mylist.add(7);
        mylist.add(8);
        mylist.add(9);
        mylist.add(10);
/*
        // recorrer  la list
        for (Integer i : mylist) {
            System.out.println("Valor actual de la lisa: " + i);
        }
*/
        // Eliminar los numeros pares de la lista
        mylist.removeIf(n -> (n%2 == 0));

        // Recorrer la lista final

        for (Integer i : mylist) {
            System.out.println("Valor actual de la lisa: " + i);


        }

    }
}
