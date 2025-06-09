package my_project.detail;

public class PruebaFiguras {
 public static void main(String[] args) {
     Figura[] figuras = new Figura[4];

     figuras[0] = new Circulo(5.0);
     figuras[1] = new Cuadrado(4.0);
     figuras[2] = new Esfera(3.0);
     figuras[3] = new Cubo(2.0);

     for (Figura figura : figuras) {
         System.out.println(figura.toString());

         if (figura instanceof FiguraBidimensional) {
             FiguraBidimensional f2D = (FiguraBidimensional) figura;
             System.out.printf("Área: %.2f\n\n", f2D.obtenerArea());
         } else if (figura instanceof FiguraTridimensional) {
             FiguraTridimensional f3D = (FiguraTridimensional) figura;
             System.out.printf("Área superficial: %.2f\n", f3D.obtenerArea());
             System.out.printf("Volumen: %.2f\n\n", f3D.obtenerVolumen());
         }
     }
 }
}

