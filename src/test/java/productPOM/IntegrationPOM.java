package productPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntegrationPOM {

	WebDriver driver;
	PreviewPOM pom;

	public IntegrationPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
	}
	
	@FindBy(id = "email")
	@CacheLookup
	WebElement integrationemail;
	
	@FindBy(id = "leave-us feedback on this application")
	@CacheLookup
	WebElement feedback;
	
	@FindBy(css = "#header-6e26f7f4980ffe413f1d8eec5554b669")
	@CacheLookup
	WebElement integrationheading;
	
	public void scrollToIntegrationForm() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// System.out.println("Text is--" + name.getTagName());
		// name.getTagName();
		js.executeScript("arguments[0].scrollIntoView();", integrationheading);
	}
	
	public void FillIntegrationForm() throws InterruptedException {
		pom=new PreviewPOM(driver);
		pom.name.sendKeys("test test");
		integrationemail.sendKeys("test@gmail.com");
		feedback.sendKeys("Customer Feedback");

	}
	
}


