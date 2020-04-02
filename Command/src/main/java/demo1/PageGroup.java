package demo1;

/**
 * 美工组
 */
public class PageGroup extends Group {

    @Override
    void find() {
        System.out.println("找到美工组.....");
    }

    @Override
    void add() {
        System.out.println("增加一个页面.....");
    }

    @Override
    void delete() {
        System.out.println("删除一个页面.....");
    }

    @Override
    void change() {
        System.out.println("修改一个页面.....");
    }

    @Override
    void plan() {
        System.out.println("制定一个页面计划.....");
    }
}
