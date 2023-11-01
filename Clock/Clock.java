package Clock;

public class Clock {

    int hour = 0;
    int minute = 0;
    int second = 0;
    String meridiem = "AM";
    String _meridiem = "PM";

    Clock(int h, int min, int sec, String AM, String PM) {
        h = hour;
        min = minute;
        sec = second;
        AM = meridiem;
        PM = _meridiem;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return hour;
    }

    public int getSecond() {
        return hour;
    }

    public String getAM() {
        return meridiem;
    }

    public String getPM() {
        return _meridiem;
    }

    @Override
    public String toString() {
        if (hour > 11) {
            return hour + " : " + minute + " : " + second + " " + _meridiem;
        } else {
            return hour + " : " + minute + " : " + second + " " + meridiem;
        }
    }

    public static void main(String[] args) {
        tick(36000100);
    }

    public static void tick(int tick) {
        Clock time = new Clock(0, 0, 0, null, null);
            
        for (int i = tick; i > 0; i--) {
            time.second++;
        }
        time.minute += time.second / 60;
        time.second %= 60;
        time.hour += time.minute / 60;
        time.minute %= 60;

        time.hour%=24;
        if(time.hour==24){
            time.hour=0;
        }
        System.out.println(time);
    }
}
