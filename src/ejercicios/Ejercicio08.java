package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        double numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        numero = teclado.nextDouble();
        System.out.println("El doble es: " + (numero * 2));
        System.out.println("El triple es: " + (numero * 3));
    }
}
