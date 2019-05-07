package ObjectsBasic;

public class BookDemo {
    public static void main(String[] args) {
        Author russelW = new Author();
        russelW.setFirstName("Russel");
        russelW.setLastName("Winderand");

        Book book2 = new Book("Developing Java Software", russelW, 79.75);
        book2.getBookDetails();
    }
}
