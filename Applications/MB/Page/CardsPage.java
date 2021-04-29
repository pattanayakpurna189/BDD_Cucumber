package MB.Page;

import org.openqa.selenium.By;

import managers.DataManager;

public class CardsPage {
	DataManager data = new DataManager();
	
	/*public By Workspace_Navigation(String fieldname) { 
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//android.view.View[@text='"+fieldname+"']");
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
}*/
	public By Workspace() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.view.View[@text='"+workspace+"']");
			//ele = By.xpath("//android.widget.TextView[@text='"+workspace+"']");
			// ele = By.xpath("//android.view.View[@content-desc='"+workspace+"']");
			 ele = By.xpath("(//a[@data-item-id='CARDS_WS'])[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	public By Cards_Heading() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("(//android.view.View[@text='Cards'])[1]");
			ele = By.xpath("(//div[text()='Cards'])[1]");
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
		
	}
	
	
	public By Cards_Carousel() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("(//android.view.View[@resource-id='content-block'])[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
	}
	public By Cards_Carousel_First() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("(//android.view.View[@resource-id='content-block'])[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View//");
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
	}
	public By All_Cards_Numbers(int itr) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("(//div[@name='CARD_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//p[contains(@class,'crdNumber')])["+itr+"]");
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
	}
	public By Card_Holder_Name(int itr) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		ele = By.xpath("(//div[@name='CARD_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//p[contains(@class,'cedName')])["+itr+"]");	
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
	}
	
	public By Card_Expiry_Date(int itr) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("(//div[@name='CARD_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//span[contains(@class,'pl-5')])["+itr+"]");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
			}
			
			return ele;
		}
	public By Card_Status(int itr) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("(//div[@name='CARD_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//span[@class='status'])["+itr+"]");
         }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
			}
			
			return ele;
	}
	
	public By Show_More() {
		
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.view.View//android.widget.Button[@resource-id='dMore' and @index='0']");
			ele = By.xpath("//button[.='Show More' and @id='dMore']");
			
			//android.widget.Button[@text='SHOW MORE']	
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
	}
	public By Card_Type() {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//p[.='Card Type']/../h4");
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
	}
	public By Card_Detail_Fields(String fieldname) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.view.View[@text='"+fieldname+"']/following-sibling::android.view.View");
			ele = By.xpath("//p[.='"+fieldname+"']/../h4");
			
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
	}
public By Show_Less() {
		
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.widget.Button[@text='SHOW LESS']");
			ele = By.xpath("//button[.='Show Less']");		
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
	}

public By Cards_Block_ToggleButton() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='Block Card']/../child::android.view.View//android.view.View");
		ele = By.xpath("//p[.='Freeze Card']/..//div//div");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
	
}
/*public By Cards_All() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		
		ele = By.xpath("//div[@name='CARD_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//span[@class='status']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}*/

public By Card_Carousel_Dots() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("(//android.widget.TabWidget)[1]/child::android.view.View");
		ele = By.xpath("//ul[@class='slick-dots']/li/button");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By Card_Carousel_Dots(int itr) {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("(//android.widget.TabWidget)[1]/child::android.view.View");
		ele = By.xpath("(//ul[@class='slick-dots']/li/button)["+itr+"]");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}

public By CreditCardDetails_PendingAmount() {

By ele = null;
if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	//ele = By.xpath("(//android.widget.TabWidget)[1]/child::android.view.View");
	ele = By.xpath("//p[.='Pending Amount']");
	
	}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
	ele = By.xpath("");
	}
	
	return ele;
}
public By Block_Card_Confirmation_Message() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("(//android.view.View[@text='Confirmation'");
		ele = By.xpath("//h3[.='Confirmation']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By Block_Card_Confirmation_Yes() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.view[@text='Are you sure you want to freeze your Card?']/../following-sibling::android.view.View[2]//android.view.View[@text='YES']");
		ele = By.xpath("//div[contains(text(),'Are you sure you want to freeze your Card?')]/../following-sibling::div//a[.='Yes']");
				
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By Unblock_Card_Confirmation_Yes() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.view[@text='Are you sure you want to unfreeze your Card?']/../following-sibling::android.view.View[2]//android.view.View[@text='YES']");
		ele = By.xpath("//div[contains(text(),'Are you sure you want to unfreeze your Card?')]/../following-sibling::div//a[.='Yes']");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By Cards_Togglebutton_On() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		ele = By.xpath("//p[.='Freeze Card']/..//child::div[@class='switcCard on']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}

public By Cards_Togglebutton_Off() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		ele =  By.xpath("//p[.='Freeze Card']/..//child::div[@class='switcCard']");

	}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
	ele = By.xpath("");
	}
	
	return ele;
}
//Credit Card Statement
public By Card_Statement_FilterIcon() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.Button[@resource-id='FORM_CARD_STATEMENT-FILTERS_OPTION']");
		ele = By.xpath("//button[@name='FILTERS_OPTION']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}

public By Card_Statement_FilterTransactions_Heading() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='Filter Transactions']");
		ele = By.xpath("//span[.=' Filter Transactions']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}

public By Card_Statement_Type_Heading() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='Statement Type']");
		ele = By.xpath("//span[.='Statement Type']");
		
				
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}

public By Card_Statement_Types_Monthly() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.RadioButton[@text='"+fieldname+"']");
		ele = By.xpath("//span[text()='Statement Type']/../../following-sibling::div//child::label[1]/span");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By Card_Statement_Types_DateRange() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		ele = By.xpath("//span[text()='Statement Type']/../../following-sibling::div//child::label[2]/span");
		//ele = By.xpath("//android.view.View[@text='Month']");
		 	
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}



public By Monthly_Statement_Month_Dropdown() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.Spinner[@resource-id='FORM_CARD_STATEMENT-CARD_STMT_MONTH']");
		ele = By.xpath("//span[text()='Month']/../../following-sibling::div//select[@name='CARD_STMT_MONTH']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
//Payment Received
//Opening Balance
//Finance Charges
//Closing Balance
public By Monthly_Statement_Fields(String fieldname) {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//e
		ele = By.xpath("//p[text()='"+fieldname+"']/../h4");
				
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}

public By CardStatement_ApplyButton() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.Button[@text='APPLY']");
		ele = By.xpath("//button[@id='FORM_CARD_STATEMENT-SEARCH']");
				
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By CardStatement_Norecord() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.Button[@text='APPLY']");
		ele = By.xpath("//span[text()='No record found']");
				
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By From_Date_EntryField() {
	
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-FROM_DATE']");
		ele = By.xpath("//span[text()='From']/../../following-sibling::div//child::input[@id='FORM_CARD_STATEMENT-FROM_DATE']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By To_Date_EntryField() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']");
		ele = By.xpath("//span[text()='To']/../../following-sibling::div//child::input[@id='FORM_CARD_STATEMENT-TO_DATE']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By CardStatement_From_Date() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']");
		ele = By.xpath("//label[@for='FORM_CARD_STATEMENT-FROM_DATE']//span[text()='From']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By CardStatement_To_Date() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']");
		ele = By.xpath("//label[@for='FORM_CARD_STATEMENT-TO_DATE']//span[text()='To']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}

public By CardStatement_From_Datepicker() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-FROM_DATE']/following-sibling::android.view.View");
		ele = By.xpath("//input[@id='FORM_CARD_STATEMENT-FROM_DATE']//following-sibling::span//i[@class='flaticon-calendar-new']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By CardStatement_To_Datepicker() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
		ele = By.xpath("//input[@id='FORM_CARD_STATEMENT-TO_DATE']//following-sibling::span//i[@class='flaticon-calendar-new']");		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
// Purna

public By CardStatement_MonthSelection() {
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
public By CardStatement_DateSelection() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
    //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
        ele = By.xpath("(//div[@class='ap-component-selector'])[2]");       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
    ele = By.xpath("");
    }
   
        return ele;
}

public By CardStatement_YearSelection() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        //ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
        ele = By.xpath("(//div[@class='ap-row ap-row-selected'])[3]");       
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
               
        ele = By.xpath("");
        }
       
        return ele;
}

public By CardStatement_Selected_Year() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        ele = By.xpath("//android.view.View[@resource-id='ap-component-2']/android.view.View/android.widget.ListView/android.view.View[@selected='true']");       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
        ele = By.xpath("");
    }
       
        return ele;
}

public By CardStatement_Date_Set() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
		ele = By.xpath("//a[text()='Set']");		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By CardStatement_BackArrow() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		ele = By.xpath("//button[@name='ARROW_BTN']");
				
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By CardStatement_Date() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        ele = By.xpath("(//android.widget.GridView//android.view.View/child::android.view.View[1])[1]");
        ele = By.xpath("(//span[@class='frmtDate']//span[1])[1]");
       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

public By CardStatement_Month() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        ele = By.xpath("(//android.widget.GridView//android.view.View/child::android.view.View[2])[1]");
        ele = By.xpath("(//span[@class='frmtDate']//span[2])[1]");
       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

public By CardStatement_Year() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        ele = By.xpath("(//android.widget.GridView//android.view.View/child::android.view.View[3])[1]");
        ele = By.xpath("(//span[@class='frmtDate']//span[3])[1]");
       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

public By CardStatement_Transaction_Description() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        ele = By.xpath("(//android.widget.GridView//android.view.View/child::android.view.View[4])[1]");
        ele = By.xpath("(//span[@class='frmtDate']/../../../following-sibling::div//p[1])[1]");
       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

public By CardStatement_Amount() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        ele = By.xpath("(//android.widget.GridView//android.view.View/child::android.view.View[5])[1]");
        ele = By.xpath("(//span[@class='frmtDate']/../../../following-sibling::div/div/div[2]/span/span)[1]");
       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

//Card Replacement
public By Cards_ContextualMenu_Button() {
	//android.view.View[@text='Cards']/../following-sibling::android.view.View//android.view.View[@resource-id='content-block'][3]//android.view.View//android.view.View//android.view.View//android.view.View
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='Cards']/../following-sibling::android.view.View//android.view.View[@resource-id='content-block'][3]//android.view.View//android.view.View//android.view.View//android.view.View");
		ele = By.xpath("//div[@data-widgetid='CARD_FLOATING_WGT']//a[@class='lanuchbt']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;

}
public By Cards_ContextualMenu_Selection(String fieldname) {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='"+fieldname+"']");
		ele = By.xpath("//ul[@data-context='submenu']//li//a[.='"+fieldname+"']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;

}


public By Cards_Entry_Heading(String fieldname) {
	
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='"+fieldname+"']");
		ele = By.xpath("//h3[text()='"+fieldname+"']");
		
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;

}
//Activate Card
public By ActivateCard_SetPin_Popup() {
	
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='"+fieldname+"']");
		ele = By.xpath("//div//textarea[text()='Please set / create PIN for all your new cards using Set / Create card PIN']/../../following-sibling::div/child::div//a[@data-item-id='dialogBtnOk']");
		
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;

}
//Card Replacement, Card Renewal - Card Number, Reason, Delivery Option
//Block Card (Stop) - Card Number, Reason 
//Magnetic Stripe - Card Number]
//Reward Points - Select outlet
	public By Cards_DataEntry_Dropdown(String fieldname) {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='"+fieldname+"']/../../../following-sibling::android.view.View//android.widget.Spinner']");
		ele = By.xpath("//span[text()='"+fieldname+"']/../../following-sibling::div//child::select");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;

}
//Fee

public By Cards_DataEntry_Fee() {
	
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='"+fieldname+"']/../../../following-sibling::android.view.View//android.view.View");
		ele = By.xpath("//span[text()='Fees']/../../following-sibling::div//child::span[@name='TRANSACTIONFEEAMOUNT']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;

}
//Activate, Card Replacement, Block (Stop), Magnetic Stripe
 public By Cards_DataEntry_CardHolderName() {
	
	 
	 By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.view.View[@text='Card Holder Name']/../../following-sibling::android.view.View//android.view.View");
			ele = By.xpath("//span[text()='Card Holder Name']/../../following-sibling::div//child::span[@name='CARDHOLDERNAME']");
					
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;

 }
 //Card Replacement - Remarks
 //Set PIN - CardNUmber, New PIN, Confirm New PIN
 //Card Renewal - Remarks
 //Block (Stop) - Remarks
 //Card Payment - Remarks
 
 public By Cards_DataEntry_InputField(String fieldname) {
	
	 By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			//ele = By.xpath("//android.view.View[@text='Remarks']/../../../following-sibling::android.view.View//android.view.View//android.widget.EditText");
			ele = By.xpath("//span[text()='"+fieldname+"']/../../following-sibling::div/div/child::input");
			
			}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
					
			ele = By.xpath("");
			}
			
			return ele;
 }
 public By Cards_DataEntry_Specify() {
 By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='Specify']/../../following-sibling::android.view.View//android.view.View//android.widget.EditText");
		ele = By.xpath("//span[text()='Specify']/../../following-sibling::div/div/child::input[@name='OTHERS']");
				
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}

public By Cards_Next_Button() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='NEXT']");
		ele = By.xpath("(//a[@data-item-id='NEXT'])[1]");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}

//Review Details screen


//Card Replacement
//Card number, reason for replacement, delivery branch, Remarks, Specify
//Activate Card
//Card number, Card expiry year, Card expiry month
//Card Renewal
//Card Number, Reason, Remarks, Delivery Option
//Block Card(Stop) - Card Number, Reason, Lost/Stolen Date, Remarks
public By Cards_ReviewDetails_Fields(String fieldname1, String fieldname2) {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='"+fieldname1+"']/../../../following-sibling::android.view.View//android.view.View//android.view.View[@text='"+fieldname2+"']");
		ele = By.xpath("(//span[text()='"+fieldname1+"']/../../following-sibling::div//child::span[text()='"+fieldname2+"'])[1]");
	
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}


public By Cards_ReviewDetails_Fees() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='Fees']/../../../following-sibling::android.view.View//android.view.View");
		ele = By.xpath("//span[text()='Fees']/../../following-sibling::div//child::span[@name='TRANSACTIONFEEAMOUNT']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
//Activate , Card Replacement
public By Cards_ReviewDetails_CardHolderName() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='Card Holder Name']/../../following-sibling::android.view.View//android.view.View");
		ele = By.xpath("//span[text()='Card Holder Name']/../../following-sibling::div//child::span[@name='CARDHOLDERNAME']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}


public By OTP_Static_Label() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
       //ele = By.xpath("//android.view.View[@text='Please enter your One Time Password (OTP)']");
        ele = By.xpath("//span[text()=' Please enter your One Time Password (OTP)']");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

public By OTP_Field() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        //ele = By.xpath("(//android.view.View[@text='OTP']/../../../following-sibling::android.view.View//child::android.widget.EditText)[1]");
    	ele = By.xpath("(//span[text()='OTP']/../../following-sibling::div/div/div/input)[1]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By OTP_Field(int itr) {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        //ele = By.xpath("(//android.view.View[@text='OTP']/../../../following-sibling::android.view.View//child::android.widget.EditText)[1]");
    	ele = By.xpath("(//span[text()='OTP']/../../following-sibling::div/div/div/input)["+itr+"]");
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
        ele = By.xpath("//android.view.View[@text='Resend OTP']");
       
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
        //ele = By.xpath("//android.view.View[@text='BACK']");
        ele = By.xpath("(//a[@data-item-id='BACK'])[1]");
        
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

//Confirmation screen
public By Confirmation_Screen() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        ele = By.xpath("//form[@data-item-id='CONFIRMATION_FORM']");
       
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
        //ele = By.xpath("//android.widget.Image[@text='success']");
        ele = By.xpath("//form[@data-item-id='CONFIRMATION_FORM']//div[@data-item-id='OD_SUCCESS_IMG']");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By CardReplacement_Confirmation_Success_Message() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        //ele = By.xpath("//android.view.View[@text='Your Card Replacement transaction was successful.']");
    	ele = By.xpath("//label[contains(text(),'Your Card Replacement transaction was successful.')]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By CardRenewal_Confirmation_Success_Message() {
	
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        
    	ele = By.xpath("//label[contains(text(),'Your Card Renewal transaction was successful.')]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

//Date / Time, Reference Number
public By Confirmation_Date() {
    By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        //ele = By.xpath("//android.view.View[@text='"+fieldname+"']/../../following-sibling::android.view.View//android.view.View//android.view.View");
        ele = By.xpath("//span[.='Date / Time']/../../following-sibling::div//span[@name='DATE_TIME']");
     
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By Confirmation_Reference() {
	   By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        
	        ele = By.xpath("//span[.='Reference Number']/../../following-sibling::div//span[@name='OD_REF_NO']");
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
        //ele = By.xpath("//android.view.View[@text='Note: Please quote the above reference number in all communications with Ahli Bank.']");
        ele = By.xpath("//span[contains(text(),'Note: Please quote the above reference number in all communications with Ahli Bank.')]");
      
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
	       // ele = By.xpath("//android.widget.Button[@text='DONE. GO BACK']");
	        ele = By.xpath("//button[@name='GO_TO_HOME' and contains(text(),'DONE. GO BACK')]");
	     
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
}

//Activate Card
public By ActivateCard_Button() {
	  By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        ele = By.xpath("//android.widget.Button[@text='ACTIVATE CARD']");
	       
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
}

public By ActivateCard_ConfirmationMessage() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        ele = By.xpath("//label[contains(text(),'Your request for Activating Card transaction was successful.')]");
       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
//Card Replacement
public By CardReplacement_Error() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        ele = By.xpath("//textarea[contains(text(),'Selected action cannot be performed for this card.')]");
       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
//Set/Change Card Pin
//Set/Change Card PIN
//Card Number, New PIN, Confirm New PIN

public By SetPin_GenerateOTP() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
       // ele = By.xpath("//android.widget.Button[@text='GENERATE OTP']");
        ele = By.xpath("//button[.='Generate OTP']");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By SetPin_Confirmation_Success_Message() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//label[contains(text(),'successful')]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
//Block Card
public By BlockCard_LostStolen_DatePicker() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

        ele = By.xpath("//input[@name='REASONDATE']//following-sibling::span//i[@class='flaticon-calendar-new']");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;

}
public By BlockCard_CardNumber(String cardnumber) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

        ele = By.xpath("//div[@name='CARD_SUMMARY_VIEW']/table/tbody/div[1]/div[1]/div//p[contains(text(),'"+cardnumber+"')]");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By BlockCard_Confirmation_Success_Message() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//label[contains(text(),'Your request for Blocking Card transaction was successful')]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
		 
}
//EPP
/*/EPP Set-up Date,
// Transaction Description, Number of Months,Monthly Installment Amount (QAR),Start Date ,End Date,Status*/


public By EPPHistory_GridFields(String fieldname) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

        ele = By.xpath("//div[@name='EPP_HISTORY_VIEW']//p[.='"+fieldname+"']");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;

}
public By EPPHistory_GridData(int position) {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		//ele = By.xpath("//android.view.View[@text='"+fieldname+"']");
		ele = By.xpath("(//p[.='Number of Months']/../../following-sibling::div//div//h3)["+position+"]");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;

}
public By EPPHistory_Checkbox(String fieldname) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

        ele = By.xpath("(//h3[.='Active']/../preceding-sibling::div//input[@type='checkbox'])[1]");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;

}
public By EPP_BackArrow() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

        ele = By.xpath("//h3[.='Easy Payment Plan Details']/../../../../following-sibling::button");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By EPP_Cancel() {
 By ele = null;
if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

    ele = By.xpath("(//a[@data-item-id='BTN_CANCEL_EPP'])[1]");
  
}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
   
    ele = By.xpath("");
}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
   
    ele = By.xpath("");
}
return ele;

}
public By EPP_Status(String status) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
    	//(//h3[text()='"+status+"'])[1]
        ele = By.xpath("(//h3[text()='Active'])[1]/../../child::div[2]/h3");
       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By EPP_History_Review_Fields(String fieldname) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

        ele = By.xpath("(//span[text()='"+fieldname+"']/../../following-sibling::div//child::span)[1]");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By EPP_History_BackButton() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

        ele = By.xpath("//a[text()='Back']");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By Card_DataEntry_Next_Button() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

        ele = By.xpath("//a[text()='Next']");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By EPP_History_PaymentSchedule() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

        ele = By.xpath("(//a[contains(text(),'Payment Schedule')])[1]");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

	public By PaymentSchedule_Grid_EMIDate() {
		By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	        ele = By.xpath("(//p[.='EMI Date']/../../following-sibling::div//h3)[1]");
	      
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
	}
	public By PaymentSchedule_Grid_PrincipalAmount() {
		By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	        ele = By.xpath("(//p[.='Principal Amount (QAR)']/../../following-sibling::div//h3)[2]");
	      
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
	}
	public By PaymentSchedule_Grid_InterestAmount() {
		By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	        ele = By.xpath("(//p[.='Interest Amount (QAR)']/../../following-sibling::div//h3)[3]");
	      
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
	}
	public By EPP_ConfirmationMessage() {
		By ele = null;
	    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
	        ele = By.xpath("//label[.='Your Easy Payment Cancel transaction was successful.']");
	       
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
	       
	        ele = By.xpath("");
	    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
	       
	        ele = By.xpath("");
	    }
	    return ele;
	}
//Magnetic Stripe
public By Magnetic_Stripe_Add() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

        ele = By.xpath("(//a[@data-item-id='ADD'])[1]");
      
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

public By Magnetic_Stripe_Grid_field(String fieldname) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//p[.='"+fieldname+"']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	 } 	
public By Magnetic_Strip_GridList() {
	
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.cssSelector("div.rtplRow");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	 } 	
public By Magnetic_Strip_Country() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("(//p[.='Country']/../../following-sibling::div//h3)[1]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	 } 	
public By Magnetic_Strip_Grid_Country(int itr) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("(//div[contains(@class,'rtplRow')])["+itr+"]//div[1]/h3[1]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By Magnetic_Strip_StartDate() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("(//p[.='Start Date']/../../following-sibling::div//h3)[2]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	 } 	
public By Magnetic_Strip_EndDate() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("(//p[.='End Date']/../../following-sibling::div//h3)[3]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	 } 	
public By Country_Exist_Error() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//textarea[contains(text(),'Selected country is already added in the system. Please either modify or delete the existing record.')]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By Popup_Ok() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//a[@data-item-id='dialogBtnOk']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By Start_EndDateField(String fieldname) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//span[text()='"+fieldname+"']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By Start_DatePicker() {
	
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//input[@name='OVERSEASUSESTARTDATE']//following-sibling::span//i[@class='flaticon-calendar-new']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By End_DatePicker() {
	
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//input[@name='OVERSEASUSEENDDATE']//following-sibling::span//i[@class='flaticon-calendar-new']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By Magnetic_CardNumber() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//span[text()='Card Number']/../../following-sibling::div//child::span[@name='CARDNUMBER']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	
}
public By MagneticStrip_Terminate_Button() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//a[@data-item-id='MAG_TERMINATE']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By MagneticStrip_Modify_Button() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//a[@data-item-id='MODIFY']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By MagneticStrip_Back_Button() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//a[@data-item-id='BACK']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

public By MagneticStrip_Add_Success() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//label[contains(text(),'Transaction status')]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By MagneticStrip_ModifyTerminate_Success() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//label[contains(text(),'Your Magnetic Strip Request was successful')]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By MagneticStrip_Grid_Country() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//p[.='Country']/../../following-sibling::div//h3");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	
}
public By MagneticStrip_BackArrow() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//h3[.='Manage Magnetic Strip']/../../../../following-sibling::button");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By Max_record_Exist_Error() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//textarea[text()='You have already set up for 3 countries. Please delete existing record to add new country.']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
	return ele;
	 
 }
//Card Statement

public By CardStatement_From_Calendar() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//android.widget.EditText[@resource-id='FORM_ACCOUNT_STATEMENT-FROM_DATE']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	 } 	

//View/Redeem Reward Points
/*Meera Rewards ID
Privilege Club Number*/
public By RewardPoints_Readonly_Fields(String fieldname, String name) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//span[text()='"+fieldname+"']/../../following-sibling::div//child::span[@name='"+name+"']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	 } 	

public By RewardPoints_RedeemNote() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//span[contains(text(),'TO REDEEM POINTS FOR YOUR VOUCHER')]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	 } 	
public By RewardPoints_Notes() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//span[@name='OUTLET_MSG']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	 } 
public By RewardPoints_OutletNote() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//span[@name='NOTE_MSG']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	 } 
public By RewardPoints_BackArrow() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	ele = By.xpath("//h3[.='Redeem Reward Points']/../../../../following-sibling::button");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

public By RewardPoints_Confirmation_Success_Message() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//label[contains(text(),'Your Redeem Rewards transaction was successful.')]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By RewardPoints_RedeemButton() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("(//a[@data-item-id='Redeem'])[1]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

//Card Payment
public By CardPayment_ReadOnly_Field(String fieldname, String name) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//span[text()='"+fieldname+"']/../../following-sibling::div//child::span[@name='"+name+"']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;	
	
}


public By CardPayment_PaymentOption_ReadOnly_Amount(String fieldname, String name) {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//span[text()='"+fieldname+"']/../../following-sibling::div//child::input[@name='"+name+"']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}
public By CardPayment_LastStatement() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//span[text()='Last Statement Balance']/../../following-sibling::div/div");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}

public By Preferred_Amount_Error() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//textarea[.='Please enter amount lesser than outstanding balance and unbilled amount']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
		 
}

public By CardPayment_Confirmation_Success_Message() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//label[contains(text(),'Your card payment transaction was successful')]");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
		 
}
public By CardPayment_InsufficientBalance_Error() {
	
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//div//textarea[text()='You do not have sufficient balance in your account to proceed with the transaction']/../../following-sibling::div/child::div//a[@data-item-id='dialogBtnOk']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
		 
}
/*public By CardPayment_ZeroAmount_Error() {
	
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

	 ele = By.xpath("//div//textarea[text()='Card Payment amount cannot be zero']/../../following-sibling::div/child::div//a[@data-item-id='dialogBtnOk']");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
        
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
}*/
//E-Statement Enrollment


public By Estatement_Checkbox() {
	By ele = null;
    if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        ele = By.xpath("//input[@name='E_ENROLLMENT_CHKBOX']/../child::span");
       
    }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
       
        ele = By.xpath("");
    }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
       
        ele = By.xpath("");
    }
    return ele;
	
}




//Set up EPP
public By Card_Statement_Types_Unbilled() {
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		ele = By.xpath("//input[@name='STATEMENT_LIST' and @value = 'Unbilled']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By CardPayment_PaymentDate_Datepicker() {
	
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		ele = By.xpath("//input[@name='TRANSACTIONDATE']//following-sibling::span//i[@class='flaticon-calendar-new']");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
public By CardPayment_ZeroAmount_Error() {
	
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		ele = By.xpath("//textarea[contains(text(),'Card Payment amount cannot be zero')]");
		
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
				
		ele = By.xpath("");
		}
		
		return ele;
}
}




