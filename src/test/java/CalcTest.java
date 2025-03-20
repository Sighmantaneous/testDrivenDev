import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {

    Calculator myCalc;

    @BeforeEach
    void setup()
    {
        myCalc = new Calculator();
    }
    @Test
    void testAddSuccess()
    {
        assertEquals(8, myCalc.add(4,4));
    }

    @Test
    void testAddFail()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{myCalc.add(Integer.MAX_VALUE, 4);});
        assertEquals("This value is too big", ex.getMessage());
    }

    @Test
    void testDivideSuccess()
    {
        assertEquals(2, myCalc.divide(8,4));
    }
    @Test
    void testDivideFailOnZero()
    {
        Exception ex = assertThrows(ArithmeticException.class, ()->{myCalc.divide(5,0 );});
        assertEquals("/ by zero not allowed", ex.getMessage());
    }

}

