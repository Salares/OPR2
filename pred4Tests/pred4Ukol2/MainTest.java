package pred4Ukol2;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void signumAboveZero() {
        Main m = new Main();
        int expectedResult = 1;
        int actualResult = m.signum(0.6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void signumZero() {
        Main m = new Main();
        int expectedResult = 0;
        int actualResult = m.signum(0);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void signumBellowZero() {
        Main m = new Main();
        int expectedResult = -1;
        int actualResult = m.signum(-0.6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void diffFromAverage() {
        Main m = new Main();
        double[] array = {0., 1., 2., 3., 4.};
        double[] expectedResult = {2,1,0,-1,-2};
        double[] actualResult = m.diffFromAverage(array);

        assertArrayEquals(expectedResult,actualResult);


    }

    @Test
    void fibonacci() {
        Main m = new Main();
        int len = 5;
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(0);
        expectedResult.add(1);
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);

        ArrayList<Integer> actualResult = m.fibonacci(len);
        Object[] expected = expectedResult.toArray();
        Object[] actual = actualResult.toArray();

        assertArrayEquals(expected,actual);


    }
}