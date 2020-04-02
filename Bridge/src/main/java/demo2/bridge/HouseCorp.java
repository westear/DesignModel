package demo2.bridge;

public class HouseCorp extends Corp {

    //必须把产品的具体实现传进来，具体色什么样的产品
    public HouseCorp(House product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        //该产品特有的逻辑
        System.out.println("卖房子赚钱");
    }
}
