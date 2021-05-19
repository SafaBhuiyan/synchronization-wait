package explicitWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWaitCommands {
	
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.assurancewireless.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void zipCodeUsingCss() {
		
		driver.findElement(By.xpath("//a[h3[text()='Testimonials']]")).click();
	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
