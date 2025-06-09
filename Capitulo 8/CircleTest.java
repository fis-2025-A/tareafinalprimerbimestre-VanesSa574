package my_project.capitulo8;

public class CircleTest {
    public static void main(String[] args) {
        java.awt.Point location = new java.awt.Point(5, 5);
        Circle myCircle = new Circle(location, 3); // Crea un círculo de radio 3

        myCircle.setDimensions(new int[]{7}); // Cambia el radio a 7

        System.out.println("El radio del círculo es: " + myCircle.getDimension());
    }
}

