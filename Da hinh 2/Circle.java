import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * constructor1.
     */
    public Circle() {
    }

    /**
     * constructor2.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * constructor3.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * constructor4.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "center=" + center.toString()
                + ",radius=" + (double) Math.round(radius * 10) / 10
                + ",color=" + getColor() + ",filled=" + isFilled() + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
