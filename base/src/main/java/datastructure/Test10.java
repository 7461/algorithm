package datastructure;

import com.sun.jmx.remote.internal.ArrayQueue;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @ClassName: Test10
 * @Author: guf
 * @Date: 2021/12/27 16:11
 * @Description:用队列实现栈
 */
public class Test10 {
    public static void main(String[] args) {
        QueueStack<Integer> queueStack=new QueueStack<Integer>();
        queueStack.push(1);
        queueStack.push(2);
        System.out.println(queueStack.pop());
        queueStack.push(3);
        System.out.println(queueStack.pop());
    }
}

class QueueStack<T> {
    ArrQueue<T> arrayQueue;

    public QueueStack() {
        this.arrayQueue = new ArrQueue<T>();
    }

    public void push(T t) {
        arrayQueue.push(t);
    }

    public T pop() {
        int size = arrayQueue.size;
        while (size>1){
            arrayQueue.push(arrayQueue.pop());
            size--;
        }
        return arrayQueue.pop();
    }
}
