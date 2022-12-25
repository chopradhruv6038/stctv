package Base;

import org.openqa.selenium.WebDriver;

public class BasePage {

	public WebDriver driver;

	public BasePage(WebDriver driver) {

		this.driver = driver;

	}

	public void loadurl(String endpoint) {

		driver.get("https://www.stctv.com/" + endpoint);

	}

}