import java.util.Scanner;

public class AreaTrianguloLeoTeclado {
    public static void main(String[] args) {
        double base;
        double altura;
        double area;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la base:");
        base = scan.nextDouble();
        System.out.println("Introduce la altura:");
        altura = scan.nextDouble();
        area = base * altura / 2;
        System.out.println("El área del triángulo es: " + area + " cm2");
    }
}
