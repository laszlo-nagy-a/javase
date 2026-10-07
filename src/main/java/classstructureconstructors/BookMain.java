package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("bookTitle", "bookAuthor");
        book.register("regNumber");

        System.out.println("Book registration info");
        System.out.println(
                "Book title: " + book.getTitle() + "\n" +
                "Book author: " + book.getAuthor() + "\n" +
                "Book register number: " + book.getRegNumber()
        );
    }
}
