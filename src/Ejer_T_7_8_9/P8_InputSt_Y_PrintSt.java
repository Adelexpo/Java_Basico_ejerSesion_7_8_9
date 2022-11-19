package Ejer_T_7_8_9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class P8_InputSt_Y_PrintSt {
    public static void main(String[] args) {
        /*
        8 - Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado
        en el parámetro "fileIn" al fichero dado en "fileOut".
         */
        // funcion para introducir dos numero

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen : " );
        String fileIn = scanner.nextLine();
        System.out.println("Introduce el fichero de destino : " );
        String fileOut = scanner.nextLine();
        copiar(fileIn, fileOut);


                
    }

    private static void copiar(String fileIn, String fileOut) {

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.println(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

}
