package ukol1;

import java.time.LocalDate;

public class Loan {
    private Integer loanLimit;
    private Book book;
    private LocalDate lentDate;
    private Boolean finished = false;
    private LocalDate limitDate;

    public Loan(Integer loanLimit, Book book, LocalDate lentDate) {
        this.loanLimit = loanLimit;
        this.book = book;
        this.lentDate = lentDate;
        this.limitDate = LocalDate.now().plusDays(loanLimit);
        this.book.setLent(true);
    }



    public Integer getLoanLimit() {
        return loanLimit;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getLentDate() {
        return lentDate;
    }

    public Boolean getFinished() {
        return finished;
    }

    public LocalDate getLimitDate() {
        return limitDate;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return  "  Loan: " +'\n' +
                "   loanLimit: " + loanLimit + '\n' +
                "   book: " + book.toString() +'\n' +
                "   lentDate: " + lentDate +'\n' +
                "   finished: " + finished +'\n' +
                "   limitDate: " + limitDate + '\n';
    }
}


