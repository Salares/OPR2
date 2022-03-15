package ukol1;

public class Main {
    public static void main(String[] args) {
        Author author = new Author( "John Doe","johndoe@mail.com","123456789",
                                    new Address( "New York", "USA", "Cement str.", "111 00"));
        Publisher publisher = new Publisher("Publisher Number one");

        Book book = new Book("Bestseller", publisher, "whatsisbn");
        author.addBook(book);

        Customer customer = new Customer("John Smith", "johnsmith@email.com", "333666999",
                new Address("Washington D.C.","USA", "Asphalt str.","222 00"));


        customer.startLoan(book);

        System.out.println(customer.toString());

        customer.checkLoans();

        System.out.println(customer.toString());

        customer.returnBook(book);

        System.out.println(customer.toString());

    }
}
