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
    private static char obtenerLetra(String dni) {
        int num = Integer.parseInt(dni);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[num % 23];
    }
    public void setNif(String nif) {
        nif = nif.trim();
        if (nif.length()==9 && nif.charAt(nif.length()-1) == obtenerLetra(nif.substring(0,nif.length()-1))) this.nif = nif;
        else this.nif = "0".repeat(8) + "A";
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
