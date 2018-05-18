public class Dot implements GraphicalElement {
    double x,y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {
        System.out.println("draw() "+this);
    }
}
