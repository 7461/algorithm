package sort;

/**
 * @description:int类型比较器
 * @author:guf
 * @createTime:2021/12/20 15:36
 */
public class IntegerComparator implements Comparator<Integer> {
    public boolean compareTo(Integer t1, Integer t2) {
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t2 <t1 ) {
            return true;
        }
        return false;

    }
}
