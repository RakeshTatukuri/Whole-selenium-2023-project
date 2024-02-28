import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HRMLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//HRM LOGIN
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		/*WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		element1.sendKeys("Admin");
		WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		element2.sendKeys("admin123");
		WebElement element3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		element3.click();*/
		//driver.close();

		// explicit wait for multiple web elements using generic function
		By elementlocator1=By.name("username");
		waitforElementPresent(driver,elementlocator1,10).sendKeys("Admin");//explicit wait
		By elementlocator2=By.name("password");
		waitforElementPresent(driver,elementlocator2,10).sendKeys("admin123");//explicit wait
		By elementlocator3=By.xpath("//button[@type='submit']");
		waitforElementPresent(driver,elementlocator3,10).click();//explicit wait

	}
	// explicit wait for multiple web elements
	private static WebElement waitforElementPresent(WebDriver driver, By elementlocator, int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	    wait.until(ExpectedConditions.presenceOfElementLocated(elementlocator)); 
	    return driver.findElement(elementlocator); 
	}

}








//driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot'] ")).click();
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
// jsexecutor.executeScript("argument[0].style.background='yellow'",element);