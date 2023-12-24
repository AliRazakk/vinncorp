package StepDefinition;

import java.util.Optional;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;

import Utilities.BaseClass;
import Utilities.TestResponseCode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import productPOM.IndexPOM;

public class IndexAction extends BaseClass{

	@Given("launch browser")
	public void launch_browser() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//DevTools devtools=((ChromiumDriver)driver).getDevTools();
		//devtools.createSession();
	}
	
	@Given("open Url {string}")
	public void open_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(url);
	}


	@When("Click on Products and Click on Device link")
	public void click_on_products_and_click_on_device_link() throws InterruptedException {
		indexpom=new IndexPOM(driver);
	    indexpom.clickonProductsAndDeviceLink();
	    
	}
	
	@When("Perform Scrolling and Fill the Form")
	public void perform_scrolling_and_fill_the_form() throws InterruptedException {
		indexpom.scroll();
		
		Thread.sleep(3000);
		indexpom.selectCountry();
		Thread.sleep(3000);
		indexpom.selectInterest();
		Thread.sleep(3000);
		indexpom.FillForm();
		Thread.sleep(3000);
		//System.out.println("Page Source of the Driver-->"+driver.getPageSource());
		//indexpom.interestSlection();
		//System.out.println("Printlist for Contry is called from action class");
	}
	
	@Then("Close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //driver.close();
		TestResponseCode obj=new TestResponseCode();
		String url=driver.getCurrentUrl();
		System.out.println("Status Code After Filling the Form: "+obj.httpResponseCodeViaPost(url));
	}

}
