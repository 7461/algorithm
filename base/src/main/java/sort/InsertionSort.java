package sort;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

/**
 * @description:插入排序
 * @author:guf
 * @createTime:2021/12/20 17:04
 */
public class InsertionSort<T> implements Sort<T> {
    public void sort(T[] arr, Comparator<T> comparator) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j -1>= 0; j--) {
                if (!comparator.compareTo(arr[j], arr[j - 1])) {
                    SwapUtil.swap(arr,j,j-1);
                }
            }
        }
    }
}
