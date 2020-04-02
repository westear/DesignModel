package demo2.origin;

/**
 * 如果派生Corp类实现不同的生产线，意味着美新增一条生产线，则需要实现一个新的生产线类
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("房地产公司......");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println();
        System.out.println("服装公司......");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }
}
