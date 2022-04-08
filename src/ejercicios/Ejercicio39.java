package ejercicios;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        /*
        MOSTRAR N MÚLTIPLOS DE 2
        */
        int n;
        Scanner scan;
        scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i);
        }
    }
}