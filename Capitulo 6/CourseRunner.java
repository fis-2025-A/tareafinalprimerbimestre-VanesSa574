package my_project.capitulo6;

public class CourseRunner {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java", 5, 1500.0, 20);

        System.out.println(javaCourse.getName() + " dura " +
            javaCourse.getNumberOfDays() + " días, cuesta " +
            javaCourse.getPricePerPerson() + " por persona y acepta hasta " +
            javaCourse.getMaximumParticipants() + " participantes.");

        System.out.println("Cursos creados: " + Course.getNumberOfCoursesCreated());
        System.out.println("Compañía: " + Course.COMPANY_NAME);
        
        // Ejercicio 6.2 prueba el metodo en el main
        System.out.println("Precio con 20% descuento: " + javaCourse.discountedCostPerPerson(20));
        
        // Ejercicio 6.4 main
        double costePorCabeza = Course.flatRatePerHead(5000.0, 20);
        System.out.println("Costo por cabeza tarifa plana: " + costePorCabeza);

    }
    
    
}



