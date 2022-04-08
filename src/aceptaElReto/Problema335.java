package aceptaElReto;

import java.util.Scanner;

public class Problema335 {
    public static void main(String[] args) {
        /*
        Pirámide de canicas
        */
        int casos;
        int nivel;
        long nivelAnterior;
        long canicasTotal;
        long canicasNivel;

        Scanner scan = new Scanner(System.in);
        casos = scan.nextInt();

        for (int i = 0; i < casos; i++){
                canicasTotal = 0;
                nivelAnterior = 0;
                canicasNivel = 0;

                nivel = scan.nextInt();

                for(int j = 1; j <= nivel; j++){
                    canicasNivel = j + nivelAnterior;
                    canicasTotal += canicasNivel;
                    nivelAnterior = canicasNivel;
                }
                System.out.println(canicasTotal);
        }
    }
}