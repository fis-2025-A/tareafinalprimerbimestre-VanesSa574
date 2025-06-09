package my_project.detail;

public class Racional {
    private int numerador;
    private int denominador;

    public Racional() {
        this(0, 1);
    }

    public Racional(int num, int den) {
        if (den == 0)
            throw new IllegalArgumentException("Denominador no puede ser 0.");
        int mcd = mcd(num, den);
        this.numerador = num / mcd;
        this.denominador = den / mcd;

        // Normalizar signos
        if (this.denominador < 0) {
            this.numerador *= -1;
            this.denominador *= -1;
        }
    }

    private int mcd(int a, int b) {
        return (b == 0) ? Math.abs(a) : mcd(b, a % b);
    }

    public Racional sumar(Racional otro) {
        int num = this.numerador * otro.denominador + otro.numerador * this.denominador;
        int den = this.denominador * otro.denominador;
        return new Racional(num, den);
    }

    public Racional restar(Racional otro) {
        int num = this.numerador * otro.denominador - otro.numerador * this.denominador;
        int den = this.denominador * otro.denominador;
        return new Racional(num, den);
    }

    public Racional multiplicar(Racional otro) {
        return new Racional(this.numerador * otro.numerador, this.denominador * otro.denominador);
    }

    public Racional dividir(Racional otro) {
        return new Racional(this.numerador * otro.denominador, this.denominador * otro.numerador);
    }

    public String aCadena() {
        return numerador + "/" + denominador;
    }

    public String aDecimal(int decimales) {
        double valor = (double) numerador / denominador;
        return String.format("%." + decimales + "f", valor);
    }
}

