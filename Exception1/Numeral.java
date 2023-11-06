public class Numeral extends Expression {
    private double value;

    /**
     * constructor1.
     */
    public Numeral() {
    }

    /**
     * constructor2.
     */
    public Numeral(double value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "" + (int) value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
