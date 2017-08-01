package org.database.demoPage;
import java.io.File;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utility.Base;
public class RegisterTest extends Base {
	static WebDriver driver;
	RegisterPage page;

	@BeforeClass
	public static void launchBrowser() {
		driver = Base.getDriver();

	}

	@Test
	public void registerDetails() {
		page = new RegisterPage();
		setText(page.getTxtFirstName(), "mohan");
		setText(page.getTxtLastName(), "raj");
		setText(page.getTxtAddress(), "xyzcolony,xyz street,xyz");
		setText(page.getTxtEmailAdress(), "mohanrajeee6@gmail.com");
		setText(page.getTxtPhoneNumber(), "9996599965");
		clickBtn(page.getBtnGender());
		clickBtn(page.getBtnCricket());
		clickBtn(page.getBtnHockey());
		clickBtn(page.getBtnMovies());
		clickBtn(page.getTxtlanguage());
		dropDownSelect(page.getDrpDwnSkills(), "Analytics");
		dropDownSelect(page.getDrpDwnCountries(), "Afghanistan");
		clickBtn(page.getDrpdwnSelectCountry());
		clickBtn(page.getDrpdwnSelectCountryDen());
		dropDownSelect(page.getDrpdwnYear(), "1993");
		dropDownSelect(page.getDrpdwnMonth(), "11");
		dropDownSelect(page.getDrpdwnDay(), "16");
		setText(page.getTxtPassword(), "Karthick123");
		setText(page.getTxtConfirmPassword(), "Karthick123");
		clickBtn(page.getBtnBrowse());
		uploadFiles(new File("./Files/Core java material.pdf"));
		Assert.assertTrue(elementFound(page.getImgbrowse()));
		clickBtn(page.getBtnSubmit());

	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}

}
