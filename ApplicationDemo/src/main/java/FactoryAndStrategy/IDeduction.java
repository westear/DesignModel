package FactoryAndStrategy;

/**
 * 扣款策略接口
 */
public interface IDeduction {

    boolean exec(Card card, Trade trade);
}
