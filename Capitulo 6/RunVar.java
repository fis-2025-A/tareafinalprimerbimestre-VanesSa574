package my_project.capitulo6;

public class RunVar {
    public static void main(String[] args) {
        // Uso de var con una instancia de Coin
        var coin = new Coin();
        var face = coin.getFace();
        System.out.println("Resultado de la moneda con var: " + face);

        // Uso de var con una instancia de Course
        var course = new Course("Curso de Python", 4, 1200.0, 0);
        System.out.println("Curso creado con var: " + course.getName());
        System.out.println("Duración: " + course.getNumberOfDays());
        System.out.println("Precio por persona: $" + course.getPricePerPerson());
    }
}

