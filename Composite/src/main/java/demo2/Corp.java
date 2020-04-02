package demo2;

/**
 * 抽象的公司职员类
 */
public abstract class Corp {

    //领导人姓名
    private String name;
    //领导职位
    private String position;
    //领导薪水
    private int salary;

    //为了方便向上遍历，添加父节点信息
    private Corp parent;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "姓名:" + this.name;
        info = info + "\t职位:" + this.position;
        info = info + "\t薪水:" + this.salary;
        return info;
    }

    //设置父节点
    protected void setParent(Corp parent) {
        this.parent = parent;
    }

    //得到父节点
    public Corp getParent() {
        return this.parent;
    }
}
