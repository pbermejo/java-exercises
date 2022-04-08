/**
 * 
 */
package muebles;

/**
 * @author Pablo Bermejo
 *
 */
public class Color {
	private short red;
	private short green;
	private short blue;
	
	/**
	 * 
	 */
	public Color() {
	}

	/**
	 * @param red
	 * @param green
	 * @param blue
	 */
	public Color(short red, short green, short blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	/**
	 * @return the red
	 */
	public short getRed() {
		return red;
	}

	/**
	 * @param red the red to set
	 */
	public void setRed(short red) {
		this.red = red;
	}

	/**
	 * @return the green
	 */
	public short getGreen() {
		return green;
	}

	/**
	 * @param green the green to set
	 */
	public void setGreen(short green) {
		this.green = green;
	}

	/**
	 * @return the blue
	 */
	public short getBlue() {
		return blue;
	}

	/**
	 * @param blue the blue to set
	 */
	public void setBlue(short blue) {
		this.blue = blue;
	}
}
