package demo1;

/**
 * 需求组
 */
public class RequirementGroup extends Group {

    @Override
    void find() {
        System.out.println("找到需求组.....");
    }

    @Override
    void add() {
        System.out.println("增加一项需求.....");
    }

    @Override
    void delete() {
        System.out.println("删除一项需求.....");
    }

    @Override
    void change() {
        System.out.println("修改一项需求.....");
    }

    @Override
    void plan() {
        System.out.println("制定一项需求计划.....");
    }
}
