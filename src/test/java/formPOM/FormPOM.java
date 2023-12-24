package formPOM;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import io.restassured.response.Response;

public class FormPOM {
	ChromeDriver driver;
	BaseClass baseclass;
	ChromeOptions option;
	public DevTools devtools;

	public FormPOM(ChromeDriver driver) {
		this.driver = driver;
		devtools=driver.getDevTools();
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
	}

	// -----------------------Start of RAQ Form-----------------------------//
	@FindBy(linkText = "Request Quote")
	@CacheLookup
	public WebElement reqCTA;

	public String previewUrl = "https://deploy-preview-2552--legendary-monstera-200afd.netlify.app/automation-testing";
	public String marketoUrl = "https://deploy-preview-2552--legendary-monstera-200afd.netlify.app/.netlify/functions/post-marketo-lead";

	//
	@FindBy(id = "email")
	@CacheLookup
	WebElement reqEmail;

	@FindBy(id = "next-btn")
	@CacheLookup
	WebElement reqNextButton;

	@FindBy(id = "first-name")
	@CacheLookup
	WebElement reqfname;

	@FindBy(id = "last-name")
	@CacheLookup
	WebElement reqlname;

	@FindBy(id = "phone")
	@CacheLookup
	WebElement reqphone;

	@FindBy(id = "company")
	@CacheLookup
	WebElement reqcompany;

	@FindBy(id = "no-of-employees")
	@CacheLookup
	WebElement reqNoOfEmployees;

	@FindBy(id = "Countries")
	@CacheLookup
	WebElement reqCountries;

	@FindBy(partialLinkText = "Canada")
	@CacheLookup
	WebElement reqcountryItem;

	@FindBy(id = "primaryInterest")
	@CacheLookup
	WebElement reqPrimaryInterest;

	@FindBy(partialLinkText = "APIs")
	@CacheLookup
	WebElement reqinterestItem;

	@FindBy(id = "submit-btn")
	@CacheLookup
	WebElement reqsubmitButton;

	// RAQ Methods

	public void clickOnNextButton() throws InterruptedException {
		BaseClass.clickonbutton(reqNextButton);
	}

	public void clickondemoButton() throws InterruptedException {
		baseclass = new BaseClass();
		baseclass.performMouseActionIfElementNotClickable(reqCTA);
		System.out.println("----------End of first Method-------");
	}

	public void fillFirstDivAndClickOnNextButton() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(2000);
		// baseclass.performMouseActionIfElementNotClickable(reqCTA);
		// reqCTA.click();
		// baseclass.jsExecutorForClick(reqCTA);
		// baseclass.retryingFindClick(reqCTA);
		// System.out.println("CTA Clicked-->\n"+reqCTA.getAccessibleName());
		Actions action = new Actions(driver);
		Thread.sleep(2000);

		try {
			Thread.sleep(3000);
			reqEmail.sendKeys("test@gmail.com");
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reqEmail);
		}

		// WebDriverWait wait = new WebDriverWait(driver,
		// java.time.Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.jsReturnsValue("return document.readyState ==
		// 'complete'"));
		// Use FluentWait to wait for the element to be visible
		// WebElement element = wait.until(driver ->
		// driver.findElement(By.id(“elementId”)));
		// Perform actions on the element

		System.out.println("Text of the email-->\n" + reqEmail.getText().toString());
		// reqEmail.sendKeys("test@gmail.com");
		Thread.sleep(2000);
		BaseClass.clickonbutton(reqNextButton);
	}

	public void fillSecondDivAndClickOnNextButton() throws InterruptedException {

		System.out.println("company text-->" + reqcompany.getAttribute("id"));
		// BaseClass.elementVissiblity(reqcompany);
		Thread.sleep(3000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// @Deprecated
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.jsReturnsValue("return document.readyState ==
		// 'complete'"));

		try {
			reqfname.sendKeys("First Name");
			reqlname.sendKeys("Last Name");
			reqphone.sendKeys("18883058271");

			Thread.sleep(3000);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reqcompany);
		}

		// reqcompany.sendKeys("18883058271");

		BaseClass.clickonbutton(reqNextButton);
	}

	public void selectReqCountry() throws InterruptedException {

		Thread.sleep(5000);
		reqCountries.click();
		// System.out.println("Selected Country-->" + countryItem.getText());
		Thread.sleep(5000);
		reqcountryItem.click();

	}

	public void scrollTilInterestFields() throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// System.out.println("Text is--" + name.getTagName());
		// name.getTagName();
		js.executeScript("arguments[0].scrollIntoView();", reqPrimaryInterest);
	}

	public void selectInterest() throws InterruptedException {

		Thread.sleep(5000);
		reqPrimaryInterest.click();
		Thread.sleep(5000);
		try {
			reqinterestItem.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reqinterestItem);
		}

	}

	public void fillThirdDivAndClickOnSubmittButton() throws InterruptedException {
		Thread.sleep(3000);
		reqcompany.sendKeys("8x8");
		reqNoOfEmployees.sendKeys("1000");
		baseclass = new BaseClass();
		baseclass.scroll(reqCountries);
		Thread.sleep(2000);
		selectReqCountry();
		Thread.sleep(2000);
		selectInterest();
		Thread.sleep(2000);
		BaseClass.clickonbutton(reqsubmitButton);
		Thread.sleep(4000);
		// baseclass=new BaseClass();
		//BaseClass.teardowon();
	}

	// ----------------------- End of RAQ Form-----------------------------//

	@FindBy(id = "//*[@id=\"uid\"]")
	@CacheLookup
	public static WebElement formId;

	@FindBy(id = "full-name")
	@CacheLookup
	WebElement fullname;

	@FindBy(id = "tên")
	@CacheLookup
	WebElement ten;

	@FindBy(id = "công-ty")
	@CacheLookup
	WebElement cong_ty;

	@FindBy(id = "số-lượng nhân viên")
	@CacheLookup
	WebElement so_luong_nhan_vien;

	@FindBy(id = "họ")
	@CacheLookup
	WebElement ho;
	@FindBy(id = "first-and last name")
	@CacheLookup
	WebElement first_and_last_name;

	@FindBy(id = "first-name")
	@CacheLookup
	WebElement fname;

	@FindBy(id = "last-name")
	@CacheLookup
	WebElement lname;

	@FindBy(id = "email")
	@CacheLookup
	WebElement email;

	@FindBy(id = "phone")
	@CacheLookup
	WebElement phone;

	@FindBy(id = "company")
	@CacheLookup
	WebElement company;

	@FindBy(id = "Contact Phone Number")
	@CacheLookup
	WebElement contact_phone_number;

	@FindBy(id = "phone-number")
	@CacheLookup
	WebElement phonenumber;

	@FindBy(id = "company-name")
	@CacheLookup
	WebElement companyName;

	@FindBy(id = "type-of company")
	@CacheLookup
	WebElement type_of_company;

	@FindBy(id = "estimated-number of monthly active users")
	@CacheLookup
	WebElement estimated_monthly_active_user;

	@FindBy(id = "anything-else that can help us prepare for the call?")
	@CacheLookup
	WebElement prepare_for_call;

	@FindBy(xpath = "//a[@value='Government']")
	@CacheLookup
	WebElement type_of_company_Item;

	@FindBy(id = "industry")
	@CacheLookup
	WebElement industry;

	@FindBy(xpath = "//a[@value='Agriculture']")
	@CacheLookup
	WebElement industry_item;

	@FindBy(id = "legal-company name")
	@CacheLookup
	WebElement legal_company_name;

	@FindBy(id = "doing-business as")
	@CacheLookup
	WebElement doing_business_as;

	@FindBy(id = "street-address")
	@CacheLookup
	WebElement street_address;

	@FindBy(id = "city")
	@CacheLookup
	WebElement city;

	@FindBy(id = "zip-code")
	@CacheLookup
	WebElement zip_code;

	@FindBy(id = "ein-(employer identification number)")
	@CacheLookup
	WebElement employee_number;

	@FindBy(id = "stock-symbol")
	@CacheLookup
	WebElement stock_symbol;

	@FindBy(id = "stock-exchange")
	@CacheLookup
	WebElement stock_exchange;

	@FindBy(id = "website")
	@CacheLookup
	WebElement website;

	@FindBy(id = "sms-active 8x8 number")
	@CacheLookup
	WebElement active_number;

	@FindBy(id = "number-of employees")
	@CacheLookup
	WebElement no_of_employees;

	@FindBy(id = "country/region")
	@CacheLookup
	WebElement country_region;

	@FindBy(id = "country")
	@CacheLookup
	WebElement country;

	@FindBy(id = "quốc-gia")
	@CacheLookup
	WebElement country24;

	@FindBy(id = "message")
	@CacheLookup
	WebElement message;

	@FindBy(partialLinkText = "Albania")
	@CacheLookup
	WebElement countryItem;

	@FindBy(id = "us/ca-demo date")
	@CacheLookup
	public static WebElement ca_demo_date;

	@FindBy(xpath = "//a[@value='12/13/2021']")
	@CacheLookup
	public static WebElement ca_demo_date_Item;

	@FindBy(id = "demo-date")
	@CacheLookup
	public static WebElement demo_date;

	@FindBy(xpath = "//a[@value='03/09/2022']")
	@CacheLookup
	public static WebElement demo_date_Item1;

	@FindBy(xpath = "//a[@value='05/03/2022']")
	@CacheLookup
	public static WebElement demo_date_Item21;

	@FindBy(xpath = "//a[@data-clean-label='Wed, Mar 16']")
	@CacheLookup
	public WebElement demo_date_Item2;

	// String temp=timeItem.getText();

	@FindBy(id = "primary-interest")
	@CacheLookup
	WebElement interest;

	@FindBy(partialLinkText = "Chat Apps")
	@CacheLookup
	WebElement interestItem;

	@FindBy(css = "#gatsby-focus-wrapper > div > div > h3")
	@CacheLookup
	WebElement successmessage;
	//

	@FindBy(id = "submitRaqForm")
	@CacheLookup
	WebElement submitbutton;

	public void fillFirsNameForm() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(3000);
		baseclass.clearsixFiled(fname, lname, email, phonenumber, companyName, no_of_employees);
		Thread.sleep(2000);
		baseclass.FillFirstLastNameForm(fname, lname, email, phonenumber, companyName, no_of_employees);
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);
		baseclass.selectFromList(country_region, countryItem);
		Thread.sleep(2000);
	}

	public void fillFirsNameForm10() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearFiveFiled(fname, lname, email, companyName, no_of_employees);
		baseclass.FillFirstLastNameWithoutPhoneForm(fname, lname, email, companyName, no_of_employees);
		Thread.sleep(3000);
		baseclass.scroll(no_of_employees);
		baseclass.selectFromList(country_region, countryItem);
		Thread.sleep(2000);
	}

	public void fillFirsNameFormWithCoutryAndState() throws InterruptedException {
		// BaseClass.clearsixFiled(fname, lname, email, phonenumber, companyName,
		// no_of_employees);
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearsixFiled(fname, lname, email, phonenumber, companyName, no_of_employees);
		Thread.sleep(2000);
		baseclass.FillFirstLastNameForm(fname, lname, email, phonenumber, companyName, no_of_employees);
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);
		// String temp=country_region.getAccessibleName();
		// System.out.println("--Region is-->"+temp);
		baseclass.selectFromList(country_region, countryItem);
		Thread.sleep(2000);
		baseclass.selectInterest(interest, interestItem);
	}

	public void fillFirstNameForm4() throws InterruptedException {
		baseclass = new BaseClass();
		// baseclass.waitforElement(email);
		Thread.sleep(4000);
		// baseclass.clearOneFiled(email);
		// baseclass.clearsixFiled(fname, lname, email, phone, company,
		// no_of_employees);
		// Thread.sleep(3000);
		baseclass.fillFirstAndLastName(fname, lname);
		Thread.sleep(3000);
		baseclass.scroll(no_of_employees);
		// String temp=country_region.getAccessibleName();
		// System.out.println("--Region is-->"+temp);
		// baseclass.selectFromList(country, countryItem);
		Thread.sleep(4000);
		// BaseClass.selectInterest(interest, interestItem);
	}

	public void fillFullNameForm() throws InterruptedException {
		// BaseClass.clearOneFiled(email);
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearFourFiled(email, phone, company, no_of_employees);
		baseclass.FillFullNameForm(fullname, email, phone, company, no_of_employees);
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);
		// BaseClass.selectCountry_region(country_region, countryItem);
		Thread.sleep(2000);
		// BaseClass.selectInterest(interest, interestItem);
	}

	public void fillFirstAndLastNameForm15() throws InterruptedException {
		Thread.sleep(3000);
		baseclass = new BaseClass();
		// baseclass.clearFourFiled(first_and_last_name, email, contact_phone_number,
		// legal_company_name);
		// baseclass.clearOneFiled(email);
		// Thread.sleep(2000);
		baseclass.FillFirstAndLastNameForm16_1(first_and_last_name, email, contact_phone_number, legal_company_name,
				doing_business_as);
		Thread.sleep(2000);
		baseclass.selectFromList(industry, industry_item);
		Thread.sleep(3000);
		baseclass.scroll(industry);
		Thread.sleep(2000);
		baseclass.selectFromList(type_of_company, type_of_company_Item);
		Thread.sleep(3000);
		baseclass.FillFirstAndLastNameForm16_2(street_address, city, zip_code, employee_number);
		// baseclass.selectFromList(country_region, countryItem);
		Thread.sleep(3000);
		baseclass.scroll(zip_code);
		Thread.sleep(2000);
		baseclass.FillFirstAndLastNameForm16_3(stock_symbol, stock_exchange, website, active_number);

	}

	public void fillFullNameForm5() throws InterruptedException {
		// BaseClass.clearOneFiled(email); Thread.sleep(2000);
		// System.out.println("Phone-->"+phone.getAccessibleName());
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearThreeFiled(email, company, no_of_employees);
		Thread.sleep(2000);

		baseclass.FillFullNamewithfourfieldForm(fullname, email, company, no_of_employees);
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);
		Thread.sleep(6000);
	}

	public void fillFullNameForm8() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearTwoFiled(email, company);
		Thread.sleep(2000);

		baseclass.FillFullNameWithThreefieldAndCountryForm(fullname, email, company);
		Thread.sleep(2000);
	}

	public void fillForm21() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(3000);
		baseclass.fillFullField(fullname);
		Thread.sleep(2000);
		baseclass.selectFromList(demo_date, demo_date_Item21);
		Thread.sleep(2000);
		baseclass.scroll(company);

	}

	public void emptyformsubmission() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void fillForm24() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(3000);
		baseclass.fillFirstAndLastName(ten, ho);
		Thread.sleep(3000);
		baseclass.scroll(so_luong_nhan_vien);
		Thread.sleep(2000);
		baseclass.fillcompanyField(cong_ty);
		Thread.sleep(2000);
		baseclass.fillNumberOfEmployees(so_luong_nhan_vien);
		Thread.sleep(2000);
		baseclass.scroll(so_luong_nhan_vien);
		// baseclass.FillFullNamewithfourfieldForm(ten, ho, cong_ty,
		// so_luong_nhan_vien);

		Thread.sleep(3000);
		baseclass.selectFromList(country24, countryItem);
		Thread.sleep(2000);
	}

	public void fillemailAndCountryForm() throws InterruptedException {
		System.out.println("No Implementation Required----");

		// baseclass=new BaseClass();
		Thread.sleep(4000);
		// baseclass.clearOneFiled(email);
		// baseclass.FillEmailAndCountryRegionForm(email);
		// baseclass.selectFromList(country_region, countryItem);
		// Thread.sleep(1000);
	}

	public void fillFullNamewithcountryForm() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.selectFromList(ca_demo_date, ca_demo_date_Item);
		Thread.sleep(2000);
		baseclass.clearFiveFiled(fullname, email, phone, company, no_of_employees);

		Thread.sleep(2000);
		baseclass.FillFullNameForm(fullname, email, phone, company, no_of_employees);

		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);

		// System.out.println("Value of time from List After Click-->"+temp);
		baseclass.selectFromList(country, countryItem);
		Thread.sleep(5000);
	}

	public void fillFullNamewithcountryForm14() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearFiveFiled(fullname, email, phone, company, no_of_employees);

		Thread.sleep(2000);
		baseclass.FillFullNameForm(fullname, email, phone, company, no_of_employees);

		Thread.sleep(2000);
		baseclass.selectFromList(demo_date, demo_date_Item1);
		System.out.println("Hello from method 14");
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);

		// System.out.println("Value of time from List After Click-->"+temp);
		baseclass.selectFromList(country, countryItem);
		System.out.println("----Method 14 Ended----");

	}

	public void fillFullNamewithcountryForm15() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.clearFiveFiled(fullname, email, phone, company, no_of_employees);

		Thread.sleep(2000);
		baseclass.FillFullNameForm(fullname, email, phone, company, no_of_employees);

		Thread.sleep(3000);
		baseclass.selectFromList(demo_date, demo_date_Item2);

		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);

		// System.out.println("Value of time from List After Click-->"+temp);
		baseclass.selectFromList(country, countryItem);
	}

	public void fill4TextField() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		fname.sendKeys("First");
		lname.sendKeys("Last Name");
		Thread.sleep(2000);
		baseclass.scroll(country_region);
		Thread.sleep(2000);
		estimated_monthly_active_user.sendKeys("100");
		prepare_for_call.sendKeys("Are you calling?");
	}

	public void fill2TextField() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		fullname.sendKeys("User Full Name");
		no_of_employees.sendKeys("500");

	}

	public void fillfullname() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		fullname.sendKeys("User Full Name");
		Thread.sleep(2000);
		baseclass.selectFromList(demo_date, demo_date_Item21);
		// no_of_employees.sendKeys("500");

	}

	public void fillfullnamewithScrolltoCompany() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		fullname.sendKeys("User Full Name");
		Thread.sleep(2000);
		baseclass.scroll(no_of_employees);
		Thread.sleep(4000);

	}

	public void fillFirstAndLastName() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.fillFirstAndLastName(fname, lname);
		Thread.sleep(2000);
		baseclass.scroll(country_region);

	}

	public void fillPhoneNumberAndMessage() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(4000);
		baseclass.fillphoneField(phonenumber);
		Thread.sleep(2000);
		baseclass.scroll(country_region);
		Thread.sleep(2000);
		baseclass.selectInterest(interest, interestItem);
		Thread.sleep(2000);
		baseclass.fillGeneralTextField(message);
	}

	public void submitform() throws InterruptedException {
		BaseClass.clickonbutton(submitbutton);

	}

	public void verifyMessage() throws InterruptedException {
		baseclass = new BaseClass();
		// baseclass.httpResponseCodeViaPost(onePageUrl);
		// String actual = successmessage.getText();
		String expected = "Thank you for your interest";
		// if (actual.equals(expected)) {
		// System.out.println("Condition passed");

		// }
		// System.out.println("Expected-->" + expected + "\n" + "Actual-->" + actual +
		// "\n");
		// Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
	}

	public void getReseponseCodefrompreview() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(3000);

		// String responsoCode=baseclass.httpResponseCodeViaPost(marketoUrl);
		// System.out.println("Response Code from preview is-->\t"+responsoCode);
		// int responsoCode2=baseclass.httpResponseCodeViaPost(marketoUrl);

	}

	public void getReseponseCodefromMarketo() throws InterruptedException {
		baseclass = new BaseClass();
		Thread.sleep(3000);
		// baseclass.testResoponseCode(marketoUrl);
		// System.out.println("Response Code of from
		// Request--->"+baseclass.httpResponseCodeViaPost(marketoUrl));
		// int responsoCode1=baseclass.httpResponseCodeViaPost(previewUrl);
		// String responsoCode=baseclass.httpResponseCodeViaPost(marketoUrl);
		// System.out.println("Response Code from Marketo is-->/t"+responsoCode);

	}

	public void getcodeTest() {
		baseclass = new BaseClass();
		baseclass.getResponseCode();
	}

}
