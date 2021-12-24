package xor;

/**
 * @ClassName: Test2
 * @Author: guf
 * @Date: 2021/12/24 9:45
 * @Description: 数组中一个数出现了奇数次，其他数偶数次，把奇数次那个数找出来
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3};
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            a = a ^ arr[i];
        }
        System.out.println(a);
    }
}
