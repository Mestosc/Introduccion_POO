/**
 * Representacion de una fecha
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    private boolean esBisiesto;

    /**
     * Definimos un dia
     * @param dia el dia que definimos en el calendario
     * @param mes el mes que definimos en el calendario
     * @param ano el año que definimos en el calendario
     */
    public Fecha(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    /// Sirve para averiguar si el año es bisiesto
    /// ```java
    /// if ano MOD 4 == 0 && (ano MOD 100 !=0 || ano MOD 400 == 0)
    /// ```
    /// Es decir si el resto de **ano/4** es igual a 0 y el resto de **ano/100** es distinto a 0 o el resto de **ano/400** es igual a 0 es bisiesto
    /// @return si es bisiesto
    private boolean isEsBisiesto() {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }

    /**
     * Obtener dia por mes
     * @return la cantidad de dias por mes
     */
    private int obtenerDiasMes() {
        if (mes < 1 || mes > 12) {
            return 1;
        }
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (esBisiesto) {
            diasPorMes[1] = 29;
        }

        return diasPorMes[mes - 1];
    }

    /**
     * Incrementa el mes en uno
     */
    public void incrementarMes() {
        if (mes < 12) {
            mes += 1;
            if (dia>obtenerDiasMes()) {
                incrementarDia();
            }
        }
        else if (mes==12) {
            mes = 1;
            dia = 1;
            incrementarAno();
        }
    }
    public void incrementarAno() {
        ano += 1;
        esBisiesto = isEsBisiesto();
    }
    public void incrementarDia() {
        int diasPorMes = obtenerDiasMes();
        if (dia<diasPorMes) {
            this.dia += 1;
        }
        else {
            this.dia = 1;
            incrementarMes();
        }
    }
    public boolean equals(Fecha fecha) {
        return this.dia == fecha.dia && this.mes == fecha.mes && this.ano == fecha.ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        int diasPorMes = obtenerDiasMes();
        if (dia<=diasPorMes && dia>=1) {
            this.dia = dia;
        }
        else if (dia>diasPorMes) {
            this.dia = 1;
            incrementarMes();
        }
        else {
            this.dia = 1;
            this.mes = 1;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes<=12 && mes>=1) {
            this.mes = mes;
        }
        else if (mes<1) {
            this.mes = 1;
        }
        else {
            incrementarAno();
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano>=0) {
            this.ano = ano;
        }
        esBisiesto = isEsBisiesto();
    }
}
