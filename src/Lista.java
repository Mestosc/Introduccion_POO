import java.util.Arrays;

public class Lista {
	private int[] listaNumeros;

	public Lista() {
		listaNumeros = new int[0];
	}

	public Lista(int... numeros) {
		this.listaNumeros = numeros;
	}

	public int delete(int index) {
		if (listaNumeros.length == 0)
			return 0;
		int eliminado = listaNumeros[index];
		if (index == 0) {
			return deleteFirst();
		} else if (index >= listaNumeros.length - 1) {
			return deleteLast();
		} else {
			int[] new_num = new int[listaNumeros.length - 1];
			int[] nuevo = Arrays.copyOfRange(listaNumeros, 0, index);
			int[] nuevo2 = Arrays.copyOfRange(listaNumeros, index + 1, listaNumeros.length);
			System.arraycopy(nuevo, 0, new_num, 0, index);
			for (int i = index, j = 0; i < new_num.length; i++, j++) {
				new_num[i] = nuevo2[j];
			}
			listaNumeros = new_num;
		}
		return eliminado;
	}

	public int deleteFirst() {
		if (listaNumeros.length == 0)
			return 0;
		int primero = listaNumeros[0];
		listaNumeros = Arrays.copyOfRange(listaNumeros, 1, listaNumeros.length);
		return primero;
	}

	public int deleteLast() {
		if (listaNumeros.length == 0)
			return 0;
		int ultimo = listaNumeros[listaNumeros.length - 1];
		listaNumeros = Arrays.copyOf(listaNumeros, listaNumeros.length - 1);
		return ultimo;
	}

	/**
	 * Reemplazar valor en un indice especifico
	 * 
	 * @param index el indice a reemplazar
	 * @param value el valor a reemplazar
	 */
	public int replace(int index, int value) {
		if (listaNumeros.length == 0)
			return 0;
		listaNumeros[index] = value;
		return listaNumeros[index];
	}

	/**
	 * Insertar valor en un indice especifico
	 * 
	 * @param index el indice en el que se quiere insertar un valor
	 * @param value el valor que se quiere insertar
	 * @return el numero en el indice en el que si quiso insertar
	 */
	public int insert(int index, int value) {
		if (index <= 0)
			return firstAppend(value);
		else if (index >= listaNumeros.length - 1)
			return append(value);
		else {
			int[] twoNumbers = Arrays.copyOfRange(listaNumeros, index, listaNumeros.length);
			listaNumeros = copyList();
			listaNumeros[index] = value;
			for (int i = index + 1, j = 0; i < listaNumeros.length; i++, j++) {
				listaNumeros[i] = twoNumbers[j];
			}
		}
		return listaNumeros[index];
	}

	public int[] getListaNumeros() {
		return listaNumeros;
	}

	private int[] copyList() {
		return Arrays.copyOf(listaNumeros, listaNumeros.length + 1);
	}

	public int firstAppend(int numero) {
		listaNumeros = copyList();
		int[] new_numeros = Arrays.copyOfRange(listaNumeros, 0, listaNumeros.length - 1);
		for (int i = 1, j = 0; j < new_numeros.length; i++, j++) {
			listaNumeros[i] = new_numeros[j];
		}
		listaNumeros[0] = numero;
		return listaNumeros[0];
	}

	/**
	 * Añade un elemento al final de la lista 
	 * @param numero el numero a introducir
	 * @return el numero añadido
	 **/
	public int append(int numero) {
		listaNumeros = copyList();
		listaNumeros[listaNumeros.length - 1] = numero;
		return listaNumeros[listaNumeros.length - 1];
	}

}
