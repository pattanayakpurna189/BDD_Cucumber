package MB.StepDefinations.Cards;



import java.util.Scanner;

import MB.Page.HomePage;
import MB.Page.LoginPage;
import Reusable_Methods.Utility;
import cucumber.api.java.en.*;
import managers.DataManager;
import managers.DriverManager;


public class MB_Login  {
	
	DriverManager driver =new DriverManager();
	DataManager data = new DataManager();
	Utility util = new Utility();
	
	//PageObjects************************************************
	HomePage homepage = new HomePage();
	LoginPage login = new LoginPage();
	
	
	@SuppressWarnings("resource")
	@Given("^user logged in with valid credentials and landed in Homepage$")
	public void user_logged_in_with_valid_credentials_and_landed_in_Homepage() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    System.out.println("Current method name : "+CurrentMethod);
	 
		    
		  //setting up test***************************************************************************************
			System.out.println(Utility.DataBinding.get());
			data.setData_Env(Utility.Environment.get());
			driver.innitialize_AppiumDriver();
			data.setData_Login(Utility.Login_DataBinding.get());
			data.setData(Utility.DataBinding.get(),Utility.SheetName.get());
			Utility.appiumDriver.set(driver.getAppiumDriver());
		//***************************************************************************************
			// util.Info(util.getAppiumDriver(), "Url value given");
			
		  util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), login.URL_To_Connect_To_UAT_OK_btn(), 40);
		  boolean flag = util.isDisplayed(util.getAppiumDriver(), login.URL_To_Connect_To_UAT_OK_btn());
			 if(flag) {
				 util.Pass(util.getAppiumDriver(), "App opened successfully...");
			 }else {
				 util.Fail(util.getAppiumDriver(), "App launching failed......");
				 throw new Exception("App was not launched..");
			 }
		  
		  
		  util.Sendkeys(CurrentMethod, util.getAppiumDriver(), login.URL_To_Connect_To_UAT(),data.getData_Env().get("UAT_Server_URL"), 10);
			 //util.Sendkeys(CurrentMethod, util.getAppiumDriver(), login.URL_To_Connect_To_UAT(),data.getData_Env().get("UAT_Server_URL"), 10);
		     if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		            util.Navigate_Back(util.getAppiumDriver(), data.getData_Env().get("Device_Type"));
		           
		        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
		           
		            //util.Navigate_Back(util.getAppiumDriver(), data.getData_Env().get("Device_Type"));
		        }
			util.Click(CurrentMethod, util.getAppiumDriver(),login.URL_To_Connect_To_UAT_OK_btn(), 10);
			Thread.sleep(30000);
			 //util.Info(util.getAppiumDriver(), "Clicked on OK Button");
			 
			 util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), login.UserName_And_Password_Login_Btn(), 50);
			 flag = util.isDisplayed(util.getAppiumDriver(), login.UserName_And_Password_Login_Btn());
				 if(flag) {
					 util.Pass(util.getAppiumDriver(), "Navigated to Select prefered login screen");
					 util.Click(CurrentMethod, util.getAppiumDriver(),login.UserName_And_Password_Login_Btn(),4);
					 util.Pass(util.getAppiumDriver(), "Username and Password login is clicked");
					 Thread.sleep(50000);
				 }else {
					 util.Fail(util.getAppiumDriver(), "Failed to navigate to Select prefered login screen");
					 throw new Exception("Navigated to Select prefered login screen");
				 }		 
				 
				
				 util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), login.UserID(), 80);
				 flag = util.isDisplayed(util.getAppiumDriver(), login.UserID());
					 if(flag) {
						 util.Pass(util.getAppiumDriver(), "Navigated to Prelogin screen");
						 util.Sendkeys(CurrentMethod, util.getAppiumDriver(), login.UserID(), data.getData_Login().get("User_ID"), 5);
						 util.Sendkeys(CurrentMethod, util.getAppiumDriver(), login.Password(), data.getData_Login().get("Password"), 5);
						 util.Pass(util.getAppiumDriver(), "UserID and Password are entered");
						 if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
					           util.Navigate_Back(util.getAppiumDriver(), data.getData_Env().get("Device_Type"));
					           
					        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					           
					            //util.Navigate_Back(util.getAppiumDriver(), data.getData_Env().get("Device_Type"));
					        }
						 util.Click(CurrentMethod, util.getAppiumDriver(), login.Sign_In_Btn(), 5);
						 util.Pass(util.getAppiumDriver(), "Sign in is clicked");
						 Thread.sleep(40000);
						 util.Pass(util.getAppiumDriver(), "After clicking Sign in");
						
					 }else {
						 util.Fail(util.getAppiumDriver(), "Failed to Navigate to Prelogin screen");
						 throw new Exception("Navigated to Prelogin screen");
					 }
					 
					 
					 util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), login.Allow_SMS_Message(), 20);
					 flag = util.isDisplayed(util.getAppiumDriver(), login.Allow_SMS_Message());
						 if(flag) {
							 util.Pass(util.getAppiumDriver(), "Allow SMS message popup is displayed");
							 util.Click(CurrentMethod, util.getAppiumDriver(), login.Allow_Button(), 5);
							 util.Pass(util.getAppiumDriver(), "Allow SMS message is displayed and Allow is clicked");
							 Thread.sleep(10000);
							 
						 }else {
							 util.Fail(util.getAppiumDriver(), "Allow SMS message is not displayed");
							 throw new Exception("Allow SMS message is not displayed");
						 }
			 
						 util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), login.OTP_Header(), 30);
						 flag = util.isDisplayed(util.getAppiumDriver(), login.OTP_Header());
						 if(flag) {						 
						 util.Pass(util.getAppiumDriver(), "Successfully Login OTP Screen is Displayed");				    	
						    System.out.println("Enter the OTP");
				    		Scanner s = new Scanner(System.in);
				    		String otp = s.next();
					    	System.out.println("Your OTP is " + otp);
					    	int i = 0;
					    	for (int itr = 1; itr <= 6; itr ++) {					    								    							    	
						    	char otp_char = otp.charAt(i);
						    	String otp_field = Character.toString(otp_char);						  
						    	Thread.sleep(2000);
					    		util.Sendkeys_Clear(CurrentMethod, util.getAppiumDriver(), login.OTP_Field(itr), otp_field, 10);					
					    		//System.out.println("otp" + i + " digit is" + otp_char);
					    		i++;
					    		Thread.sleep(2000);
					    	
					    	} 
					    	
					    	 if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
						            util.Navigate_Back(util.getAppiumDriver(), data.getData_Env().get("Device_Type"));
						           
						        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
						           
						            //util.Navigate_Back(util.getAppiumDriver(), data.getData_Env().get("Device_Type"));
						        }
						    	util.Pass(util.getAppiumDriver(), "OTP is entered");
						    	util.Click(CurrentMethod,util.getAppiumDriver(), login.OTP_Next_Button(),2);
						    	util.Pass(util.getAppiumDriver(), "Next button is clicked");
						    	 Thread.sleep(10000);
							 
							 }else {
								 util.Fail(util.getAppiumDriver(), "Failed to display OTP screen");
								 throw new Exception("Failed to display OTP screen");
							 }
						 
						 util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), login.Allow_Location_Message(), 20);
						 flag = util.isDisplayed(util.getAppiumDriver(), login.Allow_Location_Message());
							 if(flag) {
								 util.Click(CurrentMethod, util.getAppiumDriver(), login.Allow_Button(), 5);
								 util.Pass(util.getAppiumDriver(), "Allow Location message is displayed and Allow is clicked");
								 Thread.sleep(10000);
								 
							 }else {
								 util.Fail(util.getAppiumDriver(), "Allow Location message is not displayed");
								 throw new Exception("Allow SMS message is not displayed");
							 }
							 Thread.sleep(60000);
							 util.wait_for_Element_WithOutThrowing_Exception( util.getAppiumDriver(), login.You_Have(), 30);
							 flag = util.isDisplayed(util.getAppiumDriver(), login.You_Have());
							 if(flag) {
								 
								 util.Pass(util.getAppiumDriver(), "Homepage is displayed");
								 if(util.isDisplayed(util.getAppiumDriver(), login.Login_Notification_Skip())==true) {
								 util.Click(CurrentMethod, util.getAppiumDriver(), login.Login_Notification_Skip(), 10);
								util.Pass(util.getAppiumDriver(),"Skip is clicked");
								 }
								 
							 }else {
								 util.Fail(util.getAppiumDriver(), "Homepage is not displayed");
							
							 }
		}
		
		
	
	
	@Then("^User Logged out of the system successfully$")
	public void user_Logged_out_of_the_system_successfully() throws Throwable {
	    String CurrentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    util.Click(CurrentMethod,util.getAppiumDriver(), homepage.Logout_Link(),5);
        Thread.sleep(3000);
       
        boolean flag = util.isDisplayed(util.getAppiumDriver(), homepage.Logout_Confirmation());
        if(flag) {
        util.Click(CurrentMethod,util.getAppiumDriver(), homepage.Logout_Confirmation(),2);
        }else {
            util.wait_for_Element(CurrentMethod, util.getAppiumDriver(), login.Logout_Feedback(), 8);
            util.Click(CurrentMethod, util.getAppiumDriver(), login.Logout_Feedback_Skip(), 8);
        }
        util.wait_for_Element(CurrentMethod,util.getAppiumDriver(),homepage.Signin_Button(), 15);
        flag = util.isDisplayed(util.getAppiumDriver(), homepage.Signin_Button());
         if(flag) {
             util.Pass(util.getAppiumDriver(),"Successfully logout of IB");
         }else {
             util.Fail(util.getAppiumDriver(),"Logout failed");
         }
       
        System.out.println("Current method name : "+CurrentMethod);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
