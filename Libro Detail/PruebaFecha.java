package my_project.detail;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(28, 2, 2024); // Año bisiesto
        System.out.println("Fecha inicial: " + fecha);

        for (int i = 0; i < 5; i++) {
            fecha.siguienteDia();
            System.out.println("Día siguiente: " + fecha);
        }

        // Cambio de mes y año
        Fecha f2 = new Fecha(31, 12, 2023);
        System.out.println("\nFecha final del año: " + f2);
        f2.siguienteDia();
        System.out.println("Después de siguienteDía: " + f2);
    }
}

