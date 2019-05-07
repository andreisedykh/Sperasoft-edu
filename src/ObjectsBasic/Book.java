package ObjectsBasic;

public class Book {

    String title;
    Author author;
    double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }


    public void getBookDetails() {
        System.out.println(String.format("\nBook title : %s\nBook author : %s\nBook price : %f",
                this.title,
                this.author.getFullName(),
                this.price));
    }


}
