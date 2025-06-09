package my_project.detail;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear empleado por comisión
        EmpleadoPorComision empleadoBase = new EmpleadoPorComision(
            "Ana", "Pérez", "123-45-6789", 10000.00, 0.06
        );

        // Crear empleado base más comisión usando composición
        EmpleadoBaseMasComision empleadoCompuesto = new EmpleadoBaseMasComision(
            empleadoBase, 500.00
        );

        // Mostrar información
        System.out.println("Información del empleado con salario base más comisión:\n");
        System.out.println(empleadoCompuesto.toString());
        System.out.printf("Ingresos totales: %.2f\n", empleadoCompuesto.ingresos());
    }
}
