package estructurasDatos;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        double[] tiendas = {456.456,123.123,789.789,321.321,654.654};
        double mayorVenta;
        double menorVenta;
        double totalVentas;
        int tiendaVendeMas;
        int tiendaVendeMenos;
        Scanner scan = new Scanner(System.in);
        
        mayorVenta = tiendas[0];
        menorVenta = tiendas[0];
        totalVentas = 0;
        tiendaVendeMas = 0;
        tiendaVendeMenos = 0;
        for (int i = 0; i < tiendas.length; i++) {
            if(mayorVenta < tiendas[i]){
                tiendaVendeMas = i;
            }
            if(menorVenta > tiendas[i]){
                tiendaVendeMenos = i;
            }
            totalVentas += tiendas[i];
        }
        System.out.println("Tienda que más vende: " + tiendaVendeMas);
        System.out.println("Tienda que menos vende: " + tiendaVendeMenos);
        System.out.println("Total ventas: " + totalVentas + " €");
    }
}
