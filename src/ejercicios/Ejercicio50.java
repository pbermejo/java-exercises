package ejercicios;

import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        /*
        PALINDROMOS
        */
        /*
        String frase;
        String inversa = "";
        
        Scanner scan;
        System.out.println("Introduce una cadena de texto:");
        scan = new Scanner(System.in);
        frase = scan.nextLine();
        for(int i = frase.length() - 1; i >= 0; i--){
            inversa = inversa + frase.charAt(i);
        }
        if(frase.equalsIgnoreCase(inversa)){
            System.out.println("Es un palíndromo!");
        }else{
            System.out.println("No es un palíndromo");
        }

        */
        
        
        String frase;
        StringBuffer reversa;
        
        Scanner scan;
        System.out.println("Introduce una cadena de texto:");
        scan = new Scanner(System.in);
        frase = scan.nextLine();
        frase = frase.toLowerCase().replace(" ", "");
        reversa = new StringBuffer(frase);
        
        
        if(frase.equals(reversa.reverse().toString())){
            System.out.println("Es un palíndromo!");
        } else {
            System.out.println("No es un palíndromo");            
        }

    }
}