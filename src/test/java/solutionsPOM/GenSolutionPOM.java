package solutionsPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class GenSolutionPOM {
	
	WebDriver driver;

	public GenSolutionPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
		
	}
	
	@FindBy(xpath = "//*[@id=\"mustache-nav\"]/div[1]/div[3]/div[1]/a")
	@CacheLookup
	WebElement Solutions;
	
    @FindBy(linkText = "Business Continuity Planning")
	@CacheLookup
	WebElement BusinessContinutyPlanning;
	
	@FindBy(linkText = "Cloud Migration")
	@CacheLookup
	WebElement CloudMigration;
	
	@FindBy(linkText = "Collaboration & Mobility")
	@CacheLookup
	WebElement Collaboration_Mobility;
	
	@FindBy(linkText = "Customer Experience Enhancement")
	@CacheLookup
	WebElement CustomerExperienceEnhancement;
	
	@FindBy(linkText = "Marketing & Demand Generation")
	@CacheLookup
	WebElement Marketing_Demand_Generation;
	
	@FindBy(linkText = "Microsoft Teams Integration")
	@CacheLookup
	WebElement Microsoft_Teams_Integration;
	
	@FindBy(linkText = "Office Communications")
	@CacheLookup
	WebElement Office_Communications;
	
	@FindBy(linkText = "Sales and Customer Service")
	@CacheLookup
	WebElement Sales_and_Customer_Service;
	
	@FindBy(linkText = "Security & Authentication")
	@CacheLookup
	WebElement Security_Authentication;
	
	@FindBy(linkText = "Education")
	@CacheLookup
	WebElement Education;
	
	@FindBy(linkText = "Government")
	@CacheLookup
	WebElement Government;
	
	@FindBy(linkText = "Manufacturing")
	@CacheLookup
	WebElement Manufacturing;
	
	@FindBy(linkText = "Retail")
	@CacheLookup
	WebElement retail;
	
	@FindBy(linkText = "Financial Services")
	@CacheLookup
	WebElement FinancialServices;
	
	@FindBy(linkText = "Healthcare")
	@CacheLookup
	WebElement Healthcare;
	
	@FindBy(linkText = "Professional Services")
	@CacheLookup
	WebElement ProfessionalServices;
	
	@FindBy(linkText = "Transportation")
	@CacheLookup
	WebElement Transportation;
	
	@FindBy(css = "#contact-us > div > p")
	@CacheLookup
	WebElement requestheading;
	
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
	
	public void clickonSolutionsAndBusinesscontinutyLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		System.out.println("Simple text--"+BusinessContinutyPlanning.getText());
		BusinessContinutyPlanning.click();
		Thread.sleep(5000);
	}
	
	public void clickonSolutionsAndCloudMigrationLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		System.out.println("Simple text--"+BusinessContinutyPlanning.getText());
		CloudMigration.click();
		Thread.sleep(5000);
	}
	
	public void clickonSolutionsAndColaborationLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		System.out.println("Simple text--"+BusinessContinutyPlanning.getText());
		Collaboration_Mobility.click();
		Thread.sleep(5000);
	}
	
	public void clickonSolutionsAndCustomerExperienceEnhancementLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		CustomerExperienceEnhancement.click();
		Thread.sleep(5000);
	}
	
	public void clickonSolutionsAndMarketingAndDemandGenerationLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		System.out.println("Simple text--"+BusinessContinutyPlanning.getText());
		Marketing_Demand_Generation.click();
		Thread.sleep(5000);
	}
	
	public void clickonSolutionsAndMicrosoftTeamsIntegrationLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		System.out.println("Simple text--"+BusinessContinutyPlanning.getText());
		Microsoft_Teams_Integration.click();
		Thread.sleep(5000);
	}
	
	public void clickonSolutionsAndOfficeCommunicationsLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		BaseClass.elementVissiblity(Office_Communications);
		//Office_Communications.click();
		Thread.sleep(5000);
	}
	
	public void clickonSalesandCustomerServiceLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		BaseClass.elementVissiblity(Sales_and_Customer_Service);
		//Office_Communications.click();
		Thread.sleep(5000);
	}
	
	public void clickonSecurityAuthenticationLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		BaseClass.elementVissiblity(Security_Authentication);
		//Office_Communications.click();
		Thread.sleep(5000);
	}
	
	public void clickonEducationLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		//BaseClass.elementVissiblity(Security_Authentication);
		Education.click();
		Thread.sleep(5000);
	}
	
	public void clickonGovernmentLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		//BaseClass.elementVissiblity(Security_Authentication);
		Government.click();
		Thread.sleep(5000);
	}
	
	public void clickonManufacturingLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		//BaseClass.elementVissiblity(Security_Authentication);
		Manufacturing.click();
		Thread.sleep(5000);
	}
	
	public void clickonRetailLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		//BaseClass.elementVissiblity(Security_Authentication);
		retail.click();
		Thread.sleep(5000);
	}
	
	public void clickonFinancialServicesLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		//BaseClass.elementVissiblity(Security_Authentication);
		FinancialServices.click();
		Thread.sleep(5000);
	}
	
	public void clickonHealthcareLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		//BaseClass.elementVissiblity(Security_Authentication);
		Healthcare.click();
		Thread.sleep(5000);
	}
	
	public void clickonProfessionalServicesLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		//BaseClass.elementVissiblity(Security_Authentication);
		ProfessionalServices.click();
		Thread.sleep(5000);
	}
	
	public void clickonTransportationLink() throws InterruptedException {	
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).perform();
		//action.click(Solutions).perform();
		Thread.sleep(3000);
		//BaseClass obj=new BaseClass();
		//BaseClass.elementVissiblity(Security_Authentication);
		Transportation.click();
		Thread.sleep(5000);
	}
	
}
