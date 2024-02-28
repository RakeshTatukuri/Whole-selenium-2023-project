package selenium_assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreationofFacebookaccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		Thread.sleep(2500);
		driver.findElement(By.name("firstname")).sendKeys("Rakesh");
		Thread.sleep(2500);
		driver.findElement(By.name("lastname")).sendKeys("Tatukuri");
		Thread.sleep(2500);
		driver.findElement(By.name("reg_email__")).sendKeys("Rakesh.tatukuri@gmail.com");
		Thread.sleep(2500);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Rakesh.tatukuri@gmail.com");
		Thread.sleep(2500);
		driver.findElement(By.id("password_step_input")).sendKeys("R@kesh000");
		Thread.sleep(2500);
		driver.findElement(By.id("day")).sendKeys("29");
		Thread.sleep(2500);
		driver.findElement(By.id("month")).sendKeys("SEPTEMBER");
		Thread.sleep(2500);
		driver.findElement(By.id("year")).sendKeys("2011");
		Thread.sleep(2500);
		//driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		driver.findElement(By.xpath("//*[text()='Male']")).click();
		Thread.sleep(2500);
		//driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(2500);
		/*driver.findElement(By.xpath("(//input[@id='email'])")).sendKeys("rakesh.tatukuri@gmail.com");
		Thread.sleep(2500);
		driver.findElement(By.id("pass")).sendKeys("R@kesh000");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@id='u_0_5_cM']")).click();
		Thread.sleep(2500);*/
		driver.close();

	}

}
