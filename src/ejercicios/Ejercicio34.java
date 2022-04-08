package ejercicios;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        /*
        LEER NÚMERO Y MOSTRAR DIVISORES
        */
        int num, cont = 1;
        Scanner scan;
        scan = new Scanner(System.in);
        num = scan.nextInt();
        while (cont <= num) {
            if (num % cont == 0) {
                System.out.println(cont);
            }
            cont++;
        }
    }
}