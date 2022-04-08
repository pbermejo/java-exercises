package ejercicios;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        /*
        LEER 2 ENTEROS Y MOSTRAR PRODUCTO SIN OPERADOR *
        */
        int num1;
        int num2;
        
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Introduzca 2 enteros: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        System.out.println("El resultado de la multiplicación es: " + Math.multiplyExact(num1, num2));
    }
}