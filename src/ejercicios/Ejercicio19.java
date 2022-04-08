package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        int N1;
        int N2;
        int N3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        N1 = teclado.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        N2 = teclado.nextInt();
        System.out.print("Introduce el tercer número entero: ");
        N3 = teclado.nextInt();
        System.out.println("Números introducidos: " + N1 + ", " + N2 + ", " + N3);
        
        if(N1 == N2 + N3){
            System.out.println("Se cumple que N1 = N2 + N3");            
        }else if(N2 == N1 + N3){
            System.out.println("Se cumple que N2 = N1 + N3");            
        }else if(N3 == N1 + N2){
            System.out.println("Se cumple que N3 = N1 + N2");           
        }else{
            System.out.println("Los números no cumplen la condición");            
        }
    }
}