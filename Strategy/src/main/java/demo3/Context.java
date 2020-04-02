package demo3;

public class Context {

    private Calculator calculator = null;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b, String symbol) {
        return this.calculator.exec(a, b);
    }
}
