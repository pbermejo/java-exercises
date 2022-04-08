package objetos;


public class Ejercicio106 {
    public static void main(String[] args){
        
        Portatil asus = new Portatil("ASUS", "Intel i7", 16, 50, false);        
        Portatil dell = new Portatil("DELL", "Intel i5", 16, 1000, true);
        
        System.out.println("PC 1:\n");        
        asus.visualiza();
        System.out.println("\nPC 2:\n");        
        dell.visualiza();
    }
}
