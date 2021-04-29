package MB.Page;

import org.openqa.selenium.By;

import managers.DataManager;

public class Accountspage {
	
	DataManager data = new DataManager();	
	
	//jayashree 28-06-2020
	//Account Summary
	
	public By Accounts_Heading(){			
			By ele = null;
			if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
				ele = By.xpath("(//android.view.View[@text='Accounts'])[1]");
				
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
				ele = By.xpath("");
			}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
				
				ele = By.xpath("");
			}
			
			return ele;	
		}
	
	public By Account_Summary_Carousel() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("(//android.view.View[@resource-id='content-block'])[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View//");
			ele = By.xpath("//div[@name='ACCOUNT_SUMMARY_VIEW']//div[@class='cards cardCrsl']");
			
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
//			ele = By.xpath("(//android.view.View[@resource-id='content-block'])[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View//");
//			ele = By.xpath("//h4[contains(text(),'"+account_type+"')]");
			ele = By.xpath("(//div[@name='ACCOUNT_SUMMARY_VIEW']//div[@class='cards cardCrsl']//child::h4)["+i+"]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By Account_Status(String account_type,String status) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("(//android.view.View[@resource-id='content-block'])[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View//");
			ele = By.xpath("//h4[text()='"+account_type+"']/following-sibling::span[text()='"+status+"']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By Account_Number(String account_type) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("(//android.view.View[@resource-id='content-block'])[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View//");
			ele = By.xpath("//h4[text()='"+account_type+"']/following-sibling::span[2]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By Account_Holder_Name(String account_type) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("(//android.view.View[@resource-id='content-block'])[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View//");
			ele = By.xpath("//h4[text()='"+account_type+"']/following-sibling::span[3]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By Available_Balance(String account_type) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("(//android.view.View[@resource-id='content-block'])[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View//");
			ele = By.xpath("//h4[text()='"+account_type+"']/../../following-sibling::div/div/p[2]");
			
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
	        ele = By.xpath("//ul[@class='slick-dots']/li/button");
	               
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	               
	        ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
				
				ele = By.xpath("");
			}
			
			return ele;
	}
	
	
	//Accounts Details
	
	public By Show_More_btn() {
		
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.Button[@text='SHOW MORE']");
			ele = By.xpath("//button[.='Show More' and @id='dMore']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
		
	}
	
	public By AD_IBAN_Num() {
		
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='IBAN']/following-sibling::android.view.View");
			ele = By.xpath("//p[text()='IBAN']/../a");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
		
	}
	
	public By AD_QAR_EQUI() {
		
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='QAR Equivalent']/following-sibling::android.view.View");
			ele = By.xpath("//p[text()='QAR Equivalent']/../h4");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
		
	}
	
	public By AD_Overdraft_Limit() {
			
			By ele = null;
			if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//				ele = By.xpath("//android.view.View[@text='Overdraft Limit']/following-sibling::android.view.View");
				ele = By.xpath("//p[text()='Overdraft Limit']/../h4");
				
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
				ele = By.xpath("");
			}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
				
				ele = By.xpath("");
			}
			
			return ele;
			
		}

	public By AD_Amount_Clearing() {
		
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Amount in Clearing']/following-sibling::android.view.View");
			ele = By.xpath("//p[text()='Amount in Clearing']/../h4");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}

	public By AD_Account_Branch_Name() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Account Branch Name']/following-sibling::android.view.View");
			ele = By.xpath("//p[text()='Account Branch Name']/../h4");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By AD_Hold_Amount() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Hold Amount']/following-sibling::android.view.View");
			ele = By.xpath("//p[text()='Hold Amount']/../h4");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")){
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By Show_Less_Btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.Button[@text='SHOW LESS']");
			ele = By.xpath("//button[.='Show Less']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	
	//Account Statement
	public By AS_Filter_Icon() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.Button[@resource-id='FORM_ACCOUNT_STATEMENT-APPLY_FILTER']");
			ele = By.xpath("//button[@name='APPLY_FILTER']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_FilterTransaction_Header() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Filter Transactions']");
			ele = By.xpath("//span[text()=' Filter Transactions']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_More_Icon() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.Spinner[@resource-id='more_tool']");
			ele = By.xpath("//a[@id='more_tool']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Export_btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.Button[@text='Export']");
			ele = By.xpath("//span[.='Export']/..");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_ExportToPDF() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Export To PDF']");
			ele = By.xpath("//span[text()='Export To PDF']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_PeriodSelection_Header() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Period Selection']");
			ele = By.xpath("//span[text()='Period Selection']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Last10Transaction_Radiobtn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.RadioButton[@text='Last 10 Transactions']");
			ele = By.xpath("//span[text()='Period Selection']/../../following-sibling::div//child::label[1]/span");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_CurrentMonth_Radiobtn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.RadioButton[@text='Current Month']");
			ele = By.xpath("//span[text()='Period Selection']/../../following-sibling::div//child::label[2]/span");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_PastMonth_Radiobtn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.RadioButton[@text='Past Months']");
			ele = By.xpath("//span[text()='Period Selection']/../../following-sibling::div//child::label[3]/span");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_PM_SelectMonth_Dropdown() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.Spinner[@text='Select Month*']");
			ele = By.xpath("//span[text()='Select Month']/../../following-sibling::div//select");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_PS_MonthSelection(String pastmonth) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.CheckedTextView[@text='"+pastmonth+"']");
			ele = By.xpath("//span[text()='Select Month']/../../following-sibling::div//select/option[text()='"+pastmonth+"']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_DateRange_Radiobtn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.RadioButton[@text='Date Range']");
			ele = By.xpath("//span[text()='Period Selection']/../../following-sibling::div//child::label[4]/span");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Filter_Search_btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.Button[@text='APPLY']");
			ele = By.xpath("//button[.='Search']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Filter_Back_btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.Button[@resource-id='FORM_ACCOUNT_STATEMENT-BACK_BTN']");
			ele = By.xpath("//button[@name='BACK_BTN']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Date() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("(//android.widget.GridView//android.view.View/child::android.view.View[1])[1]");
			ele = By.xpath("(//span[@class='frmtDate']//span[1])[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Month() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("(//android.widget.GridView//android.view.View/child::android.view.View[2])[1]");
			ele = By.xpath("(//span[@class='frmtDate']//span[2])[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Year() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("(//android.widget.GridView//android.view.View/child::android.view.View[3])[1]");
			ele = By.xpath("(//span[@class='frmtDate']//span[3])[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Transaction_Description() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("(//android.widget.GridView//android.view.View/child::android.view.View[4])[1]");
			ele = By.xpath("(//span[@class='frmtDate']/../../../following-sibling::div//p[1])[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Amount() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("(//android.widget.GridView//android.view.View/child::android.view.View[5])[1]");
			ele = By.xpath("(//span[@class='frmtDate']/../../../following-sibling::div/div/div[2]/span/span)[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Transaction_Field() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@resource-id='content-block'][2]");
			ele = By.xpath("//div[@class='row card-body  ACCOUNT_STATEMANT_WGT ct-app__content']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Date_From() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='From']/../../../following-sibling::android.view.View//child::android.widget.EditText");
			ele = By.xpath("//span[text()='From']/../../following-sibling::div//input");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Date_Picker_From() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='From']/../../../following-sibling::android.view.View/android.view.View/android.view.View/android.view.View");
			ele = By.xpath("(//span[text()='From']/../../following-sibling::div//span/i)[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Date_To(){
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='To']/../../../following-sibling::android.view.View//child::android.widget.EditText");
			ele = By.xpath("//span[text()='To']/../../following-sibling::div//input");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Date_Picker_To() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='To']/../../../following-sibling::android.view.View/android.view.View/android.view.View/android.view.View");
			ele = By.xpath("(//span[text()='To']/../../following-sibling::div//span/i)[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Allow_Message() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.widget.TextView[@text='Allow AhliBankH57 to access photos, media, and files on your device?']");
//			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_Allow_Btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.widget.Button[@text='ALLOW']");
//			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_FileDownloaded_Heading() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.widget.TextView[@text='File Downloaded']");
//			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_FD_Open_Btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.widget.Button[@text='OPEN']");
			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
//			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By AS_FD_Cancel_Btn() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.widget.Button[@text='CANCEL']");
//			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	//Cheque Book Request 30-06-2020
	public By Contextual_menu_Button() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Accounts\"]/following-sibling::android.view.View//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View");
			ele = By.xpath("//div[@name='content-panel']/a");
//			ele = By.xpath("//div[@data-widgetid='ACCOUNT_FLOATING_WGT']//a[@class='lanuchbt']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By Cheque_Book_Request_Menu() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text()='Cheque Book Request']");
			ele = By.xpath("(//a[.='Cheque Book Request'])[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By Cheque_Book_Request_Heading() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Cheque Book Request']");
			ele = By.xpath("//h3[.='Cheque Book Request']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_Account_Number() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Account Number']/../../following-sibling::android.view.View//child::android.widget.Spinner");
			ele = By.xpath("//span[.='Account Number']/../../following-sibling::div//select");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_Account_Number_Selection(String accountnumber) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.CheckedTextView[@text='"+accountnumber+"']");
			ele = By.xpath("//span[.='Account Number']/../../following-sibling::div//select/option[.='"+accountnumber+"']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_NumberOfChequeBook() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Number of Cheque Book(s)']/../../../following-sibling::/android.view.View//child::android.widget.Spinner");
			ele = By.xpath("//span[.='numeric']/../../following-sibling::div//select");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_NumberOfChequeBook_Selection(String count) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.CheckedTextView[@text='"+count+"']");
			ele = By.xpath("//span[.='numeric']/../../following-sibling::div//select/option[.='"+count+"']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_NumberOfLeaves() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Number of Leaves per Cheque Book']/../../following-sibling::android.view.View//child::android.widget.Spinner");
			ele = By.xpath("//span[@id='lbl_NOOFLEAF']/../../following-sibling::div//select");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_NumberOfLeaves_Selection(String leaves) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.CheckedTextView[@text='"+leaves+"']");
			ele = By.xpath("//span[@id='lbl_NOOFLEAF']/../../following-sibling::div//select/option[.='"+leaves+"']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_Delivery_option() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Delivery Option']/../../following-sibling::android.view.View//child::android.widget.Spinner");
			ele = By.xpath("//span[@id='lbl_DELIVERYOPTION']/../../following-sibling::div//select");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_Delivery_option_Selection(String option) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.CheckedTextView[@text='"+option+"']");
			ele = By.xpath("//span[@id='lbl_DELIVERYOPTION']/../../following-sibling::div//select/option[.='"+option+"']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_Delivery_Branch() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Delivery Branch']/../../following-sibling::android.view.View//child::android.widget.Spinner");
			ele = By.xpath("//span[@id='lbl_DELIVERYBRANCH']/../../following-sibling::div//select");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_Delivery_Branch_Selection(String branch) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.CheckedTextView[@text='"+branch+"']");
			ele = By.xpath("//span[@id='lbl_DELIVERYBRANCH']/../../following-sibling::div//select/option[.='"+branch+"']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_Remarks() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='Remarks']/../../following-sibling::android.view.View//child::android.widget.EditText");
			ele = By.xpath("//span[@id='lbl_REMARKS']/../../following-sibling::div//input");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_CheckBox() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.widget.CheckBox[@text='I hereby authorize Ahlibank to enquire and review all the information related to my financial situation as obtained from Qatar Central Bank - Credit Bureau']");
			ele = By.xpath("//input[@name='TERM_COND']/..");
			
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
//			ele = By.xpath("//android.view.View[@text='NEXT']");
//			ele = By.xpath("//a[.='NEXT']");
			ele = By.xpath("//a[.='Next']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_Review_Details_Heading() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Review Details']");
			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_RD_AccountNumber() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Account Number']/../../following-sibling::android.view.View/android.view.View/android.view.View");
			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_RD_NumberOfChequeBook() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Number of Cheque Book(s)']/../../../following-sibling::android.view.View/android.view.View/android.view.View");
			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_RD_NumberOfLeaves() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Number of Leaves per Cheque Book']/../../../following-sibling::android.view.View/android.view.View/android.view.View");
			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_RD_DeliveryOption() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Delivery Option']/../../../following-sibling::android.view.View/android.view.View/android.view.View");
			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_RD_DeliveryBranch() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Delivery Branch']/../../../following-sibling::android.view.View/android.view.View/android.view.View");
			ele = By.xpath("");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By CBR_RD_Remarks() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Remarks']/../../../following-sibling::android.view.View/android.view.View/android.view.View");
			ele = By.xpath("");
			
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
	
	public By Back_button() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='BACK']");
			ele = By.xpath("//a[.='Back']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	//Register for e statement
	//01-07-2020
	
	public By E_Statement_ContextualMenu() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text()='Register for E-Statements']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By E_Statement_Heading() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='E-Statement Enrollment']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By ES_Static_Text() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Once registered, you will receive your e-Statement in your mailbox in PDF format, from the next statement cycle.']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By ES_Email_Field() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Primary E-mail ID']/../../../following-sibling::android.view.View//child::android.widget.EditText");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By ES_Status(String status) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='Enrollment Status']/../../following-sibling::android.view.View//child::android.widget.EditText[@text='"+status+"']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	public By ES_Checkbox() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.widget.CheckBox[@text='I agree to receive E-statement for all my accounts / cards in the above mentioned e-mail address.']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
	//confirmation message 02-07-2020
	
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
	public By ChequeBookRequest_Confirmation_Success_Message() {
	    By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        ele = By.xpath("//android.view.View[@text='Your Card Replacement transaction was successful.']");
//	        ele = By.xpath("");
	        
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
	}

	 

	//Date / Time, Reference Number
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
	       ele = By.xpath("//span[.='Date / Time']/../../following-sibling::div//span[1]");
	        
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
//	        ele = By.xpath("//android.view.View[@text='Note: Please quote the above reference number in all communications with Ahli Bank.']");
//	    	ele = By.xpath("//span[.='Note: Please quote the above reference number in all communications with Ahli Bank.']");
//        	ele = By.xpath("//span[.='Date / Time']/ancestor::div[12]/following-sibling::div//span[.='Note: Please quote the above reference number in all communications with Ahli Bank.']");
	    	ele = By.xpath("//span[@name='NOTE']");
	    	
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
//		            ele = By.xpath("//android.widget.Button[@text='DONE. GO BACK']");
		           ele = By.xpath("//button[.='DONE. GO BACK']");
		        	
		        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
		           
		            ele = By.xpath("");
		        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
		           
		            ele = By.xpath("");
		        }
		        return ele;
	}
	
	
	// IBAN Certificate
	
	public By IBAN_Certificate_Workspace() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='IBAN Certificate']");
//            ele = By.xpath("(//a[.='IBAN Certificate'])[1]");
        	ele = By.xpath("//div[@class='ACCOUNTS_CONTXT_SWS']//ul//a[.='IBAN Certificate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Heading_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='IBAN Certificate']");
            ele = By.xpath("//h3[.='IBAN Certificate']");
           
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Account Number']/../../../following-sibling::android.view.View/android.view.View/android.view.Spinner");
            ele = By.xpath("//span[@id='lbl_ACCOUNTID']/../../following-sibling::div//select");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Account_Number_Select(String account_number) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.widget.CheckedTextView[@text='"+account_number+"']");
            ele = By.xpath("//span[@id='lbl_ACCOUNTID']/../../following-sibling::div//select/option[.='"+account_number+"']");
           
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Available_Balance() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Available Balance']/../../../following-sibling::android.view.View/android.view.View");
            ele = By.xpath("//span[@id='lbl_AVAILABLEBALANCE']/../../following-sibling::div//span");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Preferred_Language() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Preferred Language']/../../../following-sibling::android.view.View/android.view.View/android.view.Spinner");
            ele = By.xpath("//span[@id='lbl_PREFERREDLANGUAGE']/../../following-sibling::div//select");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Preferred_Language_Select(String lang) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.widget.CheckedTextView[@text='"+lang+"']");
            ele = By.xpath("//span[@id='lbl_PREFERREDLANGUAGE']/../../following-sibling::div//select/option[.='"+lang+"']");
      
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Remarks() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Remarks']/../../following-sibling::android.view.View/android.view.View/android.view.EditText");
            ele = By.xpath("//span[.='Remarks']/../../following-sibling::div//input");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Note() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Note: Fee will be levied to the account for which the IBAN certificate is requested. On successful transaction completion, Balance certificate will also be sent to your CBX-R Mail box.']");
            ele = By.xpath("//span[@name='NOTE_IBAN_CERT' or @name='NOTE_BAL_CERT']");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Next() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='NEXT']");
            ele = By.xpath("//a[.='NEXT']");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Review_AccountNumber() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Account Number']/../../../following-sibling::android.view.View/android.view.View/android.view.View");
            ele = By.xpath("//span[@id='lbl_ACCOUNTID']/../../following-sibling::div//span");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Review_AvailableBalance() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Available Balance']/../../../following-sibling::android.view.View/android.view.View");
            ele = By.xpath("//span[@id='lbl_AVAILABLEBALANCE']/../../following-sibling::div//span");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Review_PreferredLanguage() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Preferred Language']/../../../following-sibling::android.view.View/android.view.View/android.view.View");
            ele = By.xpath("//span[@id='lbl_PREFERREDLANGUAGE']/../../following-sibling::div//span");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Review_Fee() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Fee']/../../following-sibling::android.view.View/android.view.View");
            ele = By.xpath("//span[.='Fee']/../../following-sibling::div//span");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Review_Remarks() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Remarks']/../../following-sibling::android.view.View/android.view.View/android.view.View");
            ele = By.xpath("//span[.='Remarks']/../../following-sibling::div//span");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Confirmation_Success_msg() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Your IBAN certificate transaction was successful.']");
            ele = By.xpath("//label[.='Your IBAN certificate transaction was successful.' or .='Your balance certificate transaction was successful.']");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Confirmation_Share() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.widget.Button[@text='SHARE IBAN CERTIFICATE']");
            ele = By.xpath("//button[.='SHARE IBAN CERTIFICATE' or .='SHARE BALANCE CERTIFICATE']");
            
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By IBAN_Balance_Confirmation_Download() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.widget.Button[@text='DOWNLOAD IBAN CERTIFICATE']");
            ele = By.xpath("//button[.='DOWNLOAD IBAN CERTIFICATE' or .='DOWNLOAD BALANCE CERTIFICATE']");
      
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Balance Certificate
	
	public By Balance_Certificate_Workspace() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Balance Certificate']");
//            ele = By.xpath("");
        	ele = By.xpath("//div[@class='ACCOUNTS_CONTXT_SWS']//ul//a[.='Balance Certificate']");
           
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Balance_Heading_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//            ele = By.xpath("//android.view.View[@text='Balance Certificate']");
        	ele = By.xpath("//h3[.='Balance Certificate']");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Homepage 12-07-2020
	
	public By You_Have() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='You have']/../p");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By You_Owe() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='You owe']/../p");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By You_Have_Portfolio() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@data-target='#accounts']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By You_Have_Portfolio_Products() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@class='accordionList-body']/ul)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By You_Owe_Portfolio() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@data-target='#cards']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By You_Have_Portfolio_ProductName_And_Number(String accnt_type,String accnt_number) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h6[.='"+accnt_type+"']/../p[.='"+accnt_number+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By You_Have_Portfolio_ProductName_And_Balance(String accnt_type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h6[.='"+accnt_type+"']/../following-sibling::div//p[.='Available Balance']/../span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By You_Owe_Portfolio_ProductName_And_Number(String accnt_type,String accnt_number) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h6[.='"+accnt_type+"']/../p[.='"+accnt_number+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By You_Owe_Portfolio_ProductName_And_Balance(String accnt_type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h6[.='"+accnt_type+"']/../following-sibling::div/p[.='Outstanding Balance']/../span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Al Rabeh Certificate
	
	//Summary
	
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
	
	public By Al_Rabeh_Certificate_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[.='Al Rabeh Certificate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
//	public By Overlay() {
//		By ele = null;
//        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("//div[@class='moreOverlay']");
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
	
	public By Al_Rabeh_Certificate_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Al Rabeh Certificate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By AL_Rabeh_Certificate_Product_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//h4[.='Al Rabeh Certificate'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Al_Rabeh_Certificate_Number(int i) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//h4[.='Al Rabeh Certificate']/../span[2])["+i+"]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Al_Rabeh_Certificate_Summary() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='ALRABEH_SUMMARY_VIEW']//div[@class='cards cardCrsl']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Al_Rabeh_Certificate_ChannelType() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//h4[.='Al Rabeh Certificate']/../span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Al_Rabeh_Certificate_CustomerName() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//h4[.='Al Rabeh Certificate']/../span[3])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Al_Rabeh_Certificate_Value() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[.='Certificate Value']/../p[2])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Al Rabeh Certificate Details
	
	public By Al_Rabeh_No_Of_Certificates() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='No. of Certificate(s)']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Al_Rabeh_From_Certificate_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='From Certificate Number']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Al_Rabeh_To_Certificate_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='To Certificate Number']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Al_Rabeh_Certificate_Issue_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Issue Date']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Purchase Al Rabeh Certificate from Accounts
	public By Accounts_Purchase_Al_Rabeh_Contextual_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("(//a[.='Purchase Al Rabeh Certificate'])[1]");
        	ele = By.xpath("//div[@class='ACCOUNTS_CONTXT_SWS']//ul//a[.='Purchase Al Rabeh Certificate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	// Purchase AL Rabeh Certificate
	
	public By Purchase_Al_Rabeh_Contextual_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("(//a[.='Purchase Al Rabeh Certificate'])[1]");
        	ele = By.xpath("//div[@class='ALRAEBH_CONTEXTUALAPP_SWS']//ul//a[.='Purchase Al Rabeh Certificate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_Al_Rabeh_Certificate_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Purchase Al Rabeh Certificate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_AR_Debit_From() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_PURCHASE_ALRABEH_CERT-DEBTORACCOUNT']/../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_AR_Debit_From_Selection(String accnt_num) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_PURCHASE_ALRABEH_CERT-DEBTORACCOUNT']/../following-sibling::div//select/option[.='"+accnt_num+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_Al_Rabeh_Available_Balance() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Available Balance']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_Al_Rabeh_Customer_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_PURCHASE_ALRABEH_CERT-ACCOUNTHOLDERNAME']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_Al_Rabeh_No_Of_Certificate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_PURCHASE_ALRABEH_CERT-NOOFCERTIFICATE']/../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_Al_Rabeh_Certificate_Value() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_PURCHASE_ALRABEH_CERT-CERTIFICATEVALUE']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_Al_Rabeh_Certificate_Note() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@name='PAC_NOTE']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_Al_Rabeh_Review_Details() {
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
	
	public By PAC_Review_Customer_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_PURCHASE_ALRABEH_CERT-ACCOUNTHOLDERNAME']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By PAC_Review_No_Of_Certificate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_PURCHASE_ALRABEH_CERT-NOOFCERTIFICATE']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By PAC_Review_Certificate_Value() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_PURCHASE_ALRABEH_CERT-CERTIFICATEVALUE']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By PAC_Review_Debit_From() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_PURCHASE_ALRABEH_CERT-DEBTORACCOUNT']/../following-sibling::div//span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By PAC_Review_Available_Balance() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Available Balance']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_Al_Rabeh_Confirmation_Message() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[.='Your Purchase Al Rabeh transaction was successful.']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Purchase_Another_Certificate_button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//button[.='Purchase Another Certificate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	
	//Redeem al rabeh cetificate
	
	public By Redeem_Al_Rabeh_Certificate_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("(//a[.='Redeem Al Rabeh Certificate'])[1]");
        	ele = By.xpath("//div[@class='ALRAEBH_CONTEXTUALAPP_SWS']//ul//a[.='Redeem Al Rabeh Certificate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Al_Rabeh_Certificate_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Redeem Al Rabeh Certificate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Al_Rabeh_Certificate_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_REDEEM_ALRABEH_CERT-ACCOUNTID']/../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Al_Rabeh_Certificate_Number_Selection(String number) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_REDEEM_ALRABEH_CERT-ACCOUNTID']/../following-sibling::div//select/option[.='"+number+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Al_Rabeh_Certificate_NoOfCertificate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_REDEEM_ALRABEH_CERT-NOOFCERTIFICATE']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Al_Rabeh_Certificate_FromCertficate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_REDEEM_ALRABEH_CERT-FROMCERTIFICATENO']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Al_Rabeh_Certificate_To_certificate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_REDEEM_ALRABEH_CERT-TOCERTIFICATENO']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Al_Rabeh_Certificate_Value() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_REDEEM_ALRABEH_CERT-CERTIFICATEVALUE']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Al_Rabeh_Certificate_CreditTo() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_REDEEM_ALRABEH_CERT-CREDITORACCOUNT']/../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Al_Rabeh_Certificate_CreditTo_Selection(String accnt_num) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_REDEEM_ALRABEH_CERT-CREDITORACCOUNT']/../following-sibling::div//select/option[.='"+accnt_num+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Review
	public By RARC_Review_Certificate_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_REDEEM_ALRABEH_CERT-ACCOUNTID']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By RARC_Review_NoOfCertificate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_REDEEM_ALRABEH_CERT-NOOFCERTIFICATE']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By RARC_Review_FromCertificate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_REDEEM_ALRABEH_CERT-FROMCERTIFICATENO']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By RARC_Review_ToCertificate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_REDEEM_ALRABEH_CERT-TOCERTIFICATENO']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By RARC_Review_CertificateValue() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_REDEEM_ALRABEH_CERT-CERTIFICATEVALUE']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By RARC_Review_Credit_To() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//label[@for='FORM_REDEEM_ALRABEH_CERT-CREDITORACCOUNT']/../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Al_Rabeh_Certificate_Confirmation_Msg() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[.='Your redeemtion of  Al Rabeh transaction was successful.']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	
	// Open New term deposits
	public By Open_New_Terms_Deposits_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@class='ACCOUNTS_CONTXT_SWS']//ul//a[.='Open New Deposit']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Open_New_Terms_Deposits_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Open New Term Deposit']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Type() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Type']/../../following-sibling::div//child::select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Currency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Currency']/../../following-sibling::div//child::select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Value_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Deposit Value Date']/../../following-sibling::div//child::span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Tenure() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Tenor']/../../following-sibling::div//child::select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Interest_Rate_Frequency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Interest Payment Frequency']/../../following-sibling::div//child::select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Amount']/../../following-sibling::div//child::input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Debit_Account() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Debit Account']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Rate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Rate']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Available_Balance() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Available Balance']/../../following-sibling::div//child::span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Account_Holder_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[text()='Account Name']/../../following-sibling::div//child::span)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Maturity_Instructiion() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Maturity Instruction']/../../following-sibling::div//child::select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Paid_To_Account() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Principal / Interest to be paid to']/../../following-sibling::div//child::select");
        	
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
        	ele = By.xpath("//label[@for='FORM_DEPOSIT_CREATE-DEP_TERMS_CHKBOX-0']//child::span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Deposit_Type() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Type']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Deposit_Currency() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Currency']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Deposit_Value_Date() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Value Date']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Deposit_Tenure() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Tenor']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Interest_Rate_Freq() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Interest Payment Frequency']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Deposit_Amount() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Amount']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Deposit_Rate() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Deposit Rate']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Debit_Account() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Debit Account']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Available_Balance() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Available Balance']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Customer_Name() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Account Name']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Maturity_Instruction() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Maturity Instruction']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By ONDR_Paid_To_Account() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[text()='Principal / Interest to be paid to']/../../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Open_New_Term_Deposit_ConfirmationMessage() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[contains(text(),'success')]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Open_Another_Deposit_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//button[.='Open Another Deposit']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	
	// Homepage mailbox
	
	public By MailBox_workspace() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[.='Mailbox']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Inbox() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Inbox']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Inbox_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Inbox']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Inbox_Table_Sub() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='MAIL_INBOX_WGT']//div[@class='ws-list-row renderedRecords'][1]//div[@class='media-body m-grid-description align-self-center']");
        
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Message_Icon() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("//div[@name='MAIL_INBOX_WGT']//div[@class='ws-list-row renderedRecords'][1]//div[@class='circle45 bg-C']");
        	ele = By.xpath("//div[@name='VW_RETAIL_INBOX']//tbody/child::div[1]/child::div[1]/child::div[1]//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Message_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("//div[@name='MAIL_INBOX_WGT']//div[@class='ws-list-row renderedRecords'][1]//div[@class='ml-3 text-right']");
        	ele = By.xpath("//div[@name='VW_RETAIL_INBOX']//tbody/child::div[1]/child::div[1]/child::div[2]//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Swipe_Left() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='MAIL_INBOX_WGT']//div[@class='ws-list-row renderedRecords'][1]//span[@class='swipeLeftSpan']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Swipe_Right() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='MAIL_INBOX_WGT']//div[@class='ws-list-row renderedRecords'][1]//span[@class='swipeRightSpan']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Delete_Option() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("(//div[@name='MAIL_INBOX_WGT']//div[@class='ws-list-row renderedRecords'][1]//span[.='Delete'])[1]");
        	ele = By.xpath("(//div[@name='VW_RETAIL_INBOX']//tbody/child::div[1]//span[.='Delete'])[1]");
        	//done
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Archive_Option() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("(//div[@name='MAIL_INBOX_WGT']//div[@class='ws-list-row renderedRecords'][1]//span[.='ARCHIVE'])[1]");
        	ele = By.xpath("//div[@name='VW_RETAIL_INBOX']//tbody/child::div[1]//span[.='ARCHIVE']");
        	
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By View_Message_Details() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='View Message Details']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Date']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Subject() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Subject']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Category() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Category']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Sub_Category() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Sub-Category']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Initial_Reference_No() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Initial Reference No']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Reference_No() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Reference Number']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Message() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Message']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Message_Note() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='MAIL_INBOX_WGT']//div[@data-item-id='portlet-detail-message']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By MailBox_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Mailbox']");
        	
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
	
	//Date Picker
	public By AS_MonthSelection() {
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
    public By AS_DateSelection() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
            ele = By.xpath("(//div[@class='ap-component-selector'])[2]");       
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
               
        ele = By.xpath("");
        }
       
            return ele;
    }
   
    public By AS_YearSelection() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
            ele = By.xpath("(//div[@class='ap-row ap-row-selected'])[3]");       
            }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
                   
            ele = By.xpath("");
            }
           
            return ele;
    }
   
    public By AS_Selected_Year() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            ele = By.xpath("//android.view.View[@resource-id='ap-component-2']/android.view.View/android.widget.ListView/android.view.View[@selected='true']");       
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
               
            ele = By.xpath("");
        }
           
            return ele;
    }
    
    public By AS_Date_Set() {
        By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
            //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
            ele = By.xpath("//a[text()='Set']");       
            }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
                   
            ele = By.xpath("");
            }
           
            return ele;
    }
    
    //Favourite Transfer
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
        	ele = By.xpath("(//div[@class='FAV_TRANS_SWS']//div[@class='cards']//p)[1]");
        	
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
        	ele = By.xpath("(//div[@class='FAV_TRANS_SWS']//div[@class='cards']//p)[2]");
        	
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
        	ele = By.xpath("(//div[@class='FAV_TRANS_SWS']//div[@class='cards']//p)[3]");
        	
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
        	ele = By.xpath("(//div[@class='FAV_TRANS_SWS']//div[@class='cards']//p)[4]");
        	
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
        	ele = By.xpath("(//button[.='repeat' or .='Repeat' or .='REPEAT'])[1]");
        	
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
	
}
