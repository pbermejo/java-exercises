package examenes;

import java.util.Scanner;

public class PruebaExamenEjercicio3 {
    public static void main(String[] args) {
        int num;
        int suma = 0;
        int cont = 1;
        
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        num = scan.nextInt();
        // Recorro todos los números excepto el propio
        while (cont < num) {
            // Compruebo si es divisor y lo añado a la suma
            if (num % cont == 0) {
                suma += cont;
            }
            cont++;
        }
        // Compruebo si es deficiente
        if(suma < num){
            System.out.println(num + " es un número deficiente");
        }else{            
            System.out.println(num + " no es un número deficiente");
        }
    }
}