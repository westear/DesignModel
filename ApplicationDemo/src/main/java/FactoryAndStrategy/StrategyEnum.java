package FactoryAndStrategy;

/**
 * 策略枚举配置, 隐藏策略类的调用
 */
public enum StrategyEnum {
    SteadyDeduction("FactoryAndStrategy.SteadyDeduction"),
    FreeDeduction("FactoryAndStrategy.FreeDeduction")
    ;

    private String value;

    StrategyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
