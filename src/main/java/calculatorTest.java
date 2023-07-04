import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    @DisplayName("Add two numbers")
     void add() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, calculator.multiply(2, 2)),
                () -> assertEquals(-4, calculator.multiply(2, -2)),
                () -> assertEquals(4, calculator.multiply(-2, -2)),
                () -> assertEquals(0, calculator.multiply(1, 0)));
    }

    @Test
    void divide() {
        assertEquals(2, calculator.divide(6,3));
        assertEquals(Double.POSITIVE_INFINITY, calculator.divide(6,0));
        //assertThrows(ArithmeticException.class, () -> {calculator.divide(2,0);});
    }
}