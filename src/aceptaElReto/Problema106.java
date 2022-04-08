package aceptaElReto;

import java.util.Scanner;

public class Problema106 {
    public static void main(String[] args) {
        int num;
        int[] codigo;
        Scanner scan;
        scan = new Scanner(System.in);  
        num = scan.nextInt();
        while(num > 0){
            if(String.valueOf(num).length() > 8){
                System.out.println("EAN-13");
            }else{
                System.out.println("EAN-8");
            } 
            num = scan.nextInt();
        }
    }
}