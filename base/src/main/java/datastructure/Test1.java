package datastructure;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @ClassName: Test1
 * @Author: guf
 * @Date: 2021/12/24 17:00
 * @Description:双向链表反转
 */
public class Test1 {
    public static void main(String[] args) {
        TwoWayNode twoWayNode1 = new TwoWayNode(1, null);
        TwoWayNode twoWayNode2 = new TwoWayNode(2, twoWayNode1);
        TwoWayNode twoWayNode3 = new TwoWayNode(3, twoWayNode2);
        twoWayNode1.setNext(twoWayNode2);
        twoWayNode2.setNext(twoWayNode3);
        System.out.println(twoWayNode1.value);
        TwoWayNode reverse = reverse(twoWayNode1);
        while (reverse != null) {
            System.out.println(reverse.value);
            reverse=reverse.next;
        }

    }

    public static TwoWayNode reverse(TwoWayNode head) {
        TwoWayNode pre = null;
        TwoWayNode next;
        while (head != null) {
            next = head.next;
            head.pre = next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }

}
