package estructurasDatos;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int num;
        int menor;
        int mayor;
        int numPos = 0;
        int menorPos = 0;
        int mayorPos = 0;
        boolean numEnArray = false;
        Scanner scan = new Scanner(System.in);
       
        // Almaceno números en numeros[]
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número entero:");
            numeros[i] = scan.nextInt();
        }
        
        // Pido número por teclado
        System.out.println("Introduce el número entero a buscar:");
        num = scan.nextInt();
        
        // Recorro el array, calculo menor/mayor y compruebo si contiene a num
        menor = numeros[0];
        mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(menor > numeros[i]){
                menor = numeros[i];
                menorPos = i;
            }
            if(mayor < numeros[i]){
                mayor = numeros[i];
                mayorPos = i;
            }
            if(num == numeros[i]){
                numEnArray = true;
                numPos = i;
            }
        }
        if(numEnArray){
            System.out.println("El número " + num + " está en la posición " + numPos);            
        }else{
            System.out.println("El número " + num + " no está en el array");
        }
        System.out.println("El número menor es " + menor + " y está en la posición " + menorPos);
        System.out.println("El número mayor es " + mayor + " y está en la posición " + mayorPos);
    }
}
