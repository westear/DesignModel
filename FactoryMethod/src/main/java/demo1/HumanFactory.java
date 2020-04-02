package demo1;

/**
 * 创造人类工厂
 */
public class HumanFactory extends AbstractHumanFactory {

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Human> T createHuman(Class<T> cls) {
        //定义一个生产的人种
        T human = null;
        try {
            //产生一个人种
            human = (T) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生产错误!");
        }
        return human;
    }
}
