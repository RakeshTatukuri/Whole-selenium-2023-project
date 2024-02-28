import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
public class Frames2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Text1");//main html document
		Thread.sleep(2500);
		//-------------//frame1
		driver.switchTo().frame("frm1");//frame1
		Select coursenamedropdown=new Select(driver.findElement(By.id("course")));//when ever we have to handle dropdown, we create select class instance
		Thread.sleep(2500);
		coursenamedropdown.selectByVisibleText("Java");
		Thread.sleep(2500);

		driver.switchTo().defaultContent(); //main html document
		
		//------------//frame2
		driver.switchTo().frame("frm2");//frame2
		Thread.sleep(2500);
		driver.findElement(By.id("firstName")).sendKeys("Rakesh");
		Thread.sleep(2500);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(2500);
		
		driver.switchTo().defaultContent();//main html document
		Thread.sleep(2500);
		
		
		
		driver.switchTo().defaultContent();//main html document

		
		driver.switchTo().frame("frm1");//frame1
		Thread.sleep(2500);
		coursenamedropdown.selectByVisibleText("Javascript");
		
		
		
		driver.switchTo().defaultContent();//main html document
		Thread.sleep(2500);
		driver.findElement(By.id("name")).clear();
		Thread.sleep(2500);
		driver.findElement(By.id("name")).sendKeys("Text2");
		
		
	}

}
