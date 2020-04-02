package demo1;

public class V1Drawing extends Drawing {

    @Override
    public void drawLine(double x1, double y1, double x2, double y2) {
        DP1 dp1 = new DP1();
        dp1.draw_a_line(x1, x2, y1, y2);
    }

    @Override
    public void drawCircle(double x, double y, double r) {
        DP1 dp1 = new DP1();
        dp1.draw_a_circle(x, y, r);
    }
}
