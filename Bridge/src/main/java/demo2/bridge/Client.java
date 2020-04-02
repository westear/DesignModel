package demo2.bridge;

/**
 * 如果有一天新增一个产品类，比如Mac, 那么新增一个 public class Mac extends Product, 又或者继承Product的某个子类
 * 如果新增公司，则继承Corp,或者继承Corp的某个子类
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("房地产公司......");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        System.out.println();

        System.out.println("山寨产品公司，什么赚钱生产什么......,目前生产IPod");
        ShanzhaiCorp shanzhaiCorp = new ShanzhaiCorp(new IPod());
        shanzhaiCorp.makeMoney();
    }
}
