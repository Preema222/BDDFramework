package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookHomePage {

	private WebDriver driver;

	public FacebookHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isLoginButtonDisplyed() {
		if (driver.findElements(By.name("login")).size() > 0) {
			return true;
		}
		return false;
	}

}
