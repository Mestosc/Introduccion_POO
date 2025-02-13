package Herencia;

public class Deportista extends Persoa {
    private String deporte;
    private String club;
    private int licencia;

    /**
     * Creacion de un objeto deportista
     * @param persoa la persona a la que queremos definir como deportista
     * @param club el club al que pertenece ese deportista
     * @param licencia la licencia de ese deportista
     */
    public Deportista(Persoa persoa,String club, int licencia) {
        super(persoa.nome,persoa.dni);
        this.club = club;
        this.licencia = licencia;
    }

    public Deportista(String nome, String dni, String deporte, String club, int licencia) {
        super(nome,dni);
        this.deporte = deporte;
        this.club = club;
        this.licencia = licencia;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }
}