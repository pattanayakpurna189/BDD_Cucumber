package MB.Page;

import org.openqa.selenium.By;

import managers.DataManager;

public class TransfersPage {
	
	DataManager data = new DataManager();
	
	public By More_Icon() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//li[@class='dropup pull-right tabdropWs' or @class ='dropup pull-right tabdropWs show']/a");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[.='Transfers']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Transfers']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Within Bank Transfer
	
	public By Within_Bank_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Within Bank Transfer']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By WithinBank_Transfer() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='CONTAINER_WITHINBANK_TRANSFERS']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By All_Beneficiary() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='All Beneficiary']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Selection() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//h3[.='All Beneficiary']/../../../following-sibling::div//p[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By WithinBank_Transfer_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Within Bank Transfer']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Photo() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Send to ']/../../following-sibling::div[1]//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Nick_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Send to ']/../../following-sibling::div[1]//p[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_AccountNumber() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Send to ']/../../following-sibling::div[1]//p[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Carousel_Dots() {
	    By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//	        ele = By.xpath("(//android.widget.TabWidget)[1]//child::android.view.View");
	        ele = By.xpath("//div[@name='ACCOUNT_CAROUSEL_WGT']//ul[@class='slick-dots']/li/button");
	               
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	               
	        ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
				
				ele = By.xpath("");
			}
			
			return ele;
	}
	
	public By Account_Carousel() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='ACCOUNT_CAROUSEL_WGT']//div[@class='cards cardCrsl']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Account_Type(int i) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='ACCOUNT_CAROUSEL_WGT']//div[@class='cards cardCrsl']//child::h4)["+i+"]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Account_Number(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h4[text()='"+type+"']/following-sibling::span[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Account_Name(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h4[text()='"+type+"']/following-sibling::span[3]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Available_Balance(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h4[text()='"+type+"']/../../following-sibling::div/div/p[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_Currency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Transfer Currency']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='How much would you like to send?	']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Now_RadioButton() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//input[@value='Now']/following-sibling::span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Later_RadioButton() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//input[@value='Later']/following-sibling::span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Recurring_RadioButton() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//input[@value='Recurring']/following-sibling::span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Payment_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Payment Date']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Payment_Date_Picker() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Payment Date']/../../following-sibling::div//span/i)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Credit_Value_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Credit Value Date']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Remainder_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Reminder Date	']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Remainder_Date_Picker() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Reminder Date	']/../../following-sibling::div//span/i)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Date picker
	
	public By Transfer_MonthSelection() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
                //ele = By.xpath("(//div[@class='ap-component-selector'])[1]");   
                ele = By.xpath("(//div[@class='ap-row ap-row-selected'])[1]");   
               
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
               
            ele = By.xpath("");
        }
           
            return ele;
    }
	
    public By Transfer_DateSelection() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
            ele = By.xpath("(//div[@class='ap-component-selector'])[2]");       
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
               
        ele = By.xpath("");
        }
       
            return ele;
    }
   
    public By Transfer_YearSelection() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
            ele = By.xpath("(//div[@class='ap-row ap-row-selected'])[3]");       
            }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
                   
            ele = By.xpath("");
            }
           
            return ele;
    }
   
    public By Transfer_Selected_Year() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            ele = By.xpath("//android.view.View[@resource-id='ap-component-2']/android.view.View/android.widget.ListView/android.view.View[@selected='true']");       
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
               
            ele = By.xpath("");
        }
           
            return ele;
    }
	
	public By Transfer_Date_Set() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
            ele = By.xpath("//a[text()='Set']");       
            }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
                   
            ele = By.xpath("");
            }
           
            return ele;
    }
	
	public By Frequency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Frequency']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Start_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Start Date	']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Start_Date_Picker() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Start Date	']/../../following-sibling::div//span/i)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By No_Of_Payment() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='No. of Payments	']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By End_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='End Date	']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purpose_Of_Transfer() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Purpose of Transfer']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Remarks() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[contains(text(),'Remarks')]/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By TandC_Checkbox() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//input[@type='checkbox']/following-sibling::span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Note() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Notes:' or .='Note:']/..//ol");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Confirm_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[.='proceed to confirm']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Review_Details_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Review Details']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Send_To() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Send to ']/../../following-sibling::div/div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Pay_From() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Pay From']/../../following-sibling::div/div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_Currency_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Transfer Currency']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_Amount_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Transfer Amount']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Send_Option() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Send']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Payment_Date_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Payment Date']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Credit_Value_Date_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Credit Value Date']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purpose_Tranfer_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Purpose of Transfer']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Remarks_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[contains(text(),'Remarks')]/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	
	
	public By OTP_Static_Lable() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text()='Please enter your One Time Password (OTP)']");
			ele = By.xpath("//span[.=' Please enter your One Time Password (OTP)']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By OTP_Field(int i) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//(android.view.View[@text()='OTP']/../../../following-sibling::android.view.View//child::android.widget.EditText)["+i+"]");
			ele = By.xpath("(//span[@id='lbl_KEY_OTP']/../../following-sibling::div//input)["+i+"]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By Resend_OTP() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Resend OTP']");
			ele = By.xpath("//a[.=' Resend OTP ']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By Submit_button() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='SUBMIT']");
			ele = By.xpath("//a[.='Submit']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By Cancel_button() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='SUBMIT']");
			ele = By.xpath("//a[.='Cancel']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By Back_button() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='BACK']");
			ele = By.xpath("//a[.='Back' or .='back']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By Back_Btn() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//button[@data-original-title='Cancel']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_Confirmation_Message() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[.='You have transferred successfully.' or .='Your request for a fund transfer is scheduled successfully.']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
//	public By Transfer_Confirmation_Message_PayLater() {
//		By ele = null;
//        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("//label[.='Your request for a fund transfer is scheduled successfully.']");
//        	
//        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
//           
//            ele = By.xpath("");
//        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
//           
//            ele = By.xpath("");
//        }
//        return ele;
//	}
	
	public By Transfer_Amount_Confirmation() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@name='TRANSFER_AMT']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By PayFrom_At_Confrimaton() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Pay From']/../../following-sibling::div/div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By PayTo_At_Confirmation() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Pay To']/../../following-sibling::div/div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Confirmation_Tick_Symbol() {
	    By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//	        ele = By.xpath("//android.widget.Image[@text='success']");
	        ele = By.xpath("//img[@name='OD_SUCCESS_IMG']");
	       
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
	}
	
	public By Confirmation_Reference_Num() {
	    By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//	        ele = By.xpath("//android.view.View[@text='Reference Number']/../../following-sibling::android.view.View/android.view.View/android.view.View");
	    	ele = By.xpath("(//span[.='Reference Number']/../../following-sibling::div//span[1])[1]");
	    	
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
	}
	
	public By Confirmation_Date_and_Time() {
		By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//	        ele = By.xpath("//android.view.View[@text='Date / Time']/../../following-sibling::android.view.View/android.view.View/android.view.View");
	       ele = By.xpath("(//span[.='Date / Time']/../../following-sibling::div//span[1])[1]");
	        
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
	}
	
	public By Confirmation_Note() {
	    By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	    	ele = By.xpath("//span[@name='NOTE']");
	    	
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
	}
	
	public By Make_Another_Transfer_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//button[.='Make Another Transfer']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Confirmation_Favourite_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//button[@name='FAV_BTN']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Confirmation_Download_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//button[@name='DLD_BTN']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Confirmation_Share_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//button[@name='SHARE_BTN']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Confirmation_Done_Button() {
	     By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//	            ele = By.xpath("//android.widget.Button[@text='DONE. GO BACK']");
	           ele = By.xpath("//button[.='DONE. GO BACK']");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
}
	
	public By Remainder_Date_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Reminder Date	']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Frequency_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Frequency']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Start_Date_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Start Date	']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By End_Date_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='End Date	']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By No_Of_Payment_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='No. of Payments	']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Own Account Transfer
	
	public By Own_Account_Transfer_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Own Account Transfer']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Own_Account_Transfer_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Own Account Transfer']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By To_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_OWN_ACC_TRANSFER-BENE_ACC_NO']/../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By OA_Transfer_Currency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_OWN_ACC_TRANSFER-TXN_CCY']/../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By OA_Transfer_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_OWN_ACC_TRANSFER-TXN_AMT']/../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By On_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_OWN_ACC_TRANSFER-VALUE_DATE']/../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By On_Date_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_OWN_ACC_TRANSFER-VALUE_DATE']/../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By On_Date_Picker() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_OWN_ACC_TRANSFER-VALUE_DATE']/../following-sibling::div//span/i)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By OA_Remainder_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_OWN_ACC_TRANSFER-REMINDER_DATE']/../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By OA_Remainder_Date_Picker() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_OWN_ACC_TRANSFER-REMINDER_DATE']/../following-sibling::div//span/i)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Next_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[.='next' or .='Next']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Debit_From() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Debit From	']/../../following-sibling::div/div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Exchange_Rate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Exchange Rate']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Converted_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Converted Amount']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transaction_Record() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='TRANSFERPAYMNETHITRY_VIEW']//div[@class='media mGridRow'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	
	//Favourite transfer
	
	public By Favourite_Transfer_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Favourite Transfers']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Favourite_Transfer_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Favourite Transfers']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Description() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@class='TRANSFERS_FAV_TRANSFERS_SWS']//div[@class='cards']//p)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bank_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@class='TRANSFERS_FAV_TRANSFERS_SWS']//div[@class='cards']//p)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Favourite_Transfer_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@class='TRANSFERS_FAV_TRANSFERS_SWS']//div[@class='cards']//p)[3]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Favourite_Transfer_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@class='TRANSFERS_FAV_TRANSFERS_SWS']//div[@class='cards']//p)[4]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Repeat_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//button[.='repeat'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	
	//Transfer and Payment History
	
	public By Transaction_History_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Transfers & Payments History']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By History_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Transfers & Payment History']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_Type() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Transfer Type']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By From_Date() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='From']/../../../following-sibling::android.view.View//child::android.widget.EditText");
			ele = By.xpath("//span[text()='From Date']/../../following-sibling::div//input");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By Date_Picker_From() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='From']/../../../following-sibling::android.view.View/android.view.View/android.view.View/android.view.View");
			ele = By.xpath("(//span[text()='From Date']/../../following-sibling::div//span/i)[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By To_Date(){
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='To']/../../../following-sibling::android.view.View//child::android.widget.EditText");
			ele = By.xpath("//span[text()='To Date']/../../following-sibling::div//input");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By Date_Picker_To() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='To']/../../../following-sibling::android.view.View/android.view.View/android.view.View/android.view.View");
			ele = By.xpath("(//span[text()='To Date']/../../following-sibling::div//span/i)[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By Search_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//button[.='search' or .='Search'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}	
	
	public By Transaction_Reference_No() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='TRANSFERPAYMNETHITRY_VIEW']//div[@class='media']//p[contains(text(),'IBOA030820775517')])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transaction_Type() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='TRANSFERPAYMNETHITRY_VIEW']//div[@class='media']//p[contains(text(),'Own Account Transfer')])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='TRANSFERPAYMNETHITRY_VIEW']//div[@class='media']//p[contains(text(),'Self')])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transaction_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='TRANSFERPAYMNETHITRY_VIEW']//div[@class='media']//span/span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transaction_Status() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='TRANSFERPAYMNETHITRY_VIEW']//div[@class='media']//span/span[2])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transaction_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[@class='frmtDate']//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transaction_Month() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[@class='frmtDate']//span[2])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transaction_Year() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[@class='frmtDate']//span[3])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Date Picker
	public By MonthSelection() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
                //ele = By.xpath("(//div[@class='ap-component-selector'])[1]");   
                ele = By.xpath("(//div[@class='ap-row ap-row-selected'])[1]");   
               
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
               
            ele = By.xpath("");
        }
           
            return ele;
    }
    public By DateSelection() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
            ele = By.xpath("(//div[@class='ap-component-selector'])[2]");       
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
               
        ele = By.xpath("");
        }
       
            return ele;
    }
   
    public By YearSelection() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
            ele = By.xpath("(//div[@class='ap-row ap-row-selected'])[3]");       
            }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
                   
            ele = By.xpath("");
            }
           
            return ele;
    }
   
    public By Selected_Year() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            ele = By.xpath("//android.view.View[@resource-id='ap-component-2']/android.view.View/android.widget.ListView/android.view.View[@selected='true']");       
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
               
            ele = By.xpath("");
        }
           
            return ele;
    }
    
    public By Date_Set() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
            ele = By.xpath("//a[text()='Set']");       
            }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
                   
            ele = By.xpath("");
            }
           
            return ele;
    }
	
	public By Beneficiary_Photo_ALLFavourite() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='ALL_FAVOURITE_VIEW']//span//input[@class='favourite'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Nick_Name_AllFavourite() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='ALL_FAVOURITE_VIEW']//p)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bank_Name_AllFavourite() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='ALL_FAVOURITE_VIEW']//p)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Account_Number_AllFavourite() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='ALL_FAVOURITE_VIEW']//p//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Currency_AllFavourite() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='ALL_FAVOURITE_VIEW']//p)[3]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_Type_AllFavourite() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='ALL_FAVOURITE_VIEW']//p)[4]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By All_Favourite_Transfer_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//h3[.='All Favourites'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Add Beneficiary
	
	public By Add_Beneficiary_Confirmation_Message() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[.='Beneficiary details added successfully.']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Account_Number_AB() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Beneficiary Account Number']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Confirm_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Beneficiary Confirm Account Number']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Currency_AB() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Account Currency']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Name_AB() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Beneficiary Name']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Nick_Name_AB() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Nick Name']/../../following-sibling::div//input)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	public By Beneficiary_Nick_Name_AB1() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Nick Name']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Browse_File_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Browse Files']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Add_Beneficiary_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Add Beneficiary']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Add_Beneficiary_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Add Beneficiary']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By File_Option() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Files']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Create_Beneficiary_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[.='create beneficiary']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Details() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Beneficiary Details']/../../following-sibling::div/div/div/div");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_Type_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Transfer Type']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Account_Number_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Account Number']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Currency_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Currency']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Name_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Name']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Nick_Name_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Nick Name']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Gallery_Option() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Gallery']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='IBAN']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Confirm_IBAN_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Confirm IBAN']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Currency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Currency']/../../following-sibling::div//select)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bank_Name_AB() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Bank Name']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Swift_Code() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Swift Code']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bank_Name_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Bank Name']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Swift_Code_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Swift Code']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//International Bank Transfer
	
	public By First_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Beneficiary First Name']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Middle_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Middle Name (Optional) ']/../../following-sibling::div//input)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Last_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Last Name']/../../following-sibling::div//input)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Nationality() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Beneficiary Nationality']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Nationality_Select(String country) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@data-val='"+country+"'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Address() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Beneficiary Address']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_City() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Beneficiary City']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_PO_Code() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Beneficiary PO Code']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Bank_Country() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Beneficiary Bank Country']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Bank_Country_Select(String country) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@data-val='"+country+"'])[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Confirm_Beneficiary_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Confirm Beneficiary Account Number']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Currency_IB() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Currency']/../../following-sibling::div//select)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Account Number']/../../following-sibling::div//input)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By SWIFT_CODE_Yes() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Do you know the Routing Code / SWIFT Code of the beneficiary Bank?']/../../following-sibling::div//input[@value='Y']/../span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By SWIFT_CODE_No() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Do you know the Routing Code / SWIFT Code of the beneficiary Bank?']/../../following-sibling::div//input[@value='N']/../span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By SWIFT_CODE() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='SWIFT Code']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Clearing_Code() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Clearing Code']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Routing_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Fedwire / ABA Routing Number']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By First_Name_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary First Name']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Middle_Name_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Middle Name (Optional) ']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Last_Name_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Last Name']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Nick_Name_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Nick Name']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_Nationality_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Nationality']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_Address_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Address']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_City_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary City']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_POCode_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary PO Code']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_BANK_Country_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Bank Country']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By SWIFT_Code_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='SWIFT Code']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IFSC_Code_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='IFSC Code']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_BANk_Name_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Bank Name']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_Bank_Address_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Bank Address']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_Bank_City_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Bank City (Optional)']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_Bank_State_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Bank State']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_Bank_Branch_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Bank Branch']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//error messages
	
	public By AccNum_Doesnt_Match() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//textarea[contains(text(),'Account Numbers do not match.')]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Error_Message_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Error Message']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Ok_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//a[.='Ok' or .='ok'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Ok2_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//a[.='Ok' or .='ok'])[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Invalid_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//textarea[text()='The account number you entered is invalid']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Nick_Name_AlreadyExists() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//textarea[text()='You have choosen this nickname for an existing beneficiary. Please choose another nickname']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By AccountNumber_AlreadyExists() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("//textarea[text()='You seem to have already added this Beneficiary's account details']");
        	ele = By.xpath("//div[@data-item-id='dialog_body']//textarea");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ResendOTP_Morethan3() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[text()='You have exceeded the maximum number of attempts for this session and this transaction has been cancelled.']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By OTP_NotEntered() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='This field is mandatory']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By OTP_Invalid() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='OTP entered is incorrect. Please try again']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By OTP_Expired() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='OTP entered is expired.  Please try again']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By OTP_InvalidThrice() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[text()='You have exceeded maximum number of attempts and this transaction has been cancelled. Please initiate the transaction again']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Review(String IBAN) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[text()='"+IBAN+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Nick_Name_ATConfirmation() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='CONFIRMATION_FORM']//p[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_ATConfirmation() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='CONFIRMATION_FORM']//p[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_Photo_ATConfirmation() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='CONFIRMATION_FORM']//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Local Bank Transfer
		public By Local_Bank_Transfer_Menu() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("//div[.='Local Bank Transfer']");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Local_Bank_Transfer_Heading() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("//h3[.='Local Bank Transfer']");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
	
	public By LB_Beneficiary_Photo() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Transfer To']/../../following-sibling::div[1]//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By LB_Beneficiary_Nick_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transfer To']/../../following-sibling::div[1]//p[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By LB_IBAN_Num() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transfer To']/../../following-sibling::div[1]//p[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_To_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transfer To']/../../following-sibling::div/div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_From_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transfer From']/../../following-sibling::div/div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transferred_From() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transferred From']/../../following-sibling::div/div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transferred_To() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transferred To']/../../following-sibling::div/div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	
	
	//Scheduled Transfer
	
	public By Scheduled_Transfer_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Scheduled Transfers']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Scheduled_Transfer_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Scheduled Transfers']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Scheduled_Transfer_Record1() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='SCHEDULED_TRANSFER_VW']//div[contains(@class,'rtplHeader')]/following-sibling::div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Schedule_Nick_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='SCHEDULED_TRANSFER_VW']//div[contains(@class,'rtplHeader')]/following-sibling::div[1]//div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Schedule_Transfer_Type() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='SCHEDULED_TRANSFER_VW']//div[contains(@class,'rtplHeader')]/following-sibling::div[1]//div[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Schedule_Amount_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='SCHEDULED_TRANSFER_VW']//div[contains(@class,'rtplHeader')]/following-sibling::div[1]//div[3]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Schedule_Transfer_View() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Scheduled Transfers View']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Edit_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[.='edit' or .='Edit']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Schedule_Transfer_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transfer Amount']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Schedule_Transfer_ConfirmationMessage() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[text()='Your Schedule Transfer has been successfully modified.']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	
	//International Transfer
	
	public By International_Transfer_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='International Transfer']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By International_Transfer_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='International Transfer']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Transfer_To() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transfer To']/../../following-sibling::div/div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_Photo() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Transfer To']/../../following-sibling::div[1]//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_Nick_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transfer To']/../../following-sibling::div[1]//p[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Bene_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transfer To']/../../following-sibling::div[1]//p[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Swift_Transfer_RadioButton() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transfer Mode']/../../following-sibling::div//input[@value='ST']/../span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Remit_To_India_RadioButton() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Transfer Mode']/../../following-sibling::div//input[@value='RTI']/../span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Remitter_PayCharge() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Who should pay the charges?	']/../../following-sibling::div//input[@value='OUR']/../span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Shared_PayCharge() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Who should pay the charges?	']/../../following-sibling::div//input[@value='SHA']/../span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Beneficiary_PayCharge() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Who should pay the charges?	']/../../following-sibling::div//input[@value='BEN']/../span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Corresponding_Charges() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Correspondent Charges']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Mode_Transfer_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Mode of Transfer']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Charges_Applied_To_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Charges applied to']/../../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Manage Beneficiary
	
	public By Manage_Beneficiary_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[text()='Manage Beneficiary']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Manage_Beneficiary_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[text()='Manage Beneficiary']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Nick_Name(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[text()='"+type+"']/../../../div[2]//p)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Account_Number(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[text()='"+type+"']/../../../div[2]//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Bank_Name(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[text()='"+type+"']/../../../div[2]//p)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Currency(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[text()='"+type+"']/../p[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Transfer_Type(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[text()='"+type+"'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Bene_Photo(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[text()='"+type+"']/../../../div[1]//span)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Delete_Option(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("(//p[text()='"+type+"']/../../../following-sibling::span//span[text()='delete'])[1]");
        	ele = By.xpath("//android.view.View[@text='"+type+"'][1]/../following-sibling::android.widget.Button[@text='Delete']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Transfer_Option(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[text()='"+type+"']/../../../following-sibling::span//span[text()='transfer'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Delete_Confimation_Message() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[text()='Confirmation']/../../../following-sibling::div/div[contains(text(),'Deleting a beneficiary')]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Yes_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[.='Yes' or .='yes']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By No_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[.='No' or .='no']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Edit_Button(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[text()='"+type+"']/../../../..//span[text()='edit'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Edit_Beneficiary_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Edit Beneficiary']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Beneficiary_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Account Number']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Confirm_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Confirm Account Number']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//disabled
	public By MB_Account_Currency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Account Currency']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//disabled
	public By MB_Beneficiary_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Name']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//disabled
	public By MB_Beneficiary_Nick_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Nick Name']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_IBAN() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='IBAN']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Confirm_IBAN() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Confirm IBAN']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Bene_Currency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Currency']/../../following-sibling::div//select)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Bene_Bank_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Bank Name']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Swift_Code() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='SWIFT Code']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Middle_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Middle Name (Optional) ']/../../following-sibling::div//input)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Last_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Last Name']/../../following-sibling::div//input)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_Bene_Nick_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Beneficiary Nick Name']/../../following-sibling::div//input)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MB_IFSC_Code() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='IFSC Code']/../../following-sibling::div//input)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Delete_ConfirmationMessage() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[text()='Beneficiary details deleted successfully.']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Delete_Beneficiary_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Delete Beneficiary']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Modify_Beneficiary_Confirmation_Message() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[text()='Beneficiary details modified successfully.']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Do_You_Want_To_Continue_Yes_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[@data-item-id='dialogBtnYes']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
//	public By You_Have() {
//		By ele = null;
//        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("");
//        	
//        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
//           
//            ele = By.xpath("");
//        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
//           
//            ele = By.xpath("");
//        }
//        return ele;
//	}
//	
//	public By You_Have() {
//		By ele = null;
//        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("");
//        	
//        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
//           
//            ele = By.xpath("");
//        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
//           
//            ele = By.xpath("");
//        }
//        return ele;
//	}
//	
//	public By You_Have() {
//		By ele = null;
//        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("");
//        	
//        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
//           
//            ele = By.xpath("");
//        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
//           
//            ele = By.xpath("");
//        }
//        return ele;
//	}
//	
//	public By You_Have() {
//		By ele = null;
//        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("");
//        	
//        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
//           
//            ele = By.xpath("");
//        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
//           
//            ele = By.xpath("");
//        }
//        return ele;
//	}

}
