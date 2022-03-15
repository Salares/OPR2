package pred4;

public class MoneyMachine {
    private int accountHoldings;

    public MoneyMachine(int accountHoldings) {
        this.setAccountHoldings(accountHoldings);
    }

    public int getAccountHoldings() {
        return accountHoldings;
    }

    public void setAccountHoldings(int accountHoldings) {
        if (accountHoldings < 0) {
            throw new IllegalArgumentException("accountHoldings cannot be lower than 0.");
        } else {
            this.accountHoldings = accountHoldings;
        }
    }

    public void getCash(int cash) {
        if (this.getAccountHoldings() - cash < 0) {
            throw new IllegalArgumentException("No cash.");
        } else {
            this.setAccountHoldings(this.getAccountHoldings() - cash);
        }
    }
}
