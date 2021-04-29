package IB.StepDefinations.Accounts;

import IB.Page.HomePage;
import IB.Page.AccountsPage;
import Reusable_Methods.Utility;
import cucumber.api.java.en.*;
import managers.DB_Manager;
import managers.DataManager;
import managers.DriverManager;

public class IB_Account {
	
	DataManager data = new DataManager();
	Utility util = new Utility();
	DriverManager driver =new DriverManager();
	
	//PageObjects************************************************
	HomePage homepage = new HomePage();
	AccountsPage accountspage = new AccountsPage();
	DB_Manager DB=new DB_Manager();
	
	//*******************************************************************************************************************************************************************
	

	
	@When("^navigates to Accounts Workspace$")
	public void navigates_to_Accounts_Workspace() throws Throwable {
		  String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		  System.out.println("Current method name : "+CurrentMethod);
		  util.Pass(util.getDriver(), CurrentMethod+" is use Successfully");
		  /*util.wait_for_Element(CurrentMethod,util.getDriver(), homepage.Home_Main_Burger_Menu(), 5);
		  boolean flag = util.isDisplayed(util.getDriver(), homepage.Home_Main_Burger_Menu());
		  if(flag) {
			  util.Click(CurrentMethod,util.getDriver(), homepage.Home_Main_Burger_Menu(), 5);
			  util.Pass(util.getDriver(), "Burger menu is clicked Successfully");
		  }else {
			
			  util.Fail(util.getDriver(), "Failed to click Burger menu");
		  }*/
	}
	@When("^user clicks on the burger menu$")
	public void user_clicks_on_the_burger_menu() throws Throwable {
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		  System.out.println("Current method name : "+CurrentMethod);
		  util.Pass(util.getDriver(), CurrentMethod+" is use Successfully");
	}
			
					 	
}
