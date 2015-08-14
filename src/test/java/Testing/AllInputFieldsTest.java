package Testing;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllInputFieldsTest {
@Test
	public void allInputFields() {
		
		//This program will count the number of input fields present in FB page
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//List<WebElement> input = driver.findElements(By.xpath("//input[@type='text'or @type ='password']"));
		List<WebElement> input = driver.findElements(By.xpath("//input[@type='password']"));
		System.out.println("The total number of password input fiels in FB is "+input.size());
		driver.close();
		
		}
}
