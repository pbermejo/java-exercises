package estructurasDatos;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num;
        String dni;
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        Scanner scan = new Scanner(System.in); 
        
        do{
            System.out.println("Introduce un dni válido sin letra:");
            dni = scan.nextLine();
        }while(dni.length() != 8);
        
        num = Integer.parseInt(dni);
        System.out.println(letras[num % 23]);
    }
}
