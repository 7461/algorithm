package sort;

import java.util.Arrays;

/**
 * @description:排序test
 * @author:guf
 * @createTime:2021/12/20 14:45
 */
public class Test {
    public static void main(String[] args) {
        Integer[] preIntegers = {9, 8, 6, 4, 11, 100, 0, 2, 2, 5};
        System.out.println(Arrays.asList(preIntegers));
        SortUtil.sort(preIntegers,new SelectionSort<Integer>(),new IntegerComparator());
        //SortUtil.sort(preIntegers,new BubbleSort<Integer>(),new IntegerComparator());
        //SortUtil.sort(preIntegers,new InsertionSort<Integer>(),new IntegerComparator());
        System.out.println(Arrays.asList(preIntegers));
    }
}
