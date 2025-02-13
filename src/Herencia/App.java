package Herencia;

public class App {
    public static void main(String[] args) {
        Persoa persoa1 = new Persoa("Juan","1314214G");
        Deportista deportista1 = new Deportista(persoa1,"Club de los aMIGOs",23);
        Deportista deportista2 = new Deportista("Jlkje","alksfj","MLKS","lafj",3);
        System.out.println(deportista1.getClub());
    }
}
