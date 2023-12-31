import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * contructor1.
     */
    public Rectangle() {
    }

    /**
     * constructor2.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * constructor3.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * constructor4.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.length = length;
        this.width = width;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0
                && Double.compare(length, rectangle.length) == 0
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + "topLeft=" + topLeft.toString() + ",width="
                + (double) Math.round(width * 10) / 10
                + ",length=" + (double) Math.round(length * 10) / 10
                + ",color=" + getColor() + ",filled=" + isFilled() + ']';
    }
}