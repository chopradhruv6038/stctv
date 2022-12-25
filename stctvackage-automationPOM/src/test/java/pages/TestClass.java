package pages;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseTest;

public class TestClass extends BaseTest {
	@Parameters({ "ExpectedTextPlanLite", "ExpectedCPPlanLite", "ExpectedTextPlanClassic", "ExpectedCPPlanClassic",

			"ExpectedTextPlanPremium", "ExpectedCPPlanPremium" })
	@Test(priority = -1)
	public void ksaValidations(String ExpectedTextPlanLite, String ExpectedCPPlanLite, String ExpectedTextPlanClassic,

			String ExpectedCPPlanClassic, String ExpectedTextPlanPremium, String ExpectedCPPlanPremium) {

		KsaPage ksapage = new KsaPage(driver).load();

		ksapage.clickEnglishbtn();

		// Lite package

		String ActualTextPlanLite = ksapage.getAttributePlanLite();

		String ExpectedTextPlanLitee = ExpectedTextPlanLite;

		Assert.assertEquals(ActualTextPlanLite, ExpectedTextPlanLite);

		System.out.println("KSA Actual Plan Type :" + ActualTextPlanLite + "\n" + "KSA Expected Plan type :"
				+ ExpectedTextPlanLitee + "\n");

		String ActualCPPlanLite = ksapage.getAttributePriceandCurrencyLite();

		String ExpectedCPPlanLitee = ExpectedCPPlanLite;

		Assert.assertEquals(ActualCPPlanLite, ExpectedCPPlanLite);

		System.out.println("KSA Actual Currency and price for LITE Account :" + ActualCPPlanLite + "\n"
				+ "KSA Expected Currency and price for LITE Account :" + ExpectedCPPlanLitee + "\n");

		// Classic package

		String ActualTPlanClassic = ksapage.getAttributePlanClassic();

		String ExpectedTextPlanClassicc = ExpectedTextPlanClassic;

		Assert.assertEquals(ActualTPlanClassic, ExpectedTextPlanClassic);

		System.out.println("KSA Actual Plan Type :" + ActualTPlanClassic + "\n" + "KSA Expected Plan type :"
				+ ExpectedTextPlanClassicc + "\n");

		String ActualCPPlanClassic = ksapage.getAttributePriceandCurrencyClassic();

		String ExpectedCPPlanClassicc = ExpectedCPPlanClassic;

		Assert.assertEquals(ActualCPPlanClassic, ExpectedCPPlanClassic);

		System.out.println("KSA Actual Currency and price for ClASSIC Account :" + ActualCPPlanClassic + "\n"
				+ "KSA Expected Currency and price for ClASSIC Account :" + ExpectedCPPlanClassicc + "\n");

		// Premium pacckage

		String ActualTPlanPremium = ksapage.getAttributePlanPremium();

		String ExpectedTextPlanPremiumm = ExpectedTextPlanPremium;

		Assert.assertEquals(ActualTPlanPremium, ExpectedTextPlanPremium);

		System.out.println("KSA Actual Plan Type :" + ActualTPlanPremium + "\n" + "KSA Expected Plan type :"
				+ ExpectedTextPlanPremiumm + "\n");

		String ActualCPPlanPremium = ksapage.getAttributePriceandCurrencyPremium();

		String ExpectedCPPlanPremiumm = ExpectedCPPlanPremium;

		Assert.assertEquals(ActualCPPlanPremium, ExpectedCPPlanPremium);

		System.out.println("KSA Actual Currency and price for PREMIUM Account :" + ActualCPPlanPremium + "\n"
				+ "KSA Expected Currency and price for PREMIUM Account :" + ExpectedCPPlanPremiumm + "\n");

	}

	@Test
	public void BahrainValidation() {

		BahrainPage bahrainpage = new BahrainPage(driver).loadurl();

		bahrainpage.clickEnglishbtn();

		bahrainpage.clickctrybtn();

		bahrainpage.clickBahrainbtn();

		// Lite package

		String ActualTextPlanLite = bahrainpage.getAttributePlanLite();

		String ExpectedTextPlanLite = "LITE";

		Assert.assertEquals(ActualTextPlanLite, ExpectedTextPlanLite);

		System.out.println("Bahrain Actual plan type :" + ActualTextPlanLite + "\n" + "Bahrain Expected plan type :"
				+ ExpectedTextPlanLite + "\n");

		String ActualCPPlanLite = bahrainpage.getAttributePriceandCurrencyLite();

		String ExpectedCPPlanLite = "2 BHD/month";

		Assert.assertEquals(ActualCPPlanLite, ExpectedCPPlanLite);

		System.out.println("Bahrain Actual Currency and price for Lite Account :" + ActualCPPlanLite + "\n"
				+ "Bahrain Expected Currency and price for Lite Account :" + ExpectedCPPlanLite + "\n");

		// Classic package

		String ActualTPlanClassic = bahrainpage.getAttributePlanClassic();

		String ExpectedTextPlanClassic = "CLASSIC";

		Assert.assertEquals(ActualTPlanClassic, ExpectedTextPlanClassic);

		System.out.println("Bahrain Actual plan type :" + ActualTPlanClassic + "\n" + "Bahrain Expected plan type :"
				+ ExpectedTextPlanClassic + "\n");

		String ActualCPPlanClassic = bahrainpage.getAttributePriceandCurrencyClassic();

		String ExpectedCPPlanClassic = "3 BHD/month";

		Assert.assertEquals(ActualCPPlanClassic, ExpectedCPPlanClassic);

		System.out.println("Bahrain Actual Currency and price for Classic Account :" + ActualCPPlanClassic + "\n"
				+ "Bahrain Expected Currency and price for Classic Account :" + ExpectedCPPlanClassic + "\n");

		// Premium package

		String ActualTPlanPremium = bahrainpage.getAttributePlanPremium();

		String ExpectedTextPlanPremium = "PREMIUM";

		Assert.assertEquals(ActualTPlanPremium, ExpectedTextPlanPremium);

		System.out.println("Bahrain Actual plan type :" + ActualTPlanPremium + "\n" + "Bahrain Expected plan type :"
				+ ExpectedTextPlanPremium + "\n");

		String ActualCPPlanPremium = bahrainpage.getAttributePriceandCurrencyPremium();

		String ExpectedCPPlanPremium = "6 BHD/month";

		Assert.assertEquals(ActualCPPlanPremium, ExpectedCPPlanPremium);

		System.out.println("Bahrain Actual Currency and price for PREMIUM Account :" + ActualCPPlanPremium + "\n"
				+ "Bahrain Expected Currency and price for PREMIUM Account :" + ExpectedCPPlanPremium + "\n");

	}

	@Test
	public void KuwaitValidation() {

		KuwaitPage kuwaitpage = new KuwaitPage(driver).loadurl();

		kuwaitpage.clickEnglishbtn();

		kuwaitpage.clickctrybtn();

		kuwaitpage.clickKuwaitbtn();

		// Lite package

		String ActualTextPlanLite = kuwaitpage.getAttributePlanLite();

		String ExpectedTextPlanLite = "LITE";

		Assert.assertEquals(ActualTextPlanLite, ExpectedTextPlanLite);

		System.out.println("Kuwait Actual Plan Type :" + ActualTextPlanLite + "\n" + "Kuwait Expected Plan type :"
				+ ExpectedTextPlanLite + "\n");

		String ActualCPPlanLite = kuwaitpage.getAttributePriceandCurrencyLite();

		String ExpectedCPPlanLite = "1.2 KWD/month";

		Assert.assertEquals(ActualCPPlanLite, ExpectedCPPlanLite);

		System.out.println("Kuwait Actual Currency and price for Lite Account :" + ActualCPPlanLite + "\n"
				+ "Kuwait Expected Currency and price for Lite Account :" + ExpectedCPPlanLite + "\n");
		System.out.println();

		String ActualTPlanClassic = kuwaitpage.getAttributePlanClassic();

		// Classic package

		String ExpectedTextPlanClassic = "CLASSIC";

		Assert.assertEquals(ActualTPlanClassic, ExpectedTextPlanClassic);

		System.out.println("Kuwait Actual Plan Type :" + ActualTPlanClassic + "\n" + "Kuwait Expected Plan type :"
				+ ExpectedTextPlanClassic + "\n");

		String ActualCPPlanClassic = kuwaitpage.getAttributePriceandCurrencyClassic();

		String ExpectedCPPlanClassic = "2.5 KWD/month";

		Assert.assertEquals(ActualCPPlanClassic, ExpectedCPPlanClassic);

		System.out.println("Kuwait Actual Currency and price for Classic Account :" + ActualCPPlanClassic + "\n"
				+ "Kuwait Expected Currency and price for Classic Account :" + ExpectedCPPlanClassic + "\n");

		// Premium package

		String ActualTPlanPremium = kuwaitpage.getAttributePlanPremium();

		String ExpectedTextPlanPremium = "PREMIUM";

		Assert.assertEquals(ActualTPlanPremium, ExpectedTextPlanPremium);

		System.out.println("Kuwait Actual Plan Type :" + ActualTPlanPremium + "\n" + "Kuwait Expected Plan type :"
				+ ExpectedTextPlanPremium + "\n");

		String ActualCPPlanPremium = kuwaitpage.getAttributePriceandCurrencyPremium();

		String ExpectedCPPlanPremium = "4.8 KWD/month";

		Assert.assertEquals(ActualCPPlanPremium, ExpectedCPPlanPremium);

		System.out.println("Kuwait Actual Currency and price for PREMIUM Account :" + ActualCPPlanPremium + "\n"
				+ "Kuwait Expected Currency and price for PREMIUM Account :" + ExpectedCPPlanPremium + "\n");

	}

}
