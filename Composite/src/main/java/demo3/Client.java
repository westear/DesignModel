package demo3;

/**
 * 高层调用的场景类负责结果建立
 */
public class Client {

    public static void main(String[] args) {

        //创建根节点
        Composite root = new Composite();
        root.doSomething();

        //建立一个树枝节点
        Composite branch = new Composite();

        //创建一个树叶节点
        Leaf leaf = new Leaf();

        //建立整体
        root.add(branch);
        branch.add(leaf);
    }
}
