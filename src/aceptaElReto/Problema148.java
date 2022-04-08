package aceptaElReto;

import java.util.Scanner;

public class Problema148 {
    public static void main(String[] args) {
        /*
        Nochevieja
        */
        String entrada;
        int horas;
        int minutos;
        int minRestantes;
        Scanner scan;
        scan = new Scanner(System.in);
        
        entrada = scan.nextLine();
        while(entrada != ""){
            horas = Integer.parseInt(entrada.substring(0, 2));
            minutos = Integer.parseInt(entrada.substring(3, 5));
            if(horas == 0 && minutos == 0){
                break;
            }
            minRestantes = ((23 - horas) * 60) + (59 - minutos) + 1;
            System.out.println(minRestantes);
            entrada = scan.nextLine();
        }
    }
}