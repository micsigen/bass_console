package hipercube.pit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bmajor on 2017. 05. 18..
 */
public class AppTest {

    @Test
    public void testMin() {
        final int min = new App().ValidPassword("1");
        assertEquals(min, 1);
    }

    @Test
    public void testMax() {
        final int max = new App().ValidPassword("1234567890123456789012345678901234567890");
        assertEquals(max, 1);
    }

    @Test
    public void testLower() {
        final int lower = new App().ValidPassword("AAAAAAA12345678");
        assertEquals(lower, 2);
    }

    @Test
    public void testUpper() {
        final int upper = new App().ValidPassword("aaaaaaaaaaaaaaaa");
        assertEquals(upper, 2);
    }

    @Test
    public void testDigit() {
        final int digit = new App().ValidPassword("AAAAAAAAAAAAAAAA");
        assertEquals(digit, 2);
    }

    @Test
    public void testValid() {
        final int valid = new App().ValidPassword("GoodPassword123");
        assertEquals(valid, 0);
    }
}
