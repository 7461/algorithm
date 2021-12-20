package sort;

/**
 * @description:交换
 * @author:guf
 * @createTime:2021/12/20 15:18
 */
public class SwapUtil {
    public static <T> void swap(T[] ts, int index1, int index2) {
        T temp=ts[index1];
        ts[index1]=ts[index2];
        ts[index2]=temp;
    }
}
