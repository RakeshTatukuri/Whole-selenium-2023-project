package CLASSWORK;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRMLogin {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91955\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//HRM LOGIN
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2500);
		driver.close();
		//driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot'] ")).click();
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	}

}
//Xpath:
//One field can have multiple xpaths
//Field 1:

//input[1]
//input[@name='field1']
//form[@id='login']/input
//html/body/form/input
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

//JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
// jsexecutor.executeScript("argument[0].style.background='yellow'",element);