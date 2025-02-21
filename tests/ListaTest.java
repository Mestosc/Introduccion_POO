import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest {
    Lista lista1 = new Lista(1,2,3,5,6,7);
    @Test
    @DisplayName("Testear insercion metodo")
    void insert() {
        assertEquals(4,lista1.insert(3,4));
    }
    @Test
    @DisplayName("Insertar al principio")
    void insertDos() {
        assertEquals(0,lista1.insert(0,0));
    }
    @Test
    @DisplayName("Insercion al final")
    void insertMas() {
        assertEquals(8,lista1.insert(lista1.getNumeros().length-1,8));
    }
}