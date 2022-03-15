package ukol1;

public class Penalty {
    private Book book;
    private long delay;

    public Penalty(Book book, long delay) {
        this.book = book;
        this.delay = delay;
    }

    public Book getBook() {
        return book;
    }

    public long getDelay() {
        return delay;
    }

    @Override
    public String toString() {
        return "\n      Penalty: \n" +
                "\n    book: " + book +
                "\n    delay: " + delay + '\n';
    }
}
