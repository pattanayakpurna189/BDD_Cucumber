package MB.StepDefinations.Accounts;

import java.util.List;
import java.util.Scanner;
import MB.Page.Accountspage;
import MB.Page.HomePage;
import MB.Page.LoginPage;
import Reusable_Methods.Utility;
import cucumber.api.java.en.*;
import io.appium.java_client.MobileElement;
import managers.DataManager;
import managers.DriverManager;

public class MB_Account {
	
	DataManager data = new DataManager();
	Utility util = new Utility();
	DriverManager driver =new DriverManager();
	
	//PageObjects************************************************
	HomePage homepage = new HomePage();
	LoginPage login = new LoginPage();
	Accountspage accntpage = new Accountspage();
	
	
	//*******************************************************************************************************************************************************************
	
	
	@When("^user navigates to Accounts Workspace$")
	public void user_navigates_to_Accounts_Workspace() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), homepage.Workspace("Accounts"), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(),  homepage.Workspace("Accounts"));
		    if(flag) {
		    	 util.Click(CurrentMethod,util.getAppiumDriver(), homepage.Workspace("Accounts"),5);
		    	 util.Pass(util.getAppiumDriver(), "Accounts workspace is clicked");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Failed to click on Accounts workspace");
		    }
	}
	
	@Then("^user can view Static label as Accounts$")
	public void user_can_view_Static_label_as_Accounts() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), accntpage.Accounts_Heading(), 8);
			boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Accounts_Heading());
				 if(flag) {
					
					 util.Pass(util.getAppiumDriver(), "Accounts Heading is displayed");
					 
					 
				 }else {
					 util.Fail(util.getAppiumDriver(), "Accounts Heading is not displayed");
				
				 }
	}
	
	@Then("^user can view the Accounts summary for the accounts that the user holds in a carousel$")
	public void user_can_view_the_Accounts_summary_for_the_accounts_that_the_user_holds_in_a_carousel() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
	    
	    util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 10);
		boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Summary_Carousel());
			 if(flag) {
				 util.Pass(util.getAppiumDriver(), "Accounts Summary Carousel is displayed");			 
			 }else {
				 util.Fail(util.getAppiumDriver(), "Accounts Summary Carousel is not displayed");
			
			 }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view Account Type \\(AN\\((\\d+)\\)\\) as Minor Sheik Salary Account \\(ED\\)$")
	public void can_view_Account_Type_AN_as_Minor_Sheik_Salary_Account_ED(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
//	    util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
	    boolean flag = false;
	    
	    Thread.sleep(4000);
	    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Carousel_Dots());
	      
	    if(flag) {
	    
	    List<MobileElement> all_accounts = util.getAll_Element(util.getAppiumDriver(), accntpage.Carousel_Dots());
	    
	    int size = all_accounts.size();
	    System.out.println("List size is" + size);
	    int itr = 0;
	    for (MobileElement ele : all_accounts) {
	    	itr = itr + 1;
	    		
	    	System.out.println("Element going to be clicked");
			ele.click();
			
			util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 8);
	    	String type = "CURRENT ACCOUNT";
	    	
	    	System.out.println(itr);
	    	String ac_type = util.getText(util.getAppiumDriver(), accntpage.Account_Type(itr));
	    	System.out.println(ac_type);
		
	    	if(ac_type.contains(type)){
				flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Type(itr));
				if(flag) {
					util.Pass(util.getAppiumDriver(), "Account Type is displayed");
				}else {
					util.Fail(util.getAppiumDriver(), "Account Type is not displayed");
				}
				break;
	    	}
	    }
	    }
	    else {
	    	util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 8);
            String type = "CURRENT ACCOUNT";
            String account_type = util.getText(util.getAppiumDriver(), accntpage.Account_Type(1));
            System.out.println(account_type);
            if(account_type.contains(type)){
                flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Type(1));
                if(flag) {
                    util.Pass(util.getAppiumDriver(), "Account Type is displayed");
                }else {
                    util.Fail(util.getAppiumDriver(), "Account Type is not displayed");
                }
            }
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	     
	}
	
	@Then("^can view Account Status \\(A\\((\\d+)\\)\\) as Active, Inactive, Dormant, Blocked$")
	public void can_view_Account_Status_A_as_Active_Inactive_Dormant_Blocked(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Status(data.getData().get("Account_Type"), data.getData().get("Status")), 8);
		boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Status(data.getData().get("Account_Type"), data.getData().get("Status")));
		if(flag) {
			util.Pass(util.getAppiumDriver(), "Account Status is displayed");
		}else {
			util.Fail(util.getAppiumDriver(), "Account Status is not displayed");
		}
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view (\\d+) digit Account Number \\(N\\((\\d+)\\)\\)$")
	public void can_view_digit_Account_Number_N(int arg1, int arg2) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Number(data.getData().get("Account_Type")), 8);
		boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Number(data.getData().get("Account_Type")));
		if(flag) {
			util.Pass(util.getAppiumDriver(), "Account Number is displayed");
		}else {
			util.Fail(util.getAppiumDriver(), "Account Number is not displayed");
		}
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view Account Holder Name \\(AN\\((\\d+)\\)\\)$")
	public void can_view_Account_Holder_Name_AN(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Holder_Name(data.getData().get("Account_Type")), 8);
		boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Holder_Name(data.getData().get("Account_Type")));
		if(flag) {
			util.Pass(util.getAppiumDriver(), "Account Holder Name is displayed");
		}else {
			util.Fail(util.getAppiumDriver(), "Account Holder Name is not displayed");
		}
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view Available Balance label and Available Balance \\(A\\((\\d+)\\), N\\((\\d+),(\\d+)\\)\\) amount in their respective currency$")
	public void can_view_Available_Balance_label_and_Available_Balance_A_N_amount_in_their_respective_currency(int arg1, int arg2, int arg3) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Available_Balance(data.getData().get("Account_Type")), 8);
		boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Available_Balance(data.getData().get("Account_Type")));
		if(flag) {
			util.Pass(util.getAppiumDriver(), "Available Balance is displayed");
		}else {
			util.Fail(util.getAppiumDriver(), "Available Balance is not displayed");
		}
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	
	
	@When("^user selects the Children Saving Accts \\(EE\\) from the caurosel$")
	public void user_selects_the_Children_Saving_Accts_EE_from_the_caurosel() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 10);
	    
	    util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
	    
	    boolean flag = false;
	    
	    Thread.sleep(4000);
	    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Carousel_Dots());
	      
	    if(flag) {
	    
	    List<MobileElement> all_accounts = util.getAll_Element(util.getAppiumDriver(), accntpage.Carousel_Dots());
	    
	    int size = all_accounts.size();
	    System.out.println("List size is" + size);
	    int itr = 0;
	    for (MobileElement ele : all_accounts) {
	    	itr = itr + 1;
	    		
	    	System.out.println("Element going to be clicked");
			ele.click();
			
			util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 8);
	    	String type = "JUNIOR SAVINGS ACCOUNT";
	    	
	    	System.out.println(itr);
	    	String ac_type = util.getText(util.getAppiumDriver(), accntpage.Account_Type(itr));
	    	System.out.println(ac_type);
		
	    	if(ac_type.contains(type)) {
	    		
	    		flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Type(itr));
				if(flag) {
					util.Pass(util.getAppiumDriver(), "Account Type is selected");
				}else {
					util.Fail(util.getAppiumDriver(), "Account Type is not selected");
				}
				break;
	    	}
	    }
	    }
	    else {
	          
	           util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 8);
	            String type = "JUNIOR SAVINGS ACCOUNT";
	            String ac_type = util.getText(util.getAppiumDriver(), accntpage.Account_Type(1));
	            System.out.println(ac_type);
	            if(ac_type.contains(type)){
	                flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Type(1));
	                if(flag) {
	                    util.Pass(util.getAppiumDriver(), "Account Type is displayed");
	                }else {
	                    util.Fail(util.getAppiumDriver(), "Account Type is not displayed");
	                }
	            }
	       }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks on Show More$")
	public void user_clicks_on_Show_More() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.Show_More_btn(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Show_More_btn());
		    if(flag) {
		    	 util.Click(CurrentMethod,util.getAppiumDriver(), accntpage.Show_More_btn(),5);
		    	 util.Pass(util.getAppiumDriver(), "Clicked on the Show More button");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Failed to click on Show More button");
		    }
		    System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views IBAN Number \\(AN \\((\\d+)\\)\\)$")
	public void views_IBAN_Number_AN(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_IBAN_Num(), 10);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_IBAN_Num());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "IBAN Number is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "IBAN Number is not displayed");
		    }
		    System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views the Account Branch Name \\(AN\\+ \\((\\d+)\\)\\)$")
	public void views_the_Account_Branch_Name_AN(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_Account_Branch_Name(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_Account_Branch_Name());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Account Branch Name is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Account Branch Name is not displayed");
		    }
	}
	
	@When("^views QAR Equivalent \\(A\\((\\d+)\\), N\\((\\d+),(\\d+)\\)\\)$")
	public void views_QAR_Equivalent_A_N(int arg1, int arg2, int arg3) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_QAR_EQUI(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_QAR_EQUI());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "QAR Equivalent is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "QAR Equivalent is not displayed");
		    }
	}
	
	@When("^views Overdraft Limit \\(A\\((\\d+)\\), N\\((\\d+),(\\d+)\\)\\)$")
	public void views_Overdraft_Limit_A_N(int arg1, int arg2, int arg3) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_Overdraft_Limit(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_Overdraft_Limit());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Overdraft Limit is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Overdraft Limit is not displayed");
		    }
	}
	
	@When("^views Cheques in Clearing \\(N\\((\\d+)\\)\\)$")
	public void views_Cheques_in_Clearing_N(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_Amount_Clearing(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_Amount_Clearing());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Amount in Clearing is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Amount in Clearing is not displayed");
		    }
	}
	
	@When("^views Hold Amount label with drill down v symbol$")
	public void views_Hold_Amount_label_with_drill_down_v_symbol() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_Hold_Amount(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_Hold_Amount());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Hold amount slable is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Hold amount lable is not displayed");
		    }
	}
	
	@When("^clicks Show Less$")
	public void clicks_Show_Less() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.Show_Less_Btn(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Show_Less_Btn());
		    if(flag) {
		    	 util.Click(CurrentMethod,util.getAppiumDriver(), accntpage.Show_Less_Btn(),5);
		    	 util.Pass(util.getAppiumDriver(), "Clicked on the Show Less button");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Failed to click on Show Less button");
		    }
	}
	
	@Then("^the details will be hidden and Show More link will be displayed$")
	public void the_details_will_be_hidden_and_Show_More_link_will_be_displayed() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.Show_More_btn(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Show_More_btn());
		    if(flag) {
//		    	 util.Click(CurrentMethod,util.getAppiumDriver(), accntpage.AD_Show_Less_Btn(),2);
		    	 util.Pass(util.getAppiumDriver(), "Show More button is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Show More button is not displayed");
		    }
	}
	
	@When("^user navigates to Accounts Workspace and chooses a foreign currecy account from carousel$")
	public void user_navigates_to_Accounts_Workspace_and_chooses_a_foreign_currecy_account_from_carousel() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), homepage.Workspace("Accounts"), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(),  homepage.Workspace("Accounts"));
		    if(flag) {
		    	 util.Click(CurrentMethod,util.getAppiumDriver(), homepage.Workspace("Accounts"),5);
		    	 util.Pass(util.getAppiumDriver(), "Accounts workspace is clicked");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Failed to click on Accounts workspace");
		    }
		    
		    util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 10);
		    
		    util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
		    
		    flag = false;
		    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Carousel_Dots());
		      
		    if(flag) {
		    
		    List<MobileElement> all_accounts = util.getAll_Element(util.getAppiumDriver(), accntpage.Carousel_Dots());
		    
		    int size = all_accounts.size();
		    System.out.println("List size is" + size);
		    int itr = 0;
		    for (MobileElement ele : all_accounts) {
		    	itr = itr + 1;
		    		
		    	System.out.println("Element going to be clicked");
				ele.click();
				
				util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 8);
		    	String type = "CURRENT ACCOUNT";
		    	
		    	System.out.println(itr);
		    	String ac_type = util.getText(util.getAppiumDriver(), accntpage.Account_Type(itr));
		    	System.out.println(ac_type);
			
		    	if(ac_type.contains(type)) {
		    		
		    		flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Type(itr));
					if(flag) {
						util.Pass(util.getAppiumDriver(), "Account Type is selected");
					}else {
						util.Fail(util.getAppiumDriver(), "Account Type is not selected");
					}
					break;
		    	}
		    }
		    }
		    else {
		          
		           util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 8);
		            String type = "CURRENT ACCOUNT";
		            String ac_type = util.getText(util.getAppiumDriver(), accntpage.Account_Type(1));
		            System.out.println(ac_type);
		            if(ac_type.contains(type)){
//		                System.out.println("Element going to be clicked");
//		                ele.click();           
		                flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Type(1));
		                if(flag) {
		                    util.Pass(util.getAppiumDriver(), "Account Type is displayed");
		                }else {
		                    util.Fail(util.getAppiumDriver(), "Account Type is not displayed");
		                }
		            }
		       }
		    
	}
	
	@When("^clicks on Show More$")
	public void clicks_on_Show_More() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.Show_More_btn(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Show_More_btn());
		    if(flag) {
		    	 util.Click(CurrentMethod,util.getAppiumDriver(), accntpage.Show_More_btn(),5);
		    	 util.Pass(util.getAppiumDriver(), "Clicked on the Show More button");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Failed to click on Show More button");
		    }
	}
	
	@When("^views the IBAN Number$")
	public void views_the_IBAN_Number() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_IBAN_Num(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_IBAN_Num());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "IBAN Number is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "IBAN Number is not displayed");
		    }
	}
	
	@When("^views equivalent QAR amount for the foreign currency in QAR Equivalent$")
	public void views_equivalent_QAR_amount_for_the_foreign_currency_in_QAR_Equivalent() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_QAR_EQUI(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_QAR_EQUI());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "QAR Equivalent amount for foreign currency is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "QAR Equivalent amount for foreign currency is not displayed");
		    }
	}
	
	@When("^views Overdraft Limit$")
	public void views_Overdraft_Limit() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_Overdraft_Limit(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_Overdraft_Limit());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Overdraft Limit is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Overdraft Limit is not displayed");
		    }
	}
	
	@When("^views Cheques in Clearing$")
	public void views_Cheques_in_Clearing() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_Amount_Clearing(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_Amount_Clearing());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Amount in Clearing is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Amount in Clearing is not displayed");
		    }
	}
	
	@When("^views Hold Amount with drill down v symbol$")
	public void views_Hold_Amount_with_drill_down_v_symbol() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AD_Hold_Amount(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AD_Hold_Amount());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Hold amount slable is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Hold amount lable is not displayed");
		    }
	}
	
	@When("^views last (\\d+) transactions for past (\\d+) months by default$")
	public void views_last_transactions_for_past_months_by_default(int arg1, int arg2) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
	    	     
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Transaction_Field(), 20);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Transaction_Field());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Last Five Transaction is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Last Five Transaction is not displayed");
		    }
		    System.out.println("Current method name : "+CurrentMethod);   
	}
	
	@When("^views date of the Transaction$")
	public void views_date_of_the_Transaction() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Date(), 20);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Date());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Date of transaction is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Date of transaction is not displayed");
		    }
			    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Month(), 20);
			     boolean flag1 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Month());
				    if(flag1) {
				    	 util.Pass(util.getAppiumDriver(), "Month of transaction is displayed");
				    }
				    else {
				    	util.Fail(util.getAppiumDriver(), "Month of transaction is not displayed");
				    }
			    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Year(), 20);
			     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Year());
				    if(flag2) {
				    	 util.Pass(util.getAppiumDriver(), "Year of transaction is displayed");
				    }
				    else {
				    	util.Fail(util.getAppiumDriver(), "Year of transaction is not displayed");
				    }
	}
	
	@When("^views Description of the Transaction \\(AN\\((\\d+)\\)\\)$")
	public void views_Description_of_the_Transaction_AN(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Transaction_Description(), 20);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Transaction_Description());
		    if(flag2) {
		    	 util.Pass(util.getAppiumDriver(), "Transaction Description is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Transaction Description is not displayed");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views Debit/Credit amount with Cr\\(Credit\\) indicator and no indication for Debit amount$")
	public void views_Debit_Credit_amount_with_Cr_Credit_indicator_and_no_indication_for_Debit_amount() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Amount(), 20);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Amount());
		    if(flag2) {
		    	 util.Pass(util.getAppiumDriver(), "Transaction amount is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Transaction amount is not displayed");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views options\\(icons\\) to download as xls, pdf and share option$")
	public void views_options_icons_to_download_as_xls_pdf_and_share_option() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
//	    util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
	    
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_More_Icon(), 20);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_More_Icon());
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_More_Icon(), 8);
		    	util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Export_btn(), 8);
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Export_btn(), 8);
		    	util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_ExportToPDF(), 8);
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_ExportToPDF(), 8);
		    	util.Pass(util.getAppiumDriver(), "Option for download as pdf is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Option for download as pdf is not displayed");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views Load More button if there are more than (\\d+) transactions and clicks on it$")
	public void views_Load_More_button_if_there_are_more_than_transactions_and_clicks_on_it(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view more transactions in the statement$")
	public void user_can_view_more_transactions_in_the_statement() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks filter icon$")
	public void user_clicks_filter_icon() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     
	     util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
	     
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Filter_Icon(), 8);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Filter_Icon());
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Filter_Icon(), 8);
		    	 util.Pass(util.getAppiumDriver(), "Year of transaction is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Year of transaction is not displayed");
		    }
		    System.out.println("Current method name : "+CurrentMethod);
		     
	}
	
	@When("^user selects Past months from the Filter Transactions screen$")
	public void user_selects_Past_months_from_the_Filter_Transactions_screen() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_PastMonth_Radiobtn(), 8);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_PastMonth_Radiobtn());
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_PastMonth_Radiobtn(), 8);
		    	 util.Pass(util.getAppiumDriver(), "PastMonth Radio button is selected");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "PastMonth Radio button is not selected");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user selects month from the Select month drop down$")
	public void user_selects_month_from_the_Select_month_drop_down() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
//	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_PM_SelectMonth_Dropdown(), 8);
	     util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_PM_SelectMonth_Dropdown(), 8);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_PS_MonthSelection(data.getData().get("Past_Month")), 8);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_PS_MonthSelection(data.getData().get("Past_Month")));
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_PS_MonthSelection(data.getData().get("Past_Month")), 8);
		    	 util.Pass(util.getAppiumDriver(), "PastMonth from the dropdown is selected");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "PastMonth from the dropdown is not selected");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks Apply button$")
	public void user_clicks_Apply_button() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Filter_Search_btn(), 8);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Filter_Search_btn());
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Filter_Search_btn(), 8);
		    	 util.Pass(util.getAppiumDriver(), "Clicked on the apply button");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Not clicked on the apply button");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	     
	}
	
	@Then("^user can view the past months statement sorted by date in descending order$")
	public void user_can_view_the_past_months_statement_sorted_by_date_in_descending_order() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Transaction_Field(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Transaction_Field());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Past Selected Month Transaction is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Past Selected Month Transaction is not displayed");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view date of the Transaction$")
	public void user_can_view_date_of_the_Transaction() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Date(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Date());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Date of transaction is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Date of transaction is not displayed");
		    }
			    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Month(), 8);
			     boolean flag1 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Month());
				    if(flag1) {
				    	 util.Pass(util.getAppiumDriver(), "Month of transaction is displayed");
				    }
				    else {
				    	util.Fail(util.getAppiumDriver(), "Month of transaction is not displayed");
				    }
			    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Year(), 8);
			     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Year());
				    if(flag2) {
				    	 util.Pass(util.getAppiumDriver(), "Year of transaction is displayed");
				    }
				    else {
				    	util.Fail(util.getAppiumDriver(), "Year of transaction is not displayed");
				    }
	     System.out.println("Current method name : "+CurrentMethod);
	     
	}
	
	@Then("^user can view Description of the Transaction$")
	public void user_can_view_Description_of_the_Transaction() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Transaction_Description(), 8);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Transaction_Description());
		    if(flag2) {
		    	 util.Pass(util.getAppiumDriver(), "Transaction Description is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Transaction Description is not displayed");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view Debit/Credit amount with Cr\\(Credit\\) indicator and no indication for Debit amount$")
	public void can_view_Debit_Credit_amount_with_Cr_Credit_indicator_and_no_indication_for_Debit_amount() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Amount(), 8);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Amount());
		    if(flag2) {
		    	 util.Pass(util.getAppiumDriver(), "Transaction amount is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Transaction amount is not displayed");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view options\\(icons\\) to download as pdf and share option$")
	public void user_can_view_options_icons_to_download_as_pdf_and_share_option() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_More_Icon(), 8);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_More_Icon());
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_More_Icon(), 8);
		    	util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Export_btn(), 8);
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Export_btn(), 8);
		    	util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_ExportToPDF(), 8);
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_ExportToPDF(), 8);
		    	util.Pass(util.getAppiumDriver(), "Option for download as pdf is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Option for download as pdf is not displayed");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks Filter icon$")
	public void user_clicks_Filter_icon() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());	    
	     
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Filter_Icon(), 8);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Filter_Icon());
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Filter_Icon(), 8);
		    	 util.Pass(util.getAppiumDriver(), "Clicked on the filter icon");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Not clicked on the filter icon");
		    }
		    System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user selects Date Range from the Filter Transactions screen$")
	public void user_selects_Date_Range_from_the_Filter_Transactions_screen() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_DateRange_Radiobtn(), 8);
	     boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_DateRange_Radiobtn());
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_DateRange_Radiobtn(), 8);
		    	 util.Pass(util.getAppiumDriver(), "Date Range Radio button is selected");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Date Range Radio button is not selected");
		    }
	}
	
	@When("^user select To which is equal to From date from the date picker$")
	public void user_select_To_which_is_equal_to_From_date_from_the_date_picker() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    // from
	    boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Date_Picker_From());
        if(flag) {
            util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Date_Picker_From(), 10);
             util.switchAppiumContext("NATIVE", util.getAppiumDriver());
            Thread.sleep(2000);
          
          
            String[] Date_From_Sheet = data.getData().get("From_Date").split("-");
            String DDay = Date_From_Sheet[0];
            int Day = Integer.parseInt(DDay);
            System.out.println("Day is : "+Day);
            String MMonth = Date_From_Sheet[1];
            int Month = Integer.parseInt(MMonth);
            System.out.println("Month is : "+Month);
            String Year = Date_From_Sheet[2];
          
            for(int itr = 0;itr<=3;itr++) {
               // Thread.sleep(1000);
                util.Scroll_With_Coordinates(util.getAppiumDriver(), data.getData_Env().get("Device_Type"), 350, 1180, 350, 1900);
            }
            for(int itr = 0;itr<=7;itr++) {
                //Thread.sleep(1000);
                util.Scroll_With_Coordinates(util.getAppiumDriver(), data.getData_Env().get("Device_Type"), 550, 1180, 550, 1900);
            }
          
            //Thread.sleep(1000);
            if(Month==1) {
                util.Info(util.getAppiumDriver(), "Already Janualry Selected...");
            }else {
                for(int itr = 1;itr<Month;itr++) {
                    util.Scroll_With_Coordinates(util.getAppiumDriver(), data.getData_Env().get("Device_Type"), 350, 1180, 350, 1040);
                }
                util.Info(util.getAppiumDriver(), "Month selected....");
            }
          
            if(Day==1) {
                util.Info(util.getAppiumDriver(), "Already 1st day is Selected...");
            }else {
                for(int itr = 1;itr<Day;itr++) {
                    util.Scroll_With_Coordinates(util.getAppiumDriver(), data.getData_Env().get("Device_Type"), 550, 1180, 550, 1040);
                }
                util.Info(util.getAppiumDriver(), "Day selected....");
            }
          
          
            String Current_Year = util.getText(util.getAppiumDriver(),accntpage.AS_Selected_Year());
          
            if(Current_Year!=null) {
                if(!Current_Year.trim().isEmpty()) {
                    if(Current_Year.trim().contains(Year)) {
                        util.Info(util.getAppiumDriver(), "Aleady Year is selected...");
                    }else {
                        util.Scroll_With_Coordinates(util.getAppiumDriver(), data.getData_Env().get("Device_Type"), 760, 1180, 760, 1310);
                    }
                }else {
                    util.Info(util.getAppiumDriver(), "Unable to fetch current year");
                }
            }else {
                util.Info(util.getAppiumDriver(), "Unable to fetch current year");
            }
            Thread.sleep(1000);
             util.Pass(util.getAppiumDriver(), "From datepicker is selected by Purna");   
            // throw new Exception();
             util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
             util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Date_Set(), 10);
            
    }
        else {
            util.Fail(util.getAppiumDriver(), "From datepicker is not clicked");
        }
        

     // To
	    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Date_Picker_To());
        if(flag) {
            util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Date_Picker_To(), 10);
             util.switchAppiumContext("NATIVE", util.getAppiumDriver());
            Thread.sleep(2000);
          
          
            String[] Date_To_Sheet = data.getData().get("To_Date").split("-");
            String DDay = Date_To_Sheet[0];
            int Day = Integer.parseInt(DDay);
            System.out.println("Day is : "+Day);
            String MMonth = Date_To_Sheet[1];
            int Month = Integer.parseInt(MMonth);
            System.out.println("Month is : "+Month);
            String Year = Date_To_Sheet[2];
          
          
          
          
          
            for(int itr = 0;itr<=3;itr++) {
               // Thread.sleep(1000);
                util.Scroll_With_Coordinates(util.getAppiumDriver(), data.getData_Env().get("Device_Type"), 350, 1180, 350, 1900);
            }
            for(int itr = 0;itr<=7;itr++) {
                //Thread.sleep(1000);
                util.Scroll_With_Coordinates(util.getAppiumDriver(), data.getData_Env().get("Device_Type"), 550, 1180, 550, 1900);
            }
          
            //Thread.sleep(1000);
            if(Month==1) {
                util.Info(util.getAppiumDriver(), "Already Janualry Selected...");
            }else {
                for(int itr = 1;itr<Month;itr++) {
                    util.Scroll_With_Coordinates(util.getAppiumDriver(), data.getData_Env().get("Device_Type"), 350, 1180, 350, 1040);
                }
                util.Info(util.getAppiumDriver(), "Month selected....");
            }
          
            if(Day==1) {
                util.Info(util.getAppiumDriver(), "Already 1st day is Selected...");
            }else {
                for(int itr = 1;itr<Day;itr++) {
                    util.Scroll_With_Coordinates(util.getAppiumDriver(), data.getData_Env().get("Device_Type"), 550, 1180, 550, 1040);
                }
                util.Info(util.getAppiumDriver(), "Day selected....");
            }
          
          
            String Current_Year = util.getText(util.getAppiumDriver(),accntpage.AS_Selected_Year());
          
            if(Current_Year!=null) {
                if(!Current_Year.trim().isEmpty()) {
                    if(Current_Year.trim().contains(Year)) {
                        util.Info(util.getAppiumDriver(), "Aleady Year is selected...");
                    }else {
                        util.Scroll_With_Coordinates(util.getAppiumDriver(), data.getData_Env().get("Device_Type"), 760, 1180, 760, 1310);
                    }
                }else {
                    util.Info(util.getAppiumDriver(), "Unable to fetch current year");
                }
            }else {
                util.Info(util.getAppiumDriver(), "Unable to fetch current year");
            }
            Thread.sleep(1000);
             util.Pass(util.getAppiumDriver(), "To datepicker is selected by Purna");   
            // throw new Exception();
             util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
             util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Date_Set(), 10);
            
    }
        else {
            util.Fail(util.getAppiumDriver(), "To datepicker is not clicked");
        }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view selected period statement sorted by date in descending order$")
	public void user_can_view_selected_period_statement_sorted_by_date_in_descending_order() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_Transaction_Field(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_Transaction_Field());
		    if(flag) {
		    	 util.Pass(util.getAppiumDriver(), "Date Range Transaction is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Date Range Transaction is not displayed");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks on the Download option\\(icon\\) PDF$")
	public void user_clicks_on_the_Download_option_icon_PDF() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_More_Icon(), 8);
	    util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_More_Icon(), 8);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Export_btn(), 8);
	    util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Export_btn(), 8);
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.AS_ExportToPDF(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_ExportToPDF());
		    if(flag) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_ExportToPDF(), 8);
		    	 util.Pass(util.getAppiumDriver(), "Clicked on the Download Option");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Not clicked on the Download Option");
		    }
		 util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Allow_Message(), 8);   
		 util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Allow_Btn(), 8);
		 util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_Allow_Btn(), 8);
	     System.out.println("Current method name : "+CurrentMethod);
	     
	}
	
	@Then("^user can view the statement being downloaded in pdf$")
	public void user_can_view_the_statement_being_downloaded_in_pdf() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_FileDownloaded_Heading(),8);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AS_FD_Cancel_Btn(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.AS_FD_Cancel_Btn());
		    if(flag) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.AS_FD_Cancel_Btn(), 8);
		    	 util.Pass(util.getAppiumDriver(), "Clicked on the Cancel Option");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Not clicked on the Cancel Option");
		    }
	}
	
	@When("^user navigates to Accounts workspace$")
	public void user_navigates_to_Accounts_workspace() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), homepage.Workspace("Accounts"), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(),  homepage.Workspace("Accounts"));
		    if(flag) {
		    	 util.Click(CurrentMethod,util.getAppiumDriver(), homepage.Workspace("Accounts"),5);
		    	 util.Pass(util.getAppiumDriver(), "Accounts workspace is clicked");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Failed to click on Accounts workspace");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks More and selects Register for E-statements function from the contextual menu$")
	public void user_clicks_More_and_selects_Register_for_E_statements_function_from_the_contextual_menu() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Contextual_menu_Button(), 8);
	    util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Contextual_menu_Button(), 8);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.E_Statement_ContextualMenu(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.E_Statement_ContextualMenu());
	    if(flag) {
	    	 util.Click(CurrentMethod,util.getAppiumDriver(), accntpage.E_Statement_ContextualMenu(),5);
	    	 util.Pass(util.getAppiumDriver(), "Register for e-statement is selected");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to select the register for e-statement");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.E_Statement_Heading(), 8);
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user views registered email id \\(AN\\+ \\((\\d+)\\)\\), Enrollment Status as Not Subscribed$")
	public void user_views_registered_email_id_AN_Enrollment_Status_as_Not_Subscribed(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.ES_Email_Field(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.ES_Email_Field());
	    if(flag) {
	    	 util.Pass(util.getAppiumDriver(), "Email ID is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Email ID is not displayed");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.ES_Status(data.getData().get("Status")), 8);
	    flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.ES_Status(data.getData().get("Status")));
	    if(flag) {
	    	 util.Pass(util.getAppiumDriver(), "Not Subscribed status is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Not Subscribed status is not displayed");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user enables the Subscription check box  as I agree to receive E-statement for all my accounts cards in the above mentioned Email address$")
	public void user_enables_the_Subscription_check_box_as_I_agree_to_receive_E_statement_for_all_my_accounts_cards_in_the_above_mentioned_Email_address() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.ES_Checkbox(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.ES_Checkbox());
	    if(flag) {
	    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.ES_Checkbox(), 8);
	    	 util.Pass(util.getAppiumDriver(), "Enabled the check box");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to enable the checkbox");
	    }
	    System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks on next button$")
	public void user_clicks_on_next_button() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Next_Button(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Next_Button());
	    if(flag) {
	    	 util.Pass(util.getAppiumDriver(), "Clicked on the next button");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to click on the next button");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user reviews email id \\(AN\\+ \\((\\d+)\\)\\) and enrollment status and Subscription$")
	public void user_reviews_email_id_AN_and_enrollment_status_and_Subscription(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user views the static label \\(AN \\((\\d+)\\)\\) as Please enter your One Time Password\\(OTP\\)$")
	public void user_views_the_static_label_AN_as_Please_enter_your_One_Time_Password_OTP(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@SuppressWarnings("resource")
	@When("^user enters the otp$")
	public void user_enters_the_otp() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), accntpage.OTP_Static_Lable(), 10);
		 boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.OTP_Static_Lable());
		 if(flag) {						 
		 util.Pass(util.getAppiumDriver(), "Successfully OTP Screen is Displayed");				    	
		    System.out.println("Enter the OTP");
  		Scanner s = new Scanner(System.in);
  		String otp = s.next();
	    	System.out.println("Your OTP is " + otp);
	    	int i = 0;
	    	for (int itr = 1; itr <= 6; itr ++) {					    								    							    	
		    	char otp_char = otp.charAt(i);
		    	String otp_field = Character.toString(otp_char);						  
		    	Thread.sleep(2000);
	    		util.Sendkeys_Clear(CurrentMethod, util.getAppiumDriver(), accntpage.OTP_Field(itr), otp_field, 10);					
	    		//System.out.println("otp" + i + " digit is" + otp_char);
	    		i++;
	    		Thread.sleep(2000);
	    	}
		 }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks on submit$")
	public void user_clicks_on_submit() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can views tick symbol$")
	public void user_can_views_tick_symbol() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user views the success message \\(AN\\+ \\((\\d+)\\)\\) as Your request has been successfully submitted$")
	public void user_views_the_success_message_AN_as_Your_request_has_been_successfully_submitted(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view Reference Number \\(AN\\+ \\((\\d+)\\)\\), Date and time \\(DT\\) should reflect in Misys equation$")
	public void user_can_view_Reference_Number_AN_Date_and_time_DT_should_reflect_in_Misys_equation(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view Go to Home Page button$")
	public void user_can_view_Go_to_Home_Page_button() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user enters email id in the Email id field$")
	public void user_enters_email_id_in_the_Email_id_field() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.ES_Email_Field(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.ES_Email_Field());
	    if(flag) {
	    	util.Sendkeys(CurrentMethod, util.getAppiumDriver(), accntpage.ES_Email_Field(), data.getData().get("Email_ID"), 8);
	    	 util.Pass(util.getAppiumDriver(), "Entered the email id");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to enter the email id");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user views Enrollment Status as Not Subscribed$")
	public void user_views_Enrollment_Status_as_Not_Subscribed() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
//	    util.Scroll_With_Coordinates(util.getAppiumDriver(), DeviceType, startx, starty, endx, endy);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.ES_Status(data.getData().get("Status")), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.ES_Status(data.getData().get("Status")));
	    if(flag) {
	    	 util.Pass(util.getAppiumDriver(), "Not Subscribed status is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Not Subscribed status is not displayed");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	
	@When("^user views the static label as Please enter your One Time Password\\(OTP\\)$")
	public void user_views_the_static_label_as_Please_enter_your_One_Time_Password_OTP() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.OTP_Static_Lable(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.OTP_Static_Lable());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Otp static lable is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Otp static lable");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
		
	}
	
//	@When("^user enters the otp \\(N\\((\\d+)\\)\\)$")
//	public void user_enters_the_otp_N(int arg1) throws Throwable {
//		String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName(); 
//		util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), accntpage.OTP_Static_Lable(), 10);
//		 boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.OTP_Static_Lable());
//		 if(flag) {						 
//		 util.Pass(util.getAppiumDriver(), "Successfully Login OTP Screen is Displayed");				    	
//		    System.out.println("Enter the OTP");
//   		Scanner s = new Scanner(System.in);
//   		String otp = s.next();
//	    	System.out.println("Your OTP is " + otp);
//	    	int i = 0;
//	    	for (int itr = 1; itr <= 6; itr ++) {					    								    							    	
//		    	char otp_char = otp.charAt(i);
//		    	String otp_field = Character.toString(otp_char);						  
//		    	Thread.sleep(2000);
//	    		util.Sendkeys_Clear(CurrentMethod, util.getAppiumDriver(), accntpage.OTP_Field(itr), otp_field, 10);					
//	    		//System.out.println("otp" + i + " digit is" + otp_char);
//	    		i++;
//	    		Thread.sleep(2000);
//	    	}
//		 }
//		System.out.println("CurrentMethod : "+CurrentMethod);
//				
//	}
	
	
	@When("^user selects the \\(Current Account \\(CA\\)\\) Account number from the drop down and views the available balance$")
	public void user_selects_the_Current_Account_CA_Account_number_from_the_drop_down_and_views_the_available_balance() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.IBAN_Balance_Account_Number(), 8);
	    util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.IBAN_Balance_Account_Number(), 8);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.IBAN_Balance_Account_Number_Select(data.getData().get("AccountNumber")), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.IBAN_Balance_Account_Number_Select(data.getData().get("AccountNumber")));
	    if(flag) {
	    	 util.Click(CurrentMethod,util.getAppiumDriver(), accntpage.IBAN_Balance_Account_Number_Select(data.getData().get("AccountNumber")),5);
	    	 util.Pass(util.getAppiumDriver(), "Account number is selected");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to select the Account Number");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.IBAN_Balance_Available_Balance(), 8);
	    flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.IBAN_Balance_Available_Balance());
	    if(flag) {
//	    	 util.Click(CurrentMethod,util.getAppiumDriver(), accntpage.IBAN_Available_Balance(),5);
	    	 util.Pass(util.getAppiumDriver(), "Available Balance is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Available Balance is not displayed");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user views the success message as Your request has been successfully submitted$")
	public void user_views_the_success_message_as_Your_request_has_been_successfully_submitted() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view Reference Number, Date and time should reflect in Misys equation$")
	public void user_can_view_Reference_Number_Date_and_time_should_reflect_in_Misys_equation() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user selects the active Current Account \\(CA\\) number which is in QAR currency$")
	public void user_selects_the_active_Current_Account_CA_number_which_is_in_QAR_currency() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
//	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Carousel_Dots("2"), 8);
//	     util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Carousel_Dots("2"), 8);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 8);
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks on more icon$")
	public void user_clicks_on_more_icon() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Contextual_menu_Button(), 8);
	    boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.Contextual_menu_Button());
	    if(flag2) {
	    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Contextual_menu_Button(), 8);
	    	 util.Pass(util.getAppiumDriver(), "Clicked on the contextual menu");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Not Clicked on the contextual menu");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user selects the Cheque Book Request contextual Menu$")
	public void user_selects_the_Cheque_Book_Request_contextual_Menu() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Cheque_Book_Request_Menu(), 8);
	    boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.Cheque_Book_Request_Menu());
	    if(flag2) {
	    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Cheque_Book_Request_Menu(), 8);
	    	 util.Pass(util.getAppiumDriver(), "Cheque book request menu is selected");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Cheque book request menu is not selected");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Cheque_Book_Request_Heading(), 8);
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user selects the number of cheque book \\(N\\((\\d+)\\)\\) \\((\\d+) or (\\d+)\\)$")
	public void user_selects_the_number_of_cheque_book_N_or(int arg1, int arg2, int arg3) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook(), 8);
	     util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook(), 8);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook_Selection(data.getData().get("Number_Of_ChequeBook")), 8);
		    boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook_Selection(data.getData().get("Number_Of_ChequeBook")));
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook_Selection(data.getData().get("Number_Of_ChequeBook")), 8);
		    	 util.Pass(util.getAppiumDriver(), "Number of cheque book is selected");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Number of cheque book is not selected");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^number of leaves for the cheque book$")
	public void number_of_leaves_for_the_cheque_book() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfLeaves(), 8);
	     util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfLeaves(), 8);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfLeaves_Selection(data.getData().get("ChequeBook_Leaves")), 8);
		    boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_NumberOfLeaves_Selection(data.getData().get("ChequeBook_Leaves")));
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook_Selection(data.getData().get("ChequeBook_Leaves")), 8);
		    	 util.Pass(util.getAppiumDriver(), "Number of cheque book leaves is selected");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Number of cheque book leaves is not selected");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user views the delivery option as Branch and default home branch name$")
	public void user_views_the_delivery_option_as_Branch_and_default_home_branch_name() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_option(), 8);
	     util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_option(), 8);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_option_Selection(data.getData().get("Delivery_Option")), 8);
		    boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_Delivery_option_Selection(data.getData().get("Delivery_Option")));
		    if(flag2) {
//		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_option_Selection(data.getData().get("Delivery_Option")), 8);
		    	 util.Pass(util.getAppiumDriver(), "Delivery option is selected");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Delivery option is not selected");
		    }
		    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_Branch(), 8);
		     util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_Branch(), 8);
		     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_Branch_Selection(data.getData().get("Delivery_Branch")), 8);
			    boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_Delivery_Branch_Selection(data.getData().get("Delivery_Branch")));
			    if(flag) {
//			    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_Branch_Selection(data.getData().get("Delivery_Branch")), 8);
			    	 util.Pass(util.getAppiumDriver(), "Delivery Branch is selected");
			    }
			    else {
			    	util.Fail(util.getAppiumDriver(), "Delivery Branch is not selected");
			    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user enters the remarks \\(AN\\+ \\((\\d+)\\)\\)$")
	public void user_enters_the_remarks_AN(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Remarks(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_Remarks());
	    if(flag) {
	    	util.Sendkeys(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Remarks(),data.getData().get("Remarks"),8);
	    	util.Pass(util.getAppiumDriver(), "Remarks is entered");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Remarks is not entered");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user accepts the Acceptance of Charges I hereby authorise Ahlibank to enquire and review all the information related to my financial situation as obtained from Qatar Central Bank - Credit Bureau$")
	public void user_accepts_the_Acceptance_of_Charges_I_hereby_authorise_Ahlibank_to_enquire_and_review_all_the_information_related_to_my_financial_situation_as_obtained_from_Qatar_Central_Bank_Credit_Bureau() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_CheckBox(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_CheckBox());
	    if(flag) {
	    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_CheckBox(), 8);
	    	util.Pass(util.getAppiumDriver(), "Check box is enabled");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Check box is not enabled");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks on Next button$")
	public void user_clicks_on_Next_button() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Next_Button(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Next_Button());
	    if(flag) {
	    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Next_Button(), 8);
	    	util.Pass(util.getAppiumDriver(), "Clicked on the Next Button");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Not Clicked on the Next Button");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user reviews the details previously entered and views static label \\(AN \\((\\d+)\\)\\) as Please enter your One Time Password\\(OTP\\)$")
	public void user_reviews_the_details_previously_entered_and_views_static_label_AN_as_Please_enter_your_One_Time_Password_OTP(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_AccountNumber(), 8);
		    boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_AccountNumber());
		    if(flag) {
		    	util.Pass_WithOut_SS("Account number is displayed");
		    }
		    else {
		    	util.Fail_WithOut_SS("Account number is not displayed");
		    }
		    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_NumberOfChequeBook(), 8);
		    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_NumberOfChequeBook());
		    if(flag) {
		    	util.Pass_WithOut_SS("Number of cheque book is displayed");
		    }
		    else {
		    	util.Fail_WithOut_SS("Number of cheuque book is not displayed");
		    }
		    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_NumberOfLeaves(), 8);
		    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_NumberOfLeaves());
		    if(flag) {
		    	util.Pass_WithOut_SS("Number of Leaves is displayed");
		    }
		    else {
		    	util.Fail_WithOut_SS("Number of Leaves is not displayed");
		    }
		    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_DeliveryOption(), 8);
		    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_DeliveryOption());
		    if(flag) {
		    	util.Pass_WithOut_SS("Delivery option is displayed");
		    }
		    else {
		    	util.Fail_WithOut_SS("Delivery option is not displayed");
		    }
		    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_DeliveryBranch(), 8);
		    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_DeliveryBranch());
		    if(flag) {
		    	util.Pass_WithOut_SS("Delivery branch is displayed");
		    }
		    else {
		    	util.Fail_WithOut_SS("Deliveru branch is not displayed");
		    }
		    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_Remarks(), 8);
		    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_Remarks());
		    if(flag) {
		    	util.Pass_WithOut_SS("Remarks is displayed");
		    }
		    else {
		    	util.Fail_WithOut_SS("Remarks is not displayed");
		    }
		    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.OTP_Static_Lable(), 8);
		    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.OTP_Static_Lable());
		    if(flag) {
		    	util.Pass(util.getAppiumDriver(), "Otp static lable is displayed");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Otp static lable is not displayed");
		    }
		    System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user enters the otp in the otp field$")
	public void user_enters_the_otp_in_the_otp_field() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks on Submit$")
	public void user_clicks_on_Submit() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Submit_button(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Submit_button());
	    if(flag) {
	    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Submit_button(), 8);
	    	util.Pass(util.getAppiumDriver(), "Clicked on the submit button");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Not clicked on the submit button");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view the tick symbol  and the heading \\(AN\\+ \\((\\d+)\\)\\) as your request has been successfully submitted$")
	public void user_can_view_the_tick_symbol_and_the_heading_AN_as_your_request_has_been_successfully_submitted(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Confirmation_Tick_Symbol(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Confirmation_Tick_Symbol());
	    if(flag) {
	    	 util.Pass(util.getAppiumDriver(), "Success tick symbol is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Success tick symbol is not displayed");
	    }
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.IBAN_Balance_Confirmation_Success_msg(), 8);
	    flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.IBAN_Balance_Confirmation_Success_msg());
	    if(flag) {
	    	 util.Pass(util.getAppiumDriver(), "Success message is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Success message is not displayed");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view the Reference Number \\(AN\\+ \\((\\d+)\\)\\) and Date & Time \\(DT\\)$")
	public void user_can_view_the_Reference_Number_AN_and_Date_Time_DT(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view the Go to Home Page button$")
	public void user_can_view_the_Go_to_Home_Page_button() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user selects the active Current Account \\(CK\\) which is in QAR currency$")
	public void user_selects_the_active_Current_Account_CK_which_is_in_QAR_currency() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
//	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Carousel_Dots("2"), 8);
//	     util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Carousel_Dots("2"), 8);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 8);
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user selects the number of cheque book \\(N\\((\\d+)\\)\\) \\((\\d+) - (\\d+)\\)$")
	public void user_selects_the_number_of_cheque_book_N(int arg1, int arg2, int arg3) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook(), 8);
	     util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook(), 8);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook_Selection(data.getData().get("Number_Of_ChequeBook")), 8);
		    boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook_Selection(data.getData().get("Number_Of_ChequeBook")));
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_NumberOfChequeBook_Selection(data.getData().get("Number_Of_ChequeBook")), 8);
		    	 util.Pass(util.getAppiumDriver(), "Number of cheque book is selected");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Number of cheque book is not selected");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user views the delivery option as Branch$")
	public void user_views_the_delivery_option_as_Branch() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_option(), 8);
	     util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_option(), 8);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_option_Selection(data.getData().get("Delivery_Option")), 8);
		    boolean flag2 = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_Delivery_option_Selection(data.getData().get("Delivery_Option")));
		    if(flag2) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_option_Selection(data.getData().get("Delivery_Option")), 8);
		    	 util.Pass(util.getAppiumDriver(), "Delivery option is selected");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Delivery option is not selected");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user select the delivery branch from the drop down$")
	public void user_select_the_delivery_branch_from_the_drop_down() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_Branch(), 8);
	     util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_Branch(), 8);
	     util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_Branch_Selection(data.getData().get("Delivery_Branch")), 8);
		    boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_Delivery_Branch_Selection(data.getData().get("Delivery_Branch")));
		    if(flag) {
		    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Delivery_Branch_Selection(data.getData().get("Delivery_Branch")), 8);
		    	 util.Pass(util.getAppiumDriver(), "Delivery Branch is selected");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Delivery Branch is not selected");
		    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user enters the remarks$")
	public void user_enters_the_remarks() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Remarks(), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_Remarks());
	    if(flag) {
	    	util.Sendkeys(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_Remarks(),data.getData().get("Remarks"),8);
	    	util.Pass(util.getAppiumDriver(), "Remarks is entered");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Remarks is not entered");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user reviews the details previously entered and views the static label as Please enter your One Time Password\\(OTP\\)$")
	public void user_reviews_the_details_previously_entered_and_views_the_static_label_as_Please_enter_your_One_Time_Password_OTP() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_AccountNumber());
	    if(flag) {
	    	util.Pass_WithOut_SS("Account number is displayed");
	    }
	    else {
	    	util.Fail_WithOut_SS("Account number is not displayed");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_NumberOfChequeBook(), 8);
	    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_NumberOfChequeBook());
	    if(flag) {
	    	util.Pass_WithOut_SS("Number of cheque book is displayed");
	    }
	    else {
	    	util.Fail_WithOut_SS("Number of cheuque book is not displayed");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_NumberOfLeaves(), 8);
	    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_NumberOfLeaves());
	    if(flag) {
	    	util.Pass_WithOut_SS("Number of Leaves is displayed");
	    }
	    else {
	    	util.Fail_WithOut_SS("Number of Leaves is not displayed");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_DeliveryOption(), 8);
	    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_DeliveryOption());
	    if(flag) {
	    	util.Pass_WithOut_SS("Delivery option is displayed");
	    }
	    else {
	    	util.Fail_WithOut_SS("Delivery option is not displayed");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_DeliveryBranch(), 8);
	    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_DeliveryBranch());
	    if(flag) {
	    	util.Pass_WithOut_SS("Delivery branch is displayed");
	    }
	    else {
	    	util.Fail_WithOut_SS("Deliveru branch is not displayed");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.CBR_RD_Remarks(), 8);
	    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.CBR_RD_Remarks());
	    if(flag) {
	    	util.Pass_WithOut_SS("Remarks is displayed");
	    }
	    else {
	    	util.Fail_WithOut_SS("Remarks is not displayed");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.OTP_Static_Lable(), 8);
	    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.OTP_Static_Lable());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Otp static lable is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Otp static lable is not displayed");
	    }
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view the Go to Home Page$")
	public void user_can_view_the_Go_to_Home_Page() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user navigates to Al Rabeh Certificate Workspace$")
	public void user_navigates_to_Al_Rabeh_Certificate_Workspace() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.More_Icon(), 8);
	    util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.More_Icon(), 10);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Menu(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_Certificate_Menu());
	    if(flag) {
	    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Menu(), 5);
	    	util.Pass(util.getAppiumDriver(), "Al Rabeh Certificate Menu is clicked");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to click on the Al Rabeh Certificate Menu");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.More_Icon(), 8);
	    util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.More_Icon(), 10);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Heading(), 8);
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^user can view the label Al Rabeh Certificate  \\(A\\((\\d+)\\)\\) in the band$")
	public void user_can_view_the_label_Al_Rabeh_Certificate_A_in_the_band(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Heading(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_Certificate_Heading());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Al Rabeh Certificate heading is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Al Rabeh Certificate heading");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view Al Rabeh Certificate Summary of the certificates that the user holds in a carousel$")
	public void can_view_Al_Rabeh_Certificate_Summary_of_the_certificates_that_the_user_holds_in_a_carousel() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Summary(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_Certificate_Summary());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Al Rabeh Certificate is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Al Rabeh Certificate");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view Product Name as Al Rabeh Certificate \\(A\\((\\d+)\\)\\)$")
	public void can_view_Product_Name_as_Al_Rabeh_Certificate_A(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.AL_Rabeh_Certificate_Product_Name(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.AL_Rabeh_Certificate_Product_Name());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Product Name Al Rabeh Certificate is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Product Name Al Rabeh Certificate");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view Channel Type A\\((\\d+)\\) as Online or Branch$")
	public void can_view_Channel_Type_A_as_Online_or_Branch(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_ChannelType(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_Certificate_ChannelType());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Al Rabeh Certificate Channel type is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Al Rabeh Certificate Channel type");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view Application Certificate Number \\(N\\((\\d+)\\)\\)$")
	public void can_view_Application_Certificate_Number_N(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Number(1), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_Certificate_Number(1));
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Al Rabeh Certificate Number is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Al Rabeh Certificate Number");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view Customer Name \\(A\\((\\d+)\\)\\)$")
	public void can_view_Customer_Name_A(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_CustomerName(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_Certificate_CustomerName());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Al Rabeh Certificate Customer Name is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Al Rabeh Certificate Customer Name");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@Then("^can view label Certificate Value and the total amount of the certificate lot in QAR \\(A\\((\\d+)\\),N\\((\\d+)\\)\\)$")
	public void can_view_label_Certificate_Value_and_the_total_amount_of_the_certificate_lot_in_QAR_A_N(int arg1, int arg2) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Value(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_Certificate_Value());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Al Rabeh Certificate Value is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Al Rabeh Certificate Value");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^chooses a certificate from the carousel$")
	public void chooses_a_certificate_from_the_carousel() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    boolean flag = false;
	    flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Carousel_Dots());
	      
	    if(flag) {
	    
	    List<MobileElement> all_certificate = util.getAll_Element(util.getAppiumDriver(), accntpage.Carousel_Dots());
	    
	    int size = all_certificate.size();
	    System.out.println("List size is" + size);
	    int itr = 0;
	    for (MobileElement ele : all_certificate) {
	    	itr = itr + 1;
	    		
	    	System.out.println("Element going to be clicked");
			ele.click();
			
			util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Summary(), 8);
	    	String num = "0500090202";
	    	
	    	System.out.println(itr);
	    	String cert_num = util.getText(util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Number(itr));
	    	System.out.println(cert_num);
		
	    	if(cert_num.contains(num)) {
	    		
	    		flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Number(itr));
				if(flag) {
					util.Pass(util.getAppiumDriver(), "Al Rabeh Certificate is selected");
				}else {
					util.Fail(util.getAppiumDriver(), "Al Rabeh Certificate is not selected");
				}
				break;
	    	}
	    }
	    }
	    else {
	          
	           util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Account_Summary_Carousel(), 8);
	            String num = "0500090202";
	            String cert_num = util.getText(util.getAppiumDriver(), accntpage.Account_Type(1));
	            System.out.println(cert_num);
	            if(cert_num.contains(num)){
	                flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Account_Type(1));
	                if(flag) {
	                    util.Pass(util.getAppiumDriver(), "Account Type is displayed");
	                }else {
	                    util.Fail(util.getAppiumDriver(), "Account Type is not displayed");
	                }
	            }
	       }
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Show_More_btn(), 10);
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^clicks Show More$")
	public void clicks_Show_More() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod,util.getAppiumDriver(), accntpage.Show_More_btn(), 8);
	     boolean flag = util.isDisplayed(util.getAppiumDriver(), accntpage.Show_More_btn());
		    if(flag) {
		    	 util.Click(CurrentMethod,util.getAppiumDriver(), accntpage.Show_More_btn(),5);
		    	 util.Pass(util.getAppiumDriver(), "Clicked on the Show More button");
		    }
		    else {
		    	util.Fail(util.getAppiumDriver(), "Failed to click on Show More button");
		    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views No of Certificates label N\\((\\d+)\\) with the number of certificates$")
	public void views_No_of_Certificates_label_N_with_the_number_of_certificates(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_No_Of_Certificates(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_No_Of_Certificates());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Number of Certificate is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Number of Certificate");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views From Certificate Number label with the number from which the certificate is issued in this lot\\(N \\((\\d+)\\)\\)$")
	public void views_From_Certificate_Number_label_with_the_number_from_which_the_certificate_is_issued_in_this_lot_N(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_From_Certificate_Number(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_From_Certificate_Number());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "From Certificate Number is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the From Certificate Number");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views To Certificate Number label with the number to which the certificate is issued in this lot\\(N \\((\\d+)\\)\\)$")
	public void views_To_Certificate_Number_label_with_the_number_to_which_the_certificate_is_issued_in_this_lot_N(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_To_Certificate_Number(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_To_Certificate_Number());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "To Certificate Number is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the To Certificate Number");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views Issue Date label with the date$")
	public void views_Issue_Date_label_with_the_date() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Issue_Date(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_Certificate_Issue_Date());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Issue Date is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Issue Date");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user navigates to Al Rabeh Workspace$")
	public void user_navigates_to_Al_Rabeh_Workspace() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.switchAppiumContext("WEBVIEW", util.getAppiumDriver());
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.More_Icon(), 8);
	    util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.More_Icon(), 10);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Menu(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Al_Rabeh_Certificate_Menu());
	    if(flag) {
	    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Menu(), 5);
	    	util.Pass(util.getAppiumDriver(), "Al Rabeh Certificate Menu is clicked");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to click on the Al Rabeh Certificate Menu");
	    }
//	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.More_Icon(), 8);
//	    util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.More_Icon(), 10);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Al_Rabeh_Certificate_Heading(), 8);
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^user clicks More icon and selects Purchase Al Rabeh Certificate function from the contextual menu$")
	public void user_clicks_More_icon_and_selects_Purchase_Al_Rabeh_Certificate_function_from_the_contextual_menu() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
//	    Thread.sleep(3000);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Contextual_menu_Button(), 8);
	    util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Contextual_menu_Button(), 8);
//	    Thread.sleep(2000);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_Al_Rabeh_Contextual_Menu(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Purchase_Al_Rabeh_Contextual_Menu());
	    if(flag) {
	    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_Al_Rabeh_Contextual_Menu(), 10);
	    	util.Pass(util.getAppiumDriver(), "Purchase Al Rabeh Certificate contextual menu is selected");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to select the Purchase Al Rabeh Certificate contextual menu");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_Al_Rabeh_Certificate_Heading(), 8);
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views the No of Certificates  label and enters the number to be purchased \\(N \\((\\d+)\\)\\)$")
	public void views_the_No_of_Certificates_label_and_enters_the_number_to_be_purchased_N(int arg1) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_AR_Debit_From(), 8);
	    util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_AR_Debit_From(), 8);
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_AR_Debit_From_Selection(data.getData().get("AccountNumber")), 8);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Purchase_AR_Debit_From_Selection(data.getData().get("AccountNumber")));
	    if(flag) {
	    	util.Click(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_AR_Debit_From_Selection(data.getData().get("AccountNumber")), 8);
	    	util.Pass(util.getAppiumDriver(), "Account Number is selected");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to select the Account Number");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_Al_Rabeh_Available_Balance(), 10);
	    flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Purchase_Al_Rabeh_Available_Balance());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Available Balance is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Available Balance");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_Al_Rabeh_Customer_Name(), 10);
	    flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Purchase_Al_Rabeh_Customer_Name());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Customer Name is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Customer Name");
	    }
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_Al_Rabeh_No_Of_Certificate(), 10);
	    flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Purchase_Al_Rabeh_No_Of_Certificate());
	    if(flag) {
	    	util.Sendkeys(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_Al_Rabeh_No_Of_Certificate(), data.getData().get("NoOfCertificate"), 8);
	    	util.Pass(util.getAppiumDriver(), "No Of Certificate is entered");
//	    	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//		            util.Navigate_Back(util.getAppiumDriver(), data.getData_Env().get("Device_Type"));
//		           
//		        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
//		           
//		            //util.Navigate_Back(util.getAppiumDriver(), data.getData_Env().get("Device_Type"));
//		        }
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to enter the No Of Certificate");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	@When("^views label Certificate value  and the total amount of the certificate lot in QAR\\(A \\((\\d+)\\),N\\((\\d+),(\\d+)\\)$")
	public void views_label_Certificate_value_and_the_total_amount_of_the_certificate_lot_in_QAR_A_N(int arg1, int arg2, int arg3) throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    
	    util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), accntpage.Purchase_Al_Rabeh_Certificate_Value(), 10);
	    boolean flag = util.isDisplayed(util.getAppiumDriver(),  accntpage.Purchase_Al_Rabeh_Certificate_Value());
	    if(flag) {
	    	util.Pass(util.getAppiumDriver(), "Certificate Value is displayed");
	    }
	    else {
	    	util.Fail(util.getAppiumDriver(), "Failed to display the Certificate Value");
	    }
	    
	     System.out.println("Current method name : "+CurrentMethod);
	}
	
	
	
	
	
	
	
	
	
	
	
	
		
}
