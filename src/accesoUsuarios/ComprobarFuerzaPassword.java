package accesoUsuarios;

public class ComprobarFuerzaPassword {

	private int minLongitud;
	private int minMayusculas;
	private int minMinusculas;
	private int minNumeros;

	/**
	 * @param minLongitud
	 * @param minMayusculas
	 * @param minMinusculas
	 * @param minNumeros
	 */
	public ComprobarFuerzaPassword(int minLongitud, int minMayusculas, int minMinusculas, int minNumeros) {
		super();
		this.minLongitud = minLongitud;
		this.minMayusculas = minMayusculas;
		this.minMinusculas = minMinusculas;
		this.minNumeros = minNumeros;
	}

	public ComprobarFuerzaPassword() {
		super();
	}

	/**
	 * @return the minLongitud
	 */
	public int getMinLongitud() {
		return minLongitud;
	}

	/**
	 * @param minLongitud the minLongitud to set
	 */
	public void setMinLongitud(int minLongitud) {
		this.minLongitud = minLongitud;
	}

	/**
	 * @return the minMayusculas
	 */
	public int getMinMayusculas() {
		return minMayusculas;
	}

	/**
	 * @param minMayusculas the minMayusculas to set
	 */
	public void setMinMayusculas(int minMayusculas) {
		this.minMayusculas = minMayusculas;
	}

	/**
	 * @return the minMinusculas
	 */
	public int getMinMinusculas() {
		return minMinusculas;
	}

	/**
	 * @param minMinusculas the minMinusculas to set
	 */
	public void setMinMinusculas(int minMinusculas) {
		this.minMinusculas = minMinusculas;
	}

	/**
	 * @return the minNumeros
	 */
	public int getMinNumeros() {
		return minNumeros;
	}

	/**
	 * @param minNumeros the minNumeros to set
	 */
	public void setMinNumeros(int minNumeros) {
		this.minNumeros = minNumeros;
	}

	/**
	 * @param password
	 * @return true si valida:
	 * - minLongitud
	 * - minMayusculas
	 * - minMinusculas
	 * - minNumeros
	 */
	public boolean esFuerte(String password) {
		int longitud = password.length();
		int minusculas = 0;
		int mayusculas = 0;
		int numeros = 0;
		
		for (int i = 0; i < password.length(); i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				mayusculas++;
			}
			if(Character.isLowerCase(password.charAt(i))) {
				minusculas++;
			}
			if(Character.isDigit(password.charAt(i))) {
				numeros++;
			}
		}
		return (longitud >= minLongitud && mayusculas >= minMayusculas && minusculas >= minMinusculas && numeros >= minNumeros);
	}
}
