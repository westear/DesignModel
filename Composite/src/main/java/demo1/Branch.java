package demo1;

import java.util.ArrayList;

public class Branch implements IBranch {

    //领导人姓名
    private String name;
    //领导职位
    private String position;
    //领导薪水
    private int salary;
    //领导管理的下属
    private ArrayList<ICorp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public ArrayList<ICorp> getSubordinate() {
        return this.subordinateList;
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
