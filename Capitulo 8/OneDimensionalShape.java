package my_project.capitulo8;

public abstract class OneDimensionalShape extends Shape {
    public OneDimensionalShape(java.awt.Point location, int dimension) {
        super(location);
        setDimensions(new int[]{dimension});
    }

    public void setDimensions(int[] dims) {
        if (dims.length == 1) {
            super.setDimensions(dims);
        }
    }

    public int getDimension() {
        return getDimensions()[0];
    }
}

