package demo2;

import java.util.ArrayList;
import java.util.Objects;

public class Client {

    public static void main(String[] args) {
        //首先组装一个组织结构
        Branch ceo = compositeCorpTree();
        //把CEO的信息打印出来
        System.out.println(ceo.getInfo());
        //打印所有员工信息
        System.out.println(getTreeInfo(ceo));
    }

    public static Branch compositeCorpTree() {
        //生产CEO
        Branch ceo = new Branch("张三","CEO", 10000);
        //生产三个部门经理
        Branch developDep = new Branch("李四","研发经理",8000);
        Branch salesDep = new Branch("王五","销售经理",8000);
        Branch financeDep = new Branch("郑七","财务部经理",8000);
        //生产两个小组长
        Branch firstDevGroup = new Branch("松岛枫", "开发一组", 5000);
        Branch secondDevGroup = new Branch("葛天萨", "开发二组", 5000);
        //生产普通员工
        Leaf a = new Leaf("a","研发",3000);
        Leaf b = new Leaf("b","研发",3000);
        Leaf c = new Leaf("c","研发",3000);
        Leaf d = new Leaf("d","研发",3000);
        Leaf e = new Leaf("e","研发",3000);
        Leaf f = new Leaf("f","研发",3000);
        Leaf g = new Leaf("g","销售",3000);
        Leaf h = new Leaf("h","销售",3000);
        Leaf i = new Leaf("i","财务",3000);
        Leaf subDevDep = new Leaf("山崎俊","研发部副经理",6500);

        //开始组装
        //CEO下面有三个部门经理
        ceo.addSubordinate(developDep);
        ceo.addSubordinate(salesDep);
        ceo.addSubordinate(financeDep);
        //研发部经理
        developDep.addSubordinate(subDevDep);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        //开发小组长的下属
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        firstDevGroup.addSubordinate(d);

        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);

        //销售部下属
        salesDep.addSubordinate(g);
        salesDep.addSubordinate(h);

        //财务部下属
        financeDep.addSubordinate(i);

        System.out.println("结构建立完成后,此处模拟从下往上遍历========");
        leafFind(a);

        System.out.println();
        System.out.println("以下输出按从上往下顺序遍历 ======== ");
        return ceo;
    }

    //从上往下遍历
    public static String getTreeInfo(Branch ceo) {
        ArrayList<Corp> arrayList = ceo.getSubordinate();
        StringBuilder info = new StringBuilder();
        for (Corp s : arrayList) {
            if (s instanceof Leaf) {
                info.append(s.getInfo()).append("\n");
            } else {
                info.append(s.getInfo()).append("\n").append(getTreeInfo((Branch) s));
            }
        }
        return info.toString();
    }

    //从下往上遍历
    public static void leafFind(Corp leaf) {
        if(Objects.nonNull(leaf)) {
            System.out.println(leaf.getInfo());
            while (Objects.nonNull(leaf.getParent())) {
                Corp parent = leaf.getParent();
                System.out.println(parent.getInfo());
                leaf = parent;
            }
        }
    }

}
