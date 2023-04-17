package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProg {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AgamPatnala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	System.setProperty("webdriver.gecko.driver", "C:/Software/drivers/geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
	//	System.setProperty("webdriver.edge.driver", "C:/Software/drivers/msedgedriver.exe");
	//	WebDriver driver = new EdgeDriver();
		
		driver.get("https://petstore.octoperf.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("j2ee");//html/body/div[2]/div/form/p[2]/input[1] - Absolute XPath
		Thread.sleep(3000);
		driver.findElement(By.name("password")).clear();//    //input[@name=�password�] � Relative XPath
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("j2ee");
		Thread.sleep(3000);
		driver.findElement(By.name("signon")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}