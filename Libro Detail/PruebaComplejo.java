package my_project.detail;

public class PruebaComplejo {
    public static void main(String[] args) {
        Complejo c1 = new Complejo(2.0, 3.5);
        Complejo c2 = new Complejo(1.5, -2.5);

        Complejo suma = c1.sumar(c2);
        Complejo resta = c1.restar(c2);

        System.out.println("Número complejo 1: " + c1);
        System.out.println("Número complejo 2: " + c2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
}

