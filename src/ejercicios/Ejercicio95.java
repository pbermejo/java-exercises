package ejercicios;

import java.util.Random;
import java.util.Scanner;
public class Ejercicio95 {
    public static void main(String[] args) {
        /*
        Acertar números
        */
        Random aleat = new Random();
        Scanner scan = new Scanner(System.in);
        int num;
        int n;
        int intentos = 0;
        int generado;
        
        System.out.println("Introduce un número: ");
        n = scan.nextInt();
        generado = aleat.nextInt(n) + 1;
        System.out.println("Intenta acertar el número entre 0 y " + n);
        do{
            num = scan.nextInt();
            intentos++;
            if(num < generado){
                System.out.println("El nº secreto es mayor que el que has introducido.");
            }
            if(num > generado){
                System.out.println("El nº secreto es menor que el que has introducido.");
            }            
        }while(num != generado);
        if(num == generado){
            System.out.println("Has acertado! Nº de intentos: " + intentos);
        }
    }
}