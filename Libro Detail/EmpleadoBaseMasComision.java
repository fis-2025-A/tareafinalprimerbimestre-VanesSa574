package my_project.detail;

public class EmpleadoBaseMasComision {
    private EmpleadoPorComision empleado;
    private double salarioBase;

    public EmpleadoBaseMasComision(EmpleadoPorComision empleado, double salarioBase) {
        this.empleado = empleado;
        this.salarioBase = salarioBase;
    }

    public double ingresos() {
        return salarioBase + empleado.ingresos();
    }

    public String toString() {
        return empleado.toString() + String.format("\nSalario base: %.2f", salarioBase);
    }
}

