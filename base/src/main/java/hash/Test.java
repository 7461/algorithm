package hash;

import java.util.HashMap;

/**
 * @ClassName: Test
 * @Author: guf
 * @Date: 2021/12/27 17:57
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Integer a=1999;
        Integer b=1999;
        HashMap<Integer,String> map=new HashMap();
        map.put(a,"1");
        System.out.println(map.containsKey(b));
    }
}
