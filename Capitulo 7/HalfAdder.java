package my_project.capitulo7;

class HalfAdder {
    private int result;
    private int carry;

    public void setInput(int bitA, int bitB) {
        result = bitA ^ bitB; // XOR
        carry = bitA & bitB; // AND
    }

    public int getResult() {
        return result;
    }

    public int getCarry() {
        return carry;
    }
}
