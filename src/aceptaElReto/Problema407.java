package aceptaElReto;

import java.util.Scanner;

public class Problema407 {
    public static void main(String[] args) {
        /*
        Rebotando en el parchís
        */
        int casillas;
        int posicion;
        int tirada;
        
        Scanner scan;
        scan = new Scanner(System.in);
        casillas = scan.nextInt();
        posicion = scan.nextInt();
        tirada = scan.nextInt();
        
        while (posicion > 0){
            // Si nos pasamos del tope
            if(casillas < (posicion + tirada)){
                // Rebotamos el exceso de tirada
                posicion = casillas - (posicion + tirada - casillas);
            }else{
                // Avanzamos si no llegamos
                posicion += tirada;                
            }
            System.out.println(posicion);
            casillas = scan.nextInt();
            posicion = scan.nextInt();
            tirada = scan.nextInt(); 
        }
    }
}