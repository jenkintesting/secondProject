package Testing;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahooTest {
@Test
	
	public void testGoogle(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.com");
	}
    }
