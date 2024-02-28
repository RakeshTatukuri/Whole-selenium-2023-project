package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationpageload {

	//private static final String webDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://staragile.melimu.com/login/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		//driver.get("https://www.youtube.com/");
		//Thread.sleep(2500);
		/*driver.get("https://www.facebook.com/");
		Thread.sleep(2500);
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2500);
		driver.get("https://www.isro.gov.in/");
		Thread.sleep(5000);*/
		driver.close(); 
	}

}
