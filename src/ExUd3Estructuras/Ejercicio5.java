/**
 * 
 */
package ExUd3Estructuras;

import java.util.Random;

/**
 * @author Pablo Bermejo
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random aleat = new Random();
		Portatil[] equipos = new Portatil[15];
		int[] ram = {2, 4, 6, 8, 16};
		int[] hdd = {64, 128, 256, 1024};
		boolean[] usbC = {true, false};
		int menorRam;
		
		/**
		 * Escoge la mayor ram
		 */
		menorRam = ram[4];
		for(int i = 0; i < equipos.length; i++) {
			
			/**
			 * Construye los objetos dándole valores y los visualiza
			 */
			equipos[i] = new Portatil("HP", "Intel core I7", ram[aleat.nextInt(4)], hdd[aleat.nextInt(4)], usbC[aleat.nextInt(2)]);
			equipos[i].visualiza();
			
			/**
			 * Guarda el equipo que tenga menor RAM
			 */
			if(menorRam > equipos[i].getRam()) {
				menorRam = equipos[i].getRam();
			}
		}
		
		/**
		 * Muestra los equipos que tengan menos RAM
		 */
		for(Portatil equipo : equipos) {
			if(menorRam == equipo.getRam()) {
				equipo.visualiza();
			}
		}
	}

}
