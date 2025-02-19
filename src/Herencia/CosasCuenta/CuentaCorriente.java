package Herencia.CosasCuenta;

public class CuentaCorriente {
    private double saldo;
    private String titular;
    private String numeroCuenta;
    private String nif;

    public CuentaCorriente(double saldo, String nif, String numeroCuota, String titular) {
        this.saldo = saldo;
        this.nif = nif;
        this.numeroCuenta = numeroCuota;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double sacarDinero(double dineroSacar) {
        saldo -= dineroSacar;
        return saldo;
    }

}
