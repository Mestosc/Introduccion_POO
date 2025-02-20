import java.util.Arrays;

public class Lista {
    int[] numeros;
    public Lista() {
        numeros = new int[0];
    }
    public void firstAppend(int numero) {
        numeros = Arrays.copyOf(numeros,numeros.length+1);
        int[] new_numeros = Arrays.copyOfRange(numeros,0, numeros.length-1);
        for (int i = 1, j = 0; j < new_numeros.length; i++,j++) {
            numeros[i] = new_numeros[j];
        }
        numeros[0] = numero;
    }
    public void append(int numero) {
        numeros = Arrays.copyOf(numeros,numeros.length+1);
        numeros[numeros.length-1] = numero;
    }

}
