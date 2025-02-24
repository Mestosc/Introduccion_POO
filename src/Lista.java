import java.util.Arrays;

public class Lista {
    private int[] numeros;
    public Lista() {
        numeros = new int[0];
    }
    public Lista(int...numeros) {
        this.numeros = numeros;
    }
    public int delete(int index) {
        int eliminado = numeros[index];
        if (numeros.length==0) return 0;
        else if (index == 0) {
            return deleteFirst();
        } else if (index == numeros.length - 1) {
            return deleteLast();
        }
        else {
            int[] nuevo1 = Arrays.copyOfRange(numeros,0,index);
            int[] nuevo2 = Arrays.copyOfRange(numeros,index+1,numeros.length);
        }
        return eliminado;
    }
    public int deleteFirst() {
        if (numeros.length==0) return 0;
        int primero = numeros[0];
        numeros = Arrays.copyOfRange(numeros,1,numeros.length);
        return primero;
    }
    public int deleteLast() {
        if (numeros.length==0) return 0;
        int ultimo = numeros[numeros.length-1];
        numeros = Arrays.copyOf(numeros,numeros.length-1);
        return ultimo;
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
     * @return el numero en el indice en el que si quiso insertar
     */
    public int insert(int index,int value) {
        if (index==0) return firstAppend(value);
        else if (index==numeros.length-1) return append(value);
        else {
            int[] twoNumbers = Arrays.copyOfRange(numeros, index, numeros.length);
            numeros = copyList();
            numeros[index] = value;
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
    public int firstAppend(int numero) {
        numeros = copyList();
        int[] new_numeros = Arrays.copyOfRange(numeros,0, numeros.length-1);
        for (int i = 1, j = 0; j < new_numeros.length; i++,j++) {
            numeros[i] = new_numeros[j];
        }
        numeros[0] = numero;
        return numeros[0];
    }
    public int append(int numero) {
        numeros = copyList();
        numeros[numeros.length-1] = numero;
        return numeros[numeros.length-1];
    }

}
