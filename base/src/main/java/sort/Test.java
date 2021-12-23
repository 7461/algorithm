package sort;

import random.BuildArr;

import java.util.Arrays;

/**
 * @description:排序test
 * @author:guf
 * @createTime:2021/12/20 14:45
 */
public class Test {
    static boolean is=true;
    public static void main(String[] args) {
        int times=500000;
        for(int i=0;i<times;i++){
            Integer[] preIntegers1 = BuildArr.buildArr(50, 200);
            Integer[] integers2 = Arrays.copyOf(preIntegers1, preIntegers1.length);
            //System.out.println(Arrays.asList(preIntegers1));
            SortUtil.sort(preIntegers1,new SelectionSort<Integer>(),new IntegerComparator());
            SortUtil.sort(integers2,new SelectionSort<Integer>(),new IntegerComparator());
            isEqual(preIntegers1,integers2);

        }
        System.out.println(is);
    }
    public static void isEqual(Integer[]arr1,Integer[]arr2){
        if (arr1.length==0){return;}
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i])
                is=false;
        }

    }
}
