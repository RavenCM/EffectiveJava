import builder.Builder;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.26 19:40
 * @version 1.0
 * @name EffectiveJava
 * @description Entity
 */
public class Entity {
    private int a;
    private long b;
    private double c;
    private String d;

    private Entity(Builder builder) {
        a = builder.a;
        b = builder.b;
        c = builder.c;
        d = builder.d;
    }

    public static class Builder implements builder.Builder<Entity> {
        private int a;
        private long b;
        private double c;
        private String d;

        @Override
        public Entity build() {
            return new Entity(this);
        }

        public Builder a(int value) {
            a = value;
            return this;
        }

        public Builder b(long value) {
            b = value;
            return this;
        }

        public Builder c(double value) {
            c = value;
            return this;
        }

        public Builder d(String value) {
            d = value;
            return this;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d='" + d + '\'' +
                '}';
    }
}
