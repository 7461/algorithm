package random;

/**
 * @description:
 * @author:guf
 * @createTime:2021/12/21 14:08
 */
public class BuildArr {
    public static Integer[] buildArr(int maxLength, int maxValue) {
        int i1 = (int) (Math.random() * maxLength);
        Integer[]arr=new Integer[i1];
        for (int i=0;i<i1;i++){
            int i2 = (int) (Math.random() * maxValue)-(int) (Math.random() * maxValue);
            arr[i]=i2;
        }
        return arr;
    }
}
