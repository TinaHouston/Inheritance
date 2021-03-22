import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Emily", "GH345381S", 70000, "Product Team");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(100);
        assertEquals(70100.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(700, manager.payBonus(), 0.01);
    }
}
