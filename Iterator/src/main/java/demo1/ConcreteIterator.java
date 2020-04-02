package demo1;

import java.util.Iterator;
import java.util.Vector;

/**
 * 具体迭代器
 */
public class ConcreteIterator implements Iterator<Object> {

    private Vector<Object> vector;

    //定义当前游标
    public int cursor = 0;

    public ConcreteIterator(Vector<Object> vector) {
        this.vector = vector;
    }

    @Override
    public boolean hasNext() {
        return this.cursor != this.vector.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()) {
            return this.vector.get(this.cursor++);
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        this.vector.remove(this.cursor);
    }
}
