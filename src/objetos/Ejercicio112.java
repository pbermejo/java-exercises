package objetos;

import java.util.Scanner;
public class Ejercicio112 {
    public static void main(String[] args) {
        double ingreso;
        double retirada;
        Scanner scan = new Scanner(System.in);
        Cuenta cc = new Cuenta();
        
        cc.setTitular("Pablo Bermejo");
        System.out.println("Haz un ingreso en la cuenta:");
        ingreso = scan.nextDouble();
        cc.ingresar(ingreso);
        //cc.visualiza();
        
        System.out.println("Haz un ingreso en la cuenta:");
        ingreso = scan.nextDouble();
        cc.ingresar(ingreso);
        //cc.visualiza();
        
        System.out.println("Haz una retirada de la cuenta:");
        retirada = scan.nextDouble();
        cc.retirar(retirada);
        //cc.visualiza();
        
        System.out.println("Haz una retirada de la cuenta:");
        retirada = scan.nextDouble();
        cc.retirar(retirada);
        //cc.visualiza();
    }
}