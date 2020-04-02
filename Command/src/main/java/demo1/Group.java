package demo1;

public abstract class Group {

    abstract void find();

    abstract void add();

    abstract void delete();

    abstract void change();

    abstract void plan();

    void rollBack() {
        //todo 根据日志回滚
    }
}
