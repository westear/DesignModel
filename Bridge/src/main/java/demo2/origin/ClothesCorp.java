package demo2.origin;

/**
 * 假设服装生产公司
 */
public class ClothesCorp extends Corp{

    @Override
    protected void produce() {
        System.out.println("制造衣服......");
    }

    @Override
    protected void sell() {
        System.out.println("卖衣服......");
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("服装公司赚钱");
    }
}
