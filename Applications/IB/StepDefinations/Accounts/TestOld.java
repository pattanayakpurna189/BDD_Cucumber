package IB.StepDefinations.Accounts;

import java.util.concurrent.TimeUnit;
import IB.Page.HomePage;
import Reusable_Methods.Utility;
import cucumber.api.java.en.*;
import managers.DataManager;
import managers.DriverManager;

public class TestOld {
	DataManager data = new DataManager();
	Utility util = new Utility();
	DriverManager driver =new DriverManager();
	
	//PageObjects************************************************
	
	HomePage homepage = new HomePage();
	@When("^Purna login with google$")
	public void purna_login_with_google() throws Throwable {
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
			
			
			
			//DO ur validations
			//
			util.Pass(driver.getDriver(),"Successfully IB Application has been opened....");
			System.out.println("Open URl");
			util.Pass(driver.getDriver(),"Agfian IB Application has been opened....");
			
			util.Pass(driver.getDriver(),"Agfian IB Application has been opened....");
			util.Pass(driver.getDriver(),"aaaaa IB Application has been opened....");
			util.Pass(driver.getDriver(),"bbbbbbb IB Application has been opened....");
			util.Pass(driver.getDriver(),"cccccccc IB Application has been opened....");
			util.Pass(driver.getDriver(),"dddddd IB Application has been opened....");
			
			util.Pass(driver.getDriver(),"eeeeee IB Application has been opened....");
			util.Pass(driver.getDriver(),"fffffff IB Application has been opened....");
	}

	/*@Given("^user name is displayed$")
	public synchronized void user_name_is_displayed() throws Throwable {
		//util.Pass(util.getDriver(),"Step definations Transfer");
		String value = util.get_Element(util.getDriver(), homepage.Display_Name()).getText();
		System.out.println("Crosssssssssssssssssssssssed");
		if(!value.trim().isEmpty()) {
			if(value.contains(data.getData().get("Displayed_Name"))) {
				util.Pass(util.getDriver(),"Successfully validated the Displayed name on Home screen of IB as : "+data.getData().get("Displayed_Name"));
			}else {
				System.out.println("Displayed name is : "+value);
				String val = "Displayed name on Home screen of IB validation failed as thee displayed name : "+value+" is different from expected : "+data.getData().get("Displayed_Name");
				util.Fail(util.getDriver(),val);
			}
		}else {
			util.Fail(util.getDriver(),"User name is not displayed on IB Home screen..");
		}
		
		
		try {
			
		}catch(Exception e) {
			
		}
		
	}
	
	@When("^user clicks on the Accounts Overview link$")
	public void user_clicks_on_the_Accounts_Overview_link() throws Throwable {
	   
	}

	@When("^navigates to Accounts Overview$")
	public void navigates_to_Accounts_Overview() throws Throwable {
	    
	}

	@Then("^user can view Static label as \"([^\"]*)\" in the band$")
	public void user_can_view_Static_label_as_in_the_band(String arg1) throws Throwable {
	    boolean flag = util.isDisplayed(util.getDriver(), homepage.Accounts_Overview_Txt());
	    if(flag) {
	    	util.Pass(util.getDriver(),"Successfully user can view Static label as Accounts Overview");
	    }else {
	    	util.Fail(util.getDriver(),"Failed to view Static label as Accounts Overview");
	    }
	}

	@Then("^can view Account Number$")
	public void can_view_Account_Number() throws Throwable {
	    
		//boolean flag = util.isDisplayed(util.getDriver(), homepage.Account_Number());
		String val = util.getText(util.getDriver(), homepage.Account_Number());
		util.Write_To_Json("Ref_InterNet_1212", "AccountNumber", val, "", "");
		
	    if(val.contains(data.getData().get("AccountNumber"))) {
	    	util.Pass(util.getDriver(),"Successfully user can view Account Number as expected and the same is : "+val);
	    }else {
	    	util.Fail(util.getDriver(),"Failed to validate the Account Number");
	    }
	}

	@Then("^can view Balance$")
	public void can_view_Balance() throws Throwable {
		try {
			boolean flag = util.isDisplayed(util.getDriver(), homepage.Balance());
			String val = util.getText(util.getDriver(), homepage.Balance());
		    if(flag) {
		    	util.Pass(util.getDriver(),"Successfully user can view Balance as expected and the same is : "+val);
		    }else {
		    	util.Fail(util.getDriver(),"Failed to view Balance");
		    }
		}catch(Exception e) {
			throw new Exception();
		}
		
	    
	}

	@Then("^can view  AvailableAmount$")
	public void can_view_AvailableAmount() throws Throwable {
		boolean flag = util.isDisplayed(util.getDriver(), homepage.Available_Amount());
		String val = util.getText(util.getDriver(), homepage.Available_Amount());
	    if(flag) {
	    	util.Pass(util.getDriver(),"Successfully user can view Available_Amount as expected and the same is : "+val);
	    }else {
	    	util.Fail(util.getDriver(),"Failed to view Available_Amount");
	    }
	    
	}
	*/
	
}
