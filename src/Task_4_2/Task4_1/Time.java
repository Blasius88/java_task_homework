package Task_4_2.Task4_1;

public class Time {
    public int second;
    public int minuts;
    public int hour;

    public int getSecond() {
        return second;
    }

    public int getMinuts() {
        return minuts;
    }

    public int getHour() {
        return hour;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Time() {
    }

    public Time(int s, int min, int h) {
        this.hour = h;
        this.minuts = min;
        this.second = s;
    }
}
