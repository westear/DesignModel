package demo1;

/**
 * 撤销删除页面命令
 */
public class CancelDeletePageCommand extends Command {

    @Override
    void execute() {
        super.pageGroup.rollBack();
    }
}
