package ukol1;

public class Publisher {
    private static Integer id = 1;
    private String name;
    private Book[] books;

    public Publisher(String name) {
        this.id++;
        this.name = name;
    }

    public Publisher() {
        this.id++;
    }

    public static Integer getId() {
        return id;
    }

    public Book[] getBooks() {
        return books;
    }
}
