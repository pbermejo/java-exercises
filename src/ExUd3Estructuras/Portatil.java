/**
 * 
 */
package ExUd3Estructuras;

/**
 * @author Pablo Bermejo
 *
 */
public class Portatil {

	private String marca;
	private String cpu;
	private int ram;
	private int hdd;
	private boolean usbC;

	public void visualiza() {
		System.out.println("Marca: " + marca);
		System.out.println("cpu: " + cpu);
		System.out.println("ram: " + ram);
		System.out.println("hdd: " + hdd);
		if (usbC == true) {
			System.out.println("tiene puertos usb");
		} else {
			System.out.println("No tiene puertos USB");
		}
	}

	public Portatil() {
	}

	public Portatil(String marca, String cpu, int ram, int hdd, boolean usbC) {
		this.marca = marca;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.usbC = usbC;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public boolean isUsbC() {
		return usbC;
	}

	public void setUsbC(boolean usbC) {
		this.usbC = usbC;
	}
}
