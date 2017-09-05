package entity;

/**
 * @author qingsheng.chen@hand-china.com	2017.09.05 10:05
 * @version 1.0
 * @name EffectiveJava
 * @description Time
 */
// Public class with exposed immutable fields - questionable
public class Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINNUTES_PER_HOUR = 60;

    private final int hour;

    private final int minute;

    public Time(int hour, int minute) {
        if (hour < 0 || hour >= HOURS_PER_DAY)
            throw new IllegalArgumentException("Hour : " + hour);
        if (minute < 0 || minute >= MINNUTES_PER_HOUR)
            throw new IllegalArgumentException("Minute : " + minute);
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }
}
