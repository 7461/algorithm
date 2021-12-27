package datastructure;

/**
 * @ClassName: Test
 * @Author: guf
 * @Date: 2021/12/24 16:59
 * @Description:数据结构,单链表反转
 */
public class Test {
    public static void main(String[] args) {
        Node node1 = new Node();
        node1.setValue(1);
        Node node2 = new Node();
        node2.setValue(2);
        node1.setNext(node2);
        Node node3 = new Node();
        node3.setValue(3);
        node2.setNext(node3);
        Node node4 = new Node();
        node4.setValue(4);
        node3.setNext(node4);
        Node node5 = new Node();
        node5.setValue(5);
        node4.setNext(node5);
        Node reverse = reverse(node1);
        System.out.println(reverse.value);
        while (reverse != null) {
            System.out.println(reverse.value);
            reverse=reverse.next;
        }

    }

    public static Node reverse(Node head) {
        Node pre=null;
        Node next;
        while (head != null) {
            next=head.next;
            head.next=pre;
            pre=head;
            head = next;
        }
        return pre;
    }
}
