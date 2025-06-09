package my_project.detail;

public class PruebaTiempo2M {
    public static void main(String[] args) {
        Tiempo2_M t = new Tiempo2_M(1, 59, 58);
        System.out.println("Estado inicial: " + t.aStringUniversal());

        t.ticTac(); // 1:59:59
        System.out.println("Después de ticTac: " + t.aStringUniversal());

        t.ticTac(); // 2:00:00
        System.out.println("Después de otro ticTac: " + t.aStringUniversal());

        t.incrementarMinuto(); // 2:01:00
        System.out.println("Después de incrementarMinuto: " + t.aStringUniversal());

        t.incrementarHora(); // 3:01:00
        System.out.println("Después de incrementarHora: " + t.aStringUniversal());

        // Prueba de paso de día
        Tiempo2_M t2 = new Tiempo2_M(23, 59, 59);
        System.out.println("\nCasi medianoche: " + t2.aStringUniversal());
        t2.ticTac();
        System.out.println("Después de ticTac (nuevo día): " + t2.aStringUniversal());
    }
}

