package datastructure;

/**
 * @ClassName: Test8
 * @Author: guf
 * @Date: 2021/12/27 16:05
 * @Description:实现一个特殊栈，常规功能的基础上，返回最小元素 pop push getMin 时间复杂度都是O(1)
 */
public class Test8 {
    public static void main(String[] args) {
        ArrStack1<Integer> arrStack1=new ArrStack1<Integer>();
        arrStack1.add(1);
        arrStack1.add(2);
        arrStack1.add(3);
        arrStack1.add(4);
        System.out.println(arrStack1.getMin());
        System.out.println(arrStack1.pop());
        System.out.println(arrStack1.getMin());
        System.out.println(arrStack1.pop());
        System.out.println(arrStack1.getMin());
        System.out.println(arrStack1.pop());
        System.out.println(arrStack1.getMin());
        System.out.println(arrStack1.pop());
        System.out.println(arrStack1.getMin());
        System.out.println(arrStack1.pop());
        System.out.println(arrStack1.getMin());
    }
}

class ArrStack1<T extends Comparable> {
    private Object[] arr;
    private Object[] min;
    private int index;

    public int getSize(){
        return index;
    }

    public ArrStack1() {
        this.arr = new Object[5];
        this.min = new Object[5];
    }

    public void add(T t) {
        if (index < arr.length) {
            arr[index] = t;
            if (index > 0) {
                min[index] = t.compareTo(min[index-1])<0?t:min[index-1];
            } else {
                min[index] = t;
            }
            index++;
        } else {
            System.out.println("栈已经满了...");
        }

    }

    public T pop() {
        if (index > 0) {
            T t = (T) arr[index-1];
            arr[index-1] = null;
            min[index-1]=null;
            index--;
            return t;
        } else {
            System.out.println("栈已经空了...");
            return null;
        }

    }

    public T getMin() {
        if (index > 0) {
            T t = (T) min[index-1];
            return t;
        } else {
            System.out.println("栈已经空了...");
        }
        return null;
    }
}
