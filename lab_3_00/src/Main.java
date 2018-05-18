public class Main {
    public static void main(String[] args) {
        Dot dot=new Dot(1,1);
        dot.draw();
        Line line=new Line(5,5,4,4);
        System.out.println(line.length);
        line.draw();
        Square square=new Square(1,1,1,2,2,2,2,1);
        System.out.println(square.height+" "+square.width);
        square.draw();
        Circle circle=new Circle(5,6);
        circle.draw();
        System.out.println("ComplexElement: ");
        ComplexElement complexElement=new ComplexElement();
        complexElement.addCircle(2,0);
        complexElement.addDot(1,1);
        complexElement.addLine(1,1,2,2);
        complexElement.addSquare(0,0,0,5,5,5,5,0);
    }
}
