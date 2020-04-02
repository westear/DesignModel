package demo2;

import java.util.ArrayList;

public class Branch extends Corp {

    //领导管理的下属
    private ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    /**
     * 增加下属
     * @param corp 员工具体类
     */
    public void addSubordinate(Corp corp) {
        //此处设置父节点
        corp.setParent(this);
        this.subordinateList.add(corp);
    }

    /**
     * 获取下属员工信息
     * @return ICorp ArrayList
     */
    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
