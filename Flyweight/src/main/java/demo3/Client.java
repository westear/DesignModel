package demo3;

/**
 * 调用场景类
 */
public class Client {

    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加对象内部状态的处理============");
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,20));
    }
}
