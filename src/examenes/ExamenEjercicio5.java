package examenes;

import java.util.Scanner;
import java.util.Random;

public class ExamenEjercicio5 {
    public static void main(String[] args) {
        int n;
        int aleatorio;
        int primerIntervalo = 0;
        int segundoIntervalo = 0;
        
        Random aleat = new Random();        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca un número: ");
        n = teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            do {
                aleatorio = aleat.nextInt(100) + 1;                
            } while (aleatorio < 50 || aleatorio > 100);
            
            if(aleatorio <= 75){
                primerIntervalo++;
            }else{
                segundoIntervalo++;
            }
            
            System.out.print(aleatorio);
            if(i < (n - 1)){
                System.out.print(", ");
            }else{
                System.out.println("");
            }
        }
        
        System.out.println("Números en el intervalo [50,75]: " + primerIntervalo);
        System.out.println("Números en el intervalo [76,100]: " + segundoIntervalo);
    }
}
