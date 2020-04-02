package demo1;

import java.util.Iterator;

/**
 * 抽象容器
 */
public interface Aggregate {

    void add(Object object);

    void remove(Object object);

    Iterator<Object> iterator();
}
