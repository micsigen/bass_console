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
    public void test7() {
        final int max = new App().ValidPassword("1Aa3456");
        assertEquals(max, 1);
    }

    @Test
    public void test8() {
        final int max = new App().ValidPassword("1Aa45678");
        assertEquals(max, 0);
    }

    @Test
    public void test33() {
        final int max = new App().ValidPassword("123456789012345A789012345a7890123");
        assertEquals(max, 1);
    }

    @Test
    public void test32() {
        final int max = new App().ValidPassword("123456789012345A789012345a789012");
        assertEquals(max, 0);
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
    public void testBadPasswd1() {
        final int digit = new App().ValidPassword("badpassword1");
        assertEquals(digit, 2);
    }

    @Test
    public void testBadPasswd2() {
        final int digit = new App().ValidPassword("badpasswordA");
        assertEquals(digit, 2);
    }

    @Test
    public void testBadPasswd3() {
        final int digit = new App().ValidPassword("123456789A");
        assertEquals(digit, 2);
    }

    @Test
    public void testBadPasswd4() {
        final int digit = new App().ValidPassword("123456789a");
        assertEquals(digit, 2);
    }

    @Test
    public void testBadPasswd5() {
        final int digit = new App().ValidPassword("ABCDEFGHIJKL1");
        assertEquals(digit, 2);
    }

    @Test
    public void testBadPasswd6() {
        final int digit = new App().ValidPassword("ABCDEFGHIJKLa");
        assertEquals(digit, 2);
    }

    @Test
    public void testValid() {
        final int valid = new App().ValidPassword("GoodPassword123");
        assertEquals(valid, 0);
    }

    @Test
    public void testValid2() {
        final int valid = new App().ValidPassword("SecondGoodPassword123!");
        assertEquals(valid, 0);
    }

    @Test
    public void testValid3() {
        final int valid = new App().ValidPassword("Secondgoodpassword1");
        assertEquals(valid, 0);
    }

}
