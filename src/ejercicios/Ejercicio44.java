package ejercicios;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        /*
        LEER ENTERO Y CALCULAR CUANTAS CIFRAS TIENE
        */
        int num;
        
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Introduzca entero: ");
        num = scan.nextInt();
        
        System.out.println("El número introducido tiene " + Integer.toString(num).length() + " cifra(s)");
    }
}