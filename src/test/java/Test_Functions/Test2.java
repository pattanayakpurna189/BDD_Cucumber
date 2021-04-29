package Test_Functions;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import managers.DataManager;
import managers.DriverManager;

public class Test2 {
	//DriverManager driver = DriverManager.getInstance();
	DriverManager driver =new DriverManager();
	public static int itr;
	DataManager data = new DataManager();

	
	public static final String AUTOMATE_USERNAME = "mavericsystems1";
	  public static final String AUTOMATE_ACCESS_KEY = "bTswSoLR9Ayt7TqqKct1";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	@Test
	public void BGoogle() throws MalformedURLException {
		
		
		   DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browserName", "iPhone");
		    caps.setCapability("device", "iPhone XS");
		    caps.setCapability("realMobile", "true");
		    caps.setCapability("os_version", "12");
		    caps.setCapability("browserstack.local", "true"); 
		    
		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		    driver.get("https://www.google.com");
		    WebElement element = driver.findElement(By.name("q"));
		    element.sendKeys("BrowserStack");
		    element.submit();
		    System.out.println(driver.getTitle());
		
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void CGoogle() throws MalformedURLException {
		
		   String userName = "mavericsystems1";
		   String accessKey = "bTswSoLR9Ayt7TqqKct1";

		   DesiredCapabilities caps = new DesiredCapabilities();

		   caps.setCapability("device", "iPhone XS");
		    caps.setCapability("os_version", "12");
		   
		    caps.setCapability("browser", "Safari");
		    caps.setCapability("real_mobile", "true");
		     //caps.setCapability("app", "bs://fd8612c0afae2b6396e7b6256b381d4a6590d4fc");

		    IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
		
		    driver.get("https://appiumpro.com/editions/4-using-appium-for-testing-mobile-web-apps");
		    
		    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
