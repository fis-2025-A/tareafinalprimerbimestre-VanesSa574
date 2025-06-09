package my_project.detail;

public class PruebaCuadrilatero {
    public static void main(String[] args) {
    	Punto p1 = new Punto(0, 0);  // esquina inferior izquierda
    	Punto p2 = new Punto(4, 0);  // esquina inferior derecha
    	Punto p3 = new Punto(4, 3);  // esquina superior derecha
    	Punto p4 = new Punto(0, 3);  // esquina superior izquierda


        Cuadrilatero[] figuras = {
            new Trapecio(p1, p2, p3, p4),
            new Rectangulo1(p1, p2, p3, p4),
        };

        for (Cuadrilatero c : figuras) {
            System.out.printf("Clase: %s, Área: %.2f%n", c.getClass().getSimpleName(), c.obtenerArea());
        }
    }
}

