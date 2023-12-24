package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralMethods {
	
	public WebDriver driver;
	
	public GeneralMethods(WebDriver driver) {
		this.driver = driver;
	}

	public void scroll(WebElement element) throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// System.out.println("Text is--" + name.getTagName());
		// name.getTagName();
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
}
