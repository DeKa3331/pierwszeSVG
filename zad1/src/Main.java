import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Point A = new Point(100, 20);
        Point B = new Point(180, 60);
        Point C = new Point(180, 140);
        Point D = new Point(100, 180);
        Point E = new Point(20, 140);
        Point F = new Point(20, 200);

        Point G = new Point(300, 97);
        Point H = new Point(12, 109);
        Point I = new Point(48, 222);

        Point J = new Point(200, 300);
        Point K = new Point(300, 200);
        Point L = new Point(200, 200);
        Point M = new Point(300, 300);

        ArrayList<Point> pointsHexagon = new ArrayList<>();
        pointsHexagon.add(A);
        pointsHexagon.add(B);
        pointsHexagon.add(C);
        pointsHexagon.add(D);
        pointsHexagon.add(E);
        pointsHexagon.add(F);
        ArrayList<Point> pointsTriangle = new ArrayList<>();
        pointsTriangle.add(G);
        pointsTriangle.add(H);
        pointsTriangle.add(I);
        ArrayList<Point> pointsSquare = new ArrayList<>();
        pointsSquare.add(J);
        pointsSquare.add(K);
        pointsSquare.add(L);
        pointsSquare.add(M);

        Style styleHexagon = new Style("#ffff00", "red", 20);
        Style styleTriangle = new Style("#00ff00", "blue", 20); // zmieniono kolor hexagonu na zielony
        Style styleSquare = new Style("#000000", "gray", 20); // zmieniono kolor square na czarny

        Polygon hexagon = new Polygon(pointsHexagon, styleHexagon);
        Polygon triangle = new Polygon(pointsTriangle, styleTriangle);
        Polygon square = new Polygon(pointsSquare, styleSquare);

        Ellipse ellipse = new Ellipse(new Vec2(400, 100), 50, 30, "fill:yellow;stroke:blue;stroke-width:2");

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(hexagon);
        shapes.add(triangle);
        shapes.add(square);
        shapes.add(ellipse);

        SvgScene scene = new SvgScene(shapes);

        System.out.println(scene.toSvg());

    }
}
