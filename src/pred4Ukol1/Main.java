package pred4Ukol1;

public class Main {

    public int intSum(int a, int b) {
        return a + b;
    }

    public double pythagoras(double a, double b) {
        return( Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) );
    }

    public int countPositiveNums(int[] array) {
        int count = 0;
        for (int i : array) {
            if(i > 0) {
                count++;
            }
        }
        return count;
    }

}
