package my_project.detail;

public class PruebaValidacionTiempo2 {
    public static void main(String[] args) {
        Tiempo2 t = new Tiempo2();

        if (!t.establecerHora(25)) {
            System.out.println("Error: hora inválida");
        }

        if (!t.establecerMinuto(70)) {
            System.out.println("Error: minuto inválido");
        }

        if (!t.establecerSegundo(-1)) {
            System.out.println("Error: segundo inválido");
        }

        // Establecer valores válidos
        t.establecerHora(12);
        t.establecerMinuto(30);
        t.establecerSegundo(45);

        System.out.println("Tiempo corregido: " + t.aStringUniversal());
    }
}

