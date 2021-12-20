package sort;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/20 14:46
 */
public class SortUtil {
    public static <T> void sort(T[] t, Sort<T> sort, Comparator<T> comparator) {
        sort.sort(t, comparator);
    }
}
