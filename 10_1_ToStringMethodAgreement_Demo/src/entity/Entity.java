package entity;

import java.util.Arrays;

/**
 * @author qingsheng.chen@hand-china.com	2017.08.28 15:45
 * @version 1.0
 * @name EffectiveJava
 * @description Entity
 */
public class Entity {
    private byte a;
    private short b;
    private int c;
    private long d;
    private float e;
    private double f;
    private char g;
    private boolean h;

    private String i;
    private int[] j;

    public byte getA() {
        return a;
    }

    public Entity setA(byte a) {
        this.a = a;
        return this;
    }

    public short getB() {
        return b;
    }

    public Entity setB(short b) {
        this.b = b;
        return this;
    }

    public int getC() {
        return c;
    }

    public Entity setC(int c) {
        this.c = c;
        return this;
    }

    public long getD() {
        return d;
    }

    public Entity setD(long d) {
        this.d = d;
        return this;
    }

    public float getE() {
        return e;
    }

    public Entity setE(float e) {
        this.e = e;
        return this;
    }

    public double getF() {
        return f;
    }

    public Entity setF(double f) {
        this.f = f;
        return this;
    }

    public char getG() {
        return g;
    }

    public Entity setG(char g) {
        this.g = g;
        return this;
    }

    public boolean isH() {
        return h;
    }

    public Entity setH(boolean h) {
        this.h = h;
        return this;
    }

    public String getI() {
        return i;
    }

    public Entity setI(String i) {
        this.i = i;
        return this;
    }

    public int[] getJ() {
        return j;
    }

    public Entity setJ(int[] j) {
        this.j = j;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity entity = (Entity) o;

        return getA() == entity.getA() && getB() == entity.getB() && getC() == entity.getC() && getD() == entity.getD() && Float.compare(entity.getE(), getE()) == 0 && Double.compare(entity.getF(), getF()) == 0 && getG() == entity.getG() && isH() == entity.isH() && (getI() != null ? getI().equals(entity.getI()) : entity.getI() == null) && Arrays.equals(getJ(), entity.getJ());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) getA();
        result = 31 * result + (int) getB();
        result = 31 * result + getC();
        result = 31 * result + (int) (getD() ^ (getD() >>> 32));
        result = 31 * result + (getE() != +0.0f ? Float.floatToIntBits(getE()) : 0);
        temp = Double.doubleToLongBits(getF());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) getG();
        result = 31 * result + (isH() ? 1 : 0);
        result = 31 * result + (getI() != null ? getI().hashCode() : 0);
        result = 31 * result + Arrays.hashCode(getJ());
        return result;
    }

    /**
     * @return 该方法以BSON的格式返回类中的所有成员
     */
    @Override
    public String toString() {
        return "Entity{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                ", g=" + g +
                ", h=" + h +
                ", i='" + i + '\'' +
                ", j=" + Arrays.toString(j) +
                '}';
    }
}
