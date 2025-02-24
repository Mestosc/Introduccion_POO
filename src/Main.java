public class Main {
    public static void main(String[] args) {
        Lista lista2 = new Lista(1,2,3,5,6,7,8,9);
        lista2.insert(8,20);
        lista2.deleteFirst();
        for (int i : lista2.getNumeros()) {
            System.out.println(i);
        }
        System.out.println("-----LISTA 2----");
        Lista lista = new Lista();
        for (int i = 0; i < lista.getNumeros().length; i++) {
            System.out.println(lista.getNumeros()[i]);
        }
    }
}
