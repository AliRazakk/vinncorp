package productPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APIPOM{
	
	WebDriver driver;
	PreviewPOM pom;

	public APIPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
	}
	
	@FindBy(id = "first-name")
	@CacheLookup
	WebElement fname;

	@FindBy(id = "last-name")
	@CacheLookup
	WebElement lname;
	
	@FindBy(id = "phone-number")
	@CacheLookup
	WebElement apiphone;

	@FindBy(id = "company-name")
	@CacheLookup
	WebElement apicompany;
	
	@FindBy(id = "country/region")
	@CacheLookup
	WebElement apicountry;
	
	@FindBy(partialLinkText = "Albania")
	@CacheLookup
	WebElement countryItem;
	
	@FindBy(id = "primary-interest")
	@CacheLookup
	WebElement interest;
	
	@FindBy(partialLinkText = "Video Interaction")
	@CacheLookup
	WebElement interestItem;
	
	
	@FindBy(css = "#header-b339b06ef9c939ef781ac7c60108aa43 > span")
	@CacheLookup
	WebElement apiheading;
	
	
	public void scrollToAPIForm() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// System.out.println("Text is--" + name.getTagName());
		// name.getTagName();
		js.executeScript("arguments[0].scrollIntoView();", apiheading);
	}
	
	public void selectAPICountry() throws InterruptedException {
		Thread.sleep(5000);
		apicountry.click();
		Thread.sleep(5000);
		countryItem.click();
	}
	
	public void selectInterest() throws InterruptedException {

		Thread.sleep(9000);
		interest.click();
		Thread.sleep(5000);
		interestItem.click();

	}
	
	public void FillAPIForm() throws InterruptedException {

		pom=new PreviewPOM(driver);
		fname.sendKeys("test");
		lname.sendKeys("test");
		pom.email.sendKeys("test@gmail.com");
		apiphone.sendKeys("18883058271");
		apicompany.sendKeys("google");
		pom.noOfEmployees.sendKeys("123");
		Thread.sleep(4000);

	}

}
