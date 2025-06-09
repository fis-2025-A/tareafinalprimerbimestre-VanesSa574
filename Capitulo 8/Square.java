package my_project.capitulo8;

public class Square extends OneDimensionalShape implements Drawable, Rotatable {
    public Square(java.awt.Point location, int side) {
        super(location, side);
    }

    @Override
    public void rotate() {
        System.out.println("Square rotated 90 degrees");
    }

    @Override
    public double getArea() {
        int side = getDimension();
        return side * side;
    }

    @Override
    public void draw(java.awt.Graphics g) {
        g.fillRect(location.x, location.y, getDimension(), getDimension());
    }
}
