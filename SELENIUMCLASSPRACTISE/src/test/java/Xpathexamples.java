import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexamples {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/Downloads/XpathExample.html");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@name=\"field1\"]"));email.sendKeys("Rakesh");
		Thread.sleep(2500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red;')", email);

		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("R@kesh000");
		Thread.sleep(2500);
		js.executeScript("arguments[0].setAttribute('style','background:blue; border:2px solid red;')", password);

		WebElement login = driver.findElement(By.xpath("//input[@value=\"Login\"]"));login.click();
		Thread.sleep(2500);
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red;')", login);

		WebElement clear = driver.findElement(By.xpath("//input[@type=\"button\"][@value=\"Clear\"]"));clear.click();
		Thread.sleep(2500);
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red;')",clear);

		// driver.close();

	}

}
//form[@id="login"]--1
//input[@name="field1"]--1
//input[1]--1
//html//body//form//input--1
//input[@name="password"]--2
//input[2]--2

//input[3]--3
//input[@name="continue"][@type="submit"][@value="Login"]

//input[4]--4
//input[@type="button"][@value="Clear"]
