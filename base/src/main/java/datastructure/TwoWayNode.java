package datastructure;

import lombok.Data;

/**
 * @ClassName: Node
 * @Author: guf
 * @Date: 2021/12/24 17:50
 * @Description:
 */
@Data
public class TwoWayNode {
    public int value;
    public TwoWayNode next;
    public TwoWayNode pre;

    public TwoWayNode(int value,  TwoWayNode pre) {
        this.value = value;
        this.next = next;
        this.pre = pre;
    }
}
