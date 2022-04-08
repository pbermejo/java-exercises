package ejercicios;

import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        int dni;
        int resto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su DNI: ");
        dni = teclado.nextInt();
        resto = dni % 23;
        switch(resto){
            case 0:
                System.out.println("Su letra es la T");
                break;    
            case 1:
                System.out.println("Su letra es la R");
                break;
            case 2:
                System.out.println("Su letra es la W");
                break;
            case 3:
                System.out.println("Su letra es la A");
                break;
            case 4:
                System.out.println("Su letra es la G");
                break;
            case 5:
                System.out.println("Su letra es la M");
                break;
            case 6:
                System.out.println("Su letra es la Y");
                break;
            case 7:
                System.out.println("Su letra es la F");
                break;
            case 8:
                System.out.println("Su letra es la P");
                break;
            case 9:
                System.out.println("Su letra es la D");
                break;
            case 10:
                System.out.println("Su letra es la X");
                break;
            case 11:
                System.out.println("Su letra es la B");
                break;
            case 12:
                System.out.println("Su letra es la N");
                break;
            case 13:
                System.out.println("Su letra es la J");
                break;
            case 14:
                System.out.println("Su letra es la Z");
                break;
            case 15:
                System.out.println("Su letra es la S");
                break;
            case 16:
                System.out.println("Su letra es la Q");
                break;
            case 17:
                System.out.println("Su letra es la V");
                break;
            case 18:
                System.out.println("Su letra es la H");
                break;
            case 19:
                System.out.println("Su letra es la L");
                break;
            case 20:
                System.out.println("Su letra es la C");
                break;
            case 21:
                System.out.println("Su letra es la K");
                break;
            case 22:
                System.out.println("Su letra es la E");
                break;
        }
    }
}