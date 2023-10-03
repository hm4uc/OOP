public class Square extends Rectangle {
    /**
     * constructor1.
     */
    public Square() {
    }

    /**
     * constructor2.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * constructor3.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[" + "side=" + getSide() + ",color=" + super.getColor()
                + ",filled=" + super.isFilled() + ']';
    }
}
