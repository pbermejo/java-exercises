package ejercicios;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        /*
        LEER BASE Y EXPONENTE Y MOSTRAR POTENCIA
        */
        int base;
        int exp;
        
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Introduzca base y exponente: ");
        base = scan.nextInt();
        exp = scan.nextInt();
        
        System.out.println("El resultado de la exponenciación es: " + Math.pow(base, exp));
    }
}