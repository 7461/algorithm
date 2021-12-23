package search.binarySearch;

import search.Search;

/**
 * @description:二分查找
 * @author:guf
 * @createTime:2021/12/21 17:45
 */
public class BinarySearch implements Search {
    public int search(int[] arr, int num) {
        int index = -1;
        // 1.先处理边界条件
        if (arr == null || arr.length == 0) {
            return index;
        }
        int l = 0;
        int r = arr.length-1;
        int mid = (l + r) / 2;
        while (l<=r) {
            if (arr[mid]== num){
                index = mid;
                r = mid-1;
            }
            if (arr[mid] < num) {
                l = mid+1;
            }
            if (arr[mid] > num) {
                r = mid-1;
            }
            mid = (l + r) / 2;
        }
        return index;
    }

    public static void main(String[] args) {
        int[]arr=new int[]{1,2,5,9,11,52,59,63};
        BinarySearch binarySearch = new BinarySearch();
        int search = binarySearch.search(arr, 63);
        System.out.println(search);
        System.out.println(arr[search]);
    }
}
