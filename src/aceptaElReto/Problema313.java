package aceptaElReto;

import java.util.Scanner;

public class Problema313 {
    public static void main(String[] args) {
        /*
        Fin de mes
        */
        int casos;
        int saldo;
        int estimado;
        
        Scanner scan;
        scan = new Scanner(System.in);
        casos = scan.nextInt();
        for (int i = 0; i < casos; i++){  
            saldo = scan.nextInt();
            estimado = scan.nextInt();
            if((saldo + estimado) >= 0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}