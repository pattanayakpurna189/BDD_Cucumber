package MB.StepDefinations.Cards;


import MB.Page.CardsPage;
import MB.Page.HomePage;
import MB.Page.LoginPage;
import Reusable_Methods.Utility;
import cucumber.api.java.en.*;
import managers.DataManager;





public class MB_Cards {
	DataManager data = new DataManager();
	Utility util = new Utility();
	
	//PageObjects************************************************
	HomePage homepage = new HomePage();
	LoginPage login = new LoginPage();
	CardsPage cards = new CardsPage();
	
	
	@When("^user navigates to Cards Workspace$")
	public void user_navigates_to_Cards_Workspace() throws Throwable {
		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
		util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
		boolean flag = util.isDisplayed(util.getAppiumDriver(), cards.Workspace());
			 if(flag) {
				 util.Click(CurrentMethod, util.getAppiumDriver(), cards.Workspace(), 8);
				 util.Pass(util.getAppiumDriver(), "Cards workspace is clicked from Homepage");
				 
				 
			 }else {
				 util.Fail(util.getAppiumDriver(), "Failed to click Cards workspace");
				 
			 }
			
	    System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view Static label AN(\\d+) as Cards$")
	public void user_can_view_Static_label_AN_as_Cards(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), cards.Cards_Heading(), 8);
		boolean flag = util.isDisplayed(util.getAppiumDriver(), cards.Cards_Heading());
			 if(flag) {
				
				 util.Pass(util.getAppiumDriver(), "Cards Heading is displayed");
				 
				 
			 }else {
				 util.Fail(util.getAppiumDriver(), "Cards Heading is not displayed");
			
			 }
	    System.out.println("Current method name : "+CurrentMethod);
	}
	
	
}
		
		
	
	
		

	
	
	
	
	
	
	
	
	
