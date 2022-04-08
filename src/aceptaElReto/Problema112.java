package aceptaElReto;
import java.util.Scanner;

/**
 * @author pbermejo
 * Radares de tramo
 */
public class Problema112 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d;
		double v;
		int limite;
		int t;
		double margen = .2;
		
		do {
			/**
			 * Lee datos
			 */
			d = scan.nextInt();
			limite = scan.nextInt();
			t = scan.nextInt();
			
			/**
			 * Muestra error
			 */
			if (d < 0 || limite < 0 || t < 0) {
				System.out.println("ERROR");
				break;
			}
			/**
			 * Finaliza el programa
			 */
			if(d == 0 && limite == 0 && t == 0) {
				break;
			}
			
			/**
			 * Normaliza magnitudes y 
			 * Calcula velocidad del vehículo
			 */
			// Convierte m/s => Km/h
			v = (double) d / (double) t;
			v *= 3.6;
			
			/**
			 * Muestra resultado evaluación
			 */
			if(v <= limite) {
				System.out.println("OK");				
			} else {
				if((v - limite) >= (limite * margen)) {
					System.out.println("PUNTOS");					
				} else {
					System.out.println("MULTA");					
				}
			}
			
		} while (d != 0 && limite != 0 && t != 0);
	}
}