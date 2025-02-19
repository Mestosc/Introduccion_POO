package Herencia.CosasCuenta;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1021,"anlfasf","241234GDL","LKJ");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(1221,"anlfasf","241234GDA","LKJC");
        System.out.println(CuentaCorriente.getContadorContas());
    }
}
