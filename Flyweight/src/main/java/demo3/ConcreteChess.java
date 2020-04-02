package demo3;

/**
 * ConcreteFlyWeight具体享元类
 */
public class ConcreteChess implements ChessFlyWeight {

    //外部状态
    private String color;

    public ConcreteChess(String color) {
        super();
        this.color = color;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+c.getX()+"------"+c.getY());
    }
}
