package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        numero2 = teclado.nextInt();
        System.out.println("Números introducidos: " + numero1 + ", " + numero2);
        
        if(numero1 < 0 && numero2 < 0){
            System.out.println("No se calcula la suma porque los dos números son negativos");                
        }else if(numero1 < 0){
            System.out.println("No se calcula la suma porque el primer número es negativo");
        }else if(numero2 < 0){
            System.out.println("No se calcula la suma porque el segundo número es negativo");
        }else{
            System.out.println("La suma de los dos numeros es: " + (numero1 + numero2));               
        }
    }
}