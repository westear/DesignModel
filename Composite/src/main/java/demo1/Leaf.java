package demo1;

public class Leaf implements ILeaf {

    //普通员工也有名称
    private String name;
    //普通员工也有职位
    private String position;
    //普通员工也有薪水
    private int salary;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "姓名:" + this.name;
        info = info + "\t职位:" + this.position;
        info = info + "\t薪水:" + this.salary;
        return info;
    }
}
