package demo3;

public class Client {
    public final static String ADD_SYMBOL = "+";
    public final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        Context context = null;
        String symbol = "+";
        //判断初始化哪个策略
        if(ADD_SYMBOL.equals(symbol)) {
            context = new Context(new Add());
        }
        if(SUB_SYMBOL.equals(symbol)) {
            context = new Context(new Sub());
        }
        System.out.println("result = " + context.exec(1,2, symbol));
    }
}
