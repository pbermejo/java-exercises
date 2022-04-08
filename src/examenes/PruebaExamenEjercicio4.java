package examenes;

import java.util.Scanner;

public class PruebaExamenEjercicio4 {
    public static void main(String[] args) {
        int num;
        
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Introduce un número:");
        num = scan.nextInt();        
        for (int i = num; i >= 4; i--) {
            // Compruebo si es divisible por 4
            if(i % 4 == 0){
                System.out.print(i);
                // Escribo coma después de cada número excepto el último
                if(i > 4){
                    System.out.print(", ");                    
                }
            }
        }
    }
}