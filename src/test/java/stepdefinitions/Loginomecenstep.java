package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginomecenstep {
	
	WebDriver driver;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.out.println("inside  steps- User Launch Chrome browser");	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
	}

	@When("User Enters URL {string}")
	public void user_enters_url(String string) {
		System.out.println("inside steps");
		driver.get("https://inventory.omecen.com/");
	}

	@Then ("User Enters username as {string}")
	public void user_enters_email_as(String username) {
		System.out.println("inside steps");
		driver.findElement(By.name("username")).sendKeys("admin");	
	}
	
	@And("user Enters password as {string}")
	public void user_enters_password_as(String password) {
		System.out.println("inside steps");
		driver.findElement(By.name("password")).sendKeys("admin_test");	
	}

	@Then ("User Click login")
	public void user_click_login() {
		System.out.println("inside steps");
		driver.findElement(By.id("kt_login_signin_submit")).click();
	}

	@Then("User Navigated Dashboard page")
	public void user_navigated_dashboard_page() {
		System.out.println("inside steps");
		driver.getPageSource().contains("Dashboard");
	}



}
