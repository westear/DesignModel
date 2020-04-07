package FactoryAndStrategy;

/**
 * 策略工厂
 */
public class StrategyFactory {

    public static IDeduction getDeduction(StrategyEnum strategy) {
        IDeduction deduction = null;
        try {
            deduction = (IDeduction) Class.forName(strategy.getValue()).newInstance();
        } catch (Exception e) {
            //TODO 异常处理
        }
        return deduction;
    }
}
