package pred4Ukol2;

import java.util.ArrayList;

public class Main {
    public int signum(double input) {
        if (input == 0) {
            return 0;
        } else {
            if(input > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public double[] diffFromAverage(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        double average = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            array[i] = average - array[i];
        }
        return array;
    }

    public ArrayList<Integer> fibonacci(int len) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        for (int i = 2; i < len; i++) {
            list.add(list.get(i-1) + list.get(i-2));
        }

        return list;
    }


}
