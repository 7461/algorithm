package datastructure;

import lombok.Data;

/**
 * @ClassName: DoubleEndsList
 * @Author: guf
 * @Date: 2021/12/28 10:00
 * @Description:
 */
public class DoubleEndsList<T> {
    private TwoWayNode1 head;
    private TwoWayNode1 tail;
    public int size;

    public DoubleEndsList() {
        head = null;
        tail = null;
    }

    public void addFromHead(T value) {
        TwoWayNode1 twoWayNode = new TwoWayNode1(value);
        if (size == 0) {
            tail = twoWayNode;
            head = twoWayNode;
        } else {
            twoWayNode.next = head;
            head.pre = twoWayNode;
            head = twoWayNode;
        }
        size++;
    }

    public void addFromTail(T value) {
        TwoWayNode1 twoWayNode = new TwoWayNode1(value);
        if (size == 0) {
            head = twoWayNode;
            tail = twoWayNode;
        } else {
            tail.next = twoWayNode;
            twoWayNode.pre = tail;
            tail = twoWayNode;
        }
        size++;
    }

    public T popFromHead() {
        if (head == null) {
            return null;
        }
        TwoWayNode1 result = head;
        result.next = null;
        TwoWayNode1 next = head.getNext();
        if (next != null) {
            next.pre = null;
            head = next;
        } else {
            head = null;
            tail = null;
        }

        return result.getValue();
    }

    /**
     * @return T
     * @Description:从尾部pop
     * @Author: guf
     * @Date:2021/12/28
     */
    public T popFromBottom() {
        if (tail == null) {
            return null;
        }
        TwoWayNode1 result = this.tail;
        result.pre = null;
        tail = tail.pre;
        if (head != null) {
            tail.next=null;
        }else {
            tail=null;
            head=null;
        }
        return result.getValue();
    }

    @Data
    class TwoWayNode1 {
        public T value;
        public TwoWayNode1 next;
        public TwoWayNode1 pre;

        public TwoWayNode1(T value) {
            this.value = value;
            this.next = next;
            this.pre = pre;
        }
    }
}

