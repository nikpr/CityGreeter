package argument_parser;

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArgumentParserTest {

    private final ArgumentParser parser;
    private String[] args = {"Vancouver", "America/Vancouver"};
    private boolean result;

    public ArgumentParserTest() {
        parser = new ArgumentParser();
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIsValidArguments() throws Exception {
        System.out.println("isValidArguments");
        result = parser.isValidArguments(args);
        assertTrue(result);
    }

    @Test
    public void testIsValidArgumentsWithException() throws Exception {
        System.out.println("Testing isValidArguments with wrong args");
        String [] args = {"Vancouver", "America /Vancouver"};
        try {
           result = parser.isValidArguments(args);
        } catch (IllegalArgumentException exception) {
             assertThat(exception.getMessage(), is("Illegal argument"));
        }
    }
    
     @Test
    public void testIsValidArgumentsWithinvalidLength() throws Exception {
        System.out.println("Testing isValidArguments with wrong args");
        String [] args = {"Vancouver", "America /Vancouver","America"};
        try {
           result = parser.isValidArguments(args);
        } catch (Exception exception) {
             assertThat(exception.getMessage(), is("Wrong number of arguments"));
        }
    }
    

}
