package driverSession;

import java.io.File;
import java.time.Duration;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
public class Appiumservice {

	public static void main(String[] args) {
        AppiumDriverLocalService appiumDriverLocalService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/")
                .withArgument(GeneralServerFlag.LOG_LEVEL, "info:debug")
                .withTimeout(Duration.ofSeconds(10))
                .withLogFile(new File("Logs" + File.separator + "Server.log")));
        appiumDriverLocalService.start();

        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options()
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .setApp(System.getProperty("user.dir" + "\\src\\\\test\\\\resources\\\\ApiDemos-debug.apk"))
                .setFullReset(false)
                .setNoReset(true)
                .setPlatformName("android")
                .setPlatformVersion("13")
                .setUdid("emulator-5556")
                .setAppPackage("com.saucelabs.mydemoapp.rn")
                .setAppActivity("com.saucelabs.mydemoapp.rn.MainActivity");

        System.out.println("URL " + appiumDriverLocalService.getUrl());
        AppiumDriver appiumDriver = new AndroidDriver(appiumDriverLocalService.getUrl(), uiAutomator2Options);
        System.out.println("SessionID" + appiumDriver.getSessionId());
        appiumDriverLocalService.stop();
}
}