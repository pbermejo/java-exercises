package objetos;

import java.util.Scanner;
public class Ejercicio109 {
    public static void main(String[] args) {
        String marca;
        String cpu;
        int ram;
        int hd;
        boolean usbC;
        Portatil pc1;
        Portatil pc2;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la marca:");
        marca = scan.nextLine();
        System.out.println("Introduce la CPU:");
        cpu = scan.nextLine();
        System.out.println("Introduce la RAM:");
        ram = scan.nextInt();
        System.out.println("Introduce el HD:");
        hd = scan.nextInt();
        System.out.println("¿Lleva USB? (true/false)");
        usbC = scan.nextBoolean();
        
        pc1 = new Portatil(marca, cpu, ram, hd, usbC);
        pc1.visualiza();
        System.out.println(".................");
        pc2 = new Portatil();
        pc2.setMarca("Nisupu");
        pc2.visualiza();
    }
}