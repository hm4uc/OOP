import javax.management.RuntimeMBeanException;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * constructor1.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.distance(p2) == 0 || p2.distance(p3) == 0 || p3.distance(p1) == 0
                || ((p1.getPointX() - p2.getPointX()) * (p1.getPointY() - p3.getPointY()))
                == (p1.getPointX() - p3.getPointX()) * (p1.getPointY() - p2.getPointY())) {
            throw new RuntimeException();
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        return a + b + c;
    }

    @Override
    public String getInfo() {
        String p1x = String.format("%.2f", p1.getPointX());
        String p1y = String.format("%.2f", p1.getPointY());
        String p2x = String.format("%.2f", p2.getPointX());
        String p2y = String.format("%.2f", p2.getPointY());
        String p3x = String.format("%.2f", p3.getPointX());
        String p3y = String.format("%.2f", p3.getPointY());
        return "Triangle[(" + p1x + "," + p1y + "),("
                + p2x + "," + p2y + "),("
                + p3x + "," + p3y + ")]";
    }
}
