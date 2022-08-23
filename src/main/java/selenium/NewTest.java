package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	ChromeDriver driver;

	@BeforeTest()
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority=2,groups = "google")
	public void FirstTest() {

		driver.get("https://www.google.com");

	}
	
	@Test(priority=1,groups = "google")
	public void secondTest() {

		driver.get("https://www.gmail.com");

	}
	
	@Test(priority=3)
	public void ThirdTest() {

		driver.get("https://www.youtube.com");

	}
	
	@AfterTest()
	public void AfterTest()
	{
       driver.quit();
	}

}
