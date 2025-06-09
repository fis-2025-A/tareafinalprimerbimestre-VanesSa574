package my_project.detail;

public class PruebaConjuntoEnteros {
    public static void main(String[] args) {
        ConjuntoEnteros a = new ConjuntoEnteros();
        ConjuntoEnteros b = new ConjuntoEnteros();

        a.insertarElemento(10);
        a.insertarElemento(20);
        a.insertarElemento(30);

        b.insertarElemento(20);
        b.insertarElemento(40);

        System.out.println("Conjunto A: " + a);
        System.out.println("Conjunto B: " + b);

        ConjuntoEnteros union = ConjuntoEnteros.union(a, b);
        System.out.println("Unión: " + union);

        ConjuntoEnteros interseccion = ConjuntoEnteros.interseccion(a, b);
        System.out.println("Intersección: " + interseccion);

        a.eliminarElemento(10);
        System.out.println("Conjunto A después de eliminar 10: " + a);

        System.out.println("¿A es igual a B?: " + a.esIgualA(b));
    }
}

