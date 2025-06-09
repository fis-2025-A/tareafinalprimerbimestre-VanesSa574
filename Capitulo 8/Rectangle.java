package my_project.capitulo8;
import java.awt.*;

public class Rectangle extends TwoDimensionalShape implements Drawable, Rotatable {
    public Rectangle(Point location, int width, int height) {
        super(location, height, width);
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public void draw(Graphics g) {
        Point loc = getLocation();
        g.fillRect(loc.x, loc.y, getWidth(), getHeight());
    }

    @Override
    public void rotate() {
        // intercambiar alto y ancho
        int temp = getHeight();
        setDimensions(new int[]{getWidth(), temp});
    }
}
