package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglesearchSteps {
	WebDriver driver;

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("indide steps- browser is open");
		//System.setProperty("WebDriver.chrome.driver","C:/Users/sayee/Documents/workspace-spring-tool-suite-4-4.12.1.RELEASE/Omecen.CucumberSimple/src/test/resources/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("inside steps- user is on google search page");
		driver.navigate().to("https://www.google.com/");
	}

	@When("User enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println(" inside steps- user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}

	@And("User hits enter")
	public void user_hits_enter() {
		System.out.println(" inside steps- user hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("User is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("inside steps- user navigated to search result");
		driver.getPageSource().contains("Online courses");
	}





}
