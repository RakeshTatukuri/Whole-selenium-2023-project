package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebooklogin {

	WebDriver driver;

@Given("user is on the facebook login page")
public void user_is_on_the_facebook_login_page() throws InterruptedException {
	 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
}

@When("user enters the valid emailaddress and password")
public void user_enters_the_valid_emailaddress_and_password() {
	driver.findElement(By.name("email")).sendKeys("Rakesh.tatukuri179@gmail.com");
	driver.findElement(By.name("pass")).sendKeys(("ram7799"));
}
@When("click on facebook login  button")
public void click_on_facebook_login_button() {
	driver.findElement(By.xpath("//button[@name='login']")).click();

}

@Then("the user should be navigated to facebook home page")
public void the_user_should_be_navigated_to_facebook_home_page() {
	  String expectedResult="https://www.facebook.com/";
      
	    String actualResult=driver.getCurrentUrl();
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(actualResult, expectedResult);
		 softAssert.assertAll();
}
}
