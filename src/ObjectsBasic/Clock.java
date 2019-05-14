package ObjectsBasic;

public class Clock {

    int hour;
    int minute;
    int second;

    private int hourDefault = 12;
    private int minuteDefault = 0;
    private int secondDefault = 0; //0 - дефолтное значение int, его можно не сеттить

//    int secondsSinceMidnight;

    Clock(TimeValidate objHour){ //в конструктор передаем объекты типа TimeValidate
        this.hour = objHour.getHour();
        this.minute = objHour.getMinute();
        this.second = objHour.getSecond();
    }

    Clock() {
        //эти значения были присвоены по-умолчанию в коде выше, можно было вынести присваивание сюда, что, по сути, идентично
//        hourDefault = 12;
//        minuteDefault = 0;
//        secondDefault = 0;
        this.hourDefault = hourDefault; // Дефолтный конструктор
        this.minuteDefault = minuteDefault; 
        this.secondDefault = secondDefault;

      


    }


    public void printTime(){
        System.out.println("\nTime is " + hour + ":" + minute + ":" + second);
    }
    //Перед пушем / пулл реквестом лучше чистить код от муссора
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
