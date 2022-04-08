package objetos;

import java.util.Scanner;
public class Ejercicio111 {
    public static void main(String[] args) {
        float largo;
        float alto;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce el largo del rectángulo 1:");
        largo = scan.nextFloat();
        System.out.println("Introduce el alto del rectángulo 1:");
        alto = scan.nextFloat();
        
        Rectangulo rect1 = new Rectangulo();
        rect1.setLargo(largo);
        rect1.setAlto(alto);
        rect1.visualiza();
        
        System.out.println("Introduce el largo del rectángulo 2:");
        largo = scan.nextFloat();
        System.out.println("Introduce el alto del rectángulo 2:");
        alto = scan.nextFloat();
        
        Rectangulo rect2 = new Rectangulo(largo, alto);
        rect2.visualiza();
    }
}