package my_project.detail;

public enum LuzSemaforo {
    ROJO(30),
    VERDE(45),
    AMARILLO(5);

    private final int duracion;

    LuzSemaforo(int duracion) {
        this.duracion = duracion;
    }

    public int obtenerDuracion() {
        return duracion;
    }
}

