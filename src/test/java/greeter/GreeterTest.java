package greeter;

import greet_generator.GreetGenerator;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GreeterTest {

    private static GreetGenerator greeter;
    private static ResourceBundle bundle;

    private String city;
    private int hours;
    private String result;

    public GreeterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        bundle = ResourceBundle.getBundle("messages");
        greeter = new GreetGenerator(bundle);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        city = "Vancouver";
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testGenerateGreetingMorning() throws Exception {
        System.out.println("generateGreeting");
        result = greeter.generateGreeting(city, 6);
        assertNotNull(result);
    }

    @Test
    public void testGenerateGreetingDay() throws Exception {
        result = greeter.generateGreeting(city, 12);
        assertNotNull(result);
    }

    @Test
    public void testGenerateGreetingEvening() throws Exception {
        result = greeter.generateGreeting(city, 22);
        assertNotNull(result);
    }

    @Test
    public void testGenerateGreetingNight() throws Exception {
        result = greeter.generateGreeting(city, 3);
        assertNotNull(result);
    }

  
    @Test
    public void testGenerateGreetingWrongHours() {
        try{
        result = greeter.generateGreeting(city, 44);
        }catch(IllegalArgumentException exception){
            assertThat(exception.getMessage(), is("value of hours must be between 0-24"));
        }
       

    }

}


