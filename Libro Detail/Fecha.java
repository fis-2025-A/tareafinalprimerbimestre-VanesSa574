package my_project.detail;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    private static final int[] diasPorMes = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public Fecha(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) mes = 1;
        if (anio < 0) anio = 2000;
        if (dia < 1 || dia > diasEnMes(mes, anio)) dia = 1;

        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    private boolean esBisiesto(int año) {
        return (año % 400 == 0 || (año % 4 == 0 && año % 100 != 0));
    }

    private int diasEnMes(int mes, int año) {
        if (mes == 2 && esBisiesto(año)) return 29;
        return diasPorMes[mes];
    }

    public void siguienteDia() {
        dia++;
        if (dia > diasEnMes(mes, anio)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }
}

