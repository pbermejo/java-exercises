package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        double precio1;
        double precio2;
        double precio3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer precio(€):");
        precio1 = teclado.nextDouble();
        System.out.println("Introduce el segundo precio(€):");
        precio2 = teclado.nextDouble();
        System.out.println("Introduce el tercer precio(€):");
        precio3 = teclado.nextDouble();
        System.out.println("El precio medio es: " + ((precio1 + precio2 + precio3) / 3) + "€");
    }
}
