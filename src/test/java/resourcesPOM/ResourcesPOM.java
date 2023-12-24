package resourcesPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPOM {

	WebDriver driver;

	public ResourcesPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();

	}
	@FindBy(xpath = "//*[@id=\"mustache-nav\"]/div[1]/div[4]/div[1]/a")
	@CacheLookup
	WebElement resources;
	
	@FindBy(linkText = "Webinars & Events")
	@CacheLookup
	WebElement WebinarsandEvents;
	//
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[4]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement selfServiceForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[7]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement averagechatbotForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[8]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement expertWebinarForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[20]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement aboveTheExperForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[23]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement AskTheExperAgentForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[25]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement AboveHealthCare;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[28]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement HealthCareForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[31]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement AboveCpaasForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[35]/div/a/div[2]")
	@CacheLookup
	WebElement Aboveloadmore;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[39]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement aboveThaiForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[52]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement aboveWebinarDemoForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[55]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement WebinarDemoForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[41]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement ThaiForm;
	
	
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[34]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement CpaasForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[42]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement APAC_CustomerForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[42]/div/a/div[2]/div/h4")
	@CacheLookup
	WebElement aboveMainEventForm;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[2]/button")
	@CacheLookup
	WebElement loadMorebutton;
	
	@FindBy(id = "full-name")
	@CacheLookup
	WebElement fullname;
	
	@FindBy(id = "name")
	@CacheLookup
	WebElement eventname;
	
	@FindBy(id = "first-name")
	@CacheLookup
	WebElement fname;
	
	@FindBy(id = "last-name")
	@CacheLookup
	WebElement lname;
	
	@FindBy(id = "ชื่อ")
	@CacheLookup
	WebElement thaifname;
	
	@FindBy(id = "นามสกุล")
	@CacheLookup
	WebElement thailname;
	
	@FindBy(id = "nama-depan")
	@CacheLookup
	WebElement cfname;
	
	@FindBy(id = "nama-belakang")
	@CacheLookup
	WebElement clname;
	
	@FindBy(id = "nomor-telepon")
	@CacheLookup
	WebElement cphone;
	
	@FindBy(id = "หมายเลขโทรศัพท์")
	@CacheLookup
	WebElement thaiphone;
	
	@FindBy(id = "phone-number")
	@CacheLookup
	WebElement phone;
	
	
	@FindBy(id = "phone")
	@CacheLookup
	WebElement businessphone;
	
	@FindBy(id = "nama-perusahaan")
	@CacheLookup
	WebElement ccompany;
	
	@FindBy(id = "ชื่อบริษัท")
	@CacheLookup
	WebElement thaicompany;
	
	@FindBy(id = "jumlah-pegawai")
	@CacheLookup
	WebElement c_no_of_employees;
	
	@FindBy(id = "จำนวนพนักงาน")
	@CacheLookup
	WebElement thai_no_of_employees;
	
	@FindBy(id = "negara/wilayah")
	@CacheLookup
	WebElement c_Country;
	
	@FindBy(id = "ประเทศ/ภูมิภาค")
	@CacheLookup
	WebElement thai_Country;
	
	@FindBy(id = "email")
	@CacheLookup
	WebElement email;
	
	@FindBy(id = "business-email")
	@CacheLookup
	WebElement businessemail;
	
	@FindBy(id = "อีเมล")
	@CacheLookup
	WebElement thaiemail;
	//
	
	@FindBy(id = "company")
	@CacheLookup
	WebElement company;
	
	@FindBy(id = "company-name")
	@CacheLookup
	WebElement companyName;
	
	@FindBy(id = "number-of employees")
	@CacheLookup
	WebElement no_of_employees;
	
	@FindBy(id = "country")
	@CacheLookup
	WebElement country;
	
	@FindBy(id = "country/region")
	@CacheLookup
	WebElement country_region;
	
	@FindBy(id = "primary-interest")
	@CacheLookup
	WebElement interest;
	
	@FindBy(partialLinkText = "Contact Center")
	@CacheLookup
	WebElement interestItem;
	
		
	
	@FindBy(partialLinkText = "Albania")
	@CacheLookup
	WebElement countryItem;
	
	@FindBy(id = "submitRaqForm")
	@CacheLookup
	WebElement submitbutton;
	
	public void scroll(WebElement element) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Hello from Scroll method");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("Scroll Called---"+element.getText().toString());
	}
	
	public void moveTosupervisorForm() throws InterruptedException {
		Thread.sleep(2000);
		selfServiceForm.click();
		Thread.sleep(2000);
	}
	
	
	public void moveToaveragechatbotForm() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Welcome from Move to chat bot form method");
		scroll(selfServiceForm);
		Thread.sleep(2000);
		averagechatbotForm.click();
		Thread.sleep(2000);
	}
	
	public void moveToExpertWebinarForm() throws InterruptedException {
		Thread.sleep(4000);
		scroll(averagechatbotForm);
		Thread.sleep(2000);
		expertWebinarForm.click();
		Thread.sleep(2000);
	}
	
	public void moveToAstTheExpertForm() throws InterruptedException {
		Thread.sleep(4000);
		scroll(aboveTheExperForm);
		Thread.sleep(2000);
		AskTheExperAgentForm.click();
		Thread.sleep(2000);
	}
	
	public void moveTohealthcareForm() throws InterruptedException {
		Thread.sleep(4000);
		scroll(AboveHealthCare);
		Thread.sleep(2000);
		HealthCareForm.click();
		Thread.sleep(2000);
	}
	
	public void moveToCpaasForm() throws InterruptedException {
		Thread.sleep(4000);
		scroll(AboveCpaasForm);
		Thread.sleep(2000);
		CpaasForm.click();
		Thread.sleep(2000);
	}
	
	public void clickonloadmore() throws InterruptedException {
		Thread.sleep(3000);
		scroll(Aboveloadmore);
		loadMorebutton.click();
	}
	
	public void moveToCpaasThaiForm() throws InterruptedException {
		Thread.sleep(2000);
		clickonloadmore();
		Thread.sleep(4000);
		scroll(aboveThaiForm);
		System.out.println("Hello from Move to method");
		Thread.sleep(2000);
		ThaiForm.click();
		Thread.sleep(2000);
	}
	
	public void moveToAPAC_CustomerForm() throws InterruptedException {
		Thread.sleep(2000);
		clickonloadmore();
		Thread.sleep(2000);
		scroll(aboveThaiForm);
		System.out.println("Hello from Move to method");
		Thread.sleep(2000);
		APAC_CustomerForm.click();
		Thread.sleep(2000);
	}
	
	public void moveToDemoWebinarForm() throws InterruptedException {
		Thread.sleep(2000);
		clickonloadmore();
		Thread.sleep(2000);
		scroll(aboveWebinarDemoForm);
		System.out.println("Hello from Move to method");
		Thread.sleep(2000);
		WebinarDemoForm.click();
		Thread.sleep(2000);
	}
	
	public void moveToMainEventForm() throws InterruptedException {
		Thread.sleep(2000);
		scroll(aboveMainEventForm);
		System.out.println("Hello from Move to method");
		Thread.sleep(1000);
	}
	
	
	////*[@id="gatsby-focus-wrapper"]/div/div/main/div/div[2]/section/div/div/div[1]/div/div/div/div/div[1]/div[20]/div/a/div[2]/div/h4
	public void clickonREsourceAndEvents() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(resources).perform();
		Thread.sleep(5000);
		WebinarsandEvents.click();
	}
	
	public void selectCountry() throws InterruptedException {
		Thread.sleep(3000);
		country.click();
		Thread.sleep(3000);
		countryItem.click();
	}
	
	public void selectCountry_region() throws InterruptedException {
		Thread.sleep(3000);
		country_region.click();
		Thread.sleep(3000);
		countryItem.click();
	}
	
	public void selectCpassCountry() throws InterruptedException {
		Thread.sleep(3000);
		c_Country.click();
		Thread.sleep(3000);
		countryItem.click();
	}
	
	public void selectThaiCountry() throws InterruptedException {
		Thread.sleep(3000);
		thai_Country.click();
		Thread.sleep(3000);
		countryItem.click();
	}
	
	public void selectInterest() throws InterruptedException {
		Thread.sleep(5000);
		interest.click();
		Thread.sleep(5000);
		try {
		interestItem.click();
		}
		catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", interestItem);
	}

	}
	
	
	public void FillSupervisorForm() throws InterruptedException {
		moveTosupervisorForm();
		fullname.sendKeys("test test");
		email.sendKeys("test@gmail.com");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");
		Thread.sleep(4000);
		selectCountry();
		Thread.sleep(4000);
	}
	
	public void FillyouraveragechatbotForm() throws InterruptedException {
		Thread.sleep(2000);
		moveToaveragechatbotForm();
		Thread.sleep(2000);
		fullname.sendKeys("test test");
		email.sendKeys("test@gmail.com");
		company.sendKeys("google");
		Thread.sleep(2000);
		selectCountry();
		Thread.sleep(2000);
	}
	
	public void FillExpertWebinarForm() throws InterruptedException {
		System.out.println("From Fill Average form method---");
		Thread.sleep(2000);
		moveToExpertWebinarForm();
		Thread.sleep(2000);
		fullname.sendKeys("test test");
		email.sendKeys("test@gmail.com");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");
		Thread.sleep(2000);
		selectCountry();
		Thread.sleep(2000);
	}
	
	public void FillAskTheExpertForm() throws InterruptedException {
		System.out.println("From Fill Average form method---");
		Thread.sleep(2000);
		moveToAstTheExpertForm();
		Thread.sleep(2000);
		fullname.sendKeys("test test");
		email.sendKeys("test@gmail.com");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");
		Thread.sleep(2000);
		selectCountry();
		Thread.sleep(3000);
		scroll(country);
		Thread.sleep(2000);
		selectInterest();
	}
	
	public void FillHealthForm() throws InterruptedException {
		moveTohealthcareForm();
		fname.sendKeys("Fist name");
		lname.sendKeys("Last name");
		email.sendKeys("test@gmail.com");
		companyName.sendKeys("google");
		no_of_employees.sendKeys("123");
		Thread.sleep(3000);
		scroll(companyName);
		Thread.sleep(2000);
		selectCountry_region();
		Thread.sleep(2000);
		selectInterest();
	}
	
	public void FillTanyaPakarIndForm() throws InterruptedException {
		moveToCpaasForm();
		//Thread.sleep(2000);
		cfname.sendKeys("Fist name");
		clname.sendKeys("Last name");
		email.sendKeys("test@gmail.com");
		cphone.sendKeys("12345678910");
		ccompany.sendKeys("google");
		c_no_of_employees.sendKeys("123");
		Thread.sleep(3000);
		scroll(ccompany);
		Thread.sleep(2000);
		selectCpassCountry();
		Thread.sleep(2000);
	}
	
	public void FillThaiForm() throws InterruptedException {
		moveToCpaasThaiForm();
		//Thread.sleep(2000);
		thaifname.sendKeys("Fist name");
		thailname.sendKeys("Last name");
		thaiemail.sendKeys("test@gmail.com");
		thaiphone.sendKeys("12345678910");
		thaicompany.sendKeys("google");
		thai_no_of_employees.sendKeys("123");
		Thread.sleep(3000);
		scroll(thaicompany);
		Thread.sleep(2000);
		selectThaiCountry();
		Thread.sleep(2000);
	}
	
	public void FillAPACForm() throws InterruptedException {
		moveToAPAC_CustomerForm();
		//Thread.sleep(2000);
		fname.sendKeys("Fist name");
		lname.sendKeys("Last name");
		email.sendKeys("test@gmail.com");
		phone.sendKeys("12345678910");
		companyName.sendKeys("google");
		no_of_employees.sendKeys("123");
		Thread.sleep(3000);
		scroll(companyName);
		Thread.sleep(2000);
		selectCountry_region();
		Thread.sleep(2000);
		selectInterest();
	}
	
	public void FillWebinarDemoForm() throws InterruptedException {
		moveToDemoWebinarForm();
		//Thread.sleep(2000);
		fullname.sendKeys("Test Name");
		businessemail.sendKeys("test@gmail.com");
		businessphone.sendKeys("12345678910");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");
		Thread.sleep(3000);
		scroll(company);
		Thread.sleep(2000);
		selectCountry();
		Thread.sleep(2000);
		selectInterest();
	}
	
	public void FillMainEventForm() throws InterruptedException {
		moveToMainEventForm();
		//Thread.sleep(2000);
		eventname.sendKeys("Test Name");
		businessemail.sendKeys("test@gmail.com");
		businessphone.sendKeys("12345678910");
		company.sendKeys("google");
		no_of_employees.sendKeys("123");
		Thread.sleep(3000);
		scroll(company);
		Thread.sleep(2000);
		selectCountry();
		Thread.sleep(2000);
		selectInterest();
	}
	
	
	
}
