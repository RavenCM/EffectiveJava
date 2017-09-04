/**
 * @author qingsheng.chen@hand-china.com	2017.09.04 11:02
 * @version 1.0
 * @name EffectiveJava
 * @description Main
 */
public class Main {

    public static void main(String[] args) {
        Entity x = new Entity().setA(Byte.valueOf("1")).setB(Short.valueOf("2")).setC(3).setD(4L).setE(5f).setF(6d).setG('7').setH(true).setI("8").setJ(new int[]{9, 10});
        Entity y = new Entity().setA(Byte.valueOf("1")).setB(Short.valueOf("2")).setC(3).setD(4L).setE(5f).setF(6d).setG('7').setH(true).setI("8").setJ(new int[]{9, 10});
        Entity z = new Entity().setA(Byte.valueOf("10")).setB(Short.valueOf("9")).setC(8).setD(7L).setE(6f).setF(5d).setG('4').setH(false).setI("3").setJ(new int[]{2, 1});
        assert x.compareTo(y) == -y.compareTo(x);
        assert y.compareTo(z) == -z.compareTo(y);

        assert x.compareTo(y) <= 0 || y.compareTo(z) <= 0 || x.compareTo(z) > 0;

        assert x.compareTo(y) != 0 || x.compareTo(z) == y.compareTo(z);
    }
}
