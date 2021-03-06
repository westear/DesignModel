package demo1;

public class V2Drawing extends Drawing {

    @Override
    public void drawLine(double x1, double y1, double x2, double y2) {
        DP2 dp2 = new DP2();
        dp2.drawLine(x1, x2, y1, y2);
    }

    @Override
    public void drawCircle(double x, double y, double r) {
        DP2 dp2 = new DP2();
        dp2.drawCircle(x, y, r);
    }
}
