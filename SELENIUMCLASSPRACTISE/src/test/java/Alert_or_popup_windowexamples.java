import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
public class Alert_or_popup_windowexamples {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		//---------alert window with ok button---------
		driver.findElement(By.xpath("//*[text()=\"Click for JS Alert\"]")).click();
		Thread.sleep(2500);
		//driver.switchTo().alert().accept();
		Alert alertwindow=driver.switchTo().alert();// create variable/reference/obj is alertwindow, and return type is Alert
		String actualresult=alertwindow.getText();
		alertwindow.accept();
		Thread.sleep(2500);
		driver.switchTo().defaultContent();
		System.out.println(actualresult);
		String exceptedresult="I am a JS Alert";
		
		//----------Alert window with ok and cancel button---------
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2500);
		//driver.switchTo().alert().accept();//close alert by using ok button
		//driver.switchTo().alert().dismiss();//close alert by using cancel button
		Alert alertwindow1 =driver.switchTo().alert();
		String actualresult1=alertwindow1.getText();
		alertwindow1.dismiss();//cancel
		Thread.sleep(2500);
		driver.switchTo().defaultContent();
		System.out.println(actualresult1);
		String exceptedresult1="I am a JS Confirm";
		
		//----------Alert window with input box and capture text from alert--------
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(2500);
		//driver.switchTo().alert().sendKeys("welcome");//alert by using input box
		Alert alertwindow2=driver.switchTo().alert();
		System.out.println("The message displayed on alert:"+alertwindow2.getText());
		alertwindow2.sendKeys("welcome");//input box
		Thread.sleep(2500);
		alertwindow2.accept();//ok
	}
}
