public class Line implements GraphicalElement {
    double x1,y1,x2,y2,length;

    public Line(double x1, double y1, double x2, double y2) {
        System.out.println("Constructor() "+this);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        length=Math.abs(x1-x2);
    }

    @Override
    public void draw() {
        System.out.println("draw() "+this);
    }
}