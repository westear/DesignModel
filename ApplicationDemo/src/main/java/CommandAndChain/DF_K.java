package CommandAndChain;
/**
 * df_k 命令
 */
public class DF_K extends AbstractDF {

    protected String getOperateParam() {
        return super.K_PARAM;
    }

    protected String echo(CommandVO commandVO) {
        return DiskManager.df_k();
    }

}
