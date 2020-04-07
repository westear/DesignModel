package CommandAndChain;

public class LS_L extends AbstractLS {

    protected String echo(CommandVO commandVO) {
        return FileManager.ls_l("");
    }

    protected String getOperateParam() {
        return super.L_PARAM;
    }
}
