package Ejer_T_7_8_9;

import java.util.Scanner;
public class P0_CadenaREves {
    public static void main(String[] args) {


    /*
       0 - Escribe el código que devuelva una cadena al revés.
        Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    */

        System.out.println("Cadena al Reves");
            Scanner scanner = new Scanner(System.in);
            String texto;
        System.out.println("Introduce el texto");
            texto = scanner.nextLine();
            StringBuilder reves = new StringBuilder(texto);
            texto = reves.reverse().toString();
        System.out.println(texto);


    }



}
