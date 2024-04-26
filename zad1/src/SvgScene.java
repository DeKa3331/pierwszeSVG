import java.util.ArrayList;

public class SvgScene {

    private ArrayList<Shape> shapes;

    public SvgScene(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public String toSvg() {
        String svgCode = "<svg height=\"240\" width=\"500\" xmlns=\"http://www.w3.org/2000/svg\">\n";

        for (Shape shape : shapes) {
            svgCode += "\t" + shape.toSvg() + "\n";
        }

        svgCode += "</svg>";
        return svgCode;
    }
}
