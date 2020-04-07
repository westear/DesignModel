package FactoryAndStrategy;

/**
 * 封装策略的类
 */
public class DeductionContext {

    private IDeduction deduction;

    public DeductionContext(IDeduction deduction) {
        this.deduction = deduction;
    }

    public boolean exec(Card card, Trade trade) {
        return this.deduction.exec(card, trade);
    }
}
