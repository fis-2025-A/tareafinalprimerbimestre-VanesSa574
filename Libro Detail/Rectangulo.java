package my_project.detail;

public class Rectangulo {
    private Punto p1, p2, p3;

    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        // Validación muy básica: asumimos p1-p2 y p3-p4 son lados opuestos
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double longitud() {
        return Math.max(p1.distancia(p2), p2.distancia(p3));
    }

    public double anchura() {
        return Math.min(p1.distancia(p2), p2.distancia(p3));
    }

    public double area() {
        return longitud() * anchura();
    }

    public double perimetro() {
        return 2 * (longitud() + anchura());
    }

    public boolean esCuadrado() {
        return Math.abs(longitud() - anchura()) < 0.0001;
    }
}
