/**
 * 
 */
package muebles;

/**
 * @author Pablo Bermejo
 *
 */
public class Mesa extends Mueble {
	
	private int numeroPatas;

	/**
	 * 
	 */
	public Mesa() {
	}

	/**
	 * @param numeroPatas
	 */
	public Mesa(double largo, double ancho, double alto, Color color, int numeroPatas) {
		super(largo, ancho, alto, color);
		this.numeroPatas = numeroPatas;
	}
	
	/**
	 * @return string con las propiedades del objeto
	 */
	public String visualizaMesa() {
		String mesa;
		mesa = "Largo: " + largo + "\t";
		mesa += "ancho: " + ancho + "\t";
		mesa += "alto: " + alto + "\t";
		mesa += "número de patas: " + numeroPatas + "\n";
		mesa += "Color: R: " + color.getRed() + "\t";
		mesa += "G: " + color.getGreen() + "\t";
		mesa += "B: " + color.getBlue() + "\t";
		
		return mesa;
	}
}
