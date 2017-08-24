package singleton;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.27 09:28
 * @version 1.0
 * @name EffectiveJava
 * @description
 */
public enum Singleton {
    INSTANCE;

    public void execute(){
        System.out.println("Instance executed...");
    }
}
