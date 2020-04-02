package demo1;

/**
 * 绘图工具1
 */
public class DP1 {

    public void draw_a_line(double x1, double x2, double y1, double y2){
        System.out.print("绘图工具1 画的线");
        System.out.format("x1=%s, y1=%s, x2=%s, y2=%s",x1, x2, y1, y2);
    }

    public void draw_a_circle(double x, double y, double r){
        System.out.print("绘图工具1 画的圆");
        System.out.format("x=%s, y=%s, r=%s",x,y,r);
    }
}
