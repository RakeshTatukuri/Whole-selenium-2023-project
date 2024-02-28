package selenium_assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailaccountlogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&ifkv=AYZoVhc70AfNr0y-oRTWBj2AlZLDXWY6HvNgldETvs5T77IbX5G0QYZ-k2MNETpVxTXVaw8WG38k&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S369890930%3A1695730695162777&theme=glif");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//ul[@aria-label='Create account']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rakesh Tatukuri");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@id='day']")).sendKeys("11");
		Thread.sleep(2500);
		driver.findElement(By.id("month")).sendKeys("september");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2005");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//select[@id='gender']")).sendKeys("male");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//div[@id='selectionc2'][1]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name='Username'][1]")).sendKeys("rakeshtatukuri25");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("R@kesh123");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name='PasswdAgain']")).sendKeys("R@kesh123");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		Thread.sleep(2500);

	}

}
