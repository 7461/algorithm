package xor;

import common.Common;

/**
 * @ClassName: Test3
 * @Author: guf
 * @Date: 2021/12/24 9:46
 * @Description:把一个数的二进制位最后一个1提取出来
 * 00000000000100000001000
 * 00000000000000000001000
 * 一个数的相反数：这个数取反+1
 */
public class Test3 {
    public static void main(String[] args){
        int a=200;
        Common.print(a);
        Common.print(a&(-a));
        Common.print(a&((~a)+1));

    }
}
