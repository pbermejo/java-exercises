package ejercicios;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        int num;
        Scanner scan;
        scan = new Scanner(System.in);
        num = scan.nextInt();
        System.out.print(num % 10);
        num /= 10;
        System.out.print(num % 10);
        num /= 10;
        System.out.print(num % 10);
        num /= 10;
        System.out.print(num % 10);
        
        /*
        OPCIÓN CON STRINGS
        
        String num;
        Scanner scan;
        scan = new Scanner(System.in);
        num = scan.next();
        for (int i = num.length() -1; i >= 0; i--) {
            System.out.print(num.charAt(i));
        }
        */
    }
}