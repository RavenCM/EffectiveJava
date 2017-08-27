package entity;

/**
 * @author qingsheng.chen@hand-china.com	2017.08.27 23:24
 * @version 1.0
 * @name EffectiveJava
 * @description Entity
 */
public class Entity {
    private int a;
    private float b;
    private String c;

    public int getA() {
        return a;
    }

    public Entity setA(int a) {
        this.a = a;
        return this;
    }

    public float getB() {
        return b;
    }

    public Entity setB(float b) {
        this.b = b;
        return this;
    }

    public String getC() {
        return c;
    }

    public Entity setC(String c) {
        this.c = c;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity entity = (Entity) o;

        if (getA() != entity.getA()) return false;
        if (Float.compare(entity.getB(), getB()) != 0) return false;
        return getC() != null ? getC().equals(entity.getC()) : entity.getC() == null;
    }

    @Override
    public int hashCode() {
        int result = getA();
        result = 31 * result + (getB() != +0.0f ? Float.floatToIntBits(getB()) : 0);
        result = 31 * result + (getC() != null ? getC().hashCode() : 0);
        return result;
    }
}
