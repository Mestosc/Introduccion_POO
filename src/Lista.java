import java.util.Arrays;

public class Lista {
    private int[] numeros;
    public Lista() {
        numeros = new int[0];
    }
    public void insert(int index,int value) {
        int[] newNumbers = Arrays.copyOfRange(numeros,0,index);
        int[] twoNumbers = Arrays.copyOfRange(numeros,index,numeros.length);
        numeros = Arrays.copyOf(numeros,numeros.length+1);
        numeros[index] = value;
        for (int i = 0; i < index; i++) {

        }
    }
    public int[] getNumeros() {
        return numeros;
    }
    private int[] copyList() {
        return Arrays.copyOf(numeros,numeros.length+1);
    }
    public void firstAppend(int numero) {
        numeros = copyList();
        int[] new_numeros = Arrays.copyOfRange(numeros,0, numeros.length-1);
        for (int i = 1, j = 0; j < new_numeros.length; i++,j++) {
            numeros[i] = new_numeros[j];
        }
        numeros[0] = numero;
    }
    public void append(int numero) {
        numeros = copyList();
        numeros[numeros.length-1] = numero;
    }

}
