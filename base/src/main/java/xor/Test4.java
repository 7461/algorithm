package xor;

/**
 * @ClassName: Test4
 * @Author: guf
 * @Date: 2021/12/24 11:15
 * @Description:一个数组中，有两种数出现奇数次，其他数出现偶数次
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,5,5};
        int eor=0;
        for (int i=0;i<arr.length;i++){
            eor^=arr[i];
        }
        //只保留eor的第一个1
        int eor2 = eor & (-eor);
        for (int i=0;i<arr.length;i++){
            eor2^=arr[i];
        }
        System.out.println(eor2);
        System.out.println(eor^eor2);
    }
}
