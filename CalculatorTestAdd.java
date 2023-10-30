import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestAdd {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(4, Calculator.add(3,1));
    }
}