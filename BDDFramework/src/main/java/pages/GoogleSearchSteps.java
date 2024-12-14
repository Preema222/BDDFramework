package pages;

import org.openqa.selenium.WebDriver;

public class GoogleSearchSteps {
	
	private WebDriver driver;
	
	public GoogleSearchSteps(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	


	public GoogleSearchSteps() {
		
		driver.get("https://www.google.com/");
	}

		
	}
	


