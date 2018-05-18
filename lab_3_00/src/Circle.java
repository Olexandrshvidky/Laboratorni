public class Circle implements GraphicalElement {
    double center, R;

    public Circle(double center, double r) {
        System.out.println("Constructor() "+this);
        this.center = center;
        R = r;
    }
    @Override
    public void draw() {
        System.out.println("draw() "+this);
    }
}
