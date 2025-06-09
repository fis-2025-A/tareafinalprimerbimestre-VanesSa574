package my_project.detail;

public class PruebaLuzSemaforo {
    public static void main(String[] args) {
        for (LuzSemaforo luz : LuzSemaforo.values()) {
            System.out.printf("%s dura %d segundos%n", luz, luz.obtenerDuracion());
        }
    }
}
