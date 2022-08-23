package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTests {
	ChromeDriver driver;

	@BeforeTest()
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Parameters({ "url", "emailID" })
	@Test
	public void f(String url, String emailID) throws InterruptedException {

		driver.get(url);
		driver.findElement(By.id("login-username")).sendKeys(emailID);
		Thread.sleep(2000);
	}

	@AfterTest()
	public void AfterTest() {
		driver.quit();
	}
}
