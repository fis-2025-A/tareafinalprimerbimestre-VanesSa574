package my_project.detail;

public class Circulo extends FiguraBidimensional {
 private double radio;

 public Circulo(double radio) {
     this.radio = radio;
 }

 @Override
 public double obtenerArea() {
     return Math.PI * radio * radio;
 }

 @Override
 public String toString() {
     return "Círculo - Radio: " + radio;
 }
}

