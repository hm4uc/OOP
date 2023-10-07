import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    /**
     * add Shape.
     */
    public void addShape(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
        }
    }

    /**
     * remove Circle.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * remove Duplicates.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            Shape s = shapes.get(i);
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(j).equals(s)) {
                    shapes.remove(j);
                }
            }
        }
    }

    /**
     * get Info.
     */
    public String getInfo() {
        String s = "Layer of crazy shapes:";
        for (Shape shape : shapes) {
            s += '\n' + shape.toString();
        }
        return s;
    }
}
