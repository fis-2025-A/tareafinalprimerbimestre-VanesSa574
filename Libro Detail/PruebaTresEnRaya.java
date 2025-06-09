package my_project.detail;

import java.util.Scanner;

public class PruebaTresEnRaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TresEnRaya juego = new TresEnRaya();
        int jugadorActual = 1;

        while (true) {
            juego.imprimirTablero();
            System.out.printf("Jugador %d (X para 1, O para 2), ingrese fila y columna (0-2): ", jugadorActual);
            int fila = sc.nextInt();
            int columna = sc.nextInt();

            if (!juego.realizarMovimiento(fila, columna, jugadorActual)) {
                System.out.println("Movimiento inválido. Intente de nuevo.");
                continue;
            }

            int resultado = juego.verificarGanador();
            if (resultado == 1 || resultado == 2) {
                juego.imprimirTablero();
                System.out.printf("¡Jugador %d ha ganado!\n", resultado);
                break;
            } else if (resultado == -1) {
                juego.imprimirTablero();
                System.out.println("¡Empate!");
                break;
            }

            jugadorActual = (jugadorActual == 1) ? 2 : 1;
        }

        sc.close();
    }
}

