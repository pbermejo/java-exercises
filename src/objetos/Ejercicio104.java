package objetos;

public class Ejercicio104 {
    public static void main(String[] args){
        
        Portatil asus = new Portatil("ASUS", "Intel i7", 16, 50, false);     
        
        System.out.println("PC 1:\n");        
        System.out.println("· Marca: \t" + asus.getMarca());
        System.out.println("· CPU: \t\t" + asus.getCpu());
        System.out.println("· RAM: \t\t" + asus.getRam() + "GB");
        System.out.println("· HD: \t\t" + asus.getHd() + "GB");
        if (asus.isUsbC()) {
            System.out.println("· USB-C: \tSí");
        }else{
            System.out.println("· USB-C: \tNo");
        }
    }
}
