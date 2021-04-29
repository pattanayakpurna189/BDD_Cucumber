package IB.Page;

import org.openqa.selenium.By;

public class AccountsPage {
	
	
    public By Accounts_Heading() {
        //return By.xpath("//div[@class='ACCOUNTS_NOTE_SWS']//h3[.='Accounts']/../p[.='Access and manage your money, with ease.']");
        return By.xpath("//p[text()='Access and manage your money, with ease']/..//child::h3[contains(text(),Accounts)]");
      
    }
   
    //(//div[contains(@class,'ACCOUNT_NOTE_WGT')])[3]//div//div//h3[.='Accounts']/../p[.='Access and manage your money, with ease.']
    
    public By Accounts_Summary() {
        return By.xpath("//div[@name='ACCOUNTS_SUMMARY_SWS']");
    }
       
    public By Accounts_Statement_Link() {
        return By.xpath("//a[text()='Account Statement']");
    }
   
    public By Accounts_Statement_PeriodSelection_Drpdown() {
        return By.xpath("//select[@id='FORM_ACCOUNT_STATEMENT-STATEMENT_TYPE']");
    }

    
    //Aswini may-07
    
    public By Accounts_Summary_Caroussels() {
        return By.xpath("//div[@class='ACCOUNTS_SUMMARY_SWS']");
    }
    
    public By All_Accounts(String AccounsType) {
        return By.xpath("//div[@name='ACCOUNT_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//h4[text()='"+AccounsType+"']");
    }
    
    //(//div[@name='ACCOUNT_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//h4[text()='Current Account']/../span)[1]
    public By All_Accounts_Status(String AccounsType) {
        return By.xpath("(//div[@name='ACCOUNT_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//h4[text()='"+AccounsType+"']/../span)[1]");
    }
    
    
    public By All_Accounts_Number(String AccounsType) {
        return By.xpath("(//div[@name='ACCOUNT_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//h4[text()='"+AccounsType+"']/../span)[2]");
    }
    
    public By All_Accounts_Holder_Name(String AccounsType) {
        return By.xpath("(//div[@name='ACCOUNT_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//h4[text()='"+AccounsType+"']/../span)[3]");
    }
    
    
  
    public By Acc_Details_Share_Button() {
        return By.xpath("//a[@class='dtl_val detailBtn share']");
    }
    
    
    public By Home_Main_Burger_Menu_Modules(String ModuleName) {
		return By.xpath("//a[text()='"+ModuleName+"']");
	}
	
    public By Amount_In_Account(String ModuleName) {
		return By.xpath("//a[text()='"+ModuleName+"']");
	}
    
    //Aswini June-08
    public By Available_Balance_Label_In_Carousel(String AccounsType) {
        return By.xpath("(//div[@name='ACCOUNT_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//h4[text()='"+AccounsType+"']//parent::div//parent::div//parent::div//div)[4]/p[contains(text(),'Available Balance')]");
    }
   
    public By Available_Balance_In_Carousel(String AccounsType) {
        return By.xpath("((//div[@name='ACCOUNT_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//h4[text()='"+AccounsType+"']//parent::div//parent::div//parent::div//div)[4]/p)[2]");
    }
    
    /*public By CurrCode_Near_Available_Balance_In_Carousel() {
        return By.xpath("(//div[@name='ACCOUNT_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div/p)[2]/small");
    }
    */
    //Aswini June-09
    
   //Accout details
    
    public By Acc_Details_IBAN_Label() {
        return By.xpath("(//div[@class='ACCOUNT_DETAILS_SWS']/div/div/div/div/div/div/div/div/div)[1]/div/p");
    }
    
    
    public By Acc_Details_IBAN_Number() {
        return By.xpath("(//div[@class='ACCOUNT_DETAILS_SWS']/div/div/div/div/div/div/div/div/div)[1]/div/a");
    }
    
    public By Acc_Details_QAR_Equivalent_Label() {
        return By.xpath("//p[text()='QAR Equivalent']");
        //return By.xpath("((//div[@class='ACCOUNT_DETAILS_SWS']/div/div/div/div/div/div/div/div/div)[2]//div)[1]/p");
    }
    
    
    public By Acc_Details_QAR_Equivalent_CurrCode() {
        return By.xpath("(//p[text()='QAR Equivalent']//following::h4)[1]/small");
    }
    
    public By Acc_Details_QAR_Equivalent_Amount() {
        return By.xpath("(//p[text()='QAR Equivalent']//following::h4)[1]");
    }
    
    
    public By Acc_Details_Over_Draft_Limit_CurrCode() {
        return By.xpath("(//p[text()='Overdraft Limit']//following::h4)[1]/small");
    }
    
    public By Acc_Details_Over_Draft_Limit_Label() {
        
    	return By.xpath("//p[text()='Overdraft Limit']");
    	//return By.xpath("((//div[@class='ACCOUNT_DETAILS_SWS']/div/div/div/div/div/div/div/div/div)[2]//div)[2]/p");
    	
    }
    
    public By Acc_Details_Over_Draft_Limit_Amount() {
        
    	return By.xpath("(//p[text()='Overdraft Limit']//following::h4)[1]");
    	
    	
    }
    
    public By Acc_Details_Cheques_In_Clearing_Label() {
        //return By.xpath("//p[text()='Cheques in Clearing']");
    	return By.xpath("//p[text()='Amount in Clearing']");
    }
    
    public By Acc_Details_Cheques_In_Clearing() {
        return By.xpath("((//div[@class='ACCOUNT_DETAILS_SWS']/div/div/div/div/div/div/div/div/div)[2]//div)[3]/h4");
    }
    
    
    
    public By Acc_Details_Account_Branch_Name_Label() {
        return By.xpath("//p[text()='Account Branch Name']");
    }
    
    public By Acc_Details_Account_Branch_Name() {
        return By.xpath("((//div[@class='ACCOUNT_DETAILS_SWS']/div/div/div/div/div/div/div/div/div)[2]//div)[4]/h4");
    }
    
    
    public By Acc_Details_Hold_Amount_Label() {
        return By.xpath("//p[text()='Hold Amount']");
    }
    
    public By Acc_Details_Hold_Amount_Value() {
        return By.xpath("//p[text()='Hold Amount']//following::h4");
    }
    
  
    
// Aswini June-10
    // Accounts Page
    public By Acc_Statement_in_Contexual_Menu() {
        return By.xpath("//a[text()='Account Statement']");
    } 
    
    
    public By Acc_Statement_Apply_Button() {
    	
    	return By.xpath("//button[@name='SEARCH']");
    	//return By.xpath("//button[text()='Apply']");
    	//return By.cssSelector("button[name='SEARCH']");
    	//return By.id("FORM_ACCOUNT_STATEMENT-SEARCH");
    	
    	
    } 
    
    public By Acc_Statement_Date_Label() {
        return By.xpath("//p[text()='Date']");
    } 
  
    public By Acc_Statement_Description_Label() {
        return By.xpath("//p[text()='Description']");
    } 
    
    public By Acc_Statement_DebitorCredit_With_QAR_Label() {
        return By.xpath("//p[contains(text(),'Debit / Credit') and contains(text(),'(QAR')]");
    } 
    
    
    public By Acc_Statement_Balance_Amount_With_QAR_Label() {
        return By.xpath("//p[contains(text(),'Balance Amount') and contains(text(),'(QAR')]");
    } 
    
    public By Acc_Statement_Period_Section_DropDown() {
        return By.cssSelector("select[name='STATEMENT_TYPE']");
    } 
    
    public By Acc_Statement_Select_Month_DropDown() {
        //return By.xpath("(//span[text()='Select Month']/span//following::div)[1]/div/select");
       // return By.xpath("//select[@id='FORM_ACCOUNT_STATEMENT-MONTH']");
        return By.cssSelector("select[name='MONTH']");
       
        
    } 
    
    public By Acc_Statement_First_Record_Displayed() {
        return By.xpath("(//p[contains(text(),'Balance Amount')]//following::div)[1]");
    }
    
    public By Acc_Statement_No_Record_Found() {
        return By.xpath("//span[contains(text(),'No record found')]");
    }
  
 
    
    public By Acc_Statement_1srRecord_Date_Value() {
        return By.xpath("((//p[contains(text(),'Balance Amount')]//following::div)[1]/div)[1]");
    }
 
	 public By Acc_Statement_1srRecord_Description_Value() {
	     return By.xpath("((//p[contains(text(),'Balance Amount')]//following::div)[1]/div)[2]");
	 }
	 
	 public By Acc_Statement_1srRecord_DebitorCredit_Value() {
	     return By.xpath("((//p[contains(text(),'Balance Amount')]//following::div)[1]/div)[3]");
	 }
	 
	 public By Acc_Statement_1srRecord_Balance_Amount_Value() {
	     return By.xpath("((//p[contains(text(),'Balance Amount')]//following::div)[1]/div)[4]");
	 }
	 
	 //Purna****************
	 public By Acc_Statement_From_Date_Calender_Btn() {
	     return By.xpath("//input[@name='FROM_DATE']");
	 }
	 
	 public By Acc_Statement_To_Date_Calender_Btn() {
	     return By.xpath("//input[@name='TO_DATE']");
	 }
	 
	 public By Acc_Statement_Payment_Date_Calender_Btn() {
	     return By.xpath("//input[@name='VALUE_DATE']");
	 }
	 
	////input[@name='FROM_DATE']/../span/i
	 public By Acc_Statement_CurrentMon_Year() {
	     return By.xpath("//th[@title='Select Month']");
	 }
	 
	 public By Acc_Statement_Prev_Month_Btn() {
	     return By.xpath("//th[@title='Select Month']/..//th[@data-action='previous']");
	 }
	 
	 public By Acc_Statement_Next_Month_Btn() {
	     return By.xpath("//th[@title='Select Month']/..//th[@data-action='next']");
	 }
	 
	 public By Acc_Statement_Exact_Day_Txt(String M_D_Y) {
	     return By.xpath("//th[@title='Select Month']/../../following-sibling::tbody[1]/tr/td[@data-day='"+M_D_Y+"']");
	 }
	 
	
	 
	 public By Acc_Statement_To_Date() {
		 return By.xpath("//input[@name='TO_DATE']/../span/i[1]");
	   
	 }
    
    
	 public By Acc_Statement_From_Date_Picker() {
		 return By.xpath("(//i[@class='flaticon-calendar-new'])[1]");
	   
	 }
	 
	 public By Acc_Statement_Load_More_Button() {
		 return By.xpath("//em[text()='-- Load More --']");
	   
	 }
	 
	 
	
	 
	 
	 public By Acc_Statement_To_Date_Picker() {
		 return By.xpath("(//i[@class='flaticon-calendar-new'])[2]");
	   
	 }
	 
	 
    public By Balance_Certificate_in_Contexual_Menu() {
        return By.xpath("//a[text()='Balance Certificate']");
    } 
    
    public By IBAN_Certificate_in_Contexual_Menu() {
        return By.xpath("//a[text()='IBAN Certificate']");
    } 
    
  // Aswini Jun-15 Accounts page
    
    public By AccountsPage_Next_Button() {
        return By.xpath("//button[.='Next']");
    } 
    
    
  //Aswini Jun-16

  
    
    public By AccountsPage_All_Account_Currency_Code() {
        return By.xpath("//p[@class='amount']/small");
    } 
    
    public By AccountsPage_1st_Account_Currency_Code() {
        return By.xpath("(//p[@class='amount']/small)[1]");
    } 
    
    
    
    
  //Aswini Jun-17

  	//Request for E-Statement

  	public By EStatement_Contextual_Menu() {
  		return By.xpath("//a[text()='Register for E-Statements']");
  	} 
  	
  	public By EStatement_Primary_Email_Id_Label() {
  		return By.xpath("//span[text()='Primary E-mail ID']");
  	} 
  	
  	public By EStatement_Registered_Primary_Email_Id_() {
  		return By.xpath("//input[@id='FORM_E_STATEMENT-PRIMARYEMAILID']");
  	} 
  
  	public By EStatement_Enrollment_Status_Label() {
  		return By.xpath("//span[text()='Enrollment Status']");
  	} 

  	public By EStatement_Enrollment_Status() {
  		return By.xpath("//input[@id='FORM_E_STATEMENT-ENROLLMENTSTATUS']");
  	} 
  	
  	public By EStatement_Check_Box() {
  		return By.xpath("//input[@name='E_ENROLLMENT_CHKBOX']//following::span[1]");
  	} 

  /*	public By EStatement_Next_Button() {
  		return By.xpath("(//a[contains(text(),'NEXT')])[1]");
  	} 
  	*/
 //  Aswini June-22
  	
  	
  	public By Accounts_Statement_Date_List() {
  		return By.xpath("//div[@name='ACCOUNT_STATEMANT_VIEW']//tbody//div[contains(@class,'Row')]/div[1]/h3");
  	} 
  	
  	
  //priya ---jun-21//
  	
  	
  	 //ChequeBook Request
  	  	
  	  	
  	  	public By ChequeBook_request() {
  	  		return By.linkText("Cheque Book Request");
  	  	} 
  	  	
  	  
  	  	
  	  	public By ChequeBook_Header() {
  	  		return By.xpath("//h3[.='Cheque Book Request']");
  	  	} 
  	  	
  	  	
  	  	
  	  	public By  CurrentActive_account() {
  	  		return By.xpath("//span[.='Active']/..");
  	  	}	
  		public By  Curren_account() {
  	  		return By.xpath("//span[.='Active']/..//h4");
  	  	}	
  		
  		public By CBR_AccountNumber() {
  	  		return By.xpath("//span[.='Account Number']/../../following-sibling::div[1]//select");
  	  	}	
  		
  		public By CBR_AvailableBalanace() {
  	  		return By.xpath("//span[.='Available Balance']/../../following-sibling::div[1]//span[@name='AVAILABLEBALANCE']");
  	  	}		
  		
  		
  		
  		public By No_of_ChequeBook() {
  	  		return By.xpath("//span[contains(text(),'Number of Cheque Book')]/../../following-sibling::div[1]//select");
  	  		
  	  	}
  		
  		public By No_of_Leaves() {
  	  		return By.xpath("//span[contains(text(),'Number of Leaves')]/../../following-sibling::div[1]//select");
  	  		
  	  	}
  				
  		public By Deivery_Option() {
  	  		return By.xpath("//span[contains(text(),'Delivery Option')]/../../following-sibling::div[1]//select");
  	  		
  	  	}
  		
  		public By Deivery_Branch() {
  	  		return By.xpath("//span[contains(text(),'Delivery Branch')]/../../following-sibling::div[1]//select");
  	  		
  	  	}
  		
  		
  		public By CBR_Remarks() {
  	  		return By.xpath("//input[@id='FORM_CHQ_BOOK-REMARKS']");
  	  		
  	  	}
  		
  		public By Checkbox_Authorize() {
  	  		return By.cssSelector("span.rd_cstmz");
  	  		
  	  	}
  		
  		
  	//CheckBook Review	
  		
  		public By Chekbox_ReviewDetailsHeader() {
  	  		return By.linkText("//h3[.='Review Details']");
  	  		
  	  	}
  		
  		public By REview_No_of_Leaves() {
  	  		return By.xpath("//span[contains(text(),'Number of Leaves')]/../../following-sibling::div[1]//span[1]");
  	  		
  	  	}
  		public By Review_No_of_ChequeBook() {
  	  		return By.xpath("//span[contains(text(),'Number of Cheque Book')]/../../following-sibling::div[1]//span[1]");
  	  		
  	  	}
  		
  		
  		public By Review_AccountNumber() {
  	  		return By.xpath("//span[.='Account Number']/../../following-sibling::div[1]//span[@name='ACCOUNTID']");
  	  	}	
  		public By Review_Deivery_Option() {
  	  		return By.xpath("//span[contains(text(),'Delivery Option')]/../../following-sibling::div[1]//span[1]");
  	  		
  	  	}
  		
  		public By Review_Deivery_Branch() {
  	  		return By.xpath("//span[contains(text(),'Delivery Branch')]/../../following-sibling::div[1]//spa[1]");
  	  		
  	  	}
  		
  		public By Review_Remarks() {
  	  		return By.xpath("//span[@name='REMARKS']");
  	  		
  	  	}
  		public By Review_OTP() {
  	  		return By.xpath("//span[contains(text(),'OTP')]/../../following-sibling::div[1]//input");
  	  		
  	  	}
  		public By Review_Resend_OTP() {
  	  		return By.linkText("Resend OTP");
  	  		
  	  	}
  		
  		public By Review_submit() {
  	  		return By.cssSelector("//div[@data-item-id='rightBBARContainer']//a[@data-item-id='SUBMIT']");
  	  		
  	  	}
  		public By EStatement_Next_Button() {
  	  		return By.xpath("//div[@data-item-id='rightBBARContainer']//a");
  	  		
  	  	}
  		
  		//CheckBook Failure
  		
  		
  		public By CBR_CrossSymbol() {
  	  		return By.xpath("//img[@src='iportal/images/txnStatus/failure.png']");
  	  		
  	  	}
  		
  		
  		public By CBR_CancelError() {
  	  		return By.xpath("//label[.='Your cheque book request transaction could not go through. Please try again.']");
  	  		
  	  	}

  		public By CBR_ReferrenceNo() {
  	  		return By.xpath("//span[.='Reference Number']/../../following-sibling::div[1]//span");
  	  		
  	  	}
  		
  		public By CBR_DateandTime() {
  	  		return By.xpath("//span[.='Date / Time']/../../following-sibling::div[1]//span");
  	  		
  	  	}
  		public By CBR_goBAck() {
  	  		return By.cssSelector("a[data-item-id='BACK']");
  	  		
  	  	}
  		public By CBR_Dropdown_Error() {
  	  		return By.xpath("//span[.='Please select the Number of Cheque Book(s)']");
  	  		
  	  	}
  		
  		
  		public By CBR_Dropdown_Error2() {
  	  		return By.xpath("//span[.='Please select the Number of Leaves per Cheque Book']");
  	  		
  	  	}
  		public By OTP_error() {
  	  		return By.xpath("//span[.=' Please enter your One Time Password (OTP)']");
  	  		
  	  	}
  		public By CBR_Dropdown_Error3() {
  	  		return By.xpath("	//span[.='Please enter the Remarks']");
  	  		
  	  	}
  		public By OTP_Manadate_error() {
  	  		return By.xpath("(//span[.='Please enter the OTP'])[1]");
  	  		
  	  	}
  		
  		public By OTP_Invalid_error() {
  	  		return By.xpath("//span[.='OTP entered is incorrect. Please try again']/span");
  	  		
  	  	}
  		
  //Aswini Jul-13
  	
  		public By Open_New_Deposit_Contexual_Menu() {
  	        return By.xpath("//a[text()='Open New Deposit']");
  	    } 
  		
  		public By Purchase_Al_Rabeh_Certificate_in_Contexual_Menu() {
  	        return By.xpath("//a[text()='Purchase Al Rabeh Certificate']");
  	    } 

  		
  		
  		
  	//Aswini Jul-14
  		
  	
  		
  		public By Data_Entry_Screen_All_DropDowns(String str) {
  	        return By.xpath("//span[contains(text(),'"+str+"')]/../../following::div[2]/select");
  	    }	
  		
  		public By Data_Entry_Screen_All_NonEditable_Text_Fields(String str) {
  	        return By.xpath("(//span[contains(text(), '"+str+"')]/../../following::div[1]/div/span)[1]");
  	    }
  		
  		public By Data_Entry_Screen_All_Editable_Text_Fields(String str) {
  	        return By.xpath("//span[contains(text(),'"+str+"')]/../../following::div[2]/input");
  	    }
  		
  		public By Data_Entry_Screen_I_Accept_Check_Box() {
  	        return By.xpath("(//input[@name='DEP_TERMS_CHKBOX']//following::span)[1]");
  	    } 
  		
  		public By Data_Entry_Screen_Next_Button() {
  	        return By.xpath("(//a[@data-item-id='NEXT'])[1]");
  	    } 
  		
  		public By Accounts_Preconfirm_Page_All_Fields(String fieldname1, String fieldname2) {
  	    	return By.xpath("(//span[text()='"+fieldname1+"']/../../following-sibling::div//child::span[contains(text(),'"+fieldname2+"')])[1]");
  	     }
  		
 //Aswini Jul-19 	
  		public By Accounts_WorkSpace_More_icon() {
  			return By.xpath("//div[@class='ACCOUNTS_CONTXT_SWS']/div//a[@class='dropdown-toggle']");	
  		}

  	
  		
//Aswinis July-28 #########Hold Amount#########
  		
  	
  	
  		public By Accounts_Details_All_Acc_No_In_Carousel_For_Accountt_Selection(String accno, String  acctype) {
  			return By.xpath("//div[@name='ACCOUNT_SUMMARY_VIEW']/table/tbody/div/div/div//span[contains(text(),'"+accno+"')]/../h4[contains(text(),'"+acctype+"')]");	
  		}
  		
  		public By Accounts_Details_HoldAmount_Button() {
  			return By.xpath("//p[.='Hold Amount']/../a");	
  		}
  	
  		
  		public By Accounts_Details_HoldAmount_Details_Date() {
  			return By.xpath("(//p[contains(text(), 'Date')]/../../following::div[1]/div/p)[1]");	
  		}
  	

  		public By Accounts_Details_HoldAmount_Details_Description() {
  			return By.xpath("(//p[contains(text(), 'Description')]/../../following::div[1]/div/p)[2]");	
  		}
  		
  		public By Accounts_Details_HoldAmount_Details_Ref_Num() {
  			return By.xpath("(//p[contains(text(), 'Reference Number')]/../../following::div[1]/div/p)[3]");	
  		}
  		
  		public By Accounts_Details_HoldAmount_Details_HoldAmount() {
  			return By.xpath("(//p[contains(text(), 'Hold Amount')]/../../following::div[1]/div/p)[4]");	
  		}

  		
  		//Aswini Jul-29
  		public By OTP_Resend_OTP() {
  	  		return By.xpath("//a[@name='RESEND_OTP']");
  	  		
  	  	}
  		
  	
}













