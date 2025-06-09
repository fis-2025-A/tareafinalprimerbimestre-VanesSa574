package my_project.detail;

public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        CuentaAhorros.modificarTasaInteres(0.04); // 4%

        CuentaAhorros ahorrador1 = new CuentaAhorros(2000.00);
        CuentaAhorros ahorrador2 = new CuentaAhorros(3000.00);

        // Calcular interés por un mes
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.printf("Ahorrador1 saldo: %.2f\n", ahorrador1.obtenerSaldo());
        System.out.printf("Ahorrador2 saldo: %.2f\n", ahorrador2.obtenerSaldo());

        // Cambiar tasa a 5%
        CuentaAhorros.modificarTasaInteres(0.05);

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.printf("Ahorrador1 saldo con 5%%: %.2f\n", ahorrador1.obtenerSaldo());
        System.out.printf("Ahorrador2 saldo con 5%%: %.2f\n", ahorrador2.obtenerSaldo());
    }
}
