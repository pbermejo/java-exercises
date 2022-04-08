package aceptaElReto;

import java.util.Scanner;

public class Problema156 {
    public static void main(String[] args) {
        /*
        Ascensor
        */
        int piso;
        int pisoInicial;
        int longitud;

        Scanner scan = new Scanner(System.in);
        pisoInicial = scan.nextInt();
        
        while(pisoInicial >= 0){
            longitud = 0;
            piso = scan.nextInt();
            while(piso >= 0){
                longitud += Math.abs(pisoInicial - piso);
                pisoInicial = piso;
                piso = scan.nextInt();
            }
            System.out.println(longitud);
            pisoInicial = scan.nextInt();
        }
    }
}