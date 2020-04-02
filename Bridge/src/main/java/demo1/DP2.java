package demo1;

/**
 * 绘图工具2
 */
public class DP2 {

    public void drawLine(double x1, double x2, double y1, double y2){
        System.out.print("绘图工具2 画的线");
        System.out.format("x1=%s, y1=%s, x2=%s, y2=%s",x1, x2, y1, y2);
    }

    public void drawCircle(double x, double y, double r){
        System.out.print("绘图工具2 画的圆");
        System.out.format("x=%s, y=%s, r=%s",x,y,r);
    }
}
