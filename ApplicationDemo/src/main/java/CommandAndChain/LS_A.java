package CommandAndChain;

public class LS_A extends AbstractLS {

    protected String echo(CommandVO commandVO) {
        return FileManager.ls_a("");
    }

    protected String getOperateParam() {
        return super.A_PARAM;
    }
}
