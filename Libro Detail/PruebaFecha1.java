package my_project.detail;

public class PruebaFecha1 {
    public static void main(String[] args) {
        Fecha1 f1 = new Fecha1(6, 8, 2025);
        Fecha1 f2 = new Fecha1("junio", 8, 2025);
        Fecha1 f3 = new Fecha1("06/08/2025");

        System.out.println("Formato 1:");
        f1.imprimirFormato1();

        System.out.println("Formato 2:");
        f2.imprimirFormato2();

        System.out.println("Formato 3:");
        f3.imprimirFormato3();
    }
}
