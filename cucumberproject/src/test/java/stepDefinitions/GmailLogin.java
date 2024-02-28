package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailLogin {

	WebDriver driver;

@Given("user is on the gmail login page")
public void user_is_on_the_gmail_login_page() throws InterruptedException {
	 driver = new ChromeDriver();
	 driver.navigate().to("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AVQVeyxFJ9NTmOgpVAgNrt-BVtW8deLYv3YvXDddj_rDl0-ZXUMZhO1M-hgFghIFqyxL1m-mJYT2gg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S890933169%3A1699029934337346&theme=glif#inbox"); 
	 Thread.sleep(2500);
}


@When("user enters the valid email address and password")
public void user_enters_the_valid_email_address_and_password() {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
	element1.sendKeys("Rakesh.tatukuri95@gmail.com");
	
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement element2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
	element2.sendKeys("R@kesh123");
	
}
@When("click on gmail next  button")
public void click_on_gmail_next_button() {
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	
}

@Then("the user should be navigated to gmail home page")
public void the_user_should_be_navigated_to_gmail_home_page() {
	 String expectedResult="https://mail.google.com/mail/u/0/#inbox";
	    String actualResult=driver.getCurrentUrl();
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(actualResult, expectedResult);
		 softAssert.assertAll();
}

}
	 
	