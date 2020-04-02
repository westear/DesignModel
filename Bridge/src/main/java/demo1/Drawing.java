package demo1;

/**
 * 画图算法的基类
 */
public abstract class Drawing {

    /**
     * 画线
     * @param x1 坐标
     * @param y1 坐标
     * @param x2 坐标
     * @param y2 坐标
     */
    abstract public void drawLine(double x1, double y1, double x2, double y2);

    /**
     * 画圆
     * @param x 坐标
     * @param y 坐标
     * @param r 半径
     */
    abstract public void drawCircle(double x, double y, double r);
}
