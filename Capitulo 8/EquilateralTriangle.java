package my_project.capitulo8;
import java.awt.*;

public class EquilateralTriangle extends TwoDimensionalShape implements Drawable {

    public EquilateralTriangle(Point location, int sideLength) {
        super(location, sideLength, sideLength); // ambos "height" y "width" serán el lado
    }

    @Override
    public double getArea() {
        int side = getHeight(); // o getWidth(), son iguales
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public void draw(Graphics g) {
        int side = getHeight(); // o getWidth()
        int x = getLocation().x;
        int y = getLocation().y;

        // Coordenadas de un triángulo equilátero apuntando hacia arriba
        int[] xPoints = {x, x + side / 2, x - side / 2};
        int[] yPoints = {y, y + (int)(Math.sqrt(3)/2 * side), y + (int)(Math.sqrt(3)/2 * side)};

        g.fillPolygon(xPoints, yPoints, 3);
    }
}

