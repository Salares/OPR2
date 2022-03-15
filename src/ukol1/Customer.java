package ukol1;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;

public class Customer extends Person{
    private ArrayList<Loan> loans = new ArrayList<>();
    private ArrayList<Penalty> penalties = new ArrayList<>();

    public Customer(String name, String email, String telephone, Address address) {
        super(name, email, telephone, address);
    }

    private void addLoan(Loan loan) {
        loans.add(loan);
    }

    public void startLoan(Book book) {
//        Initializes loan -> Adds new Loan to Customer::loans
//        Sets Book:isLent to True
//        Sets limitDate according to Loan::loanLimit
        this.addLoan(new Loan(30,book,LocalDate.now()));
    }

    public void checkLoans() {
//        Checks loans, Over limitDate? new Penalty()
        for (Loan loan : loans) {
            if (LocalDate.now().isBefore(loan.getLimitDate())) {
                this.penalties.add( new Penalty(loan.getBook(), DAYS.between(LocalDate.now(), loan.getLimitDate())));
                System.out.println("\n\nPenalty added\n\n");
            }
        }
    }

    public void returnBook(Book book) {
        // Ends loan -> Book::isLent = False, Loan::finished = True
        for (Loan loan : this.loans) {
            if (loan.getBook() == book) {
                loan.getBook().setLent(false);
                loan.setFinished(true);
                break;
            }
        }
    }



    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public ArrayList<Penalty> getPenalties() {
        return penalties;
    }


    @Override
    public String toString() {
        return super.toString() +
                "  loans: " + loans.toString() +
                "  penalties:" + penalties + '\n';
    }
}
