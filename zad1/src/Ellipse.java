public class Ellipse implements Shape {
    private String style;
    private Vec2 center;
    private double przek1;
    private double przek2;

    public Ellipse(Vec2 center, double przek1, double przek2, String style) {
        this.center = center;
        this.przek1 = przek1;
        this.przek2 = przek2;
        this.style = style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public Vec2 getCenter() {
        return center;
    }

    public void setCenter(Vec2 center) {
        this.center = center;
    }

    public double getPrzek1() {
        return przek1;
    }

    public void setPrzek1(double przek1) {
        this.przek1 = przek1;
    }

    public double getPrzek2() {
        return przek2;
    }

    public void setPrzek2(double przek2) {
        this.przek2 = przek2;
    }
    public String toSvg() {
        return "<ellipse cx=\"" + center.getX() + "\" cy=\"" + center.getY() + "\" rx=\"" + przek1 + "\" ry=\"" + przek2 + "\" style=\"" + style + "\"/>";
    }
}