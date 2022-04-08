package estructurasDatos;
import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] arrayNum = new int[20];
        int sumaPar = 0;
        int sumaImpar = 0;
        Random aleat = new Random(); 
        
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = aleat.nextInt(99);
            if(i % 2 == 0){
                sumaPar += arrayNum[i];
            }else{
                sumaImpar += arrayNum[i];
            }
        }
        System.out.println("Suma pares: " + sumaPar);
        System.out.println("Suma impares: " + sumaImpar);
    }
}
