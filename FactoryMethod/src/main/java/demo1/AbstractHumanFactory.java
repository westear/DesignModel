package demo1;

/**
 * 抽象的人类制作工厂
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> cls);
}
