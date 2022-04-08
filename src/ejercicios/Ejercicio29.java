package ejercicios;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        /*
        CALCULAR AÑOS BISIESTOS
        */
        int year;
        Scanner scan;
        scan = new Scanner(System.in);
        year = scan.nextInt();
        
        while(year > 0){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println("BISIESTO");
            }else{
                System.out.println("NO BISIESTO");
            }
            year = scan.nextInt();
        }      
    }
}