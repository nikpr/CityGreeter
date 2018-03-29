/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    private ResourceManager manager;
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
