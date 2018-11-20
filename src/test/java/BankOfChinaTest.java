import Buildings.BankOfChina;
import Kaiju.Scunner;
import Vehicle.Army;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankOfChinaTest {
    BankOfChina bankOfChina;
    Scunner scunner;
    Army army;

    @Before
    public void setUp() throws Exception {
        bankOfChina = new BankOfChina("Bank of China", 15);
        scunner = new Scunner("Campbell", 5,1);
        army = new Army("tank", 3,2);

    }

    @Test
    public void hasName() {
        assertEquals("Bank of China", bankOfChina.getName());
    }

    @Test
    public void hasInitialHealthValue() {
        assertEquals(15, bankOfChina.getHealthValue());
    }

    @Test
    public void canBeAttacked() {
        scunner.attack(bankOfChina);
        assertEquals(14, bankOfChina.getHealthValue());
    }
}
