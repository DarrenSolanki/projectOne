package TestOrg.ProjectOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


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
    
    @Test
    public void answerWithTrue() {
    	String actual = "Google";
        String expected = "Google";

        Assert.assertEquals(actual, expected);
        System.out.println("Test passed in google");
    }
    
    @Test
    public void launchBrowser() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://google.com");
    	Thread.sleep(5000);
    	
    	
    	
    }
}
