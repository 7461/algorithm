package sort;

/**
 * @description:选择排序
 * @author:guf
 * @createTime:2021/12/20 15:02
 */
public class SelectionSort<T> implements Sort<T> {
    public void sort(T[] arr,Comparator<T> comparator) {
        if (arr==null|| arr.length<2){
            return;
        }
        int length = arr.length;
        for (int i=0;i<length-1;i++){
            int nowIndex=i;
            for (int j=i+1;j<length;j++){
                if (comparator.compareTo(arr[i],arr[j]))
                SwapUtil.swap(arr,nowIndex,j);
            }
        }
    }
}
