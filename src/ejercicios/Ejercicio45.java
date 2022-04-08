package ejercicios;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        /*
        LEER ENTERO Y CALCULAR CUANTAS CIFRAS TIENE
        */
        int num;
        String derecho;
        String inverso;
        
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Introduzca entero: ");
        num = scan.nextInt();
        derecho = Integer.toString(num);
        inverso = "";
        
        for (int i = derecho.length() -1; i >= 0; i--) {
            inverso += derecho.charAt(i);
        }
        
        if(derecho == inverso){
            System.out.println("Es capicúa!");
        }else{
            System.out.println("No es capicúa");
        }
    }
}