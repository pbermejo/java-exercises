package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        double largo;
        double ancho;
        double area;
        double perimetro;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el largo:");
        largo = teclado.nextDouble();
        System.out.println("Introduce el ancho:");
        ancho = teclado.nextDouble();
        area = largo * ancho / 2;
        perimetro = largo * 2 + ancho * 2;
        System.out.println("La superficie del rectángulo es: " + area + " cm2");
        System.out.println("El perímetro del rectángulo es: " + perimetro + " cm");
    }
}
