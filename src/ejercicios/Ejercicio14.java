package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        numero2 = teclado.nextInt();
        
        if(numero1 < numero2){
            System.out.println("El número " + numero1 + " es menor");
        }
        
        if(numero1 > numero2){
            System.out.println("El número " + numero2 + " es menor");
        }
    }
}
