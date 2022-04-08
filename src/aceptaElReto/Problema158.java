package aceptaElReto;

import java.util.Scanner;

public class Problema158 {
    public static void main(String[] args) {
        /*
        LOS SALTOS DE MARIO
        */
        int casos;
        int muros;
        int alturaMuro;
        int saltosArriba = 0;
        int saltosAbajo = 0;
        int alturaBase = 0;
        
        Scanner scan;
        scan = new Scanner(System.in);  
        casos = scan.nextInt();
        
        for(int i = 0; i < casos; i++){
            muros = scan.nextInt();            
            alturaBase =  scan.nextInt(); // primera altura
            for (int j = 1; j < muros; j++) {
                alturaMuro = scan.nextInt();
                // Lógica de saltos
                if(alturaMuro > alturaBase){
                    saltosArriba++;
                }
                if(alturaMuro < alturaBase){
                    saltosAbajo++;
                }
                // Guardo altura actual
                alturaBase = alturaMuro;
            }
            
            System.out.println("Saltos arriba: " + saltosArriba);
            System.out.println("Saltos abajo: " + saltosAbajo);
        }
    }
}