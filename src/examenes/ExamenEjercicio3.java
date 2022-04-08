package examenes;

import java.util.Scanner;

public class ExamenEjercicio3 {
    public static void main(String[] args) {
        String fecha;
        String num;
        String luckyString;
        int luckyNumber = 0;
        
        Scanner teclado = new Scanner(System.in);
        fecha = teclado.nextLine();
        num = fecha.substring(0, 2);
        luckyNumber += (int)Integer.parseInt(num);        
        num = fecha.substring(3, 5);
        luckyNumber += (int)Integer.parseInt(num);        
        num = fecha.substring(6, fecha.length());
        luckyNumber += (int)Integer.parseInt(num);
        luckyString = Integer.toString(luckyNumber);
        do{
            luckyNumber = 0;
            for (int i = 0; i < luckyString.length(); i++) {
                luckyNumber += (int)Integer.parseInt(Character.toString(luckyString.charAt(i)));
            }
            luckyString = Integer.toString(luckyNumber);
        }while(luckyString.length() > 1);
        
        System.out.println(luckyNumber);
    }
}
