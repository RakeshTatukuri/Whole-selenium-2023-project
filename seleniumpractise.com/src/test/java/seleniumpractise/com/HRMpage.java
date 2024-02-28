package seleniumpractise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMpage {

	public static void main(String[] args) throws Exception{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		//Thread.sleep(2500);
		WebElement email=driver.findElement(By.name("login"));
		Thread.sleep(2500);
		//highlight(driver,driver.findElement(By.className("oxd-input oxd-input--active")));
		//Thread.sleep(2500);		
		/*highlight(driver,driver.findElement(By.linkText("Forgot your password? ")));
		Thread.sleep(2500);
		highlight(driver,driver.findElement(By.partialLinkText("OrangeHRM, Inc")));
		Thread.sleep(2500);
		highlight(driver,driver.findElement(By.tagName("h5")));
		Thread.sleep(2500);
		highlight(driver,driver.findElement(By.xpath("//label[contains(text(),'orangehrm-login-container')]")));
		Thread.sleep(2500);
		highlight(driver,driver.findElement(By.cssSelector("input[type='submit']")));
		Thread.sleep(2500);*/
	

	JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
	jsexecutor.executeScript("argument[0].style.border='2px solid red'",email);
}
}
