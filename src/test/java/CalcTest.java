import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void testMultSuccess()
    {
        assertEquals(16, myCalc.multiply(4,4));
    }
<<<<<<< HEAD
=======

    @Test
    void testMultFail()
    {
        assertNotEquals(16, myCalc.multiply(2,2));
        Exception ex = assertThrows(UnsupportedOperationException.class, ()->{myCalc.multiply(Integer.MAX_VALUE,2);});
        assertEquals("This result will be bigger than allow int size", ex.getMessage());
    }

>>>>>>> eae3a58 (Adding Tests for pass and fail for  Mult function.)
}

