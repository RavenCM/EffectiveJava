package entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author qingsheng.chen@hand-china.com	2017.09.04 14:39
 * @version 1.0
 * @name EffectiveJava
 * @description Entity
 */
public class Entity {
    // 这样做事错误的，你无法保证它的线程安全
    public static final int[] PUBLIC_ARRAY = {1, 2, 3, 4, 5};

    // 私有
    // 这里为什么使用包装类：Arrays.asList方法接受一个数组，将数组转成一个list
    // 但是如果是基本类型，例如int[]，不被视作一个数组，而是一个对象，所以输出list泛型为int[]
    // 可以参考这个帖子http://blog.sina.com.cn/s/blog_6a6badc90101550l.html
    private static final Integer[] PRIVATE_ARRAY = {1, 2, 3, 4, 5};
    // 增加一个公有的不可变列表
    public static final List<Integer> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_ARRAY));

    // 或者提供公共的访问方法
    public static Integer[] values() {
        return PRIVATE_ARRAY.clone();
    }
}
