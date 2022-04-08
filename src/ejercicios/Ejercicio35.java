package ejercicios;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        /*
        LEER NÚMERO Y MOSTRAR SUMA DE DIVISORES
        */
        int num, suma = 0, cont = 1;
        Scanner scan;
        scan = new Scanner(System.in);
        num = scan.nextInt();
        while (cont <= num) {
            if (num % cont == 0) {
                suma += cont;
            }
            cont++;
        }
        System.out.println(suma);
    }
}