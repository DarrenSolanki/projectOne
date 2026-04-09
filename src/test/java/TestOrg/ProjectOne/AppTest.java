package TestOrg.ProjectOne;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
    	String actual = "Google";
        String expected = "Google";

        Assert.assertEquals(actual, expected);
        System.out.println("Test passed");
    }
}
