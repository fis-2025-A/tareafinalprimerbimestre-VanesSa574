package my_project.detail;

public class PruebaTiempo2 {
    public static void main(String[] args) {
        Tiempo2 tiempo = new Tiempo2(13, 45, 30);  // 1:45:30 PM

        System.out.println("Hora universal: " + tiempo.aStringUniversal());
        System.out.println("Hora estándar: " + tiempo.toString());

        // Verificar que los métodos obtener funcionan
        System.out.println("Hora: " + tiempo.obtenerHora());
        System.out.println("Minuto: " + tiempo.obtenerMinuto());
        System.out.println("Segundo: " + tiempo.obtenerSegundo());

        // Probar con datos inválidos
        tiempo.establecerTiempo(99, 99, 99); // se deben ajustar a 00:00:00

        System.out.println("\nDespués de establecer tiempo inválido:");
        System.out.println("Hora universal: " + tiempo.aStringUniversal());
        System.out.println("Hora estándar: " + tiempo.toString());
    }
}
