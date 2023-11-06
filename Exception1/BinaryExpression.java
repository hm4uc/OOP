public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * constructor 1.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
