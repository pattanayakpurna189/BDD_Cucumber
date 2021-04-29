package MB.Page;

import org.openqa.selenium.By;

import managers.DataManager;

public class LoansPage {
	
	DataManager data = new DataManager();
	
	//Loan Summary
	public By Borrowing_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Borrowings']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Product_Type(int i) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='LOAN_SUMMARY_VIEW']//div[@class='cards cardCrsl']//child::h4)["+i+"]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Number(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h4[.='"+type+"']/following-sibling::span[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Summary_Carousel() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='LOAN_SUMMARY_VIEW']//div[@class='cards cardCrsl']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Account_Holder_Name(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h4[.='"+type+"']/following-sibling::span[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Outstanding_Balance(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h4[.='"+type+"']/../../following-sibling::div/div/p[2]");
        	
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
	
	//Loan details
	
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
	
	public By Loan_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Loan Account Number']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Disbursement_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Disbursed Amount']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Interest_Rate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Interest Rate']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Tenure() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Loan Tenure']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Remaining_Tenure() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Remaining Tenure']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_First_Installment_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='First Installment Date']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Last_Installment_Datet() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Last Installment Date']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Next_Installment_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Next Installment Due Date']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Next_Installment_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Next Installment Due Amount']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Outstanding_Principal() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Outstanding Principal']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Accrued_Interest() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Accrued interest']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Overdue_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Overdue Amount']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Number_Of_Deferment() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Number of Deferment']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Number_Of_Overdue_Days() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Number of Overdue days']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Loan Repayment Schedule
	
	public By LOan_Repayment_Schedule_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Loan Repayment Schedule']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Repayment_Due_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Due Date']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Repayment_Due_Date_Val() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[.='Due Date']/../../following-sibling::div//h3)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Repayment_EMI() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[.='Due Date']/../following-sibling::div/p)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Repayment_EMI_Val() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[.='Due Date']/../../following-sibling::div//h3)[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Repayment_Status() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Status']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Loan_Repayment_Status_Val() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//p[.='Status']/../../following-sibling::div//h3)[3]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}

}
