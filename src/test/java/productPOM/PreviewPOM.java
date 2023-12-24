package productPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PreviewPOM {

	WebDriver driver;

	public PreviewPOM(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();

	}

	@FindBy(xpath = "//*[@id=\"mustache-nav\"]/div[1]/div[2]/div[1]/a")
	@CacheLookup
	WebElement Products;

	@FindBy(linkText = "Devices & Accessories")
	@CacheLookup
	WebElement Devices;

	@FindBy(linkText = "Business Phone")
	@CacheLookup
	WebElement phoneLink;

	@FindBy(linkText = "Video Conferencing")
	@CacheLookup
	WebElement VideoConference;

	@FindBy(linkText = "Team Chat")
	@CacheLookup
	WebElement Teamchat;

	@FindBy(linkText = "Integrations")
	@CacheLookup
	WebElement Integrations;

	@FindBy(linkText = "Contact Center")
	@CacheLookup
	WebElement contactCenter;

	@FindBy(partialLinkText = "APIs: SMS, Voice, Video, Chat Apps")
	@CacheLookup
	WebElement apis;

	@FindBy(linkText = "Download The App")
	@CacheLookup
	WebElement downloadApp;

	@FindBy(css = "#contact-us > div > p")
	@CacheLookup
	WebElement requestheading;
	
	@FindBy(xpath = "//*[@id=\"contact-us\"]/div/p")
	@CacheLookup
	WebElement downloadheading;

	@FindBy(id = "name")
	@CacheLookup
	WebElement name;


	@FindBy(id = "business-email")
	@CacheLookup
	WebElement email;


	@FindBy(id = "phone")
	@CacheLookup
	WebElement phone;
	
	@FindBy(id = "company")
	@CacheLookup
	WebElement company;

	@FindBy(id = "number-of employees")
	@CacheLookup
	WebElement noOfEmployees;

	@FindBy(id = "country")
	@CacheLookup
	WebElement country;

	@FindBy(id = "primary-interest")
	@CacheLookup
	WebElement interest;

	@FindBy(partialLinkText = "Team Chat")
	@CacheLookup
	WebElement interestItem;

	@FindBy(partialLinkText = "Albania")
	@CacheLookup
	WebElement countryItem;

	@FindBy(id = "submitRaqForm")
	@CacheLookup
	WebElement submitbutton;

	@FindBy(id = "leave-us feedback on this application")
	@CacheLookup
	WebElement feedback;

	public void clickonProductsAndDeviceLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Products).perform();
		Thread.sleep(9000);
		Devices.click();
		Thread.sleep(5000);
	}

	public void clickonProductsAndBusinessphoneLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Products).perform();
		//action.click(Products).perform();
		Thread.sleep(9000);
		phoneLink.click();
		Thread.sleep(5000);
	}

	public void clickonProductsAndVideoConferenceLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Products).perform();
		Thread.sleep(9000);
		VideoConference.click();
		Thread.sleep(5000);
	}

	public void clickonProductsAndTeamChatLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Products).perform();
		Thread.sleep(9000);
		Teamchat.click();
		Thread.sleep(5000);
	}

	public void clickonProductsAndContactCenterLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Products).perform();
		Thread.sleep(9000);
		contactCenter.click();
		Thread.sleep(5000);
	}

	public void clickonProductsAndAPICenterLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Products).perform();
		Thread.sleep(9000);
		apis.click();
		Thread.sleep(5000);
	}

	public void clickonProductsAndDownloadLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Products).perform();
		Thread.sleep(9000);
		downloadApp.click();
		Thread.sleep(5000);
	}

	public void clickonProductsIntegrationLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Products).perform();
		Thread.sleep(9000);
		Integrations.click();
		Thread.sleep(5000);
	}

	public void clickonProductsAndBusinessLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Products).perform();
		Thread.sleep(9000);
		phoneLink.click();
		Thread.sleep(5000);
	}

	public void scroll() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", requestheading);
	}
	
	public void scrollTillDownload() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// System.out.println("Text is--" + name.getTagName());
		// name.getTagName();
		js.executeScript("arguments[0].scrollIntoView();", downloadheading);
	}
	
	
	/*
	 * public void scrollTillDownload() throws InterruptedException {
	 * Thread.sleep(7000); JavascriptExecutor js = (JavascriptExecutor) driver; //
	 * System.out.println("Text is--" + name.getTagName()); // name.getTagName();
	 * js.executeScript("arguments[0].scrollIntoView();", downloadheading); }
	 */

	public void selectCountry() throws InterruptedException {

		Thread.sleep(5000);
		country.click();
		// System.out.println("Selected Country-->" + countryItem.getText());
		Thread.sleep(5000);
		countryItem.click();

	}
	
	public void selectInterest() throws InterruptedException {

		Thread.sleep(9000);
		interest.click();
		Thread.sleep(5000);
		interestItem.click();
		// System.out.println("Selected item-->" + interestItem.getText());

		/*
		 * Thread.sleep(4000); Actions action = new Actions(driver);
		 * action.moveToElement(interest).click();
		 * 
		 * Thread.sleep(4000); action.click(interestItem).perform();
		 */
		// System.out.println("Selected item-->" + interestItem.getText());

	}

	public void FillForm() throws InterruptedException {

		name.sendKeys("test test");
		email.sendKeys("test@gmail.com");
		phone.sendKeys("18883058271");
		company.sendKeys("google");
		noOfEmployees.sendKeys("123");
		Thread.sleep(4000);

	}
	
	public void teardowon() {
		driver.close();
	}


	public void clickonsubmitbutton() throws InterruptedException {

		try {
			submitbutton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", submitbutton);
		}
		teardowon();
	}

}
