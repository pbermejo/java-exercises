package ejercicios;

import java.util.Scanner;

public class Ejercicio78 {
    public static void main(String[] args) {
        
        int n = 0;
        Scanner scan;
        scan = new Scanner(System.in);
        while(n < 3 || n > 10){
            System.out.println("Introduce un número entre 3 y 10:");
            n = scan.nextInt();            
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= n; j++) {
                if(j > i){
                    System.out.print(" ");                    
                }else{
                    System.out.print("*");
                }
            }
            for (int j = n; j >= 1; j--) {
                if(j > i){
                    System.out.print(" ");                    
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}