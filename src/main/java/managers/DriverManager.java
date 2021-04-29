package managers;

import java.net.URL;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import Reusable_Methods.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class DriverManager {
	Utility util = new Utility();
	DataManager data = new DataManager();
	ThreadLocal<AppiumDriver<MobileElement>> appiumDriver = new ThreadLocal<AppiumDriver<MobileElement>>();
	ThreadLocal<RemoteWebDriver> webdriver = new ThreadLocal<RemoteWebDriver>();
	
	public synchronized void innitialize_WebDriver() {
		String Execute_On = data.getData_Env().get("Execute_On");
			
			if(Execute_On.contains("LOCAL")) {
				
				String browser = data.getData_Env().get("Browser");
				switch(browser) {
					case "Chrome":
						try {
							System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
							webdriver.set(new ChromeDriver());
						} catch (Exception e) {
							util.Fail_WithOut_SS("Unable to start the Test as couldnot innitiate the driver....");
						}
						
						break;
						
					case "IE":
						try {
							System.setProperty("webdriver.ie.driver", ".//Drivers//IEDriverServer.exe");
							webdriver.set(new InternetExplorerDriver());
						} catch (Exception e) {
							util.Fail_WithOut_SS("Unable to start the Test as couldnot innitiate the driver....");
						}
						
						break;
						
					case "Firefox":
						try {
							System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
							FirefoxOptions options = new FirefoxOptions();
							options.setCapability("marionette", true);
							webdriver.set(new FirefoxDriver(options));
						} catch (Exception e) {
							util.Fail_WithOut_SS("Unable to start the Test as couldnot innitiate the driver....");
						}
						
						break;
						
					case "Safari":
						try {
							System.setProperty("webdriver.safari.noinstall", "true");
							SafariOptions option = new SafariOptions();
							webdriver.set(new SafariDriver(option));
						} catch (Exception e) {
							util.Fail_WithOut_SS("Unable to start the Test as couldnot innitiate the driver....");
						}
						
						 
						break;
				}
			}else if(Execute_On.contains("CLOUD")) {
				
				String browser = data.getData_Env().get("Browser");
				String browser_Version = data.getData_Env().get("Browser_Version");
				String OS = data.getData_Env().get("OS");
				String OS_Version = data.getData_Env().get("OS_Version");
				String Resolution = data.getData_Env().get("Resolution");
				String Name = data.getData_Env().get("DataBinding");
				String USERNAME = data.getData_Env().get("BS_UserName");
				String AUTOMATE_KEY = data.getData_Env().get("BS_Password");
				String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
					
				    DesiredCapabilities caps = new DesiredCapabilities();
				    caps.setCapability("browser", browser);
				    caps.setCapability("browser_version", browser_Version);
				    caps.setCapability("os", OS);
				    caps.setCapability("os_version", OS_Version);
				    caps.setCapability("resolution", Resolution);
				    caps.setCapability("name", "Bstack_"+Name);
				    try {
						webdriver.set(new RemoteWebDriver(new URL(URL), caps));
					} catch (Exception e) {
						util.Fail_WithOut_SS("Unable to start the Test as couldnot innitiate the driver....");
						e.printStackTrace();
					}
				    
				    System.out.println("Successfully");
			}
	}
	
	
	public synchronized void innitialize_AppiumDriver() {
		String Execute_On = data.getData_Env().get("Execute_On");
			
			if(Execute_On.contains("LOCAL")) {
				
				String browser = data.getData_Env().get("Device_Type");
				DesiredCapabilities caps = new DesiredCapabilities();
				switch(browser) {
					case "ANDROID_TAB":
					case "ANDROID_MOB":
						caps.setCapability("deviceName", data.getData_Env().get("deviceName"));
						//caps.setCapability("UUID", data.getData_Env().get("UUID"));
						caps.setCapability("platformName", data.getData_Env().get("platformName"));
						caps.setCapability("platformVersion", data.getData_Env().get("platformVersion"));
						System.out.println("Binary Path : "+System.getProperty("user.dir")+"\\MB_Binaries\\"+data.getData_Env().get("Binary_Name"));
						caps.setCapability("app", System.getProperty("user.dir")+"\\MB_Binaries\\"+data.getData_Env().get("Binary_Name"));
						caps.setCapability("appPackage", data.getData_Env().get("appPackage"));
						caps.setCapability("noReset", false);
						caps.setCapability("nativeWebScreenshot", true);
						//caps.setCapability("automationName", "UiAutomator2");
						/*caps.setCapability("appActivity", data.getData_Env().get("appActivity"));
						caps.setCapability("noReset", "true");*/
						/*caps.setCapability("UUID", "emulator-5554");
						caps.setCapability("app", "C:\\Users\\ITsupport\\Documents\\Browserstack App Automate\\AhliBankSITH69.apk");
						caps.setCapability("deviceName", "sdk_gphone_x86_arm");
						caps.setCapability("platformName", "Android");
						caps.setCapability("platformVersion", "11");*/
						try {
							appiumDriver.set( new AndroidDriver<MobileElement>(new URL(data.getData_Env().get("URL")), caps));
							//appiumDriver.set( new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps));
						} catch (Exception e) {
							System.out.println("About to stop appium server...");
							util.Fail_WithOut_SS("Unable to start the Test as couldnot innitiate the driver....");
							e.printStackTrace();
						}
						break;
					
					case "IOS_TAB":
					case "IOS_MOB":
						caps.setCapability("deviceName", data.getData_Env().get("deviceName"));
						caps.setCapability("UUID", data.getData_Env().get("UUID"));
						caps.setCapability("platformName", data.getData_Env().get("platformName"));
						caps.setCapability("platformVersion", data.getData_Env().get("platformVersion"));
						//caps.setCapability("app", "D:\\Test\\My_Framework_2020\\Workspace\\BDD\\Appium_Setup\\fb.apk");
						caps.setCapability("appPackage", data.getData_Env().get("appPackage"));
						caps.setCapability("appActivity", data.getData_Env().get("appActivity"));
						caps.setCapability("noReset", "true");
						
						try {
							appiumDriver.set( new IOSDriver<MobileElement>(new URL(data.getData_Env().get("URL")), caps));
						} catch (Exception e) {
							util.Fail_WithOut_SS("Unable to start the Test as couldnot innitiate the driver....");
							e.printStackTrace();
						}
						break;
					
				}
			}else if(Execute_On.contains("CLOUD")) {
				
				String DeviceType = data.getData_Env().get("Device_Type");
				
				String deviceName = data.getData_Env().get("deviceName");
				String platformVersion = data.getData_Env().get("platformVersion");
				String project = data.getData_Env().get("project");
				String build = data.getData_Env().get("build");
				String NameDatabinding = data.getData_Env().get("DataBinding");
				String app = data.getData_Env().get("app");
				//String USERNAME = data.getData_Env().get("BS_UserName");
				//String AUTOMATE_KEY = data.getData_Env().get("BS_Password");
				//String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
					
				    DesiredCapabilities caps = new DesiredCapabilities();
				    caps.setCapability("device", deviceName);
				    caps.setCapability("os_version", platformVersion);
				    caps.setCapability("project", project);
				    caps.setCapability("build", build);
				    caps.setCapability("app", app);
				    caps.setCapability("browserstack.local", "true"); 
				    caps.setCapability("name", "Bstack_"+NameDatabinding);
				    caps.setCapability("browserstack.idleTimeout", "500"); 
				    caps.setCapability("browserstack.appium_version", "1.15.0"); 
				   
				switch(DeviceType) {
				
					case "ANDROID_TAB":
					case "ANDROID_MOB":
						
						try {
							appiumDriver.set( new AndroidDriver<MobileElement>(new URL(data.getData_Env().get("URL")), caps));
						} catch (Exception e) {
							util.Fail_WithOut_SS("Unable to start the Test as couldnot innitiate the driver....");
							e.printStackTrace();
						}

					break;
						
					case "IOS_TAB":
					case "IOS_MOB":
						
						try {
							appiumDriver.set( new IOSDriver<MobileElement>(new URL(data.getData_Env().get("URL")), caps));
						} catch (Exception e) {
							util.Fail_WithOut_SS("Unable to start the Test as couldnot innitiate the driver....");
							e.printStackTrace();
						}
					break;
					
				}
				
			}
		
	}
	
	
	public RemoteWebDriver getDriver() {
		return webdriver.get();
	}
	
	
	public AppiumDriver<MobileElement> getAppiumDriver() {
		return appiumDriver.get();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
