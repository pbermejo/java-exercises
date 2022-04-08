package objetos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dual106
 */
public class Portatil {
    private String marca;
    private String cpu;
    private int ram;
    private int hd;
    private boolean usbC;
    
    // Constructor por defecto
    public Portatil(){    
    }
    
    // Sobrecarga de constructor
    public Portatil(String marca, String cpu, int ram, int hd, boolean usbC){
        this.marca = marca;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.usbC = usbC;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public boolean isUsbC() {
        return usbC;
    }

    public void setUsbC(boolean usbC) {
        this.usbC = usbC;
    }
    
    
    public void visualiza(){      
        System.out.println("· Marca: \t" + marca);
        System.out.println("· CPU: \t\t" + cpu);
        System.out.println("· RAM: \t\t" + ram + "GB");
        System.out.println("· HD: \t\t" + hd + "GB");
        if (usbC) {
            System.out.println("· USB-C: \tSí");
        }else{
            System.out.println("· USB-C: \tNo");
        }
    }
}
