import Kaiju.Otachi;
import Kaiju.Scunner;
import Vehicle.Army;
import Vehicle.Navy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NavyTest {
    Scunner scunner;
    Otachi otachi;
    Navy navy;
    Army army;
    @Before
    public void setUp() throws Exception {
        navy = new Navy("Gunboat", 3, 2);
        scunner = new Scunner("Campbell", 10,1);
        otachi = new Otachi("Suzy", 5, 5);
        army = new Army("tank", 5, 1);
    }

    @Test
    public void hasType() {
        assertEquals("Gunboat", navy.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(3, navy.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(2, navy.getAttackValue());
    }


    @Test
    public void canLoseHealth() {
        navy.takeDamage(1);
        assertEquals(1, navy.getHealthValue());
    }

    @Test
    public void canAttack() {
        navy.attack(otachi);
        assertEquals(3, otachi.getHealthValue());
    }

    @Test
    public void canAttack__NotVehicle() {
        navy.attack(army);
        assertEquals(5, army.getHealthValue());
    }
}
