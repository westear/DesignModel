package demo1;

/**
 * 增加需求的命令
 */
public class AddRequirementCommand extends Command {

    @Override
    void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
