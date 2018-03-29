package argument_parser;

import city.City;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArgumentParserTest {

    private final ArgumentParser parser;

    public ArgumentParserTest() {
        parser = new ArgumentParser();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testParseArguments() throws Exception {
        System.out.println("Testing parseArguments");
        String[] args = {"Malabo", "Africa/Malabo"};
        City city = parser.parseArguments(args);
        assertNotNull(city);
    }

}
