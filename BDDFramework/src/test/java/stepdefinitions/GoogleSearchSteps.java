package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;

@Given("browser is open")
public void browser_is_open() {
	
	System.out.println(" Inside step: browser is open");
	System.setProperty("webdriver.chrome.driver", "C:/Users/preem/eclipse-workspace/BDDFramework/src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
}
   
@Given("user is on google search page")
public void user_is_on_google_search_page() {
    System.out.println("Inside step: User is on google search page");
    driver.navigate().to("https://google.com");
}

@When("user enters a text in a search box")
public void user_enters_a_text_in_a_search_box() throws InterruptedException {
	System.out.println("Inside step: User enters a text");
	driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	Thread.sleep(2000);
	
   
}
@When("hits enter")
public void hits_enter() {
	System.out.println("Inside step: User hits enter");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

@Then("user is navigated to search results")
public void user_is_navigated_to_search_results() {
    
	System.out.println("Inside step: User is navigated to search results");
	driver.getPageSource().contains("Online Courses");
	driver.quit();
}


}
