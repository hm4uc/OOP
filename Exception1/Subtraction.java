public class Subtraction extends BinaryExpression {
    /**
     * constructor1.
     */
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
