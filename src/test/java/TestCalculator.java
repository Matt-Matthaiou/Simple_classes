import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestCalculator {

    @Test
    public void canAdd(){
        assertEquals(5, Calculator.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(6, Calculator.multiply(2,3));
    }

    @Test
    public void canDivide(){
        assertEquals(2.0, Calculator.divide(10.0, 5.0), 0.0);
    }

}
