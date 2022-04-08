/**
 * 
 */
package muebles;

/**
 * @author Pablo Bermejo
 *
 */
public class Mueble {
	
	protected double largo;
	protected double ancho;
	protected double alto;
	protected Color color;
	
	/**
	 * 
	 */
	public Mueble() {
	}

	/**
	 * @param largo
	 * @param ancho
	 * @param alto
	 * @param color
	 */
	public Mueble(double largo, double ancho, double alto, Color color) {
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
		this.color = color;
	}

	/**
	 * @return the largo
	 */
	public double getLargo() {
		return largo;
	}

	/**
	 * @param largo the largo to set
	 */
	public void setLargo(double largo) {
		this.largo = largo;
	}

	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(double alto) {
		this.alto = alto;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
}
