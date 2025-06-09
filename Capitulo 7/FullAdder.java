package my_project.capitulo7;

class FullAdder {
    private HalfAdder ha1 = new HalfAdder();
    private HalfAdder ha2 = new HalfAdder();
    private OrGate or = new OrGate();

    private int result;
    private int carryOut;

    public void setInput(int bitA, int bitB, int carryIn) {
        ha1.setInput(bitA, bitB);
        int sum1 = ha1.getResult();
        int carry1 = ha1.getCarry();

        ha2.setInput(sum1, carryIn);
        result = ha2.getResult();
        int carry2 = ha2.getCarry();

        carryOut = or.getOutput(carry1, carry2);
    }

    public int getResult() {
        return result;
    }

    public int getCarryOut() {
        return carryOut;
    }
}

