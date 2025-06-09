package my_project.detail;
import static java.lang.System.out;

public class PruebaTiempo2Static {
    public static void main(String[] args) {
        Tiempo2 t = new Tiempo2(); // se asume que ya existe la clase Tiempo2

        out.println("Hora universal inicial: " + t.aStringUniversal());
        out.println("Hora estándar inicial: " + t.toString());

        t.establecerTiempo(13, 27, 6);
        out.println("\nHora universal después de establecerTiempo: " + t.aStringUniversal());
        out.println("Hora estándar después de establecerTiempo: " + t.toString());

        t.establecerTiempo(99, 99, 99); // valores inválidos
        out.println("\nDespués de establecer tiempo inválido:");
        out.println("Hora universal: " + t.aStringUniversal());
        out.println("Hora estándar: " + t.toString());
    }
}
