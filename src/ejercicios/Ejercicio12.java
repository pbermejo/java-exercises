package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        edad = teclado.nextInt();
        
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
