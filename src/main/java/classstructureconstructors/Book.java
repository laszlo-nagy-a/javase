package classstructureconstructors;

public class Book {
    private String author;
    private String title;
    private String regNumber;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void register(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
