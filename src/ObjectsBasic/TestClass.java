package ObjectsBasic;

public class TestClass {

    public static void main(String[] args) {
// Objects Basics Practice #1: Author & Book
        Author author1 = new Author();
        author1.setFirstName("Valera");
        author1.setLastName("Karpin");
        author1.printFullName();


        Book book1 = new Book("Falcao will not come to us", author1, 14.88);
        book1.getBookDetails();
///////////////////////////////////////////////////////////////////////////////////////////////////
//Objects Basics Practice #2: Clock
//        Clock clock1 = new Clock(23, 22, 1);
//        clock1.printTime();

        TimeValidate hour = new TimeValidate(); /**конструктор с тремя значениями*/
        hour.setHour(78888);
        hour.setMinute(30);
        hour.setSecond(45);

        Clock obj1 = new Clock(hour);
        obj1.printTime();

        TimeValidate hour2 = new TimeValidate();
        hour2.setSecondsSinceMidnight(3661);
        /**

        TimeValidate midnight = new TimeValidate(); /**конструктор с секундами*/

        Clock obj2 = new Clock(hour2);
        obj2.printTime();
        obj2.tickDown();
        obj2.tick();
        obj2.tick();
        obj2.tick();
        obj2.tick();
        obj2.tick();


        Clock obj3 = obj2.addClock(obj1);
        obj3.tick();
//        Clock hour1 = new Clock(); /** дефолтный конструктор*/
//        hour1.printTime();



//        TimeValidate midnight = new TimeValidate(); /**конструктор с секундами*/
//        midnight.setSecondsSinceMidnight(6200);
//        Clock obj2 = new Clock(midnight);
//        obj2.setClock();
//        obj2.tick();
//        obj2.tickDown();
///////////////////////////////////////////////////////////////////////////////////////////////////
//Objects Basics Practice #3: Dogs


    }

}
