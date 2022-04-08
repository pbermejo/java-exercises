package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();
        
        if(numero >= 0){
            System.out.println("El número leído es positivo");
        }else{
            System.out.println("El número leído es negativo");
        }
    }
}
