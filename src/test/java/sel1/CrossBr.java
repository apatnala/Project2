package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class CrossBr {
	
	WebDriver driver;
	int sleep=3000;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) throws Exception {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/main/resources/drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("This Browser is not correct");
		}
	}
	
	@Test
	public void petStoreTC1() throws InterruptedException {
		driver.get("https://petstore.octoperf.com/");
		Thread.sleep(sleep);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(sleep);
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(sleep);
		driver.findElement(By.cssSelector("[id^=strip]")).sendKeys("j2ee");
		Thread.sleep(sleep);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(sleep);
		driver.findElement(By.name("password")).sendKeys("j2ee");
		Thread.sleep(sleep);
		driver.findElement(By.name("signon")).click();
		Thread.sleep(sleep);
		driver.quit();
	}

}