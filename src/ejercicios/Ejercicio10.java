package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        double salario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu salario bruto(€):");
        salario = teclado.nextDouble();
        salario -= (salario * 0.2);
        System.out.println("Tu salario neto es: " + salario + "€");
    }
}
