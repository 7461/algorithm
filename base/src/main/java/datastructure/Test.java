package datastructure;

/**
 * @ClassName: Test
 * @Author: guf
 * @Date: 2021/12/24 16:59
 * @Description:数据结构
 */
public class Test {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        node1.setNext(node2);
        Node node3 = new Node();
        node2.setNext(node3);
        Node node4 = new Node();
        node2.setNext(node4);
        Node node5 = new Node();
        node2.setNext(node5);
        Node reverse = reverse(node1);
        System.out.println(reverse.value);
    }

    public static Node reverse(Node head) {
        Node pre;
        Node next;
        while (head.next != null) {
            next = head.next;
            pre = head;
            head = next;

        }
        return head;
    }
}
