package Excepciones;

public class ExemploExcepcions {
    public static void main(String[] args) {
        int a,b,c;
        a = 0;
        b = 0;
        try {
            c = a/b;
	    System.out.println("Resultado " + c);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Ha habido un fallo de seguridad critico por favor llame al servicio tecnico");
            System.out.println(arithmeticException.getMessage());
        }
	finally {
		System.out.println("Ejecutando cosas despues de comprobar");
	}
    }
}
