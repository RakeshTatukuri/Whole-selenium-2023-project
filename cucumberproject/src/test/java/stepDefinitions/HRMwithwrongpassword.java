package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMwithwrongpassword {
	WebDriver driver;

@Given("user navigates to application")
public void user_navigates_to_application() throws InterruptedException {

	driver=new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2500);
}
@When("user enters valid username and invalid pasword")
public void user_enters_valid_username_and_invalid_pasword() {
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin");

}
@When("user clicks on login button")
public void user_clicks_on_login_button() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();

}
@Then("system is displays error message")
public void system_is_displays_error_message() {
	 String exceptedresult="Invalid credentials";
	    String actualresult=driver.getTitle();
	    System.out.println(actualresult);
	    SoftAssert softassert=new SoftAssert();
	    softassert.assertEquals(exceptedresult, actualresult);
	    softassert.assertAll(); 
	
}


}
