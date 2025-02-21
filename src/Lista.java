import java.util.Arrays;

public class Lista {
    private int[] numeros;
    public Lista() {
        numeros = new int[0];
    }
    public Lista(int...numeros) {
        this.numeros = numeros;
    }

    /**
     * Reemplazar valor en un indice especifico
     * @param index el indice a reemplazar
     * @param value el valor a reemplazar
     */
    public int replace(int index,int value) {
        numeros[index] = value;
        return numeros[index];
    }

    /**
     * Insertar valor en un indice especifico
     * @param index el indice en el que se quiere insertar un valor
     * @param value el valor que se quiere insertar
     */
    public int insert(int index,int value) {
        if (index==0) firstAppend(value);
        else if (index==numeros.length-1) append(value);
        else {
            int[] newNumbers = Arrays.copyOfRange(numeros, 0, index);
            int[] twoNumbers = Arrays.copyOfRange(numeros, index, numeros.length);
            numeros = copyList();
            numeros[index] = value;
            System.arraycopy(newNumbers, 0, numeros, 0, index);
            for (int i = index+1, j = 0; i < numeros.length; i++,j++) {
                numeros[i] = twoNumbers[j];
            }
        }
        return numeros[index];
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
