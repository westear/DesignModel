package demo5;

public class Originator {

    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IMemento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(IMemento memento) {
        this.setState(((Memento)memento).getState());
    }

    /**
     * 内置类 Memento 全部是 private 的访问权限，也就是除了发起人外，别人休想访问到，
     * 如果要产生关联关系又应如何处理？ 通过接口访问，因为 Memento 实现了一个空接口是公共的访问权限
     */
    private class Memento implements IMemento {

        private String state = "";

        private Memento(String state) {
            this.state = state;
        }

        private String getState(){
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }
}
