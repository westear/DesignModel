package FactoryAndStrategy;

/**
 * 扣款模块封装: 门面; 让高层进行访问
 */
public class DeductionFacade {

    public static Card deduct(Card card, Trade trade) {
        //获得消费策略
        StrategyEnum strategy = getDeductionType(trade);
        //初始化消费策略对象
        IDeduction deduction = StrategyFactory.getDeduction(strategy);
        //产生策略封装上下文
        DeductionContext context = new DeductionContext(deduction);
        //进行扣款处理
        context.exec(card, trade);
        return card;
    }

    private static StrategyEnum getDeductionType(Trade trade) {
        if(trade.getTradeNo().contains("abc")) {
            return StrategyEnum.FreeDeduction;
        } else {
            return StrategyEnum.SteadyDeduction;
        }
    }
}
