package Utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.network.*;
import org.openqa.selenium.devtools.v119.*;
import org.openqa.selenium.devtools.v119.network.Network;
import org.openqa.selenium.devtools.v119.network.model.Response;
//import org.openqa.selenium.devtools.v120.network.Network;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Req.REQPOM;
import formPOM.FormPOM;
import io.restassured.RestAssured;
import productPOM.APIPOM;
import productPOM.IndexPOM;
import productPOM.IntegrationPOM;
import productPOM.PreviewPOM;
import resourcesPOM.ResourcesPOM;
import solutionsPOM.GenSolutionPOM;

public class BaseClass {

	public static ChromeDriver driver;
	public IndexPOM indexpom;
	public PreviewPOM previewPOM;
	public APIPOM apiPOM;
	public IntegrationPOM intPOM;
	public GenSolutionPOM genSolutionsPOM;
	public REQPOM reqPOM;
	public GeneralMethods gm;
	public ResourcesPOM resPOM;
	public FormPOM form;
	public static Actions action;
	public DevTools devtools;

	public void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}

	public void jsExecutorForClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		}
	}

	public void performMouseActionIfElementNotClickable(WebElement element) throws InterruptedException {
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(element).click().perform();

	}

	public boolean retryingFindClick(By by) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.findElement(by).click();
				result = true;
				break;
			} catch (NoSuchElementException e) {
			}
			attempts++;
		}
		return result;
	}

	public void scroll(WebElement element) throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("Scroll from Base class Called---" + element.getText().toString());
	}

	public void selectFromList(WebElement country_region, WebElement countryItem) throws InterruptedException {
		action = new Actions(driver);
		Thread.sleep(3000);
		System.out.println("Hello from select list method");
		// action.moveToElement(country_region).click().build().perform();
		country_region.click();
		Thread.sleep(4000);
		action.moveToElement(countryItem).click().build().perform();
		// countryItem.click();
	}

	public void clearOneFiled(WebElement first) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
	}

	public void clearTwoFiled(WebElement first, WebElement second) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
	}

	public void clearThreeFiled(WebElement first, WebElement second, WebElement third) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
	}

	public void clearFourFiled(WebElement first, WebElement second, WebElement third, WebElement fourth)
			throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
		fourth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fourth.sendKeys(Keys.DELETE);
	}

	public void clearsixFiled(WebElement first, WebElement second, WebElement third, WebElement fourth,
			WebElement fifth, WebElement sixth) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
		fourth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fourth.sendKeys(Keys.DELETE);
		fifth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fifth.sendKeys(Keys.DELETE);
		sixth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		sixth.sendKeys(Keys.DELETE);
	}

	public static void clearSevenFiled(WebElement first, WebElement second, WebElement third, WebElement fourth,
			WebElement fifth, WebElement sixth, WebElement seventh) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
		fourth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fourth.sendKeys(Keys.DELETE);
		fifth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fifth.sendKeys(Keys.DELETE);
		sixth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		sixth.sendKeys(Keys.DELETE);
		seventh.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		seventh.sendKeys(Keys.DELETE);
	}

	public static void clearEightFiled(WebElement first, WebElement second, WebElement third, WebElement fourth,
			WebElement fifth, WebElement sixth, WebElement seventh, WebElement eight) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
		fourth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fourth.sendKeys(Keys.DELETE);
		fifth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fifth.sendKeys(Keys.DELETE);
		sixth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		sixth.sendKeys(Keys.DELETE);
		seventh.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		seventh.sendKeys(Keys.DELETE);
		eight.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		eight.sendKeys(Keys.DELETE);
	}

	public void clearFiveFiled(WebElement first, WebElement second, WebElement third, WebElement fourth,
			WebElement fifth) throws InterruptedException {
		first.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		first.sendKeys(Keys.DELETE);
		second.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		second.sendKeys(Keys.DELETE);
		third.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		third.sendKeys(Keys.DELETE);
		fourth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fourth.sendKeys(Keys.DELETE);
		fifth.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		fifth.sendKeys(Keys.DELETE);
	}

	public void selectInterest(WebElement interest, WebElement interestItem) throws InterruptedException {
		Thread.sleep(5000);
		interest.click();
		Thread.sleep(5000);
		try {
			interestItem.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", interestItem);
		}

	}

	public static void elementVissiblity(WebElement element) throws InterruptedException {
		Thread.sleep(6000);
		try {
			element.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		}

	}

	public static void clickonbutton(WebElement element) throws InterruptedException {

		try {
			element.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		}
	}

	public void fillFirstAndLastName(WebElement element1, WebElement element2) throws InterruptedException {
		Thread.sleep(3000);
		element1.sendKeys("First");
		element2.sendKeys("User");
	}

	public void fillemailfield(WebElement element1) {
		element1.sendKeys("test@Vinncorp.cpom");
	}

	public void fillFullField(WebElement element1) {
		element1.sendKeys("Full" + " " + "Name");
	}

	public void fillphoneField(WebElement element1) {
		element1.sendKeys("0333-3333333");
	}

	public void fillcompanyField(WebElement element1) {
		element1.sendKeys("htt://www.google.com");
	}

	public void fillGeneralTextField(WebElement element1) {
		element1.sendKeys("Anything else that can help us prepare for the call?");
	}

	public void fillNumberOfEmployees(WebElement element1) {
		element1.sendKeys("500");
	}

	public void fillLastNameNamefield(WebElement Firstname) {
		Firstname.sendKeys("");
	}

	public static void teardowon() {
		driver.close();
	}

	public void FillFirstLastNameForm(WebElement fname, WebElement lname, WebElement email, WebElement phonenumber,
			WebElement companyName, WebElement no_of_employees) throws InterruptedException {
		fname.sendKeys("Fist name");
		lname.sendKeys("Last name");
		email.sendKeys("test@vinncorp.com");
		phonenumber.sendKeys("123456789");
		companyName.sendKeys("google");
		no_of_employees.sendKeys("123");

	}

	public void FillFirstLastNameWithoutPhoneForm(WebElement fname, WebElement lname, WebElement email,
			WebElement companyName, WebElement no_of_employees) throws InterruptedException {
		fname.sendKeys("Fist name");
		lname.sendKeys("Last name");
		email.sendKeys("test@vinncorp.com");
		// phonenumber.sendKeys("123456789");
		companyName.sendKeys("google");
		no_of_employees.sendKeys("123");

	}

	public void FillFirstAndLastNameForm16_1(WebElement full_and_lastname, WebElement email,
			WebElement contact_phone_number, WebElement legal_company_name, WebElement doing_business_as) {
		// full_and_lastname.sendKeys("Full and name Name");
		// email.sendKeys("test@vinncorp.com");
		// contact_phone_number.sendKeys("123456789");
		legal_company_name.sendKeys("google");
		doing_business_as.sendKeys("Trader");
	}

	public void FillFirstAndLastNameForm16_2(WebElement street_address, WebElement city, WebElement zip_code,
			WebElement employee_number) {
		street_address.sendKeys("Address for Tetsing purpose");
		city.sendKeys("California");
		zip_code.sendKeys("1234523");
		employee_number.sendKeys("123-ABC");

	}

	public void FillFirstAndLastNameForm16_3(WebElement stock_symbol, WebElement stock_exchange, WebElement website,
			WebElement active_number) throws InterruptedException {
		stock_symbol.sendKeys("Permenent");
		stock_exchange.sendKeys("Stock Exchange");
		website.sendKeys("http://www.google.com");
		active_number.sendKeys("123456789");
	}

	public void FillFullNameForm(WebElement fullname, WebElement email, WebElement phone, WebElement company,
			WebElement no_of_employees) throws InterruptedException {
		fullname.sendKeys("Full name");
		// lname.sendKeys("Last name");
		email.sendKeys("test@vinncorp.com");
		phone.sendKeys("123456789");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");

	}

	public static void FillFullNamewithCountryForm(WebElement fullname, WebElement email, WebElement phone,
			WebElement company, WebElement no_of_employees) throws InterruptedException {
		fullname.sendKeys("Full name");
		// lname.sendKeys("Last name");
		email.sendKeys("test@vinncorp.com");
		phone.sendKeys("123456789");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");

	}

	public void FillFullNamewithfourfieldForm(WebElement fullname, WebElement email, WebElement company,
			WebElement no_of_employees) throws InterruptedException {
		fullname.sendKeys("Full name");
		email.sendKeys("test@vinncorp.com");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");

	}

	public void FillFullNameWithThreefieldAndCountryForm(WebElement fullname, WebElement email, WebElement company)
			throws InterruptedException {
		fullname.sendKeys("Full name");
		email.sendKeys("test@vinncorp.com");
		company.sendKeys("google");
		// no_of_employees.sendKeys("123");

	}

	public void FillEmailAndCountryRegionForm(WebElement email) throws InterruptedException {
		email.sendKeys("test@vinncorp.com");
	}

	public static void selectDate(WebElement date) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(date).click().perform();
		Thread.sleep(3000);
		System.out.println("Hello From select Date time method");
	}

	/*
	 * public static int httpResponseCodeViaPost(String url) { return
	 * RestAssured.post(url).statusCode(); }
	 */
	
	
	public void getResponseCode() {
		devtools=driver.getDevTools();
			devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
            // establish, open connection with URL
			devtools.addListener(Network.responseReceived(), object ->
			{
				Response response=(Response) object.getResponse();
				int code=response.getStatus();
				System.out.println("Response Code is -->"+code);
				System.out.println("Header of the Request -->"+response.getHeaders());
			}
			);
	}

	/*
	 * public void getResponse() { DevTools devTools = ((ChromeDriver)
	 * driver).getDevTools(); devTools.createSession();
	 * devTools.send(Network.enable(Optional.empty(), Optional.empty(),
	 * Optional.empty())); devTools.addListener(Network.responseReceived(),
	 * responseConsumer -> { Response response = (Response)
	 * responseConsumer.getResponse(); if (response.getStatusCode() == 200) {
	 * System.out.println("---PASSED---"); } }
	 * 
	 * );
	 * 
	 * }
	 */

}
