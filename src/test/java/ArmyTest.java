import Buildings.BankOfChina;
import Kaiju.Otachi;
import Kaiju.Scunner;
import Vehicle.Army;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmyTest {
    Scunner scunner;
    Otachi otachi;
    Army army;
    BankOfChina bankOfChina;

    @Before
    public void setUp() throws Exception {
        army = new Army("tank", 2, 1);
        scunner = new Scunner("Campbell", 10,1);
        otachi = new Otachi("Suzy", 5, 5);
        bankOfChina = new BankOfChina("Bank of China", 15);

    }

    @Test
    public void hasType() {
        assertEquals("tank", army.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(2, army.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(1, army.getAttackValue());
    }


    @Test
    public void canLoseHealth() {
        army.takeDamage(1);
        assertEquals(0, army.getHealthValue());
    }

    @Test
    public void canAttack() {
        army.attack(otachi);
        assertEquals(4, otachi.getHealthValue());
    }
    @Test
    public void canAttack__NotVehicle() {
        army.attack(bankOfChina);
        assertEquals(15, bankOfChina.getHealthValue());
    }
}
