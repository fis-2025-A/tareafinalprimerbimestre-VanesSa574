package my_project.capitulo8;
import java.awt.Point;

public abstract class Shape {
    private Point location;
    private int[] dimensions;

    public Shape(Point location) {
        this.location = location;
        this.dimensions = new int[2];
    }

    public Point getLocation() {
        return location;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(int[] dims) {
        this.dimensions = dims;
    }

    public abstract double getArea();
}
