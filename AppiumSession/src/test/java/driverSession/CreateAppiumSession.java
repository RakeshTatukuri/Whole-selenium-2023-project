package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateAppiumSession {

	public static AppiumDriver initializesession() throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:automationName", "UiAutomator2");
		cap.setCapability("appium:deviceName", "pixel_7_pro");
        cap.setCapability("appium:udid", "emulator-5554");
        
        //application path
       String applipath=System.getProperty("user.dir")+"src\\test\\resources\\ApiDemos-debug.apk";
        //String applipath=System.getProperty("C:\\Users\\91955\\eclipse-workspace\\AppiumSession\\src\\test\\resources\\ApiDemos-debug.apk");

        cap.setCapability("appium:app", applipath);
		
        //server connectivity
        URL url=new URL("http://0.0.0.0:4723");
        
        //create appium session
        AppiumDriver driver=new AndroidDriver(url,cap);
        System.out.println("Session id for connected session is:" + driver.getSessionId());
        return driver;
	}
}
