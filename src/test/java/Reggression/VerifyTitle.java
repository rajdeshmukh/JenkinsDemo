package Reggression;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	@Test
	public void TestTitle() {
		
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "D:\\All Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.learn-automation.com");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}

}
