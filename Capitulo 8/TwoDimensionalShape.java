package my_project.capitulo8;

public abstract class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape(java.awt.Point location, int height, int width) {
        super(location);
        setDimensions(new int[]{height, width});
    }

    public void setDimensions(int[] dims) {
        if (dims.length == 2) {
            super.setDimensions(dims);
        }
    }

    public int getHeight() {
        return getDimensions()[0];
    }

    public int getWidth() {
        return getDimensions()[1];
    }
    public abstract double getArea();
}
