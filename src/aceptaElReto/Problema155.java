package aceptaElReto;

import java.util.Scanner;

public class Problema155 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
        y = teclado.nextInt();
        
        while(x >= 0 && y >= 0){
            System.out.println(x * 2 + y * 2);
            x = teclado.nextInt();
            y = teclado.nextInt();
        }
    }
}