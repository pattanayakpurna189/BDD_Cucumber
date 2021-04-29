package MB.Page;

import org.openqa.selenium.By;

import managers.DataManager;

public class DepositPage {
	
	DataManager data = new DataManager();
	
	
	//Deposits Summary
	
	public By Deposit_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Deposits']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Product_Type(int i) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@name='DEPOSITS_SUMMARY_VIEW']//div[@class='cards cardCrsl']//child::h4)[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Number(String type) {
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
	
	public By Deposit_Holder_Name(String type) {
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
	
	public By Deposit_Amount(String type) {
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
	
	public By Deposit_Summary_Carousel() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@name='DEPOSITS_SUMMARY_VIEW']//div[@class='cards cardCrsl']");
        	
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
	
	//Deposit Details
	
	public By Deposit_details_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Deposit Details']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Reference_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Deposit Reference Number']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Type_Details() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Deposit Type']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Account_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Account Number']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Amount_Details() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Deposit Amount ']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Rate_Details() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Deposit Rate']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Maturity_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Maturity Date ']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Maturity_Instruction() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Maturity Instruction']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Hold_Description() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Hold Description']/../h4");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Redeem deposit
	
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
	
	public By Redeem_Deposit_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[@data-widgetid='DEPOSIT_CONTEXT_WGT']//ul//a[.='Redeem Deposit']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Deposit_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Redeem Deposit']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Deposit_Note() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Note:']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Deposit_Deal_Number() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_REDEEM_DEPOSIT-DEALREFERENCENO']/../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Account_Name() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Account Name']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Deposit_Type() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Deposit Type']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Deposit_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Deposit Amount']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Deposit_Tenure() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Deposit Tenor']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Deposit_Value_Date() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Deposit Value Date']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Maturity_Instruction() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Maturity Instruction']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Deposit_Rate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Deposit Rate']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Penalty_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Penalty Amount']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Interest_Payment_Freq() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Interest Payment Frequency']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Paid_To_Account() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_REDEEM_DEPOSIT-CREDITORACCOUNT']/../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Redeem_Remarks() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[.='Remarks']/../../following-sibling::div//input");
        	
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
	
	public By Deposit_Deal_Number_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_REDEEM_DEPOSIT-DEALREFERENCENO']/../following-sibling::div//span");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Paid_To_Account_Review() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='FORM_REDEEM_DEPOSIT-CREDITORACCOUNT']/../following-sibling::div//span");
        	
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
        	ele = By.xpath("//span[.='Remarks']/../../following-sibling::div");
        	
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
	
	public By Redeem_Deposit_Confirmation_Message() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[.='Your Redeem Deposit transaction was successful.]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}

	//confirmation message
	
		public By Confirmation_Tick_Symbol() {
		    By ele = null;
		    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//		        ele = By.xpath("//android.widget.Image[@text='success']");
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
//		        ele = By.xpath("");
		        
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
//		        ele = By.xpath("//android.view.View[@text='Reference Number']/../../following-sibling::android.view.View/android.view.View/android.view.View");
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
//		        ele = By.xpath("//android.view.View[@text='Date / Time']/../../following-sibling::android.view.View/android.view.View/android.view.View");
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
//		        ele = By.xpath("//android.view.View[@text='Note: Please quote the above reference number in all communications with Ahli Bank.']");
//		    	ele = By.xpath("//span[.='Note: Please quote the above reference number in all communications with Ahli Bank.']");
//	        	ele = By.xpath("//span[.='Date / Time']/ancestor::div[12]/following-sibling::div//span[.='Note: Please quote the above reference number in all communications with Ahli Bank.']");
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
//			            ele = By.xpath("//android.widget.Button[@text='DONE. GO BACK']");
			           ele = By.xpath("//button[.='DONE. GO BACK']");
			        	
			        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			           
			            ele = By.xpath("");
			        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			           
			            ele = By.xpath("");
			        }
			        return ele;
		}
		
		//OTP
		public By OTP_Static_Lable() {
			By ele = null;
			if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//				ele = By.xpath("//android.view.View[@text()='Please enter your One Time Password (OTP)']");
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
//				ele = By.xpath("//(android.view.View[@text()='OTP']/../../../following-sibling::android.view.View//child::android.widget.EditText)["+i+"]");
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
//				ele = By.xpath("//android.view.View[@text='Resend OTP']");
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
//				ele = By.xpath("//android.view.View[@text='SUBMIT']");
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
//				ele = By.xpath("//android.view.View[@text='BACK']");
				ele = By.xpath("//a[.='Back' or .='BACK']");
				
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
				ele = By.xpath("");
			}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
				
				ele = By.xpath("");
			}
			return ele;
		}
		
		
		//open new term deposit
		// Open New term deposits
		public By Open_New_Terms_Deposits_Menu() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("//div[@class='DEPOSIT_FLOAT_SWS bansubact']//ul//a[.='Open New Deposit']");
	        	
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
		
//		public By Open_Another_Deposit_Button() {
//			By ele = null;
//	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//	        	ele = By.xpath("//button[.='Open Another Deposit']");
//	        	
//	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
//	           
//	            ele = By.xpath("");
//	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
//	           
//	            ele = By.xpath("");
//	        }
//	        return ele;
//		}
		
		//Deposit Stimulation
		
		public By Deposit_Stimulation_Menu() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("//div[@data-widgetid='DEPOSIT_CONTEXT_WGT']//ul//a[.='Deposit Simulation']");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Deposit_Stimulation_Notification() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("//textarea[.='Date of closure cannot be greater than maturity date']");
	        	
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
	        	ele = By.xpath("//a[.='Ok' or .='OK']");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Deposit_Stimulation_Heading() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("//h3[.='Deposit Simulation ']");
	        	
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
		
		public By Deposit_Stimulation_Deal_Number() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("//label[@for='FORM_DEP_SIM-DEALREFERENCENO']/../following-sibling::div//select");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Date_Picker() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("(//span[text()='Date of closure']/../../following-sibling::div//span/i)[1]");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Simulation_Button() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("//a[.='SIMULATE']");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Deposit_Amount_Simulation() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("(//span[.='Deposit Amount']/../../following-sibling::div//span[1])[1]");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Interest_Paid() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("(//span[.='Interest paid']/../../following-sibling::div//span[1])[1]");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Hold_Amount() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("(//span[.='Hold Amount']/../../following-sibling::div//span[1])[1]");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Net_Amount() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("(//span[.='Net Amount']/../../following-sibling::div//span[1])[1]");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Charges() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("(//span[.='Charges']/../../following-sibling::div//span[1])[1]");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		//Date Picker
			
		public By DS_MonthSelection() {
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
		
	    public By DS_DateSelection() {
	        By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
	            ele = By.xpath("(//div[@class='ap-component-selector'])[2]");       
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	               
	        ele = By.xpath("");
	        }
	       
	            return ele;
	    }
	   
	    public By DS_YearSelection() {
	        By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	            //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
	            ele = By.xpath("(//div[@class='ap-row ap-row-selected'])[3]");       
	            }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	                   
	            ele = By.xpath("");
	            }
	           
	            return ele;
	    }
	   
	    public By DS_Selected_Year() {
	        By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	            ele = By.xpath("//android.view.View[@resource-id='ap-component-2']/android.view.View/android.widget.ListView/android.view.View[@selected='true']");       
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	               
	            ele = By.xpath("");
	        }
	           
	            return ele;
	    }
	    
	    public By DS_Date_Set() {
	        By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	            //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
	            ele = By.xpath("//a[text()='Set']");       
	            }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	                   
	            ele = By.xpath("");
	            }
	           
	            return ele;
	    }
		
		//Update maturity instruction
		
		public By Update_Maturity_Instruction_Menu() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("//div[@data-widgetid='DEPOSIT_CONTEXT_WGT']//ul//a[.='Update Maturity Instruction']");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By Update_Maturity_Instruction_Heading() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}
		
		public By You_Have() {
			By ele = null;
	        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        	ele = By.xpath("");
	        	
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	           
	            ele = By.xpath("");
	        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	           
	            ele = By.xpath("");
	        }
	        return ele;
		}

}
