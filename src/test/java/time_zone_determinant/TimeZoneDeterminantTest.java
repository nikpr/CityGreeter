package time_zone_determinant;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TimeZoneDeterminantTest {

    private final TimeZoneDeterminant determinant;
    private String timeZone;
    private String city;

    public TimeZoneDeterminantTest() {
        determinant = new TimeZoneDeterminant();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        timeZone = "America/Vancouver";
        city = "Vancouver";
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetHoursFrom() {
        System.out.println("getHoursFrom");
        int result = determinant.getHoursFrom(timeZone);
        assertTrue(result != 0);
        
    }

    @Test
    public void testGetTimeZoneBy() {
        System.out.println("getTimeZoneBy");
        String result = determinant.getTimeZoneBy(city);
        assertEquals(timeZone, result);
        
    }

}
