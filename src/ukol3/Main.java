package ukol3;

public class Main {
    public static void main(String[] args) {
        Wage studentWage = new Wage(25000, 10000, true);
        System.out.println(studentWage.toString());

        Wage wage = new Wage(40000, 30000, false);
        System.out.println(wage.toString());
    }
}
