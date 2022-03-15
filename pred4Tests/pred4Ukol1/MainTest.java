package pred4Ukol1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void intSum() {
        Main m = new Main();
        int expectedResult = 3;
        int actualResult = m.intSum(1,2);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    void pythagoras() {
        Main m = new Main();
        double expectedResult = Math.sqrt(8);
        double actualResult = m.pythagoras(2,2);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void countPositiveNums() {
        Main m = new Main();
        int[] array = {1,2,3,-5,-6,7,8,-9};

        int expectedResult = 3;
        int actualResult = m.countPositiveNums(array);
    }
}