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

    /**
     * constructor4.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
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
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Square[" + "topLeft=" + topLeft.toString()
                + ",side=" + (double) Math.round(getSide() * 10) / 10
                + ",color=" + getColor() + ",filled=" + isFilled() + ']';
    }
}
