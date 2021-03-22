import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Derek", "KL785634F", 50000);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(100);
        assertEquals(50100.00, developer.getSalary(), 0.01);
    }

    @Test
    public void cantRaiseSalaryIfNegative(){
        developer.raiseSalary(-100);
        assertEquals(50000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(500, developer.payBonus(), 0.01);
    }

    @Test
    public void cantChangeNameIfNull(){
        developer.setName(null);
        assertEquals("Invalid entry", developer.getName());
    }

    @Test
    public void canChangeNameIfNotNull(){
        developer.setName("Tina");
        assertEquals("Tina", developer.getName());
    }
}
