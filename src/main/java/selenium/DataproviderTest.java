package selenium;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class DataproviderTest {
	WebDriver driver;
	@BeforeTest()
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@Test(dataProvider = "getData")
	public void f(String url, String emailid) throws InterruptedException {

		driver.get(url);
		driver.findElement(By.id("login-username")).sendKeys(emailid);
		Thread.sleep(2000);
	}
	
	@DataProvider
	public Iterator<Object[]> getData()
	{
		ArrayList<Object[]> data = TestUtil.getDatafromExcel();
		return data.iterator();
	}

	@AfterTest()
	public void AfterTest() {
		driver.quit();
	}
}
