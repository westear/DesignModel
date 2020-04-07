package CommandAndChain;
/**
 * 具体的 df 命令
 */
public class DFCommand extends Command{

    @Override
    public String execute(CommandVO commandVO) {
        //返回链表首节点
        CommandName firstNode = super.buildChain(AbstractDF.class).get(0);
        return firstNode.handleMessage(commandVO);
    }
}
