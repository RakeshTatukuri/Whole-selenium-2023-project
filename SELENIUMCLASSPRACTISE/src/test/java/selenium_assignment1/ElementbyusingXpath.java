package selenium_assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementbyusingXpath {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("java tutorial");
		Thread.sleep(2500);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2500);
		driver.close();
	}

}
