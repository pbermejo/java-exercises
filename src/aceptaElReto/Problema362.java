package aceptaElReto;

import java.util.Scanner;

public class Problema362 {
    public static void main(String[] args) {
        /*
        El día de Navidad
        */
        int casos;
        int DD;
        int MM;
        
        Scanner scan;
        scan = new Scanner(System.in);
        casos = scan.nextInt();
        for (int i = 0; i < casos; i++){
            DD = scan.nextInt();
            MM = scan.nextInt();
            if(25 == DD && 12 == MM){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}