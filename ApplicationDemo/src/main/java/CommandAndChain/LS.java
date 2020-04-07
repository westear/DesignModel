package CommandAndChain;

/**
 * ls 命令
 */
public class LS extends AbstractLS {

    protected String echo(CommandVO commandVO) {
        return FileManager.ls("");
    }

    protected String getOperateParam() {
        return super.DEFAULT_PARAM;
    }
}
