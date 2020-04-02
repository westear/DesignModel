package demo3;

import java.util.ArrayList;

/**
 * 树枝构件
 */
public class Composite extends Component {

    //构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public Composite() {

    }

    public Composite(String attr) {
        super(attr);
    }

    //添加叶子构件或树枝构件
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    //删除叶子构件或树枝构件
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    //获得分支下的所有叶子构件和树枝构件
    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }
}
