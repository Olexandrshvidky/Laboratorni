public class Dot implements DotInterface {
    double x,y;
    @Override
    public void setX(double x) {
        System.out.println("setX() "+this);
        this.x=x;
    }

    @Override
    public void setY(double y) {
        System.out.println("setY "+this);
        this.y=y;
    }
    void draw(double x, double y) {
        setX(x);
        setY(y);
        System.out.println("draw() "+this);
    }
}
