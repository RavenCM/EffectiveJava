import finalize.Finalize;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.27 14:06
 * @version 1.0
 * @name EffectiveJava
 * @description Main
 */
public class Main {
    public static void main(String[] args){
        Finalize finalize;
        for (int i = 0; ; i++) {
            finalize = new Finalize();
            finalize.setNumber(i);
        }
    }
}
