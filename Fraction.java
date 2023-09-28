public class Solution {
    private int numerator;
    private int denominator;

    /**
     * default init.
     */
    public Solution() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * Constructor Solution class.
     *
     * @param numerator   value
     * @param denominator value
     */
    public Solution(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    /**
     * setter.
     *
     * @param numerator value
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * setter.
     *
     * @param denominator value
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * getter.
     *
     * @return numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * getter.
     *
     * @return denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * reduce.
     */
    public Solution reduce() {
        int a = Math.abs(this.numerator);
        int b = Math.abs(this.denominator);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        a = Math.abs(a);
        this.numerator /= a;
        this.denominator /= a;
        return this;
    }

    /**
     * add.
     */
    public Solution add(Solution x) {
        numerator = numerator * x.getDenominator() + denominator * x.getNumerator();
        denominator = denominator * x.getDenominator();
        Solution ans = new Solution(numerator, denominator);
        return ans;
    }

    /**
     * subtract.
     */
    public Solution subtract(Solution x) {
        numerator = numerator * x.getDenominator() - x.getNumerator() * denominator;
        denominator = denominator * x.getDenominator();
        Solution ans = new Solution(numerator, denominator);
        return ans;
    }

    /**
     * multiply.
     *
     * @param x is another fraction
     */
    public Solution multiply(Solution x) {
        numerator *= x.getNumerator();
        denominator *= x.getDenominator();
        Solution ans = new Solution(numerator, denominator);
        return ans;
    }

    /**
     * divide.
     *
     * @param x is another fraction
     */
    public Solution divide(Solution x) {
        if (x.getNumerator() != 0) {
            numerator *= x.getDenominator();
            denominator *= x.getNumerator();
        }
        Solution ans = new Solution(numerator, denominator);
        return ans;
    }

    /**
     * equals.
     *
     * @param obj is a fraction to equal
     * @return true or false
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            if (other.getDenominator() == 0) {
                return false;
            }
            Solution p = new Solution(numerator, denominator);
            p.reduce();
            other.reduce();
            return p.getNumerator() == other.getNumerator()
                    &&
                    p.getDenominator() == other.getDenominator();
        } else {
            return false;
        }
    }
}