package my_project.detail;

public class Tiempo2_M {
    private int segundosDesdeMedianoche;

    public Tiempo2_M() {
        this(0, 0, 0);
    }

    public Tiempo2_M(int h, int m, int s) {
        establecerTiempo(h, m, s);
    }

    public void establecerTiempo(int h, int m, int s) {
        if (h < 0 || h >= 24) h = 0;
        if (m < 0 || m >= 60) m = 0;
        if (s < 0 || s >= 60) s = 0;
        segundosDesdeMedianoche = h * 3600 + m * 60 + s;
    }

    public int obtenerHora() {
        return segundosDesdeMedianoche / 3600;
    }

    public int obtenerMinuto() {
        return (segundosDesdeMedianoche % 3600) / 60;
    }

    public int obtenerSegundo() {
        return segundosDesdeMedianoche % 60;
    }

    public void incrementarHora() {
        segundosDesdeMedianoche += 3600;
        segundosDesdeMedianoche %= 86400;
    }

    public void incrementarMinuto() {
        segundosDesdeMedianoche += 60;
        segundosDesdeMedianoche %= 86400;
    }

    public void ticTac() {
        segundosDesdeMedianoche++;
        segundosDesdeMedianoche %= 86400;
    }

    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }

    public String toString() {
        int hora = obtenerHora();
        return String.format("%d:%02d:%02d %s",
                (hora == 0 || hora == 12) ? 12 : hora % 12,
                obtenerMinuto(), obtenerSegundo(),
                (hora < 12 ? "AM" : "PM"));
    }
}

