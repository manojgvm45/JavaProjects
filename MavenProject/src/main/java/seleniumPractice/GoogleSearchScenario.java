package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class GoogleSearchScenario {

	public static void main(String[] args) throws InterruptedException {
		//FirefoxProfile options = new FirefoxProfile();
		//options.setPreference("dom.webnotifications.enabled", false);
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//WebDriver edgeDriver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();
		//SafariDriver safariDriver = new SafariDriver();
		//OperaDriverManager operaDriver = new OperaDriverManager();


		
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("WebDriver");
		
		//Shadow shadowDom = new Shadow(driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@role='listbox']/li[5]")).click();
		WebElement element =  
				driver.findElement(By.xpath("//a[contains(@href,'lamdatest.com')][1]"));
		Actions actionEle = new Actions(driver);
	//	actionEle.moveToElement(element).click().build().perform();
		//contextClick(element).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			

		}
		
	}


