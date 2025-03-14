import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest {
    Lista lista1 = new Lista(1,2,3,5,6,7);

    @ParameterizedTest(name = "{0} into lista1 in index {1} is {0}")
    @CsvSource({
                    "4,3,4",
                    "-1,0,-1",
                    "8,10,8",
                    "-1,-1,-1",
                    "2,1,2"
    })
    void insert(int numInsert, int index, int expected) {
        assertEquals(expected,lista1.insert(index,numInsert), () -> "In " + index + "rd index " + "must be this number:" + numInsert);
    }
}