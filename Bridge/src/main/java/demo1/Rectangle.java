package demo1;

public class Rectangle extends Shape {
    private double x1, y1, x2, y2;

    public Rectangle (Drawing dp, double x1, double y1, double x2, double y2) {
        super(dp);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw() {
        drawLine(x1, y1, x2, y2);
        drawLine(x2, y1, x2, y2);
        drawLine(x2, y2, x1, y2);
        drawLine(x1, y2, x1, y1);
    }

    @Override
    protected void drawLine(double x1, double y1, double x2, double y2) {
        myDrawing.drawLine(x1, y1, x2, y2);
    }
}
