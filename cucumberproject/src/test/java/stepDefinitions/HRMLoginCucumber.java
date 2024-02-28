package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
public class HRMLoginCucumber{
	WebDriver driver;
@Given("user is on the HRM login page")
public void user_is_on_the_hrm_login_page() throws InterruptedException {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(250));
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//Thread.sleep(2500);
}
@When("user enters the valid username and password")
public void user_enters_the_valid_username_and_password() {
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");

}
@When("click on login In button")
public void click_on_login_in_button() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();

}
@Then("the user should be navigated to home page")
public void the_user_should_be_navigated_to_home_page() {
    String exceptedresult="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
    String actualresult=driver.getCurrentUrl();
    System.out.println(actualresult);
    SoftAssert softassert=new SoftAssert();
    softassert.assertEquals(exceptedresult, actualresult);
    softassert.assertAll();
} 
}