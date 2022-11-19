package Ejer_T_7_8_9;

import java.util.Scanner;


public class P7_DividePorCero {
    public static void main(String[] args) {

          /*
        7 - Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
        mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
    */
        // funcion para introducir dos numero

        Scanner scanner = new Scanner(System.in);
        System.out.println("introducir  dos numeros: " );

         int numeroA= scanner.nextInt();
         int numeroB= scanner.nextInt();

         // recorrer el resultado de los dos numero

        try {
            int result = numeroA/numeroB;
            System.out.println("El resultado es: " + result);
            // en caso de  ser un Cero el segundo numero, no sale  el aviso
        } catch (ArithmeticException e){
            System.out.println("¡Esto no puede hacerse!");
        }

    }
}
