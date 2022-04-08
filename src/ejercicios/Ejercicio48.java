package ejercicios;

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        /*
        LEER VOCALES DE UN STRING
        */
        String palabra;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        
        Scanner scan;
        System.out.println("Introduce una cadena de texto:");
        scan = new Scanner(System.in);
        palabra = scan.nextLine();
        palabra = palabra.toLowerCase();
        
        for (int j = 0; j < palabra.length(); j++) {
            switch (palabra.charAt(j)){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }
        if(a > 1){
            System.out.println("La letra a aparece " + a + " veces");            
        }else if(a == 1){
            System.out.println("La letra a aparece " + a + " vez");                        
        }
        if(e > 1){
            System.out.println("La letra e aparece " + e + " veces");            
        }else if(e == 1){
            System.out.println("La letra e aparece " + e + " vez");                        
        }
        if(i > 1){
            System.out.println("La letra i aparece " + i + " veces");            
        }else if(i ==1){
            System.out.println("La letra i aparece " + i + " vez");                        
        }
        if(o > 1){
            System.out.println("La letra o aparece " + o + " veces");            
        }else if(o == 1){
            System.out.println("La letra o aparece " + o + " vez");                        
        }
        if(u > 1){
            System.out.println("La letra u aparece " + u + " veces");            
        }else if(u == 1){
            System.out.println("La letra u aparece " + u + " vez");                        
        }
    }
}