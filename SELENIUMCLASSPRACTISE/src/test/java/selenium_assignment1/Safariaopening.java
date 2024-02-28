package selenium_assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safariaopening {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		driver.close();

	}
}
