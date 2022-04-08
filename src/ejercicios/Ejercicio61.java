package ejercicios;

import java.util.Scanner;

public class Ejercicio61 {
    public static void main(String[] args) {
        /*
        Números primos
        */
        int num;
        boolean esPrimo = true;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Introduce un número:");
        num = scan.nextInt();
        if(num == 1){
            esPrimo = false;
        }else{
            for (int i = 2; i < num; i++) {
                if(0 == (num % i)){
                    esPrimo = false;
                    break;
                }
            }            
        }
        if(esPrimo){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
}