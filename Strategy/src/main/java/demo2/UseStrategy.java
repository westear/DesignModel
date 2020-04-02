package demo2;

/**
 * 策略模式的使用类
 */
public class UseStrategy {
    public static void main(String[] args) {
        Context context;

        context = new Context(new FirstOperate());
        context.operate();

        context = new Context(new SecondOperate());
        context.operate();

        context = new Context(new ThirdOperate());
        context.operate();
    }
}
