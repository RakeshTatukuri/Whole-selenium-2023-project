package selenium_assignment2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRMloginusingexplicitwait {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		element1.sendKeys("Admin");
		WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		element2.sendKeys("admin123");
		WebElement element3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath ("//button[@type='submit']")));
		element3.click();
		
}
}