import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Sara", "DR457244P", 120000, "Management", 1000.00);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(200);
        assertEquals(120200.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(2400.00, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000.00, director.getBudget(), 0.01);
    }
}
