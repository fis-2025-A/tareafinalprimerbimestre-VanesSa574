package my_project.capitulo8;
import java.awt.*;

public class ShapeRotationTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(new Point(50, 70), 80, 40);
        System.out.println("Área antes de rotar: " + rect.getArea());
        System.out.println("Alto: " + rect.getHeight() + " - Ancho: " + rect.getWidth());

        rect.rotate();

        System.out.println("Área después de rotar: " + rect.getArea());
        System.out.println("Alto: " + rect.getHeight() + " - Ancho: " + rect.getWidth());
    }
}

