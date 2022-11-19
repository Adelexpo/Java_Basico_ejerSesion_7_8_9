package Ejer_T_7_8_9;

import java.util.Vector;

public class P3_Vector {
    public static void main(String[] args) {

/*
3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
Elimina el 2o y 3er elemento y muestra el resultado final.
 */
        // Declarar el Vector
        Vector<String> myVector = new Vector<>();

        //Añadir elementos

        myVector.add("Naranja");
        myVector.add("Manzana");
        myVector.add("Platano");
        myVector.add("Fresa");
        myVector.add("Pera");


        System.out.println("contenido del vector: " + myVector);

        myVector.remove("Manzana");
        myVector.remove("Platano");

        System.out.println("Nuevo contenido del vector: " + myVector);



    }

}




