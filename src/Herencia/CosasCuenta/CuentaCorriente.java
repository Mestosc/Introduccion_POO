package Herencia.CosasCuenta;

public class CuentaCorriente {
    private double saldo;
    private String titular;
    private String numeroCuenta;
    private String nif;
    private static int contadorContas;

    public CuentaCorriente(double saldo, String nif, String numeroCuenta, String titular) {
        this.saldo = saldo;
        setNif(nif);
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        contadorContas++;
    }

    public static int getContadorContas() {
        return contadorContas;
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
    private char obtenerLetra(String dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[Integer.parseInt(dni) % 23];
    }
    public void setNif(String nif) {
        if (nif.length()==9 && nif.charAt(nif.length()-1) == obtenerLetra(nif)) {
            this.nif = nif;
        }
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

    /**
     * Metodo para sacar dinero
     * @param dineroSacar la cantidad de dinero a sacar
     */
    public void sacarDinero(double dineroSacar) {
        saldo -= dineroSacar;
    }

}
