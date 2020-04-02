package demo1;

/**
 * 抽象运算符号解析器
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    //所有解析公式都应只关心自己左右两个表达式的结果
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
