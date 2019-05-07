package ObjectsBasic;

public class Clock {

    int hour;
    int minute;
    int second;

    private int hourDefault = 12;
    private int minuteDefault = 0;
    private int secondDefault = 0;

//    int secondsSinceMidnight;

    Clock(TimeValidate objHour){ //в конструктор передаем объекты типа TimeValidate
        this.hour = objHour.getHour();
        this.minute = objHour.getMinute();
        this.second = objHour.getSecond();
    }

    Clock() {
        this.hourDefault = hourDefault; // Дефолтный конструктор
        this.minuteDefault = minuteDefault;
        this.secondDefault = secondDefault;
    }


    public void printTime(){
        System.out.println("\nTime is " + hour + ":" + minute + ":" + second);
    }

//    public void setClock() {
//        int hours = secondsSinceMidnight % 60;
//        int mins = secondsSinceMidnight / 60;
//        int secs = mins % 60;
//        mins = mins / 60;
//        System.out.print( mins + ":" + secs + ":" + hours);
//    }

    public void tick() {
        second++;
        System.out.println("\n" + hour + ":" + minute + ":" + second);
    }

    public void tickDown() {
        second--;
        System.out.println("\n" + hour + ":" + minute + ":" + second);
    }


    public Clock addClock(Clock clock2) {
        TimeValidate timeValidate = new TimeValidate();
        timeValidate.setHour(this.hour + clock2.hour);
        timeValidate.setMinute(this.minute + clock2.minute);
        timeValidate.setSecond(this.second + clock2.second);
        return new Clock(timeValidate);
    }

    public Clock subClock(Clock clock2) {
        TimeValidate timeValidate = new TimeValidate();
        timeValidate.setHour(this.hour - clock2.hour);
        timeValidate.setMinute(this.minute - clock2.minute);
        timeValidate.setSecond(this.second - clock2.second);
        return new Clock(timeValidate);
    }

}
