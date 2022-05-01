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

public class Loginfacebook {
	WebDriver driver;
	@Given("User Opens chrome browser")
	public void user_opens_chrome_browser() {
		System.out.println("indide steps- browser is open");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@When("User  enters Url for face book")
	public void user_enters_url_for_face_book() {
		System.out.println("indide steps- browser is open");

		driver.navigate().to("https://www.facebook.com/");
	}

	@And("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("indide steps-User eners username and password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nelufarnelu@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mindoc5566");
	}

	/*
	 * @Then("User click on login ") public void user_click_on_login() {
	 * System.out.println("inside step- user click on log in button");
	 * driver.findElement(By.xpath("//button[@id='u_0_h_VA' or @name='login']")).
	 * click();
	 * 
	 * }
	 */
	
	@Then("User click on login")
	public void user_click_on_login() {
		System.out.println("inside step- user click on log in button");
		 driver.findElement(By.xpath("//button[@id='u_0_h_VA' or @name='login']")).click();
		 
		 
	}

	@And("User logged in facebook successfully")
	public void user_logged_in_facebook_successfully() {
		System.out.println("inside in steps- user logged sucessfully in facebook");
		driver.getPageSource().contains("Friends");
		driver.close();
	}



}
