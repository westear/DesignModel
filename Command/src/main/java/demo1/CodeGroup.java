package demo1;

/**
 * 代码组
 */
public class CodeGroup extends Group {

    @Override
    void find() {
        System.out.println("找到代码组.....");
    }

    @Override
    void add() {
        System.out.println("增加一个功能.....");
    }

    @Override
    void delete() {
        System.out.println("删除一个功能.....");
    }

    @Override
    void change() {
        System.out.println("修改一个功能.....");
    }

    @Override
    void plan() {
        System.out.println("制定一个功能实现计划.....");
    }
}
