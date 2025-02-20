import java.util.Arrays;

public class Lista {
    int[] numeros;
    public Lista() {
        numeros = new int[0];
    }
    public void append(int numero) {
        numeros = Arrays.copyOf(numeros,numeros.length+1);
        numeros[numeros.length-1] = numero;
    }

}
