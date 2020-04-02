package demo1;

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println("客户要求新增一项需求========");
        //如果需要修改为：删除一项需求， 那么只需要修改下面的一行代码
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
