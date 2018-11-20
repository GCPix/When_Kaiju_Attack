import Kaiju.Otachi;
import Kaiju.Scunner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtachiTest{
    Scunner scunner;
    Otachi otachi;
    @Before
    public void setUp() throws Exception {
        scunner = new Scunner("Campbell", 10,1);
        otachi = new Otachi("Suzy", 5, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Campbell", scunner.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(10, scunner.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(1, scunner.getAttackValue());
    }

    @Test
    public void canMove() {
        String expected = "Campbell moves slowly to the bottom of the road";
        String result = scunner.move("the bottom of the road");
        assertEquals(expected, result);
    }

    @Test
    public void canLoseHealth() {
        scunner.takeDamage(5);
        assertEquals(5, scunner.getHealthValue());
    }

    @Test
    public void canAttack() {
        scunner.attack(otachi);
        assertEquals(4, otachi.getHealthValue());
    }
}
