package productPOM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IndexPOM {

	public WebDriver driver;

	public IndexPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
	}

	@FindBy(xpath = "//*[@id=\"mustache-nav\"]/div[1]/div[1]/div[1]/a")
	@CacheLookup
	WebElement Products;

	@FindBy(xpath = "//*[@id=\"mustache-nav\"]/div[1]/div[1]/div[2]/div/div[1]/section[2]/div/div[3]/div[1]/div[2]/a")
	@CacheLookup
	WebElement Devices;
	
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[3]/div/div/header/div[2]/nav/div[1]/div[1]/div[2]/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/a")
	@CacheLookup
	WebElement business;
	

	//

	@FindBy(css = "#contact-us > div > p")
	@CacheLookup
	WebElement requestheading;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
	@CacheLookup
	WebElement name;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	@CacheLookup
	WebElement phone;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]")
	@CacheLookup
	WebElement company;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]")
	@CacheLookup
	WebElement noOfEmployees;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/main/section/div/div/div[1]/form/div[6]/input[2]")
	@CacheLookup
	WebElement country;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/a[3]")
	@CacheLookup
	WebElement countryItem;

	@FindBy(css = "#gatsby-focus-wrapper > div > div > main > div > div:nth-child(1) > section > div > div > div > h1 > div > p > span")
	@CacheLookup
	WebElement para;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/main/section/div/div/div[1]/form/div[7]/input[2]")
	@CacheLookup
	WebElement interest;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/main/section/div/div/div[1]/form/div[7]/div[1]/div/a[4]")
	@CacheLookup
	WebElement interestItem;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[12]/button[1]")
	@CacheLookup
	WebElement RequestButtopn;

	public void clickonProductsAndDeviceLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Products).perform();
		Thread.sleep(5000);
		//business.click();
		Devices.click();
		Thread.sleep(5000);
		String actualText = "VoIP Phones & Accessories";
		if (actualText.equals(para.getText())) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed:");
		}
		System.out.println("Para graph text is " + para.getText().toString());
	}

	public void scroll() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// System.out.println("Text is--" + name.getTagName());
		// name.getTagName();
		js.executeScript("arguments[0].scrollIntoView();", requestheading);
	}
	
	public void scrollTillAPI() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// System.out.println("Text is--" + name.getTagName());
		// name.getTagName();
		js.executeScript("arguments[0].scrollIntoView();", "");
	}
	

	public void selectCountry() throws InterruptedException {
		Thread.sleep(9000);
		country.click();
		System.out.println("Selected Country-->" + countryItem.getText());
		countryItem.click();

	}

	public void selectInterest() throws InterruptedException {
		Thread.sleep(9000);
		interest.click();
		interestItem.click();
		System.out.println("Selected item-->" + interest.getText().toString());

	}

	public void FillForm() throws InterruptedException {

		name.sendKeys("test test");
		email.sendKeys("test@gmail.com");
		phone.sendKeys("1-833-924-2405");
		company.sendKeys("google");
		noOfEmployees.sendKeys("123");
		Thread.sleep(5000);
		RequestButtopn.click();
	}

}
