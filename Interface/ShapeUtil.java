import java.util.List;

public class ShapeUtil {
    /**
     * print Info.
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder info = new StringBuilder();
        StringBuilder circleTitle = new StringBuilder("Circle:");
        StringBuilder triangTitle = new StringBuilder("Triangle:");
        for (GeometricObject shape : shapes) {
            if (shape.getClass().equals(Circle.class)) {
                circleTitle.append("\n").append(shape.getInfo());
            } else {
                triangTitle.append("\n").append(shape.getInfo());
            }
        }
        if (!circleTitle.toString().equals("Circle:")) {
            info.append(circleTitle).append("\n");
        }
        if (!triangTitle.toString().equals("Triangle:")) {
            info.append(triangTitle);
        }
        return info.toString();
    }

}

