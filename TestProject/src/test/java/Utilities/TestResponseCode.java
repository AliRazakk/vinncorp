package Utilities;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.restassured.RestAssured;

public class TestResponseCode {
	
	

	 public int httpResponseCodeViaPost(String url) {
	        return RestAssured.post(url).statusCode();
	    }
     
	
}
