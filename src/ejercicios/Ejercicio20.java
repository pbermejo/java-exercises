package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        int N1;
        int N2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        N1 = teclado.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        N2 = teclado.nextInt();
        System.out.println("Números introducidos: " + N1 + ", " + N2);
        
        if(
            N1 % 2 == 0 &&
            N2 % 2 == 0 &&
            N1 < 50 &&
            N2 >= 100  &&
            N2 <= 500
        ){
            System.out.println("La suma es: " + (N1 + N2));
        }else{
            System.out.println("Los números no cumplen la condición");
        }
    }
}