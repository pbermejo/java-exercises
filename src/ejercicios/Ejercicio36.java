package ejercicios;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        /*
        SUMAR PARES E IMPARES
        */
        int sumaPares = 0;
        int sumaImpares = 0;
        int cont = 1;
        while (cont <= 1000) {
            if (cont % 2 > 0) {
                sumaImpares += cont;
            }else{
                sumaPares += cont;
            }
            cont++;
        }
        System.out.println("Pares: " + sumaPares);
        System.out.println("Impares: " + sumaImpares);
    }
}