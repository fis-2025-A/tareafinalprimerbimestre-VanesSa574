package my_project.detail;

public class ConjuntoEnteros {
    private static final int TAMANIO = 101;
    private boolean[] conjunto;

    // Constructor: conjunto vacío
    public ConjuntoEnteros() {
        conjunto = new boolean[TAMANIO];
    }

    public static ConjuntoEnteros union(ConjuntoEnteros a, ConjuntoEnteros b) {
        ConjuntoEnteros resultado = new ConjuntoEnteros();
        for (int i = 0; i < TAMANIO; i++) {
            resultado.conjunto[i] = a.conjunto[i] || b.conjunto[i];
        }
        return resultado;
    }

    public static ConjuntoEnteros interseccion(ConjuntoEnteros a, ConjuntoEnteros b) {
        ConjuntoEnteros resultado = new ConjuntoEnteros();
        for (int i = 0; i < TAMANIO; i++) {
            resultado.conjunto[i] = a.conjunto[i] && b.conjunto[i];
        }
        return resultado;
    }

    // Insertar elemento
    public void insertarElemento(int k) {
        if (k >= 0 && k < TAMANIO) {
            conjunto[k] = true;
        }
    }

    // Eliminar elemento
    public void eliminarElemento(int m) {
        if (m >= 0 && m < TAMANIO) {
            conjunto[m] = false;
        }
    }

    // Convertir conjunto a cadena
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean vacio = true;
        for (int i = 0; i < TAMANIO; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
                vacio = false;
            }
        }
        return vacio ? "---" : sb.toString().trim();
    }

    public boolean esIgualA(ConjuntoEnteros otro) {
        for (int i = 0; i < TAMANIO; i++) {
            if (this.conjunto[i] != otro.conjunto[i]) {
                return false;
            }
        }
        return true;
    }
}

