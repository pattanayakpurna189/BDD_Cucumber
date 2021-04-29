package MB.Page;

import org.openqa.selenium.By;

import managers.DataManager;

public class LoginPage {
	DataManager data = new DataManager();
	
	public By URL_To_Connect_To_UAT() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.widget.TextView[@text='Please enter the URL']/../../following-sibling::android.widget.FrameLayout[1]//android.widget.EditText");
			ele = By.xpath("//android.widget.EditText");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			//XCUIElementTypeTextField
			ele = By.xpath("//XCUIElementTypeTextField");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("//XCUIElementTypeTextField");
		}
		
		return ele;
	}
	
	
	public By URL_To_Connect_To_UAT_OK_btn() {
		By ele = null;
		//System.out.println( data.getData_Env().get("deviceName"));
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.widget.Button[@text='Ok']");
			//ele = By.xpath("//button[.='Ok']");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("//XCUIElementTypeButton[@name='Ok']");
		}
		
		return ele;
	}
	
	public By UserName_And_Password_Login_Btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.view.View[@text='USERNAME & PASSWORD LOGIN']");
			//ele = By.xpath("//android.view.View[@content-desc='USERNAME & PASSWORD LOGIN']");
			ele = By.xpath("//a[.='USERNAME & PASSWORD LOGIN']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("//a[.='USERNAME & PASSWORD LOGIN']");
		}
		
		return ele;
	}
	
	public By UserID() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Username']/following-sibling::android.widget.EditText");
			//ele = By.xpath("//android.widget.TextView[@text='Username']/following-sibling::android.widget.EditText");
			ele = By.xpath("//div[@id='mobileFlow']//input[@formcontrolname='username']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("//div[@id='mobileFlow']//input[@formcontrolname='username']");
		}
		
		return ele;
	}
	
	public By Password() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Password']/following-sibling::android.widget.EditText");
			//ele = By.xpath("//android.widget.TextView[@text='Password']/following-sibling::android.widget.EditText");
			
			ele = By.xpath("//div[@id='mobileFlow']//input[@formcontrolname='password']");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("//div[@id='mobileFlow']//input[@formcontrolname='password']");
		}
		
		return ele;
	}
	
	public By Sign_In_Btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.widget.Button[@text='SIGN IN']");
			//ele = By.xpath("//div[@id='mobileFlow']//button[contains(text(),' Sign In ')]");
			//
			////div[@id='mobileFlow']//button[@type='submit']
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("//XCUIElementTypeButton[@name='SIGN IN']");
			//ele = By.xpath("//div[@id='mobileFlow']//button[@type='submit']");
		}
		
		return ele;
	}
	
	public By Allow_SMS_Message() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.widget.TextView[@text='Allow AhliBankH57 to send and view SMS messages?']");
		ele =  By.xpath("//android.widget.TextView[@resource-id='com.android.packageinstaller:id/permission_message']");
			
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	
	
	public By OTP_Header() {
		
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Great going! Verify it’s you…']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	
	}
	public By All_OTP_Fields() {	
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		ele = By.xpath("//android.view.View[@text='Enter your 6 digit OTP']/../following-sibling::android.view.View//child::android.widget.EditText");
				
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
			
			return ele;
			
	}

	public By OTP_Field(int itr) {	
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("(//android.view.View[@text='Enter your 6 digit OTP']/../following-sibling::android.view.View//child::android.widget.EditText)["+itr+"]");
		ele = By.xpath("//input[@formcontrolname='otpNo"+itr+"']");
		
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
			ele = By.xpath("//input[@formcontrolname='otpNo"+itr+"']");
		}
		
			return ele;
			
	}
	/*public By OTP_Field() {	
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("(//android.view.View[@text='Enter your 6 digit OTP']/../following-sibling::android.view.View//child::android.widget.EditText)[1]");
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
			
	}*/
	
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
	
	public By Allow_Location_Message() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.widget.TextView[@text='Allow AhliBankH57 to access this device's location?']");
			ele = By.xpath("//android.widget.TextView[@resource-id='com.android.packageinstaller:id/permission_message']");
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
	}
	
	
	public By Workspace_Navigation(String fieldname) { 
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='"+fieldname+"']");
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
	}
	
	
	public By You_Have() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='You have']");
			ele = By.xpath("//android.widget.TextView[@text='You have']");
				
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
			ele = By.xpath("");
		}
			
			return ele;
	}
	
	
	//Added Purna
	public By Home_Text() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.view.View[@text='You have']");
			ele = By.xpath("//div[.='Home']");
					
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
			ele = By.xpath("//div[.='Home']");
		}
			
			return ele;
	}
	
	public By Done_Btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
			ele = By.xpath("//XCUIElementTypeButton[@name='Return']");
		}
			
			return ele;
	}
	
	
	
	public By Allow_Button() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.widget.Button[@text='Allow']");
			//ele =  By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("//XCUIElementTypeButton[@name='Allow']");
		}
		
		return ele;
	}
	
	
	public By Allow_All_The_Time_Button() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.widget.Button[@text='Allow all the time']");
			//ele =  By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("//XCUIElementTypeButton[@Name='Allow all the time']");
		}
		
		return ele;
	}
	
	
	
	//jayashree 22-07-2020
	
		public By Logout_Feedback() {
			By ele = null;
			if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
				ele = By.xpath("//h3[.='Feedback']");
						
				}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
						
				ele = By.xpath("");
				}
				
				return ele;
		}
		
		public By Logout_Feedback_Skip() {
			By ele = null;
			if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
				ele = By.xpath("//a[.='SKIP']");
						
				}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
						
				ele = By.xpath("");
				}
				
				return ele;
		}
		
		//Jovita
		public By Login_Notification_Skip() {
	        By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	            ele = By.xpath("//android.widget.TextView[contains(@text,'SKIP')]");
	                  
	            }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	                  
	            ele = By.xpath("");
	            }
	          
	            return ele;
	   }
	
	
	
}
