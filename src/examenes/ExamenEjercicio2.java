package examenes;

import java.util.Scanner;

public class ExamenEjercicio2 {
    public static void main(String[] args) {
        int pesoMaximo;
        int numElefantes;
        int pesoElefante;
        int pesoTotal = 0;
        int elefantesSoportados = 0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el peso máximo que soporta la tela: ");
        pesoMaximo = teclado.nextInt();
        System.out.println("Introduce el número de elefantes: ");
        numElefantes = teclado.nextInt();
        for (int i = 1; i <= numElefantes; i++) {
            System.out.println("Introduce el peso del elefante " + i + ": ");
            pesoElefante = teclado.nextInt();
            pesoTotal += pesoElefante;
            if(pesoTotal > pesoMaximo){
                elefantesSoportados = i - 1;
                break;
            }else{
                elefantesSoportados = i;
            }
        }
        System.out.println("Número de elefantes que soportó la tela: " + elefantesSoportados);
    }
}
