package sort;

/**
 * @description:冒泡排序
 * @author:guf
 * @createTime:2021/12/20 16:21
 */
public class BubbleSort<T> implements Sort<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        if (arr==null|| arr.length<2){
            return;
        }
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length-i; j++) {
                if (comparator.compareTo(arr[j-1],arr[j]))
                    SwapUtil.swap(arr,j-1,j);
            }
        }
    }
}
