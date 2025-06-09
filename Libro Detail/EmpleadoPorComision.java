package my_project.detail;

public class EmpleadoPorComision {
    private String nombre;
    private String apellido;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String nss,
                               double ventas, double tarifa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = nss;
        this.ventasBrutas = ventas;
        this.tarifaComision = tarifa;
    }

    public double ingresos() {
        return ventasBrutas * tarifaComision;
    }

    public String toString() {
        return String.format("%s %s\nNSS: %s\nVentas: %.2f\nComisión: %.2f",
                nombre, apellido, numeroSeguroSocial, ventasBrutas, tarifaComision);
    }
}

