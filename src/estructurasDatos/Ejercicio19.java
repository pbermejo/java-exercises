package estructurasDatos;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[] randomArray = new int[30];
        Random aleat = new Random();
        
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (aleat.nextInt(20) + 10);			
        }
        
        System.out.println("Array original:");
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Longitud del array: " + randomArray.length);
        
        for (int i = 0; i < randomArray.length / 2; i++) {
            int temp = randomArray[i];
            randomArray[i] = randomArray[randomArray.length - 1 - i];
            randomArray[randomArray.length - 1 - i] = temp;
        }
        System.out.println("Array invertido: ");
        System.out.println(Arrays.toString(randomArray));
    }
}