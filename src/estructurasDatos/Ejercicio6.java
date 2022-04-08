package estructurasDatos;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] arrayNum = new int[20];
        int menor;
        int mayor;
        double media;
        Random aleat = new Random(); 
        
        menor = 0;
        mayor = 0;
        media = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = aleat.nextInt(10) + 10;
            if(menor > arrayNum[i]){
                menor = arrayNum[i];                
            }
            if(mayor < arrayNum[i]){
                mayor = arrayNum[i];                
            }
            media += arrayNum[i];
        }
        media /= arrayNum.length;
        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);
        System.out.println("Media: " + media);
    }
}
