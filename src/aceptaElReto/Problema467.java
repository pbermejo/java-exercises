package aceptaElReto;

import java.util.Scanner;
public class Problema467 {
	/* 
	Polisílaba es polisílaba
	 */
    public static void main(String[] args) {
        int casos;
        int espacio;
        String frase;
        String palabraX, palabraY;
        Scanner scan = new Scanner(System.in);
        casos = scan.nextInt();
        frase = scan.nextLine();
        for(int i = 0; i < casos; i++){
            frase = scan.nextLine();
            frase = frase.trim();

            espacio = frase.indexOf(" ");
            palabraX = frase.substring(0, espacio);
            frase = frase.substring(espacio + 1, frase.length());

            espacio = frase.indexOf(" ");
            palabraY = frase.substring(espacio + 1, frase.length());

            if(palabraX.equalsIgnoreCase(palabraY)){
                    System.out.println("TAUTOLOGIA");
            }else{
                    System.out.println("NO TAUTOLOGIA");
            }
        }
    }
}