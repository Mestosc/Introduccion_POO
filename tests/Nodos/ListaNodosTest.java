package Nodos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ListaNodosTest {

    @ParameterizedTest
    @CsvSource({
            "0, 10,20,30,40,10",
            "1, 10,20,30,40,20",
            "2, 10,20,30,40,30",
            "3, 10,20,30,40,40"
    })
    void testGet(int index, int n1, int n2, int n3, int n4, int expected) {
        ListaNodos lista = new ListaNodos(n1, n2, n3, n4);
        assertEquals(expected, lista.get(index));
    }

    @ParameterizedTest
    @CsvSource({
            "10, true",
            "20, true",
            "50, false"
    })
    void testContains(int value, boolean expected) {
        ListaNodos lista = new ListaNodos(10, 20, 30, 40);
        boolean found = false;
        for (int i = 0; i < lista.getTamano(); i++) {
            if (lista.get(i) == value) {
                found = true;
                break;
            }
        }
        assertEquals(expected, found);
    }

}