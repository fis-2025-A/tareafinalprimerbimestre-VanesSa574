package my_project.detail;

public class FechaYTiempo {
    private Tiempo2 tiempo;
    private Fecha fecha;

    public FechaYTiempo(int d, int m, int a, int h, int min, int s) {
        tiempo = new Tiempo2(h, min, s);
        fecha = new Fecha(d, m, a);
    }

    public void incrementarHora() {
        int horaAnterior = tiempo.obtenerHora();
        tiempo.incrementarHora();
        if (tiempo.obtenerHora() < horaAnterior) {
            fecha.siguienteDia(); // nueva fecha si pasamos de 23 a 0
        }
    }

    public String aStringUniversal() {
        return fecha.toString() + " " + tiempo.aStringUniversal();
    }

    public String aStringEstandar() {
        return fecha.toString() + " " + tiempo.toString();
    }
}

