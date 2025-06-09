package my_project.capitulo8;

public class RectangleTest {
    public static void main(String[] args) {
        java.awt.Point p = new java.awt.Point(0, 0);
        Rectangle r = new Rectangle(p, 20, 10);
        r.setDimensions(new int[]{15, 5});
        System.out.println("Width: " + r.getWidth());
        System.out.println("Height: " + r.getHeight());
        System.out.println("Área: " + r.getArea());

    }
}

