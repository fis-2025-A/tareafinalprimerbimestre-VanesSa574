package my_project.detail;

public class Tiempo2 {
    private int segundosDesdeMedianoche;

    public Tiempo2() {
        this(0, 0, 0);
    }

    public Tiempo2(int h, int m, int s) {
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

    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d",
                obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }

    public String toString() {
        int hora = obtenerHora();
        return String.format("%d:%02d:%02d %s",
                (hora == 0 || hora == 12) ? 12 : hora % 12,
                obtenerMinuto(), obtenerSegundo(),
                (hora < 12 ? "AM" : "PM"));
    }
    public boolean establecerHora(int h) {
        if (h >= 0 && h < 24) {
            segundosDesdeMedianoche = (segundosDesdeMedianoche % 3600) + h * 3600;
            return true;
        }
        return false;
    }

    public boolean establecerMinuto(int m) {
        if (m >= 0 && m < 60) {
            int horas = obtenerHora();
            int segundos = obtenerSegundo();
            segundosDesdeMedianoche = horas * 3600 + m * 60 + segundos;
            return true;
        }
        return false;
    }

    public boolean establecerSegundo(int s) {
        if (s >= 0 && s < 60) {
            int horas = obtenerHora();
            int minutos = obtenerMinuto();
            segundosDesdeMedianoche = horas * 3600 + minutos * 60 + s;
            return true;
        }
        return false;
    }

	public void incrementarHora() {
		
	}

}
