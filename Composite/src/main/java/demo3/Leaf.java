package demo3;

/**
 * 叶子构件
 */
public class Leaf extends Component {

    public Leaf() {

    }

    public Leaf(String attr) {
        super(attr);
    }

    public void doSomething() {
        //TODO 可以覆盖父类方法
    }
}
