package ClasesAbstractas;

public abstract class Animal {
    private String nombre;
    private int edad;
    public Animal(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }
    public void comer() {
        System.out.printf("%s come%n",nombre);
    }
    public void dormir() {
        System.out.printf("%s duerme%n",nombre);
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract void desprazar();

}
