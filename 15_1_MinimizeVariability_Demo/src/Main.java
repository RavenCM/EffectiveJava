import entity.Complex;

/**
 *  @ author qingsheng.chen @ hand-china.com	2017.09.11 15:44
 *  @ version 1.0
 *  @ name EffectiveJava
 *  @ description Main
 */
public class Main {
    public static void main(String[] args) {
        Complex complex1 = Complex.valueOf(2.3d, 0.2d);
        Complex complex2 = Complex.valueOf(5d, 1d);
        System.out.println(complex1.toString() + " @ " + complex1.hashCode());
        System.out.println(complex2.toString() + " @ " + complex2.hashCode());
        complex1 = complex1.add(complex2);
        System.out.println(complex1.toString() + " @ " + complex1.hashCode());
        complex1 = complex1.subtract(complex2);
        System.out.println(complex1.toString() + " @ " + complex1.hashCode());
        complex1 = complex1.multiply(complex2);
        System.out.println(complex1.toString() + " @ " + complex1.hashCode());
        complex1 = complex1.divide(complex2);
        System.out.println(complex1.toString() + " @ " + complex1.hashCode());
    }
}
