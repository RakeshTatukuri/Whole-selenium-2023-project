package selenium_assignment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CreationofnewGmailaccount {

	public static void main(String[] args) throws Exception{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91955\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&ifkv=AYZoVhc70AfNr0y-oRTWBj2AlZLDXWY6HvNgldETvs5T77IbX5G0QYZ-k2MNETpVxTXVaw8WG38k&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S369890930%3A1695730695162777&theme=glif");
	driver.manage().window().maximize();
	Thread.sleep(2500);
	driver.findElement(By.xpath("//span[text()='Create account']")).click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("(//span[normalize-space()='For my personal use'])[1]")).click();
	//driver.findElement(By.xpath("(//li[@role='menuitem'])[2]")).click();
	//driver.findElement(By.xpath("(//li[@role='menuitem'])[3]")).click();
	Thread.sleep(2500);
	driver.findElement(By.name("firstName")).sendKeys("Rakesh Tatukuri");
	Thread.sleep(2500);
	//driver.findElement(By.name("lastName")).sendKeys("Tatukuri");
	//Thread.sleep(2500);
	driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
	Thread.sleep(2500);
	driver.findElement(By.id("day")).sendKeys("04");
	Thread.sleep(2500);
	driver.findElement(By.id("month")).sendKeys("december");
	Thread.sleep(2500);
	driver.findElement(By.id("year")).sendKeys("1998");
	Thread.sleep(2500);
	driver.findElement(By.id("gender")).sendKeys("Male");
	Thread.sleep(2500);
	driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
	Thread.sleep(2500);
	driver.findElement(By.id("selectionc2")).click();
	Thread.sleep(2500);
	//driver.findElement(By.id("")).click();
	//driver.findElement(By.xpath("//div[@class=\"sSzDje zVkt0c\"]")).click();
	Thread.sleep(2500);
	//driver.findElement(By.xpath("//span[normalize-space()=\"Next\"]")).click();
	driver.findElement(By.className("BudEQ rBUW7e")).click();
	Thread.sleep(2500);
	driver.findElement(By.name("Username")).sendKeys("rakeshtatukuri4");//r95960793
	//driver.findElement(By.xpath("//*[text()=\"Create a Gmail address\"]")).sendKeys("r95960793");
	Thread.sleep(2500);
	driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
	Thread.sleep(2500);
	//driver.findElement(By.name("Passwd")).sendKeys("R@kesh123");
	driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("R@kesh123");
	Thread.sleep(2500);
	//driver.findElement(By.name("PasswdAgain")).sendKeys("R@kesh123");	
	driver.findElement(By.xpath("//input[@aria-label=\"Confirm\"]")).sendKeys("R@kesh123");
	Thread.sleep(2500);
	driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
	Thread.sleep(2500);
	
	
	
	}

}
