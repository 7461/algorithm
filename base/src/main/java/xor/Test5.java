package xor;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @ClassName: Test5
 * @Author: guf
 * @Date: 2021/12/24 13:58
 * @Description:数组中一种数出现了k次，其他数都出现了m次 m>1,k<m
 * 空间复杂度O（1），时间复杂度O（n）
 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr = randomArr(10, 10, 4, 2);
        System.out.println(Arrays.toString(arr));
        int resuult = searchK(arr, 4, 2);
        System.out.println(resuult);
    }

    public static int searchK(int[] arr, int m, int k) {
        int[] ans = new int[32];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 32; j++) {
                ans[j] += (arr[i] & (1 << j)) == 0 ? 0 : 1;
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (ans[i] % m != 0) {
                result = result | (1 << i);
            }
        }
        return result;
    }

    public static int[] randomArr(int maxNumKinds, int range, int m, int k) {
        int maxKinds = 0;
        do {
            maxKinds = (int) (Math.random() * maxNumKinds);
        } while (maxKinds == 0);
        int length = k + (maxKinds - 1) * m;
        int[] results = new int[length];
        int kNum = randomInt(range);
        int index = 0;
        for (int i = 0; i < k; i++) {
            results[i] = kNum;
            index++;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(kNum);
        int mkinds = maxKinds - 1;
        while (mkinds!= 0) {
            int mNum = 0;
            do {
                mNum = randomInt(range);
            } while (hashSet.contains(mNum));
            for (int i = 0; i < m; i++) {
                results[index] = mNum;
                index++;
            }
            hashSet.add(mNum);

            mkinds--;
        }
        return results;
    }

    public static int randomInt(int range) {
        return (int) (Math.random() * range) - (int) (Math.random() * range);
    }
}
