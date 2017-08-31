import entity.Entity;

/**
 * @author qingsheng.chen@hand-china.com	2017.08.31 10:48
 * @version 1.0
 * @name EffectiveJava
 * @description Main
 */
public class Main {
    public static void main(String[] args) {
        Entity x = new Entity().setA(Byte.valueOf("1")).setB(Short.valueOf("2")).setC(3).setD(4L).setE(5f).setF(6d).setG('7').setH(true).setI("8").setJ(new int[]{9, 10});
        Entity y =  x.clone();
        assert x != y;
        assert x.getClass() == y.getClass();
        assert x.equals(y);
        x.getJ()[1] = 11;
        assert !x.equals(y);
        System.out.println(x);
        System.out.println(y);
    }
}
