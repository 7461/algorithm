package demo1;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/20 10:39
 */
public class Test {
    public static void print(int a) {
        for (int i = 31; i >= 0; i--) {
            //左移之后做与运算
            System.out.print(((a&1<<i))==0?"0":"1");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        /*print(1);
        //负数取反+1，即补码
        print(-1);
        //异或运算相同为0，不同为1
        System.out.println(1^1);w
        //1带符号右移一位
        System.out.println(1>>1);
        //1不带符号右移1位
        System.out.println(1>>>1);*/
        //取相反数
        print(~1+1);
        //非运算，取反+1
        System.out.println(~1+1);
        System.out.println(-Integer.MIN_VALUE);

























    }
}
