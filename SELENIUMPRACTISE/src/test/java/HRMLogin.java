

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMLogin {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91955\\eclipse-workspace\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//HRM LOGIN
		driver.manage().window().maximize();
		Thread.sleep(2500);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2500);
		
		driver.close();
	
	}

}
//Xpath:
//One field can have multiple xpaths
//Field 1:

//input[1]
//input[@name='field1']
//form[@id='login']/input
//html/body/form/input


//JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
// jsexecutor.executeScript("argument[0].style.background='yellow'",element);