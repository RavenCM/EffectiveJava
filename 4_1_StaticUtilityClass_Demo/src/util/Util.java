package util;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.27 09:59
 * @version 1.0
 * @name EffectiveJava
 * @description Util
 */
public class Util {
    // Suppress default constructor for noninstantiabilty
    private Util(){
        throw new AssertionError();
    }

    public static void execute(){
        System.out.println("Util executed...");
    }
}
