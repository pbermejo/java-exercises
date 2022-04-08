package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        numero2 = teclado.nextInt();
        System.out.println("Números introducidos: " + numero1 + ", " + numero2);
        
        if(numero1 >= 0 && numero2 >= 0){
            System.out.println("La suma de los dos numeros es:" + (numero1 + numero2));
        }else{
            System.out.println(" No se calcula la suma porque alguno de los números o los dos no son positivos");
        }
    }
}
