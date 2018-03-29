package resource_manager;

import java.util.Locale;
import java.util.ResourceBundle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceManagerTest {

    private final ResourceManager manager;
    private ResourceBundle result;
    private Locale locale;
    
    public ResourceManagerTest() {
        manager = new ResourceManager();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        locale = Locale.ENGLISH;
    }

    @After
    public void tearDown() {
        locale = null;
    }

    @Test
    public void testGetResourceBundle() {
        System.out.println("Testing getResourceBundle");
        result = manager.getResourceBundle();
        assertNotNull(result);  
    }

    @Test
    public void testGetResourceBundle_Locale() {
        System.out.println("Testing getResourceBundle with Locale");
        result = manager.getResourceBundle(locale);
        assertNotNull(result);
    }

}
