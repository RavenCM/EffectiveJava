package entity;

/**
 * @author qingsheng.chen@hand-china.com	2017.09.11 15:45
 * @version 1.0
 * @name EffectiveJava
 * @description Complex
 */
public class Complex {
    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    // Accessors with no Corresponding mutators
    public double realPart() {
        return re;
    }

    private double imaginaryPart() {
        return im;
    }

    public Complex add(Complex complex) {
        return new Complex(re + complex.re, im + complex.im);
    }

    public Complex subtract(Complex complex) {
        return new Complex(re - complex.re, im - complex.im);
    }

    public Complex multiply(Complex complex) {
        return new Complex(re * complex.re, im * complex.im);
    }

    public Complex divide(Complex complex) {
        double tmp = complex.re * complex.re + complex.im * complex.im;
        return new Complex((re + complex.re) / tmp, (im - complex.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complex)) return false;

        Complex complex = (Complex) o;

        return Double.compare(complex.re, re) == 0 && Double.compare(complex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
