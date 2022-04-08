package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce x: ");
        x = teclado.nextInt();
        System.out.print("Introduce y: ");
        y = teclado.nextInt();
        System.out.println("Has escogido x = " + x + ", y = " + y);
        z = x;
        x = y;
        y = z;
        System.out.println("Los valores intercambiados son x = " + x + ", y = " + y);
    }
}
