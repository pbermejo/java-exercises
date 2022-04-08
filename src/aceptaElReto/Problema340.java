package aceptaElReto;

import java.util.Scanner;

public class Problema340 {
    public static void main(String[] args) {
    	/**
    	 * Cuadrados con cerillas
    	 */
        int casos, N, M;
        Scanner teclado = new Scanner(System.in);
        casos = teclado.nextInt();
        
        for(int i = 0; i < casos; i++){
            N = teclado.nextInt();
            M = teclado.nextInt();
            System.out.println(N * (M + 1) + M * (N + 1));
        }
    }
}