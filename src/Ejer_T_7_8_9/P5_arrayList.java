package Ejer_T_7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;


public class P5_arrayList {
    public static <linkedList> void main(String[] args) {

        /*
        Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
         */

        // Declarar el ArrayList
        ArrayList<String> mylist = new ArrayList<>();

        // añadir el/ los elementos

        mylist.add("Spain");
        mylist.add("French");
        mylist.add("Italy");
        mylist.add("Morocco");

        System.out.println(mylist);


        LinkedList<String> nuevaLista = new LinkedList<>();


        nuevaLista.add("Spain");
        nuevaLista.add("French");
        nuevaLista.add("Italy");
        nuevaLista.add("Morocco");

        System.out.println(nuevaLista);

    }


}
