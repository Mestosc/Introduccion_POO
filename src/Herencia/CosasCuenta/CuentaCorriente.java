package Herencia.CosasCuenta;

public class CuentaCorriente {
    private double saldo;
    private String titular;
    private double numeroCuota;
    private String nif;

    public CuentaCorriente(double saldo, String nif, double numeroCuota, String titular) {
        this.saldo = saldo;
        this.nif = nif;
        this.numeroCuota = numeroCuota;
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

    public double getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(double numeroCuota) {
        this.numeroCuota = numeroCuota;
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
