import entity.Entity;

import java.util.Arrays;


/**
 * @author qingsheng.chen@hand-china.com	2017.09.04 14:38
 * @version 1.0
 * @name EffectiveJava
 * @description Main
 */
public class Main {
    public static void main(String[] args) {
        // 错误，并且可以修改值
        Entity.PUBLIC_ARRAY[0] = 6;
        System.out.println(Arrays.toString(Entity.PUBLIC_ARRAY));
        // 正确
        System.out.println(Arrays.toString(Entity.values()));
        System.out.println(Arrays.toString(Entity.VALUES.toArray()));
    }
}
