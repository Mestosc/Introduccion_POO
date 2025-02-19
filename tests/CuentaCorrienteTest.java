import Herencia.CosasCuenta.CuentaCorriente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaCorrienteTest {
    CuentaCorriente prueba = new CuentaCorriente(140.10,"102134234A",12,"LKEL");
    @BeforeEach
    void setPrueba() {
        prueba.setSaldo(140.10);
    }
    @org.junit.jupiter.api.Test
    void sacarDinero() {
        assertEquals(-10,prueba.sacarDinero(150.10));
    }
}