import java.util.Date;

/**
 * @author qingsheng.chen@hand-china.com	2017.08.25 15:20
 * @version 1.0
 * @name EffectiveJava
 * @description
 */
public class Main {
    public static final Date exampleDate = new Date(1503646063000L);

    public static void main(String[] args){
        // 对于功能相同的对象，尽可能重用同一个对象
        // Wrong demonstration
        String s1 = new String("Hello World!");
        // Correct demonstration
        String s2 = "Hello World!";

        // 相同功能的静态工厂方法总是优于构造器方法
        // Wrong demonstration
        Integer i1 = new Integer("100");
        // Correct demonstration
        Integer i2 = Integer.valueOf("100");

        // 重用那些不会被修改的对象
        // Wrong demonstration
        System.out.println(new Date().after(new Date(1503646063000L)));
        // Correct demonstration
        System.out.println(new Date().after(exampleDate));

        // 尽可能重用那些功能相同的对象
        // Wrong demonstration
        System.out.println(new Integer("100").compareTo(100));
        // Correct demonstration
        System.out.println(i2.compareTo(100));

        // 要优先使用基本数据类型而不是装箱基本类型，要当心无意识的自动装箱
        // Wrong demonstration
        Long sum1 = 0L;
        for (int i = 0; i < 100; i ++){
            sum1 += i;
        }
        System.out.println(sum1);
        // Correct demonstration
        long sum2 = 0L;
        for (int i = 0; i < 100; i ++){
            sum2 += i;
        }
        System.out.println(sum2);
    }

}
