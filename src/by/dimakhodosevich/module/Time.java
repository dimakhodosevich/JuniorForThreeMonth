package by.dimakhodosevich.module;

public class Time {
    private int second;
    private int minute;
    private int hour;

    Time(int second) {
        int h = second / 3600;
        int m = second / 60 - h * 60;
        int s = second - m * 60 - h * 3600;

        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getAllSecond() {
        return second + minute * 60 + hour * 3600;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Your time: ").append(hour).append("hh:").
                append(minute).append("mm:").append(second).append("ss");
        return stringBuilder.toString();
    }
}
