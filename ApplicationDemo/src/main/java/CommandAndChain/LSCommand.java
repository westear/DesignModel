package CommandAndChain;

/**
 * 具体的 ls 命令
 */
public class LSCommand extends Command {

    @Override
    public String execute(CommandVO commandVO) {
        //返回链表首节点
        CommandName firstNode = super.buildChain(AbstractLS.class).get(0);
        return firstNode.handleMessage(commandVO);
    }
}
