package Ejer_T_7_8_9;

public class P1_ArrayUni {

    public static void main(String[] args) {

/*
1. Crea un array unidimensional de Strings y recórrelo,
mostrando únicamente sus valores.
 */
        // Declarar el Array

        int resultArray[] = new int[5];

        // Inicialización del array
            resultArray[0]=10;
            resultArray[1]=20;
            resultArray[2]=30;
            resultArray[3]=40;
            resultArray[4]=50;

        // Recorrer el array

        for (int i=0; i<resultArray.length; i++){
            System.out.println("Posicion del primer array contiene el valor " + resultArray[i]);
        }


    }
}
