package ClasesAbstractas;

public class Main {
    public static void main(String[] args) {
        Serpiente serpiente1 = new Serpiente("Juana",20);
        serpiente1.comer();
        Animal perro = new Perro("jasldf",3);
        animalhacer(serpiente1);
    }
    static void animalhacer(Animal animal) {
        if (animal instanceof Mamiferos) {
            Mamiferos anim = (Mamiferos) animal;
            anim.parir();
        }
        else {
            animal.comer();
        }
    }
}
