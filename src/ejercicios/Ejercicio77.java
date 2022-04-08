package ejercicios;

import java.util.Scanner;

public class Ejercicio77 {
    public static void main(String[] args) {
        
        int n = 0;
        Scanner scan;
        scan = new Scanner(System.in);
        while(n < 3 || n > 10){
            System.out.println("Introduce un número entre 3 y 10:");
            n = scan.nextInt();            
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}