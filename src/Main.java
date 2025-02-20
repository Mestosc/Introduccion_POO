public class Main {
    public static void main(String[] args) {
        Lista lista1 = new Lista(23,12,50,80,100);
        lista1.insert(3,100);
//        for (int i : lista1.getNumeros()) {
//            System.out.println(i);
//        }
        Lista lista2 = new Lista(1,2,3,5,6,7,8,9);
        lista2.insert(3,4);
        for (int i : lista2.getNumeros()) {
            System.out.println(i);
        }
    }
}
