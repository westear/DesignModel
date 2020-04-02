package demo3;

/**
 * FlyWeight抽象享元类
 */
public interface ChessFlyWeight {

    void setColor(String c);

    String getColor();

    void display(Coordinate c);
}
