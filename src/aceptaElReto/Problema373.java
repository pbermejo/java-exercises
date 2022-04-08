package aceptaElReto;

import java.util.Scanner;
import java.math.BigInteger;

public class Problema373 {
    public static void main(String[] args) {
        /*
        CUBOS VISIBLES
        */
        int casos;
        long n;
        Scanner scan;
        scan = new Scanner(System.in);  
        casos = scan.nextInt();
        for(int i = 0; i < casos; i++){
            n = scan.nextLong();
            BigInteger cubos = new BigInteger(Long.toString(n));
            BigInteger resultado = new BigInteger(cubos.pow(3).toString());
            cubos = cubos.subtract(new BigInteger("2"));
            resultado = resultado.subtract(cubos.pow(3));
            System.out.println(resultado);
        }
    }
}