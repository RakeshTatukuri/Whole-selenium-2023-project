import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.*;

public class Waits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// implicit wait
		/*
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.findElement(By.name("q")).sendKeys("selenium");
		 * driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		 * driver.findElement(By.xpath("//*[text()=\"WebDriver\"]")).click();
		 */

		// explicit wait
		/*
		 * WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
		 * driver.findElement(By.name("q")).sendKeys("selenium");
		 * driver.findElement(By.name("q")).sendKeys(Keys.RETURN); WebElement
		 * element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//*[text()=\"WebDriver\"]"))); element.click();
		 */

		// ----------------------------//
		// fluent wait declaration
		/*
		 * Wait<WebDriver> mywait = new
		 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
		 * .pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
		 * driver.findElement(By.name("q")).sendKeys("selenium");
		 * driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		 */

		// usage of fluent wait
		/*
		 * WebElement element=mywait.until(new Function<WebDriver,WebElement>(){                         
		 * public WebElement apply(WebDriver driver) { 
		 * return driver.findElement(By.xpath("//*[text()=\"WebDriver\"]"));//only for one
		 * single web element } }); element.click();
		 */

		// -----------------------//
		// fluent wait and explicit for multiple web elements we need to write one
		// generic function
		// and pass parameters to it
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		By elementlocator = By.xpath("(//span[@class='VuuXrf'][normalize-space()='Selenium'])[1]");//get the locator
		waitforElementwithFluentWait(driver, elementlocator);// fluent wait//pass the locator along with the instance
		// waitforElementPresent(driver,elementlocator,10).click();//explicit wait
	}// main method ends

	// explicit wait for multiple web elements
	/*
	 * private static WebElement waitforElementPresent(WebDriver driver, By locator,
	 * int timeout) { WebDriverWait wait=new
	 * WebDriverWait(driver,Duration.ofSeconds(timeout));
	 * wait.until(ExpectedConditions.presenceOfElementLocated(locator)); return
	 * driver.findElement(locator); }
	 */

	// fluent wait for multiple web elements
	public static WebElement waitforElementwithFluentWait(WebDriver driver, final By locator) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);

			}
		});
		return element;
	}
}//class body close