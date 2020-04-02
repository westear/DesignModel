package demo1;

/**
 * 图形基类
 */
public abstract class Shape {

    protected Drawing myDrawing;

    //传入具体的画图工具，决定使用什么算法进行画图
    Shape(Drawing drawing) {
        this.myDrawing = drawing;
    }

    /**
     * 具体图形，具体画法
     */
    abstract public void draw();

    protected void drawLine(double x1, double y1, double x2, double y2) {
        myDrawing.drawLine(x1,y1,x2,y2);
    }

    protected void drawCircle(double x, double y, double r) {
        myDrawing.drawCircle(x, y, r);
    }
}
