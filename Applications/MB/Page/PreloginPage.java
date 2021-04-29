package MB.Page;

import org.openqa.selenium.By;
import managers.DataManager;

public class PreloginPage {
	DataManager data = new DataManager();
	
	public By forgetUserName() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//a[.='Forgot Username?']");
			//ele = By.xpath("//android.widget.TextView[@text='Please enter the URL']/../../../following-sibling::android.widget.FrameLayout//android.widget.EditText");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	
	public By forgetPassword() {
		By ele = null;
		System.out.println( data.getData_Env().get("deviceName"));
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//a[.='Forgot Password?']");
			//ele = By.xpath("//button[.='Ok']");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By Register_For_OnlineBanking() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.view.View[@text='REGISTER FOR ONLINE BANKING']");
			//ele = By.xpath("//android.widget.TextView[@content-desc='USERNAME & PASSWORD LOGIN']");
			
			ele = By.xpath("//a[.='REGISTER FOR ONLINE BANKING']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By Self_Registration_AccountNumber_Link() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//a[.='Account Number']");
			//ele = By.xpath("//android.view.TextView[@text='Username']/following-sibling::android.widget.EditText");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By DetailsPage_AccountNumber() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//input[@formcontrolname='accountNumber']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("//input[@formcontrolname='accountNumber']");
		}
		
		return ele;
	}
	
	public By DetailsPage_DOB() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//input[@formcontrolname='dateOfBirth']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("//input[@formcontrolname='dateOfBirth']");
		}
		
		return ele;
	}
	
	public By DetailsPage_DOB_Month() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.widget.TextView[@text='Allow AhliBankH57 to send and view SMS messages?']");
			ele =  By.xpath("(//android.widget.NumberPicker//android.widget.EditText)[1]");
			
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By DetailsPage_DOB_Day() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.widget.TextView[@text='Allow AhliBankH57 to send and view SMS messages?']");
			ele =  By.xpath("(//android.widget.NumberPicker//android.widget.EditText)[2]");
			
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By DetailsPage_DOB_Year() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.widget.TextView[@text='Allow AhliBankH57 to send and view SMS messages?']");
			ele =  By.xpath("(//android.widget.NumberPicker//android.widget.EditText)[3]");
			
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By DetailsPage_OK_Btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.widget.TextView[@text='Allow AhliBankH57 to send and view SMS messages?']");
			ele =  By.xpath("//android.widget.Button[@text='OK']");
			
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("//XCUIElementTypeButton[@name='OK']");
		}
		
		return ele;
	}
	
	public By Identifying_text()
	   {
	     return By.xpath("//h1[text()='How can we identify you?']");
	
	   }
	
	public By Account_Number_Button()
	   {
	     return By.linkText("Account Number");

	   }
	
	public By Cards_Button()
	   {
	     return By.linkText("Credit / Debit Card");

	   }
	
	public By Qatari_Id()
	   {
	     return By.xpath("//mat-label[.='Qatari ID ']/.././../..//input[@formcontrolname='nationalId']");

	   }
	
	 public By OTP_screen_Next()
     {
    	 return By.xpath("//div[@class='subPages container']//button[.=' Next ']");
    		 
     }
	
	 public By OTP_Next_Button() {
			By ele = null;
			if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
				//ele = By.xpath("//android.widget.Button[@text='NEXT']");
				ele = By.xpath("//button[@type='submit']");
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				ele = By.xpath("//button[@type='submit']");
			}
				
				return ele;
				
		}
		
	
	 public By Register_Notification_text()
	  {
		  return By.xpath("//p[text()=' User ID has been sent to your registered E-mail address']");
	  }
	
	
	 public By Registration_signIn()
     {
    	 return By.xpath("//button[.='  Sign in ']");
    	 		
    		 
     }
	
	 public By Forgot_Password_link()
	   {
	     return By.linkText("Forgot Password?");

	   }
	
	 public By New_Password_Txtbox()
	   {
	     return By.xpath("//input[@id='forgotPassword']");

	   }
	
	 public By New_Confirm_Password_Txtbox()
	   {
	     return By.xpath("//input[@id='cnfrmForgotPassword']");

	   }
	
	
	 public By DetailsPage_Debit_Credit_Number()
	   {
	     return By.xpath("//input[@formcontrolname='debitCardNumber']");

	   }
	
	 public By DetailsPage_Debit_Credit_PIN_Number()
	   {
	     return By.xpath("//input[@formcontrolname='cardPin']");

	   }
	    

	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
