import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestMultiply {

    @Test
    void multiply() {
        assertEquals(4, Calculator.multiply(2,2));
    }
}