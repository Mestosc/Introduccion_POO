import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjercicioHoy {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numerosAleatoriosEntre1y10paraNums(numeros);
        System.out.println(numeros);
        Set<Integer> set = new HashSet<>();
        set.addAll(numeros);
        System.out.println(set);
        Set<Integer> repetidos = new HashSet<>();
        for (Integer n : set) {
            numeros.remove(n);
        }
        repetidos.addAll(numeros);
        System.out.println(repetidos);
    }
    static void numerosAleatoriosEntre1y10paraNums(List<Integer> l) {
        for (int i = 0; i < 20; i++) {
            l.add((int) Math.floor(Math.random()*10+1));
        }
    }
}
