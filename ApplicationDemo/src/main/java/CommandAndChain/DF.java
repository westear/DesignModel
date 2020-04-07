package CommandAndChain;
/**
 * df 命令
 */
public class DF extends AbstractDF {

    protected String getOperateParam() {
        return super.DEFAULT_PARAM;
    }

    protected String echo(CommandVO commandVO) {
        return DiskManager.df();
    }

}
