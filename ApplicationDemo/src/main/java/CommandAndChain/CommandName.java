package CommandAndChain;

/**
 * 抽象命令名类
 */
public abstract class CommandName {

    private CommandName nextOperator;

    public final String handleMessage(CommandVO commandVO) {
        //处理结果
        String result = "";
        //判断是否自己处理的参数
        if(commandVO.getParamList().size() == 0 || commandVO.getParamList().contains(this.getOperateParam())) {
            result = this.echo(commandVO);
        } else {
            if(this.nextOperator != null) {
                result = this.nextOperator.handleMessage(commandVO);
            } else {
                result = "命令无法执行";
            }
        }
        return result;
    }

    public void setNext(CommandName nextOperator) {
        this.nextOperator = nextOperator;
    }

    protected abstract String getOperateParam();

    protected abstract String echo(CommandVO commandVO);
}
