package demo1;

/**
 * 删除一项需求
 */
public class DeleteRequirementCommand extends Command {

    @Override
    void execute() {
        super.requirementGroup.find();
        super.requirementGroup.delete();
        super.requirementGroup.plan();
    }
}
