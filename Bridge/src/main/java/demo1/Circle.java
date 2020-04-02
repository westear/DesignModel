package demo1;

public class Circle extends Shape {

    private double x, y, r;

    Circle(Drawing drawing, double x, double y, double r) {
        super(drawing);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        myDrawing.drawCircle(x, y, r);
    }

}
