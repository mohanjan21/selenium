package org.database.demoPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Base;
public class RegisterPage extends Base {
	@FindBy(xpath="//*[@ ng-model='FirstName']")
	private WebElement txtFirstName;
	@FindBy(xpath="//*[@ ng-model='LastName']")
	private WebElement txtLastName;
	@FindBy(xpath="//*[@ ng-model='Adress']")
	private WebElement txtAddress;
	@FindBy(xpath="//*[@ ng-model='EmailAdress']")
	private WebElement txtEmailAdress;
	@FindBy(xpath="//*[@ ng-model='Phone']")
	private WebElement txtPhoneNumber;
	@FindBy(xpath="//*[@ value='Male']")
	private WebElement btnGender;
	@FindBy(id = "checkbox1")
	private WebElement btnCricket;
	@FindBy(id = "checkbox2")
	private WebElement btnMovies;
	@FindBy(id = "checkbox3")
	private WebElement btnHockey;
	@FindBy(id = "msdd")
	private WebElement txtlanguage;
	@FindBy(id="Skills")
	private WebElement drpdwnskills;
	@FindBy(id="countries")
	private WebElement drpdwnCountries;
	@FindBy(xpath="//*[@role='combobox']")
	private WebElement drpdwnSelectCountry;
	@FindBy(xpath=".//*[@id='select2-country-results']/li[4]")
	private WebElement drpdwnSelectCountryDen;
	@FindBy(id="imagesrc")
	private WebElement imgbrowse;
	@FindBy(id="yearbox")
	private WebElement drpdwnYear;
	@FindBy(xpath="//*[@placeholder='Month']")
	private WebElement drpdwnMonth;
	@FindBy(id="daybox")
	private WebElement drpdwnDay;
	@FindBy(id="firstpassword")
	private WebElement txtPassword;
	@FindBy(id="secondpassword")
	private WebElement txtConfirmPassword ;
	@FindBy(id="submitbtn")
	private WebElement btnSubmit ;
	@FindBy(xpath="//*[@id='section']/div/h2")
	private WebElement imgRegister ;
	@FindBy(id = "imagesrc")
	private WebElement btnBrowse;
	
	public WebElement getImgbrowse() {
		return imgbrowse;
	}

	public WebElement getDrpdwnSelectCountryDen() {
		return drpdwnSelectCountryDen;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtEmailAdress() {
		return txtEmailAdress;
	}

	public WebElement getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public WebElement getBtnGender() {
		return btnGender;
	}

	public WebElement getBtnCricket() {
		return btnCricket;
	}

	public WebElement getBtnMovies() {
		return btnMovies;
	}

	public WebElement getBtnHockey() {
		return btnHockey;
	}

	public WebElement getTxtlanguage() {
		return txtlanguage;
	}

	public WebElement getDrpDwnSkills() {
		return drpdwnskills;
	}

	public WebElement getDrpDwnCountries() {
		return drpdwnCountries;
	}

	public WebElement getDrpdwnSelectCountry() {
		return drpdwnSelectCountry;
	}

	public WebElement getDrpdwnYear() {
		return drpdwnYear;
	}

	public WebElement getDrpdwnMonth() {
		return drpdwnMonth;
	}

	public WebElement getDrpdwnDay() {
		return drpdwnDay;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtConfirmPassword() {
		return txtConfirmPassword;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getImgRegister() {
		return imgRegister;
	}

	
	public WebElement getBtnBrowse() {
		return btnBrowse;
	}

	public RegisterPage() {
		PageFactory.initElements(Base.driver, this);

	}

}
