package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu número del sorteo: ");
        numero = teclado.nextInt();
        
        if(numero == 450){
            System.out.println("Enhorabuena! Tu número está premiado!!");
        }else{
            System.out.println("Tu número no está premiado.");
        }
    }
}
