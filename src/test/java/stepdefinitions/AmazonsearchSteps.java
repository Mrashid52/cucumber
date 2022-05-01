package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonsearchSteps {
	
	WebDriver driver;
	
	@Given("User opens chrome browser")
	public void user_opens_chrome_browser() {
	System.out.println("inside  steps- User opens chrome browser");	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

	@And("User is on amazon search  page")
	public void user_is_on_amazon_search_page() {
		System.out.println("inside steps- user is on amazon search page");
		driver.navigate().to("https://www.amazon.com/");
	}

	@When("User enters a textword in search box")
	public void user_enters_a_textword_in_search_box() {
		System.out.println("inside steps- user enters a textword in search box");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T shirt");
		
	}

	@And("User click on search icon")
	public void user_click_on_search_icon() {
		System.out.println(" user click on search icon");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("User navigated expected page")
	public void user_navigated_expected_page() {
		System.out.println("inside steps - user navigated expected page");
		driver.getPageSource().contains("t-shirt");
	}





}
