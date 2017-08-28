import entity.Entity;

/**
 * @author qingsheng.chen@hand-china.com	2017.08.28 15:44
 * @version 1.0
 * @name EffectiveJava
 * @description Main
 */
public class Main {
    public static void main(String[] args) {
        Entity x = new Entity().setA(Byte.valueOf("1")).setB(Short.valueOf("2")).setC(3).setD(4L).setE(5f).setF(6d).setG('7').setH(true).setI("8").setJ(new int[]{9, 10});
        Entity y = new Entity().setA(Byte.valueOf("1")).setB(Short.valueOf("2")).setC(3).setD(4L).setE(5f).setF(6d).setG('7').setH(true).setI("8").setJ(new int[]{9, 10});
        Entity z = new Entity().setA(Byte.valueOf("10")).setB(Short.valueOf("9")).setC(8).setD(7L).setE(6f).setF(5d).setG('4').setH(false).setI("3").setJ(new int[]{2, 1});
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
    }
}
