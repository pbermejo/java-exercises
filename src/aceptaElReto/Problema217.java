package aceptaElReto;

import java.util.Scanner;

public class Problema217 {
    public static void main(String[] args) {
        /*
        EN QUÉ LADO DE LA CALLE
        */
        int x;
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
        
        while( x > 0 ) {
            if(x % 2 == 0){
                System.out.println("DERECHA");
            }else{
                System.out.println("IZQUIERDA");
            }
            x = teclado.nextInt();
        }
    }
}