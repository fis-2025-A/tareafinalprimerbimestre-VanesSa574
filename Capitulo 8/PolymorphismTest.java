package my_project.capitulo8;

public class PolymorphismTest {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(null, 5),
            new Rectangle(null, 4, 6),
            new Square(null, 3)
        };
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " area: " + s.getArea());
        }
    }
}
