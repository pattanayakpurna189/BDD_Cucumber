package IB.StepDefinations.Accounts;


import java.util.concurrent.TimeUnit;
import IB.Page.HomePage;
import Reusable_Methods.Utility;
import cucumber.api.java.en.*;
import managers.DB_Manager;
import managers.DataManager;
import managers.DriverManager;

public class Login {

	DataManager data = new DataManager();
	Utility util = new Utility();
	DriverManager driver =new DriverManager();
	
	//PageObjects************************************************
	HomePage homepage = new HomePage();
	DB_Manager DB=new DB_Manager();
	
	
//Login AlRaheb Featurefile****************************************
	
	@Given("^user logged in with valid credentials and landed in Homepage$")
	public void user_logged_in_with_valid_credentials_and_landed_in_Homepage() throws Throwable {
		 String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName(); 
		    System.out.println("CurrentMethod : "+CurrentMethod);
		//setting up test***************************************************************************************
				System.out.println(Utility.DataBinding.get());
				data.setData_Env(Utility.Environment.get());
				driver.innitialize_WebDriver();
				data.setData_Login(Utility.Login_DataBinding.get());
				data.setData(Utility.DataBinding.get(),Utility.SheetName.get());
				Utility.webdriver.set(driver.getDriver());
			//***************************************************************************************
				util.getDriver().get(data.getData_Env().get("URL"));
				util.getDriver().manage().window().maximize();
				util.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				util.getDriver().manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
				Thread.sleep(5000);
				util.Pass(driver.getDriver(),"Successfully IB Application has been opened....");
				
	}
	
	
	
	@Then("^User Logged out of the system successfully$")
	public void user_Logged_out_of_the_system_successfully() throws Throwable {
		util.Pass(driver.getDriver(),"Successfully IB Application logout....");
		  util.getDriver().quit();
	}
	
	
	
	
}
