package demo4;

public class Client {

    public static void display(Component root) {
        //通过递归实现树结构的遍历
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                //树枝节点
                display(c);
            }
        }
    }

}
