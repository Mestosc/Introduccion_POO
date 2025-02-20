
public class Horas {
    private int horas;
    private int minutos;
    private int segundos;
    formato formatoTiempo;
    private String mananaTarde;

    public Horas(int horas, int minutos, int segundos, formato formatoTiempo) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
        this.formatoTiempo = formatoTiempo;
        setMananaTarde();
    }

    public void setMananaTarde() {
        if (formatoTiempo.equals(formato.F12)) {
            if (horas<12) {
                this.mananaTarde = "A.M.";
            }
            else {
                this.mananaTarde = "P.M.";
            }
        }
    }

    @Override
    public String toString() {
        if (formatoTiempo.equals(formato.F12)) return horas + ":" + minutos + ":" + segundos + " " + mananaTarde;
        else return horas + ":" + minutos + ":" + segundos + " ";
    }

    public int getHoras() {
        if (formatoTiempo.equals(formato.F12)) return horas-12;
        else return horas;
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
