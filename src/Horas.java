
public class Horas {
    private int horas;
    private int minutos;
    private int segundos;
    formato formatoTiempo;

    public Horas(int horas, int minutos, int segundos, String formato) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
        setFormatoTiempo(formato);
    }
    public void setFormatoTiempo(String formatoTiempo) {
        if (formatoTiempo.equals("12") || formatoTiempo.equalsIgnoreCase("f12")) {
            this.formatoTiempo = formato.F12;
        }
        else {
            this.formatoTiempo = formato.F24;
        }
    }
    /**
     * Obtenemos A.M o P.M dependiendo de la hora que sea
     */
    private String getMananaTarde() {
        if (horas<=12) {
            return "A.M.";
        }
        else {
            return "P.M.";
        }
    }

    @Override
    public String toString() {
        if (formatoTiempo == formato.F24) return "%d:%d:%d".formatted(getHoras(),minutos,segundos);
        else return "%d:%d:%d %s".formatted(getHoras(),minutos,segundos,getMananaTarde());
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
