package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverManager;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void StartDriver() {

		driver = new DriverManager().initializeDriver();

	}

	@AfterMethod
	public void QuitDriver() {

		driver.quit();

	}

}
