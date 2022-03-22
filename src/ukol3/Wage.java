package ukol3;

public class Wage {
    private double grossWage;
    private double advance;
    private final double HEALTH_INSURANCE = 0.045;
    private double socialInsurance;
    private double incomeTax;
    private boolean isStudent;

    private double netWage;
    private double overpayment;

    public Wage(double grossWage, double advance, boolean isStudent) {
        if (grossWage > 0 ) {
            this.grossWage = grossWage;
        } else throw new IllegalArgumentException("Gross wage cannot be bellow 0");

        if (advance > 0 ) {
            this.advance = advance;
        } else throw new IllegalArgumentException("Advance payment cannot be bellow 0");

        this.incomeTax = (grossWage < 30000) ? 0.15 : 0.20;
        this.isStudent = isStudent;
        this.socialInsurance = (isStudent) ? 0.00 : 0.065;

        this.netWage = grossWage - grossWage * ( incomeTax + HEALTH_INSURANCE + socialInsurance);
        if ((this.netWage - advance) < 0) {
            this.overpayment = (this.netWage - this.advance ) * -1;
        }

    }

    @Override
    public String toString() {
        return  "Gross wage: " + this.grossWage + "\n" +
                "  Advance payment: " + this.advance + "\n" +
                "  Health insurance: " + this.HEALTH_INSURANCE*100 + "% (% of GW: " + this.grossWage*this.HEALTH_INSURANCE + ")\n" +
                "  Social insurance: " + this.socialInsurance*100 + "% (% of GW: " + this.grossWage*this.socialInsurance + ")\n" +
                "  Income Tax: " + this.incomeTax*100 + "% (% of GW: " + this.grossWage*this.incomeTax + ")\n" +
                "  Student: " + this.isStudent + "\n" +
                "--------------------------------------------------" + "\n" +
                "  Net wage: " + this.netWage + "\n" +
                "  Overpayment: (" + this.advance + " - " + this.netWage + ") " + this.overpayment +"\n";
    }
}