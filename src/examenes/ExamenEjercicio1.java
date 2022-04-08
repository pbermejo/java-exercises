package examenes;

import java.util.Scanner;

public class ExamenEjercicio1 {
    public static void main(String[] args) {
        String texto;
        Character ultimaLetra;
        boolean cumple;
        boolean primeraVez = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un String (longitud mínima de 4), “FINFIN” para finalizar el programa:");
        do{
            cumple = true;
            texto = teclado.nextLine();            
            if(texto.length() >= 4){
                ultimaLetra = texto.charAt(texto.length() - 1);
                for (int i = texto.length() - 2; i >= texto.length() - 4; i--) {
                    if(ultimaLetra == texto.charAt(i)){
                        cumple = false;
                    }
                    ultimaLetra = texto.charAt(i);
                }
                if(cumple){
                    System.out.println("OK");
                }else{
                    System.out.println("FAIL");
                }
                System.out.println("Introduzca un String (longitud mínima de 4), “FINFIN” para finalizar el programa:"); 
            }else{
                System.out.println("Error, la cadena debe de tener una longitud mínima de 4, introduzca otra:");                
            }                
        }while(!texto.equals("FINFIN"));
        System.out.println("Fin del programa, hasta la próxima");
    }
}
