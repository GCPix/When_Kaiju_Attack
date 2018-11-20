import Buildings.BankOfChina;
import Buildings.CentralPlaza;
import Kaiju.Scunner;
import Vehicle.Army;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CentralPlazaTest {
    CentralPlaza centralPlaza;
    Scunner scunner;
    Army army;

    @Before
    public void setUp() throws Exception {
        centralPlaza = new CentralPlaza("Bank of China", 15);
        scunner = new Scunner("Campbell", 5,1);
        army = new Army("tank", 3,2);

    }

    @Test
    public void hasName() {
        assertEquals("Bank of China", centralPlaza.getName());
    }

    @Test
    public void hasInitialHealthValue() {
        assertEquals(15, centralPlaza.getHealthValue());
    }

    @Test
    public void canBeAttacked() {
        scunner.attack(centralPlaza);
        assertEquals(14, centralPlaza.getHealthValue());
    }
}
