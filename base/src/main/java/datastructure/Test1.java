package datastructure;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @ClassName: Test1
 * @Author: guf
 * @Date: 2021/12/24 17:00
 * @Description:单向链表
 */
public class Test1 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        LinkedList linkedList1 = linkedList;
        Collections.reverse(linkedList);

    }

}
