package Testing;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class googleTest    {
	
	@Test
	
	public void testGoogle(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}
    }
