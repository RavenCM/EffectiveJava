package singleton;

import java.io.Serializable;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.27 09:20
 * @version 1.0
 * @name EffectiveJava
 * @description Singleton
 */
// Singleton with static factory
public class Singleton implements Serializable{
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
    // readeResolve method to preserve singleton property
    private Object readResolve() {
        // Return the one true Singleton and let the garbage collector
        // take care of the Singleton impersonator
        return INSTANCE;
    }

    public void execute(){
        System.out.println("Instance executed...");
    }
}
