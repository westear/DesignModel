package CommandAndChain;
/**
 * df_g 命令
 */
public class DF_G extends AbstractDF {

    protected String getOperateParam() {
        return super.G_PARAM;
    }

    protected String echo(CommandVO commandVO) {
        return DiskManager.df_g();
    }

}
