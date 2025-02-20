
public class Horas {
    private int horas;
    private int minutos;
    private int segundos;
    formato formatoTiempo;

    public Horas(int horas, int minutos, int segundos, formato formatoTiempo) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
        this.formatoTiempo = formatoTiempo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas>=0 && horas<24) this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos>=0 && minutos < 60) this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos>=0 && segundos < 60) this.segundos = segundos;
    }
}
