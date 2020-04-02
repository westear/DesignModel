package demo1;

/**
 * 自定义的迭代器接口，一般直接实现 java.util.Iterator 接口就好
 */
@Deprecated
public interface MyIterator {

    Object next();

    boolean hasNext();

    boolean remove();
}
