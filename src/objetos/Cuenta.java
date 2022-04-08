package objetos;

public class Cuenta {

    private String titular;

    private double saldo;

    public Cuenta() {

    }

    public Cuenta(String titular, double saldo) {

        this.titular = titular;

        this.saldo = saldo;

    }

    public String getTitular() {

        return titular;

    }

    public void setTitular(String titular) {

        this.titular = titular;

    }

    public double getSaldo() {

        return saldo;

    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;

    }

    public void ingresar(double saldo) {

        if (saldo >= 0) {

            this.saldo += saldo;

        }

    }

    public void retirar(double saldo) {

        if (saldo >= 0) {

            this.saldo -= saldo;

        }

    }

}
