package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;

        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5, book6, book7));

        int numberOfBooksAvailable = 0;
        for(Book book : books) {
            if (book != null) {
                numberOfBooksAvailable++;
            }
        }

        System.out.println(numberOfBooksAvailable);

        Book[] bookArray = {new Book(), new Book(), new Book()};
        List<Book> booksListOne = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> booksListTwo = new ArrayList<>();
        booksListTwo.add(new Book());

        System.out.println(Arrays.toString(bookArray));
        System.out.println(booksListOne);
        System.out.println(booksListTwo);

        System.out.println(new Shop().getBook());
    }
}
