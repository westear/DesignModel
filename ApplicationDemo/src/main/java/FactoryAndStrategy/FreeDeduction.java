package FactoryAndStrategy;

/**
 * 自由金额扣款策略
 */
public class FreeDeduction implements IDeduction {

    @Override
    public boolean exec(Card card, Trade trade) {
        card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
        return true;
    }
}
