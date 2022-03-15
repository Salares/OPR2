package ukol1;

public class Book {
    private String name;
    private Publisher publisher;
    private String isbn;
    private Boolean isLent = false;

    public Book(String name, Publisher publisher, String isbn) {
        this.name = name;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public Boolean getLent() {
        return isLent;
    }

    public void setLent(Boolean lent) {
        isLent = lent;
    }

    @Override
    public String toString() {
        return "    Book\n" +
                "    name: " + name + '\n' +
                "    publisher=" + publisher + '\n' +
                "    isbn='" + isbn + '\n' +
                "    isLent=" + isLent + '\n';
    }
}
