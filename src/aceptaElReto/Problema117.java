package aceptaElReto;

import java.util.Scanner;

public class Problema117 {
    public static void main(String[] args) {
        /*
        La fiesta aburrida
        */
        int casos;
        String persona;
        Scanner teclado = new Scanner(System.in);
        casos = teclado.nextInt();
        
        persona = teclado.nextLine();
        for (int i = 0; i < casos; i++) {
            persona = teclado.nextLine();
            persona = persona.substring(4, persona.length());
            System.out.println("Hola, " + persona + ".");
        }
    }
}