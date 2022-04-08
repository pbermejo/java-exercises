package aceptaElReto;

import java.util.Scanner;

public class Problema164 {
    public static void main(String[] args) {
        int a1, a2, b1, b2;
        Scanner teclado = new Scanner(System.in);
        a1 = teclado.nextInt();
        a2 = teclado.nextInt();
        b1 = teclado.nextInt();
        b2 = teclado.nextInt();
        
        while( b1 >= a1 && b2 >= a2 ) {
            System.out.println((b1 - a1) * (b2 - a2));
            a1 = teclado.nextInt();
            a2 = teclado.nextInt();
            b1 = teclado.nextInt();
            b2 = teclado.nextInt();
        }
    }
}