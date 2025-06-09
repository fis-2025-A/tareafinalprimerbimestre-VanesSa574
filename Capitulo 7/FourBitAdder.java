package my_project.capitulo7;

public class FourBitAdder {
    public static void main(String[] args) {
        int[] A = {1, 0, 1, 1}; // Número A en binario (1011 = 11)
        int[] B = {1, 1, 0, 1}; // Número B en binario (1101 = 13)

        int[] result = new int[4];
        int carryIn = 0;

        for (int i = 3; i >= 0; i--) {
            FullAdder fa = new FullAdder();
            fa.setInput(A[i], B[i], carryIn);
            result[i] = fa.getResult();
            carryIn = fa.getCarryOut();
        }

        System.out.print("Resultado: ");
        for (int bit : result) {
            System.out.print(bit);
        }
        System.out.println("\nCarry final: " + carryIn);

        // Ejercicio 7.4 mostrar en decimal 
        int decimalA = binaryToDecimal(A);
        int decimalB = binaryToDecimal(B);
        int decimalSum = decimalA + decimalB;
        System.out.println("A = " + decimalA + ", B = " + decimalB);
        System.out.println("Suma total en decimal: " + decimalSum);
    }

    public static int binaryToDecimal(int[] bits) {
        int result = 0;
        int power = 0;
        for (int i = bits.length - 1; i >= 0; i--) {
            result += bits[i] * (1 << power);
            power++;
        }
        return result;
    }
}