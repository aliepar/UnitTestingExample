import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualsFour(){
        var calc = new SimpleCalculator();
        assertEquals(4,calc.add(2,2));// assert or check
    }
    @Test
    void elevenPlusTwoShouldEqualsThirteen(){
        var calc = new SimpleCalculator();
        assertEquals(13,calc.add(11,2));// assert or check
    }
    //create one more method, to do mathematical equation
    //create at last one uni test  to check your
    @Test
    void fiveMinusFourEqualsOne(){
        var calc = new SimpleCalculator();
        assertEquals(1,calc.subs(5,4));// assert or check
    }
    @Test
    void fiveTimesFourEqualsTwenty(){
        var calc = new SimpleCalculator();
        assertEquals(20,calc.multi(5,4));// assert or check

    }

}