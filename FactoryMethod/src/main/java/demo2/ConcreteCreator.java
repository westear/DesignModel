package demo2;

/**
 * 具体工厂类
 */
public class ConcreteCreator extends Creator {

    @SuppressWarnings("unchecked")
    @Override
    <T extends Product> T createProduct(Class<T> cls) {
        Product product = null;
        try {
            product = (Product) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            //TODO 异常处理
        }
        return (T) product;
    }
}
