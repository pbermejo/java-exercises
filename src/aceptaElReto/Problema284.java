package aceptaElReto;

import java.util.Scanner;

public class Problema284 {
    public static void main(String[] args) {
        /*
        La tienda de la esquina
        */
        int casos;
        int importe;
        int dinero;
        Scanner scan;
        scan = new Scanner(System.in);
        casos = scan.nextInt();
        for (int i = 0; i < casos; i++){  
            importe = scan.nextInt();
            dinero = scan.nextInt();
            
            if(dinero >= importe){
                dinero -=importe;
                System.out.print((dinero / 200)); 
                System.out.print(" ");
                dinero %= 200;
                System.out.print((dinero / 100));                                
                System.out.print(" ");
                dinero %= 100;
                System.out.print((dinero / 50));                                
                System.out.print(" ");
                dinero %= 50;
                System.out.print((dinero / 20));                                
                System.out.print(" ");
                dinero %= 20; 
                System.out.print((dinero / 10));                                
                System.out.print(" ");
                dinero %= 10; 
                System.out.print((dinero / 5));                                
                System.out.print(" ");
                dinero %= 5;
                System.out.print((dinero / 2));                                
                System.out.print(" ");
                dinero %= 2;  
                System.out.println(dinero);            
            }else{
                System.out.println("DEBE " + Math.abs(dinero - importe));
            }
        }
    }
}