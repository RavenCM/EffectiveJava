package finalize;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.27 14:04
 * @version 1.0
 * @name EffectiveJava
 * @description Finalize
 */
public class Finalize {
    private int number = 0;
    private int[] a = new int[100000];

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize finalize., number = " + number);
        super.finalize();
    }
}
