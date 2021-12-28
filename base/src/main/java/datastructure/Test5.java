package datastructure;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @ClassName: Test5
 * @Author: guf
 * @Date: 2021/12/27 10:43
 * @Description:数组实现栈结构
 */
public class Test5 {
    public static void main(String[] args) {

    }

}

class ArrStack<T> {
    private Object[] arr;
    int index;

    public ArrStack() {
        arr = new Object[100];
    }

    public void add(T t) {
        arr[index] = t;
        index++;
    }

    public void pop() {
    }

}
