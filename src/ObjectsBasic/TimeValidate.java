package ObjectsBasic;

public class TimeValidate {

    int hour;
    int minute;
    int second;
//    int secondsSinceMidnight;

    TimeValidate() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <=23) {
            this.hour = hour;
        }else {
            this.hour = 12;
            System.out.println("Hour value was changed to " + this.hour);
        }
    }


    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <=59) {
            this.minute = minute;
        }else {
            this.minute = 0;
            System.out.println("Minute value was changed to " + this.minute);
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <=59) {
            this.second = second;
        }else {
            this.second = 0;
            System.out.println("Second value was changed to " + this.second);
        }
    }

//    public int getSecondsSinceMidnight() {
//        return secondsSinceMidnight;
//    }
//
    public void setSecondsSinceMidnight(int secondsSinceMidnight) {
        if (secondsSinceMidnight >= 0 && secondsSinceMidnight <=86400) {
            this.second = secondsSinceMidnight;
        }else {
            this.second = 43200; // по дефолту ставим 12ч0м0с
        }
        second = secondsSinceMidnight % 60;
        hour = secondsSinceMidnight / 60;
        minute = hour % 60;
        hour = hour / 60;
        System.out.print( minute + ":" + second + ":" + hour);
    }

}
