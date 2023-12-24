package formDefinition;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Req.REQPOM;
import Utilities.BaseClass;
import formPOM.FormPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormSteps extends BaseClass {

	@Given("Launch the browser")
	public void launch_the_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		devtools=driver.getDevTools();
		devtools.createSession();
	}

	//-----Start of  RAQ FORM Step method Definition-------
	@When("Open URL for RAQ Form {string}")
	public void open_raq_url(String url) throws InterruptedException {
		driver.get(url);
		//System.out.println("Given URL--->" + url);
		Thread.sleep(5000);
	}
	
	@When("Click on Request a Demo button")
	public void click_on_request_a_demo_button() throws InterruptedException {
	//reqPOM=new REQPOM(driver);
		System.out.println();
		form = new FormPOM(driver);
		form.clickondemoButton();
		//form.reqCTA.click();
		Thread.sleep(2000);
	}
	
	@When("Fillout email and click On Next button")
	public void fillout_and_click_on_next_button() throws InterruptedException {
	//reqPOM=new REQPOM(driver);
	form = new FormPOM(driver);
	form.fillFirstDivAndClickOnNextButton();
	Thread.sleep(3000);
	}

	@When("Fillout First Name, Last Name, Phone Fields and click on next button")
	public void fillout_first_name_last_name_phone_fields_and_click_on_next_button() throws InterruptedException {
		form = new FormPOM(driver);
		//reqPOM=new REQPOM(driver);
		form.fillSecondDivAndClickOnNextButton();
		Thread.sleep(3000);
	}
	
	@When("Fillout Company, Employees, Country, Interest Fields and click on Submit button")
	public void fillout_company_employees_country_interest_fields_and_click_on_submit_button() throws InterruptedException {
		//reqPOM=new REQPOM(driver);
		form = new FormPOM(driver);
		form.fillThirdDivAndClickOnSubmittButton();
		Thread.sleep(6000);
	}
	
	
	//------- End of RAQ Step Step Definition method
	
	
	@When("Open URL {string}")
	public void open_url(String url) throws InterruptedException {
		driver.get(url);
		System.out.println("Given URL--->" + url);
		Thread.sleep(5000);
	}

	@When("Fill First Form")
	public void fill_first_form() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFirsNameForm();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("Fill Second Form")
	public void fill_FullName_form() {
		
		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFullNameForm();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("Fill Third Form")
	public void fill_Full_Name_withcountry() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFullNamewithcountryForm();
			Thread.sleep(5000);
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("Fill Fourth Form")
	public void fill_fourth_form() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFirstNameForm4();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("Fill Fifth Form")
	public void fill_fifth_form() throws InterruptedException {
		Thread.sleep(3000);
		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFullNameForm5();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("Fill Sixth Form")
	public void fill_sixth_form() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillemailAndCountryForm();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@When("Fill Seventh Form")
	public void fill_seventh_form() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFirsNameFormWithCoutryAndState();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("Fill Eight Form")
	public void fill_eight_form() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFullNameForm8();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("Fill Ninth Form")
	public void fill_Niht_form() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillemailAndCountryForm();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("Fill Tenth Form")
	public void fill_Tenth_form() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFirsNameForm10();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("Fill Eleventh Form")
	public void fill_Eleventh_form() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFullNameForm5();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("Fill Twelth Form")
	public void fill_Twelth_form() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFirsNameForm();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@When("Fill Thirteenth Form")
	public void fill_Thirteenth_form() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFirsNameForm();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("Fill Fourteenth Form")
	public void fill_Full_Name_withcountry14() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFullNamewithcountryForm14();
			Thread.sleep(5000);
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@When("Fill Fiftheenth Form")
	public void fill_Full_Name_withcountry15() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFullNamewithcountryForm15();
			Thread.sleep(5000);
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("Fill Sixteenth Form")
	public void fill_first_and_last_name_form15() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFirstAndLastNameForm15();
			Thread.sleep(5000);
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("Fill Seventeenth Form")
	public void fill_first_and_last_name_form17() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fill4TextField();
			Thread.sleep(5000);
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
	}
	
	@When("Fill Eighteenth Form")
	public void full_name_form18() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fill2TextField();
			Thread.sleep(5000);
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("Fill Ninteenth Form")
	public void first_last_name_form19() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillFirstAndLastName();
			Thread.sleep(5000);
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@When("Fill Twenteenth Form")
	public void first_last_name_phone_form20() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillPhoneNumberAndMessage();
			Thread.sleep(5000);
			
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("Fill Twenty one Form")
	public void form21() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillForm21();
			Thread.sleep(5000);
			
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("Fill Twenty two Form")
	public void form22() {

		form = new FormPOM(driver);
		try {Thread.sleep(5000);
			form.emptyformsubmission();
			Thread.sleep(5000);
			
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@When("Fill Twenty three Form")
	public void form23() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.emptyformsubmission();
			Thread.sleep(5000);
			
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	 
	
	@When("Fill Twenty four Form")
	public void form24() {

		form = new FormPOM(driver);
		try {
			Thread.sleep(5000);
			form.fillForm24();
			Thread.sleep(5000);
			
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	  
	@When("Fill Twenty fifth Form")
	public void form25() {

		form = new FormPOM(driver);

		try {
			Thread.sleep(5000);
			form.fillfullnamewithScrolltoCompany();
			Thread.sleep(5000);
			
			// BaseClass.selectFromList(FormPOM.time, FormPOM.timeItem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

	@When("Submit Form")
	public void submit_form() throws InterruptedException {
		form = new FormPOM(driver);
		form.submitform();
	}

	@When("Verify message")
	public void verify_message() throws InterruptedException {
		//form = new FormPOM(driver);
		//form.verifyMessage();
		// System.out.println("Verify not implemented");

	}

	@Then("Verify Response of form code")
	public void verify_response_code() throws InterruptedException {
		//devtools=driver.getDevTools();
		//devtools.createSession();
		form.getcodeTest();
		Thread.sleep(5000);
		//form.getResponse();
		//form.getcode();
		//int responseCode = BaseClass.httpResponseCodeViaPost(
				//"https://deploy-preview-2552--legendary-monstera-200afd.netlify.app/.netlify/functions/post-marketo-lead");
		//System.out.println("Hello From Response Code method--->");
		//System.out.println("Form Id is-->" + FormPOM.formId.getAccessibleName());
		// BaseClass.teardowon();

	}

}
