package ukol1;

import java.util.ArrayList;

public class Author extends Person{
    private ArrayList<Publisher> publishers;
    private ArrayList<Book> books = new ArrayList<>();

    public Author(String name, String email, String telephone, Address address) {
        super(name, email, telephone, address);

    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Publisher> getPublishers() {
        return publishers;
    }

    public void addPublisher(Publisher publisher) {
        publishers.add(publisher);
    }
}
