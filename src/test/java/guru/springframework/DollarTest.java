package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DollarTest {

    @Test
    void moneyMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15) , five.times(3));

        Money five1 = Money.franc(5);
        assertEquals(Money.franc(10), five1.times(2));
        assertEquals(Money.franc(15) , five1.times(3));
    }

    @Test
    void testEquality() {
        assertEquals(Money.dollar(3), Money.dollar(3));
        assertNotEquals(Money.dollar(2), Money.dollar(3));
        assertNotEquals(Money.dollar(2), Money.franc(2));
        assertNotEquals(Money.franc(2), Money.franc(3));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(10).currency());
        assertEquals("CHF", Money.franc(10).currency());
    }

}
