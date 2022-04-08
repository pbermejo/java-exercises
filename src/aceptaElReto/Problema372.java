package aceptaElReto;

import java.util.Scanner;
import java.lang.Character;

public class Problema372 {
    public static void main(String[] args) {
        /*
        La farsante de Mary Poppins
        */
        int casos;
        String frase;
        String reversa;
        Character letra;
        boolean esMayuscula = false;

        Scanner scan = new Scanner(System.in);
        casos = scan.nextInt();

        for (int i = 0; i < casos; i++){
            frase = scan.next();
            reversa = "";
            if(Character.isUpperCase(frase.charAt(0))){
                esMayuscula = true;
            }
            
            for (int j = frase.length() - 1; j >= 0; j--) {
                if(j == frase.length() - 1 && esMayuscula){
                    letra = Character.toUpperCase(frase.charAt(j));
                }else{
                    letra = Character.toLowerCase(frase.charAt(j));
                }
                reversa += letra.toString();
            } 
            System.out.println(reversa);
            esMayuscula = false;
        }
    }
}