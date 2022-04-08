package aceptaElReto;

import java.util.Scanner;

public class Problema371 {
    public static void main(String[] args) {
        /*
        CERILLAS
        */
        int cerillasLado, casos, suma;
        Scanner scan;
        scan = new Scanner(System.in);  
        casos = scan.nextInt();
        cerillasLado = scan.nextInt();
        for(int i = 0; i < casos; i++){
            suma = 0;
            for(int j = 0; j < cerillasLado; j++){
                suma += (cerillasLado - j);
            }
            System.out.println(3 * suma);
            cerillasLado = scan.nextInt();
        }
    }
}