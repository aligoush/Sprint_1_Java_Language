package TDD.n3exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void add(){
        Calculator calculator = new Calculator();
        int result = calculator.add(5,2);
        assertEquals(7,result);
    }
    @Test
    public void subtract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10,2);
        assertEquals(8,result);
    }
    @Test
    public void multiply(){
        Calculator calculator = new Calculator();
         int result = calculator.multiply(9,3);
        assertEquals(27,result);
    }
    @Test
    public void divide(){
        Calculator calculator = new Calculator();
        float result = calculator.divide(100,2);
        assertEquals(50,result);
    }
}
