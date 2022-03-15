package pred4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyMachineTest {

    @Test
    void constructorTest() {
        int cash = 100;
        MoneyMachine machine = new MoneyMachine(cash);
        int expectedResult = cash;
        int actualResult = machine.getAccountHoldings();

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void setAccountHoldings() {
        int cash = 100;
        MoneyMachine machine = new MoneyMachine(0);
        machine.setAccountHoldings(cash);
        int expectedResult = cash;
        int actualResult = machine.getAccountHoldings();

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void getCash() {
        MoneyMachine machine = new MoneyMachine(1000);
        machine.getCash(100);
        int expectedResult = 900;
        int actualResult = machine.getAccountHoldings();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void setHoldingsThrowsException() {
        MoneyMachine machine = new MoneyMachine(0);
        assertThrows(IllegalArgumentException.class, () -> {
            machine.setAccountHoldings(-100);
        });
    }


    @Test
    void getCashThrowsException() {
        MoneyMachine machine = new MoneyMachine(50);
        assertThrows(IllegalArgumentException.class,() -> {
            machine.getCash(100);
        });
    }

    @Test
    void setHoldingsDoesntThrowException() {
        MoneyMachine machine = new MoneyMachine(0);
        assertDoesNotThrow(() -> {
            machine.setAccountHoldings(100);
        });
    }

    @Test
    void getCashDoesntThrowException() {
        MoneyMachine machine = new MoneyMachine(150);
        assertDoesNotThrow(() -> {
            machine.getCash(100);
        });
    }
}