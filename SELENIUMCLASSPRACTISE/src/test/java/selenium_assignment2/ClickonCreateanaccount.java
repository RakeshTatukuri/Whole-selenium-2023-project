package selenium_assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickonCreateanaccount {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		Thread.sleep(2500);

		driver.findElement(By.xpath("//div[@class=\"header__container\"]//span[starts-with(@class,\"laptop-desktop-only\")][contains(text(),\"Create an account\")]")).click();
	    driver.close();
	}

}
//driver.findElement(By.xpath("//div[@class=\"header__container\"]//span[contains(@class,\"laptop-desktop-only\")]")).click();
//driver.findElement(By.xpath("//div[@class=\"header__container\"]//span[contains(.,\"Create an account\")]")).click();
// driver.findElement(By.xpath("//div[@class=\"header__container\"]//span[starts-with(@class,\"laptop\")][contains(text(),\" an account\")]")).click();