public class Circle {
    double phi, ro;
    Dot dot;

    public void setPhi(double phi) {
        System.out.println("setPhi "+this);
        this.phi=phi;
    }

    public void setRo(double ro) {
        System.out.println("setRo "+this);
        this.ro=ro;
    }
    void draw(double R) {
        System.out.println("draw() "+this);
        setPhi(2*Math.PI);
        setRo(R);
        dot=new Dot();
        double currentPhi=0;
        System.out.println("Цикл отрисовки окружности:");
        while(currentPhi<this.phi) {
            dot.draw(this.ro*Math.cos(currentPhi),this.ro*Math.sin(currentPhi));
            currentPhi+=0.1;
            System.out.println("_____");
        }
    }
}