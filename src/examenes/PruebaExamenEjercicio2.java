package examenes;

import java.util.Scanner;

public class PruebaExamenEjercicio2 {
    public static void main(String[] args) {
        int num;
        
        Scanner scan;
        scan = new Scanner(System.in);
        
        System.out.print("Introduce un número entero comprendido entre 3 y 40: ");
        num = scan.nextInt();
            
        // Compruebo la excepción
        while(num < 3 && num > 40){
            System.out.print("Número fuera de rango, introduce otro: "); 
            num = scan.nextInt();
        }        
        for (int i = 1; i <= num; i++) {            
            for (int j = num; j > 0; j--) {
                if(j > i){
                    System.out.print(".");
                }else{
                    System.out.print("A");
                }                
            }
            System.out.println("");
        }
        for (int i = 1; i < num; i++) {            
            for (int j = 0; j < num; j++) {
                if(j < i){
                    System.out.print(".");
                }else{
                    System.out.print("A");
                }                
            }
            System.out.println("");
        }        
    }
}