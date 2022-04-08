package ejercicios;

import java.util.Scanner;

public class Ejercicio76 {
    public static void main(String[] args) {
        /*
        Rectángulo de asteriscos
        */
        int a, b;
        Scanner scan;
        System.out.println("Introduce el largo y alto del rectángulo:");
        scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if(i > 0 && i < b - 1 && j > 0 && j < a - 1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");                     
                }
            }
            System.out.println("");
        }
    }
}