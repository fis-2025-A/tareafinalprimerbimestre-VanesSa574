package my_project.detail;

public class PruebaRacional {
    public static void main(String[] args) {
        Racional r1 = new Racional(2, 4);
        Racional r2 = new Racional(3, 5);

        System.out.println("Racional 1: " + r1.aCadena());
        System.out.println("Racional 2: " + r2.aCadena());

        Racional suma = r1.sumar(r2);
        System.out.println("Suma: " + suma.aCadena());

        Racional resta = r1.restar(r2);
        System.out.println("Resta: " + resta.aCadena());

        Racional producto = r1.multiplicar(r2);
        System.out.println("Multiplicación: " + producto.aCadena());

        Racional division = r1.dividir(r2);
        System.out.println("División: " + division.aCadena());

        System.out.println("Racional 1 en decimal (4 decimales): " + r1.aDecimal(4));
    }
}

