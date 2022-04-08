package examenes;

import java.util.Scanner;

public class PruebaExamenEjercicio1 {
    public static void main(String[] args) {
        int num;
        int cont1Cifra = 0;
        int cont2Cifras = 0;
        int cont3Cifras = 0;
        Scanner scan;
        scan = new Scanner(System.in);
        do{
            System.out.print("Introduce un número entero, teclea el valor -1 para finalizar el programa: ");
            num = scan.nextInt();
            // Excluyo -1 como instrucción de fin de programa
            if(num > 0){
                if(Integer.toString(num).length() == 1){
                    cont1Cifra++;
                }
                if(Integer.toString(num).length() == 2){
                    cont2Cifras++;
                }
                if(Integer.toString(num).length() == 3){
                    cont3Cifras++;
                }                
            }
        }while(num > 0);
        
        // Escribo el conteo de cifras si hay alguna
        if(cont1Cifra > 1){
            System.out.println("Has tecleado " + cont1Cifra + " números de una cifra");
        }
        if(cont1Cifra == 1){
            System.out.println("Has tecleado " + cont1Cifra + " número de una cifra");
        }
        if(cont2Cifras > 1){
            System.out.println("Has tecleado " + cont2Cifras + " números de dos cifras");
        }
        if(cont2Cifras == 1){
            System.out.println("Has tecleado " + cont2Cifras + " número de dos cifras");
        }
        if(cont3Cifras > 1){
            System.out.println("Has tecleado " + cont3Cifras + " números de tres cifras");
        }
        if(cont3Cifras == 1){
            System.out.println("Has tecleado " + cont3Cifras + " número de tres cifras");
        }
    }
}