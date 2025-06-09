package my_project.detail;

public class Esfera extends FiguraTridimensional {
 private double radio;

 public Esfera(double radio) {
     this.radio = radio;
 }

 @Override
 public double obtenerArea() {
     return 4 * Math.PI * radio * radio;
 }

 @Override
 public double obtenerVolumen() {
     return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
 }

 @Override
 public String toString() {
     return "Esfera - Radio: " + radio;
 }
}

