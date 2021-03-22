import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sam", "HE830240J", 30000.00);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(31000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.01);
    }
}
