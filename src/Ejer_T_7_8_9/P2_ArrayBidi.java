package Ejer_T_7_8_9;

public class P2_ArrayBidi {
    public static void main(String[] args) {

        /*
        2. Crea un array bidimensional de enteros y recórrelo,
        mostrando la posición y el valor de cada elemento en ambas dimensiones.
         */

        // declara el array Bidi

        int [][]arrayBidi = new int[2][4];

        // Inicialización del array
        arrayBidi[0][0] = 10;
        arrayBidi[0][1] = 20;
        arrayBidi[0][2] = 30;
        arrayBidi[0][3] = 40;

        arrayBidi[1][0] = 100;
        arrayBidi[1][1] = 200;
        arrayBidi[1][2] = 300;
        arrayBidi[1][3] = 400;


        // Recorrer el array

        for (int i = 0; i < arrayBidi.length; i++){
            for (int j = 0; j < arrayBidi[i].length; j++){

                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidi[i][j]);
            }

        }




    }

}
