package sort;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/20 15:09
 */
public interface Sort<T> {
    void sort(T[] ts,Comparator<T> comparator);
}
