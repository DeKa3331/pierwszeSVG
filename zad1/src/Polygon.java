import java.util.ArrayList;

public class Polygon implements Shape {


    private  Style style;

    private  ArrayList<Point> points;

    public  Style getStyle() {
        return style;
    }

    public  void setStyle(Style style) {
        this.style = style;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }
    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }
    /*public Polygon(ArrayList<Point> points) {
        this.points = points;
    }*/
    public Polygon(ArrayList<Point> points, Style style) {
        this.points = points;
        this.style=style;
    }

    public Polygon() {

    }

    public  String toSvg() {
        String Code = null;
        Code = "\t";
        Code += "\n";
        Code += "<polygon points=\"";
        for(Point p : points)
            Code += p.x + "," + p.y + " ";
        /*Code+= "\"";
        Code+= "style=fill:cyan;stroke:blue;stroke-width:12 />" + "\n";
        Code+= "\n";*/

        Code+= "\"";
        Code+= getStyle().toSvg() + "/>";
        Code+= "\n";
        return Code;
    }






}
