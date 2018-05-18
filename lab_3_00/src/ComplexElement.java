import java.util.ArrayList;

public class ComplexElement implements GraphicalElement {

    ArrayList<GraphicalElement> elements=new ArrayList<GraphicalElement>();

    void addCircle(double center, double r) {
        System.out.println("addCircle() "+this);
        elements.add(new Circle(center, r));
    }
    void addSquare(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        System.out.println("addSquare() "+this);
        elements.add(new Square(x1, y1, x2, y2, x3, y3, x4, y4));
    }
    void addLine(double x1, double y1, double x2, double y2) {
        System.out.println("addLine() "+this);
        elements.add(new Line(x1, y1, x2, y2));
    }
    void addDot(double x, double y) {
        System.out.println("addDot() "+this);
        elements.add(new Dot(x, y));
    }

    @Override
    public void draw() {
        System.out.println("draw() "+this);
        for (GraphicalElement element:elements
             ) {
            element.draw();
        }
    }
}
