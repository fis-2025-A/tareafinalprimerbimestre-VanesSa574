package my_project.detail;

public class TresEnRaya {
    private int[][] tablero;

    public TresEnRaya() {
        tablero = new int[3][3]; 
    }

    public boolean realizarMovimiento(int fila, int columna, int jugador) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == 0) {
            tablero[fila][columna] = jugador;
            return true;
        }
        return false;
    }

    public int verificarGanador() {
        // filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != 0 && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2])
                return tablero[i][0]; // fila
            if (tablero[0][i] != 0 && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i])
                return tablero[0][i]; // columna
        }

        // diagonales
        if (tablero[0][0] != 0 && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2])
            return tablero[0][0];
        if (tablero[0][2] != 0 && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0])
            return tablero[0][2];

        // Empate o juego no terminado
        return hayEspaciosLibres() ? 0 : -1;
    }

    public boolean hayEspaciosLibres() {
        for (int[] fila : tablero) {
            for (int celda : fila) {
                if (celda == 0)
                    return true;
            }
        }
        return false;
    }

    public void imprimirTablero() {
        System.out.println("Tablero:");
        for (int[] fila : tablero) {
            for (int celda : fila) {
                char simbolo = switch (celda) {
                    case 1 -> 'X';
                    case 2 -> 'O';
                    default -> ' ';
                };
                System.out.print("| " + simbolo + " ");
            }
            System.out.println("|");
        }
        System.out.println();
    }
}

