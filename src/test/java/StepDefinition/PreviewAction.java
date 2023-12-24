package StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import Req.REQPOM;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import productPOM.APIPOM;
import productPOM.IntegrationPOM;
import productPOM.PreviewPOM;
import resourcesPOM.ResourcesPOM;
import solutionsPOM.GenSolutionPOM;

public class PreviewAction extends BaseClass{

	
	@Given("Launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("open URL {string}")
	public void open_url(String url) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(url);
	    Thread.sleep(5000);
	}

	@When("Naviagte to Device Form")
	public void naviagate_to_form() throws InterruptedException {
	    previewPOM=new PreviewPOM(driver);
	    previewPOM.clickonProductsAndDeviceLink();
	    System.out.println("Device Method----");
	}
	
	@When("Naviagte to Phone Form")
	public void naviagte_to_phone_form() throws InterruptedException {
		  previewPOM=new PreviewPOM(driver);
		    previewPOM.clickonProductsAndBusinessphoneLink();
	    
	}
	
	@When("Naviagte to Video Conference Form")
	public void naviagte_to_Video_form() throws InterruptedException {
		  previewPOM=new PreviewPOM(driver);
		    previewPOM.clickonProductsAndBusinessphoneLink();
	    
	}
	
	@When("Naviagte to Team Chat Form")
	public void naviagte_to_Chat_form() throws InterruptedException {
		  previewPOM=new PreviewPOM(driver);
		    previewPOM.clickonProductsAndTeamChatLink();
	    
	}
	
	@When("Naviagte to Contact Center Form")
	public void naviagte_to_Contact_Center_form() throws InterruptedException {
		  previewPOM=new PreviewPOM(driver);
		    previewPOM.clickonProductsAndContactCenterLink();
	    
	}
	
	
	@When("Navigate to download Form")
	public void naviagte_to_download_form() throws InterruptedException {
		 previewPOM=new PreviewPOM(driver);
		 previewPOM.clickonProductsAndDownloadLink();
	}
	
	
	/*
	 * @When("Naviagte to Download Form") public void naviagte_to_Download_form()
	 * throws InterruptedException { previewPOM=new PreviewPOM(driver);
	 * previewPOM.clickonProductsAndDownloadLink();
	 * 
	 * }
	 */
	
	@When("Naviagte to Business Continuity Planning Form")
	public void naviagte_to_Business_Continuity_Planning_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonSolutionsAndBusinesscontinutyLink();   
	}	
	
	
	@When("Naviagte to Cloud Migration Form")
	public void naviagte_to_Cloud_Migration_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonSolutionsAndCloudMigrationLink();  
	}
	
	@When("Naviagte to Collaboration & Mobility Form")
	public void naviagte_to_Collaboration_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonSolutionsAndColaborationLink();  
	}
	
	@When("Naviagte to Customer Experience Enhancement Form")
	public void naviagte_to_Customer_Experience_Enhancement_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonSolutionsAndCustomerExperienceEnhancementLink();  
	}
	
	@When("Naviagte to Marketing & Demand Generation Form")
	public void naviagte_to_Marketing_Demand_Generation_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonSolutionsAndMarketingAndDemandGenerationLink();  
	}
	
	@When("Naviagte to Microsoft Teams Integration Form")
	public void naviagte_to_Microsoft_Teams_Integration_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonSolutionsAndMicrosoftTeamsIntegrationLink();  
	}
	
	@When("Naviagte to Office Communications Form")
	public void naviagte_to_Office_Communications_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonSolutionsAndOfficeCommunicationsLink();  
	}
	
	@When("Naviagte to Sales and Customer Service Form")
	public void naviagte_to_Sales_and_Customer_Service_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonSalesandCustomerServiceLink(); 
	}
	
	@When("Naviagte to SecurityAuthentication Form")
	public void naviagte_to_Security_Authentication_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonSalesandCustomerServiceLink(); 
	}
	
	@When("Naviagte to Education Form")
	public void naviagte_to_Education_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonEducationLink(); 
	}
	
	@When("Naviagte to Government Form")
	public void naviagte_to_Government_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonGovernmentLink();
	}
	
	@When("Naviagte to Manufacturing Form")
	public void naviagte_to_Manufacturing_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonManufacturingLink();
	}
	
	@When("Naviagte to Retail Form")
	public void naviagte_to_retail_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonRetailLink();
	}
	
	@When("Naviagte to Financial Services Form")
	public void naviagte_to_Financial_Services_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonFinancialServicesLink();
	}
	
	@When("Naviagte to Healthcare Form")
	public void naviagte_to_Healthcare_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonHealthcareLink();
	}
	
	@When("Naviagte to Professional Services Form")
	public void naviagte_to_Professional_Services_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonProfessionalServicesLink();
	}
	
	@When("Naviagte to Transportation Form")
	public void naviagte_to_Transportation_Form() throws InterruptedException {
		  genSolutionsPOM=new GenSolutionPOM(driver);
		  previewPOM=new PreviewPOM(driver);
		  genSolutionsPOM.clickonTransportationLink();
	}
	
	@When("Scroll page Till Form")
	public void scroll_page_till_form() throws InterruptedException {
	    previewPOM.scroll();
	}
	
	@When("Scroll page Till download Form")
	public void scroll_page_till_download_form() throws InterruptedException {
	    previewPOM.scrollTillDownload();
	}
	
	/*
	 * @When("Scroll page Till download Form") public void
	 * scroll_page_till_download_form() throws InterruptedException {
	 * previewPOM.scrollTillDownload(); }
	 */
	//General Form Submission
	@When("Fill All the Form")
	public void fill_all_the_form_values() throws InterruptedException {
		previewPOM.FillForm();
		Thread.sleep(5000);
		previewPOM.selectCountry();
	    previewPOM.selectInterest();
	    Thread.sleep(3000);
	}
	
	@When("Naviagte to Integration Form")
	public void naviagte_integration_form() throws InterruptedException {
		previewPOM=new PreviewPOM(driver);
		    previewPOM.clickonProductsIntegrationLink();
	}
	
	@When("Scroll page Till Integration Form")
	public void scroll_page_till_Integration_form() throws InterruptedException {
	    intPOM=new IntegrationPOM(driver);
	    intPOM.scrollToIntegrationForm();
		
	}
	
	@When("Fill All Integration the Form")
	public void fill_integration_form_values() throws InterruptedException {
		intPOM.FillIntegrationForm();
		Thread.sleep(5000);
	}
	
	@When("Naviagte to API Form")
	public void naviagte_to_API_form() throws InterruptedException {
		  previewPOM=new PreviewPOM(driver);
		    previewPOM.clickonProductsAndAPICenterLink();
	    
	}
	
	@When("Scroll page Till API Form")
	public void scroll_page_till_API_form() throws InterruptedException {
	    apiPOM=new APIPOM(driver);
		apiPOM.scrollToAPIForm();
	}
	
	@When("Fill API Form")
	public void fill_API_form_values() throws InterruptedException {
		apiPOM.FillAPIForm();
		apiPOM.selectAPICountry();
		apiPOM.selectInterest();
	}
	
	@When("click on Submit button")
	public void click_on_submit_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    previewPOM=new PreviewPOM(driver);
		previewPOM.clickonsubmitbutton();
	}

	@Then("Verify Success message")
	public void verify_success_message() {
	    System.out.println("Not Implemented");
	}
	
	
	//REQ FORM Starting here
	
	@When("Click on Request a Demo button")
	public void click_on_request_a_demo_button() throws InterruptedException {
	reqPOM=new REQPOM(driver);
	reqPOM.reqCTA.click();
	}

	@When("Fillout email and click On Next button")
	public void fillout_and_click_on_next_button() throws InterruptedException {
	reqPOM=new REQPOM(driver);
	reqPOM.fillFirstDivAndClickOnNextButton();
	Thread.sleep(3000);
	}

	@When("Fillout First Name, Last Name, Phone Fields and click on next button")
	public void fillout_first_name_last_name_phone_fields_and_click_on_next_button() throws InterruptedException {
		reqPOM=new REQPOM(driver);
		reqPOM.fillSecondDivAndClickOnNextButton();
		Thread.sleep(3000);
	}

	@When("Fillout Company, Employees, Country, Interest Fields and click on Submit button")
	public void fillout_company_employees_country_interest_fields_and_click_on_submit_button() throws InterruptedException {
		reqPOM=new REQPOM(driver);
		reqPOM.fillThirdDivAndClickOnSubmittButton();
		Thread.sleep(3000);
	}
	
	//Resource Form Implementation method
	
	@When("Naviagte to form")
	public void naviagte_to_form() throws InterruptedException {
		resPOM=new ResourcesPOM(driver);
		Thread.sleep(3000);
		resPOM.clickonREsourceAndEvents();
	}

	@When("Fill Supervisor Form")
	public void fill_supervisor_form() throws InterruptedException {
		resPOM=new ResourcesPOM(driver);
		Thread.sleep(2000);
		resPOM.FillSupervisorForm();
	}
	
	@When("Fill your average chatbot Form")
	public void fill_your_average_chatbot_form() throws InterruptedException {
		resPOM=new ResourcesPOM(driver);
		Thread.sleep(4000);
		resPOM.FillyouraveragechatbotForm();
	}
	
	@When("Fill Expert Webinar Form")
	public void fill_expert_webinar_form() throws InterruptedException {
		resPOM=new ResourcesPOM(driver);
		Thread.sleep(4000);
		resPOM.FillExpertWebinarForm();
	}
	
	@When("Fill Ask The Experts Agent Form")
	public void fill_ask_the_expert_form() throws InterruptedException {
		resPOM=new ResourcesPOM(driver);
		Thread.sleep(4000);
		resPOM.FillAskTheExpertForm();
	}
	
	@When("Fill Healthcare Form")
	public void fill_Healthcare_form() throws InterruptedException {
		resPOM=new ResourcesPOM(driver);
		Thread.sleep(4000);
		resPOM.FillHealthForm();
	}
	
	@When("Fill Tanya Pakar Form")
	public void fill_Tanya_pakar_form() throws InterruptedException {
		resPOM=new ResourcesPOM(driver);
		Thread.sleep(4000);
		resPOM.FillTanyaPakarIndForm();
	}
	
	@When("Fill Cpaas Thai Form")
	public void fill_Cpaas_Thai_form() throws InterruptedException {
		resPOM=new ResourcesPOM(driver);
		Thread.sleep(4000);
		resPOM.FillThaiForm();
	}
	
	@When("Fill Engage Customer Form")
	public void fill_Apac_Customer_form() throws InterruptedException {
		resPOM=new ResourcesPOM(driver);
		Thread.sleep(4000);
		resPOM.FillAPACForm();
	}
	
	@When("Fill Webinar Demo Form")
	public void fill_Webinar_Demo_form() throws InterruptedException {
		resPOM=new ResourcesPOM(driver);
		Thread.sleep(4000);
		resPOM.FillWebinarDemoForm();
	}
}
