package Herencia;

public class PuntoFueraPrimerCuadrante extends RuntimeException {
    public PuntoFueraPrimerCuadrante() {
        super("El punto se localiza fuera del cuadrante permitido");
    }
}
