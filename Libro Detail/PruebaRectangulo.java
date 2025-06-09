package my_project.detail;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Punto a = new Punto(0, 0);
        Punto b = new Punto(0, 4);
        Punto c = new Punto(3, 4);
        Punto d = new Punto(3, 0);

        Rectangulo r = new Rectangulo(a, b, c, d);

        System.out.printf("Longitud: %.2f%n", r.longitud());
        System.out.printf("Anchura: %.2f%n", r.anchura());
        System.out.printf("Área: %.2f%n", r.area());
        System.out.printf("Perímetro: %.2f%n", r.perimetro());
        System.out.println("¿Es cuadrado?: " + r.esCuadrado());
    }
}


