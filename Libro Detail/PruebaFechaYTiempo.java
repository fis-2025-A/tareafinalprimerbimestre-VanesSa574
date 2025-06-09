package my_project.detail;

public class PruebaFechaYTiempo {
    public static void main(String[] args) {
        FechaYTiempo fyt = new FechaYTiempo(31, 12, 2023, 23, 0, 0);
        System.out.println("Fecha y hora inicial: " + fyt.aStringUniversal());

        for (int i = 0; i < 2; i++) {
            fyt.incrementarHora();
            System.out.println("Después de incrementarHora: " + fyt.aStringUniversal());
        }
    }
}
