package datastructure;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @ClassName: Test6
 * @Author: guf
 * @Date: 2021/12/27 10:44
 * @Description:数组实现队列
 */
public class Test6 {
    public static void main(String[] args) {
        ArrQueue<Integer> arrQueue = new ArrQueue();
        arrQueue.push(1);
        arrQueue.push(2);
        arrQueue.push(3);
        arrQueue.push(4);
        System.out.println(arrQueue.pop());
        arrQueue.push(4);
        System.out.println(arrQueue.pop());
        System.out.println(arrQueue.pop());
        arrQueue.push(5);
        arrQueue.push(6);
        arrQueue.push(7);
        System.out.println(arrQueue.pop());
    }

}
class ArrQueue<T> {
    private Object[] arr;
    int size;
    int head;
    int end;

    public ArrQueue() {
        arr = new Object[3];
    }

    public void push(T t) {
        if (size < arr.length) {
            arr[head] = t;
            size++;
            if (head == arr.length - 1) {
                head = 0;
            } else {
                head++;
            }
        }else {
            System.out.println("队列已满...");
        }
    }

    public T pop() {
        if (size > 0) {
            T t = (T) arr[end];
            arr[end]=null;
            size--;
            if (end == arr.length - 1) {
                end = 0;
            } else {
                end++;
            }
            return t;
        } else {
            System.out.println("队列已空...");
            return null;
        }
    }
}
