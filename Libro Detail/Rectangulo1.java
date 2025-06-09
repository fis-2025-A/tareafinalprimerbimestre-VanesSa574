package my_project.detail;

public class Rectangulo1 extends Cuadrilatero {
    private double ancho, alto;

    public Rectangulo1(Punto p1, Punto p2, Punto p3, Punto p4) {
        super(p1, p2, p3, p4);
        this.ancho = Math.abs(p2.getX() - p1.getX());
        this.alto = Math.abs(p2.getY() - p3.getY());
    }

    public double obtenerArea() {
        return ancho * alto;
    }
}

