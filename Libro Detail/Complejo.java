package my_project.detail;

public class Complejo {
    private double parteReal;
    private double parteImaginaria;

    public Complejo(double real, double imaginaria) {
        parteReal = real;
        parteImaginaria = imaginaria;
    }

    public Complejo sumar(Complejo otro) {
        return new Complejo(
            this.parteReal + otro.parteReal,
            this.parteImaginaria + otro.parteImaginaria
        );
    }

    public Complejo restar(Complejo otro) {
        return new Complejo(
            this.parteReal - otro.parteReal,
            this.parteImaginaria - otro.parteImaginaria
        );
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", parteReal, parteImaginaria);
    }
}

