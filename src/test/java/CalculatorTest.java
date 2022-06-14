import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalculator = new Calculator();


    @Test
    public void canAdd() {
        assertEquals(35,myCalculator.add(12, 23));
    }

    @Test
    public void canSubtract() {
        assertEquals(47, myCalculator.subtract(54, 7));
    }

    @Test
    public void canMultiply() {
        assertEquals(900, myCalculator.multiply(50,18));
    }

    @Test
    public void canDivide() {
        assertEquals(3.32, myCalculator.divide(136.1,41.0), 0.01);
    }
}
