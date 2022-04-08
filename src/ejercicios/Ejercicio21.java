package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        double bruto;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce valor bruto: ");
        bruto = teclado.nextDouble();
        System.out.println("Valor introducido: " + bruto);
        
        if(bruto > 200 && bruto <= 1000){
            System.out.println("Importe (5% descuento): " + (bruto - bruto * .05));            
        }else if(bruto > 1000){
            System.out.println("Importe (10% descuento): " + (bruto - bruto * .1));
        }else{
            System.out.println("No se aplica descuento");            
        }
    }
}