package datastructure;

import sun.reflect.generics.tree.VoidDescriptor;

/**
 * @ClassName: LinkedQueue
 * @Author: guf
 * @Date: 2021/12/28 9:45
 * @Description: 双向链表实现的队列
 */
public class LinkedQueue<T> {
    private DoubleEndsList doubleEndsList;

    public LinkedQueue(DoubleEndsList doubleEndsList) {
        this.doubleEndsList = doubleEndsList;
    }

    public void add(T a) {
        doubleEndsList.addFromTail(a);
    }

    public void poll() {
        doubleEndsList.popFromHead();
    }
}
