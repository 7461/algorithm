package datastructure;

/**
 * @ClassName: Test9
 * @Author: guf
 * @Date: 2021/12/27 16:11
 * @Description:用栈实现队列
 */
public class Test9 {
    public static void main(String[] args) {
        StackQueue<Integer> stackQueue = new StackQueue<Integer>();
        stackQueue.push(1);
        stackQueue.push(2);

        System.out.println(stackQueue.pop());
        stackQueue.push(3);
        stackQueue.push(4);
        stackQueue.push(5);
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
    }
}

class StackQueue<T extends Comparable> {
    ArrStack1<T> arrStack1;
    ArrStack1<T> arrStack2;

    public StackQueue() {
        arrStack1 = new ArrStack1<T>();
        arrStack2 = new ArrStack1<T>();
    }

    public void push(T t) {
        arrStack1.add(t);
    }

    public T pop() {
        if (arrStack2.getSize()==0) {
            a();
        }
        T pop = arrStack2.pop();
        return pop;
    }

    public void a() {
        while (arrStack1.getSize() > 0) {
            T pop = arrStack1.pop();
            arrStack2.add(pop);
        }
    }
}
