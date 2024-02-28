package driverSession;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws MalformedURLException {

		AppiumDriver driver=CreateAppiumSession.initializesession();
		
		WebElement ele=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
		String text1=ele.getText();
		System.out.println(text1);
		ele.click();
		
		driver.findElement(AppiumBy.accessibilityId("Accessibility Service")).click();
			System.out.println("clicked");
	}

}
