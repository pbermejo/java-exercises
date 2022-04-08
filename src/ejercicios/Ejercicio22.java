package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce 3 números: ");
        x = teclado.nextInt();
        y = teclado.nextInt();
        z = teclado.nextInt();
        
        while(true){
            if(x <= y && y <= z){
                
                System.out.println(x + ", " + y + ", " + z);
                
            }else if(x <= z && z <= y){
                
                System.out.println(x + ", " + z + ", " + y);
                
            }else if(x <= z && y <= x){
                
                System.out.println(y + ", " + x + ", " + z);
                
            }else if(z <= x && y <= z){
                
                System.out.println(y + ", " + z + ", " + x);
                
            }else if(z <= x && x <= y){
                
                System.out.println(z + ", " + x + ", " + y);
                
            }else if(z <= y && y <= x){
                
                System.out.println(z + ", " + y + ", " + x);
                
            }
            
            x = teclado.nextInt();
            y = teclado.nextInt();
            z = teclado.nextInt();            
        }        
    }
}