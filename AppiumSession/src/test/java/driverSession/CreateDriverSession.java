package driverSession;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateDriverSession {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:automationName", "UiAutomator2");
		cap.setCapability("appium:deviceName", "pixel_6a");
		cap.setCapability("appium:udid", "emulator-5556");

		// application path
		String apppath = System.getProperty("user.dir") + "\\src\\test\\resources\\ApiDemos-debug.apk";
	    System.out.println("Current working directory in Java : " + apppath);
		cap.setCapability("appium:app", apppath);

		// server connectivity
		URL url = new URL("http://0.0.0.0:4723");

		// create appium session
		AppiumDriver driver = new AndroidDriver(url, cap);
		System.out.println("Session id for connected session is:" + driver.getSessionId());

	}
}