package ejercicios;

import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        /*
        Tabla de multiplicar
        */
        int num;
        
        Scanner scan;
        scan = new Scanner(System.in);
        do{
            System.out.println("Introduce un número entre 2 y 9:");
            num = scan.nextInt();            
            if(num >= 2 && num <= 9){
                System.out.println("Tabla de multiplicar para el número " + num);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (i * num));            
                }
                System.out.println("Teclee 1 para ejecutarlo de nuevo y 2 para abandonar");
                num = scan.nextInt();            
            }
        }while(num == 1);
    }
}