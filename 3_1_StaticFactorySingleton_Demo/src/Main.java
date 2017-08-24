import singleton.Singleton;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.27 09:24
 * @version 1.0
 * @name EffectiveJava
 * @description Main
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.execute();
    }
}
