package demo2;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("初始状态...");
        System.out.println("初始状态：" +originator.getState());
        //建立备份
        originator.createMemento();
        //修改状态
        originator.setState("修改后的状态...");
        System.out.println("修改后状态：" +originator.getState());
        //恢复原有状态
        originator.restoreMemento();
        System.out.println("恢复后状态：" +originator.getState());
    }
}
