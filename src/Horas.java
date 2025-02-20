
public class Horas {
    private int horas;
    private int minutos;
    private int segundos;
    formato formatoTiempo;
    private String mananaTarde;

    public Horas(int horas, int minutos, int segundos, String formatoTiempo) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
        this.formatoTiempo = formato.valueOf(formatoTiempo.toUpperCase());
        setMananaTarde();
    }

    /**
     * Seteamos si es A.M. o P.M. dependiendo de como sea la hora almacenada
     */
    private void setMananaTarde() {
        if (formatoTiempo.equals(formato.F12)) {
            if (horas<=12) {
                this.mananaTarde = "A.M.";
            }
            else {
                this.mananaTarde = "P.M.";
            }
        }
    }

    @Override
    public String toString() {
        if (formatoTiempo.equals(formato.F12)) return getHoras() + ":" + minutos + ":" + segundos + " " + mananaTarde;
        else return getHoras() + ":" + minutos + ":" + segundos + " ";
    }

    public int getHoras() {
        int horasMostrar=horas;
        if (formatoTiempo.equals(formato.F12)) {
            if (horas>12) horasMostrar -= 12;
            if (horas==0) horasMostrar = 12;
        }
        return horasMostrar;
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
