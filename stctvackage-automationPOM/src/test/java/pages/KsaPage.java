package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;

public class KsaPage extends BasePage {

	private By LITETypePlan = By.xpath("/html//strong[@id='lite']");

	private By ActualCurrencyPricePlanLite = By.xpath("/html//div[@id='lite_tierCurrency']");

	private By ActualTypePlanClassic = By.xpath("/html//strong[@id='classic']");

	private By ActualCurrencyPricePlanClassic = By.xpath("/html//div[@id='classic_tierCurrency']");

	private By ActualTypePlanPremium = By.xpath("/html//strong[@id='premium']");

	private By ActualCurrencyPricePlanPremium = By.xpath("/html//div[@id='premium_tierCurrency']");

	public KsaPage(WebDriver driver) {
		super(driver);

	}

	public String getAttributePlanLite() {

		return driver.findElement(LITETypePlan).getText();

	}

	public String getAttributePriceandCurrencyLite() {

		return driver.findElement(ActualCurrencyPricePlanLite).getText();

	}

	public String getAttributePlanClassic() {

		return driver.findElement(ActualTypePlanClassic).getText();

	}

	public String getAttributePriceandCurrencyClassic() {

		return driver.findElement(ActualCurrencyPricePlanClassic).getText();

	}

	public String getAttributePlanPremium() {

		return driver.findElement(ActualTypePlanPremium).getText();

	}

	public String getAttributePriceandCurrencyPremium() {

		return driver.findElement(ActualCurrencyPricePlanPremium).getText();

	}

}
