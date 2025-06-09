package my_project.detail;

public class CuentaAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaAhorros(double saldoInicial) {
        saldoAhorros = saldoInicial;
    }

    public void calcularInteresMensual() {
        double interesMensual = (saldoAhorros * tasaInteresAnual) / 12;
        saldoAhorros += interesMensual;
    }

    public double obtenerSaldo() {
        return saldoAhorros;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }
}

