package my_project.detail;

public abstract class Cuadrilatero {
    protected Punto p1, p2, p3, p4;

    public Cuadrilatero(Punto p1, Punto p2, Punto p3, Punto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public abstract double obtenerArea();
}
