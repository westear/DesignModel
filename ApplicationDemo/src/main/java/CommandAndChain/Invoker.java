package CommandAndChain;

/**
 * 命令分发
 */
public class Invoker {

    //执行命令
    public String exec(String commandStr) {
        //定义返回值
        String result = "";
        CommandVO commandVO = new CommandVO(commandStr);
        if(CommandEnum.getNames().contains(commandVO.getCommandName())) {
            String className = CommandEnum.valueOf(commandVO.getCommandName().toUpperCase()).getValue();
            Command command;
            try {
                command = (Command) Class.forName(className).newInstance();
                result = command.execute(commandVO);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            result = "无法执行命令";
        }
        return result;
    }
}
