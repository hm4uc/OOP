public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "blue");
        Cylinder cylinder = new Cylinder(10, 10, "red");
        System.out.println(circle.getArea());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}
