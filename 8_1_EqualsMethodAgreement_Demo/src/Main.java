import entity.Entity;

/**
 * @author qingsheng.chen@hand-china.com	2017.08.27 23:23
 * @version 1.0
 * @name EffectiveJava
 * @description Main
 */
public class Main {
    public static void main(String[] arg) {
        Entity x = new Entity().setA(1).setB(2F).setC("3");
        Entity y = new Entity().setA(1).setB(2F).setC("3");
        Entity z = new Entity().setA(1).setB(2F).setC("3");
        // 自反性
        assert x.equals(x);
        // 对称性
        assert x.equals(y) == y.equals(x);
        // 传递性
        assert x.equals(z) == (x.equals(y) && y.equals(z));
        // 一致性
        assert x.equals(y) == (x.equals(y) && x.equals(y) && x.equals(y) && x.equals(y));
        // 对于任何非null的引用值，equals(null)必须返回false
        assert false == (x.equals(null) || y.equals(null) || z.equals(null));
    }
}
