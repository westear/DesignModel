package demo1;

/**
 * 抽象命令类
 */
public abstract class Command {

    //把组定义好
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    //只有一个方法，执行命令
    abstract void execute();
}
