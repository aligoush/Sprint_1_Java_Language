package TDD.n3exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void beforeTest() {
        calculator = new Calculator();
    }
    @Test
    public void add(){
        int result = calculator.add(5,2);
        assertEquals(7,result);
    }
    @Test
    public void subtract(){
        int result = calculator.subtract(10,2);
        assertEquals(8,result);
    }
    @Test
    public void multiply(){
        int result = calculator.multiply(9,3);
        assertEquals(27,result);
    }
    @Test
    public void divide(){
        float result = calculator.divide(100,2);
        assertEquals(50,result);
    }
    @Test
    public void divisionByZero(){
        assertThrows(ArithmeticException.class, ()-> calculator.divide(1,0));
    }
}
