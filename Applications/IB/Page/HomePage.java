package IB.Page;

import org.openqa.selenium.By;

public class HomePage {

	//LOgout Link*****************************************
	
	
	
	public By Display_Name() {
		return By.xpath("//b[.='Welcome']/..");
	}
	
	public By Accounts_Overview_Txt() {
		return By.xpath("//h1[.='Accounts Overview']");
	}
	
	public By Account_Number() {
		return By.xpath("//th[.='Account']/../../following-sibling::tbody/tr[1]//td[1]//a");
	}
	
	public By Balance() {
		return By.xpath("//th[.='Account']/../../following-sibling::tbody/tr[1]//td[2]");
	}
	
	public By Available_Amount() {
		return By.xpath("//th[.='Account']/../../following-sibling::tbody/tr[1]//td[3]");
	}
	
	public By Available_Amounts() {
		return By.cssSelector("sssss");
	}
	
	public By ATMSrvices_WithdrawFunds() {
		return By.xpath("//th[.='Account']/../../following-sibling::tbody/tr[1]//td[2]");
	}
	
	//Portfolio summary
	
	public By I_have_carousel() {
		return By.xpath("//span[text()='You have']//parent::div");
	}
	
	public By I_owe_carousel() {
		return By.xpath("//span[text()='You owe']//parent::div");
	}
	
	public By Accounts_label() {
		return By.xpath("//h3[@class='summaryTitle' and text()='Accounts']");
	}
	
	public By Borrowings_label() {
		return By.xpath("//h3[@class='summaryTitle' and text()='Borrowings']");
	}
	
	public By Deposits_label() {
		return By.xpath("//h3[@class='summaryTitle' and text()='Deposits']");
	}
	
	public By Available_accounts() {
		return By.xpath("//h3[@class='summaryTitle' and text()='Accounts']//following::div//child::ul");
	}
	
	public By Available_borrowings() {
		return By.xpath("//h3[@class='summaryTitle' and text()='Borrowings']//following::div//child::ul");
	}
	
	public By Available_deposits() {
		return By.xpath("//h3[@class='summaryTitle' and text()='Deposits']//following::div//child::ul");
	}
	
	public By Accounts_available_balance_label() {
		return By.xpath("(//p[text()='Available Balance'])[1]//parent::div//child::span");
	}
	
	public By Borrowings_available_balance_label() {
		return By.xpath("(//p[text()='Outstanding Balance'])[1]//parent::div//child::span");
	}
	
	public By Deposits_available_balance_label() {
		return By.xpath("(//p[text()='Deposit Amount'])[1]//parent::div//child::span");
	}
	
	public By AlRabehCer_available_balance_label() {
		return By.xpath("(//h6[.='Al Rabeh Savings Account'])[1]/..//following::div/p[contains(text(),'Available Balance')]/../span");
	}
	
	
	
	
	public By Accounts_All_Available_Acc() {
		return By.xpath("//h3[.='Accounts']/../div[1]//li//span");
		
	}
	
	public By Deposits_All_Available_Deposits() {
		return By.xpath("//h3[.='Deposits']/../div[1]//li//span");
		
	}
	
	public By Borrowings_All_Available_Borrowings() {
		return By.xpath("//h3[.='Borrowings']/../div[1]//li//span");
		
	}
	
	
	//Aswini June-23 
	
	public By All_Cards_List() {
		return By.xpath("//h3[@class='summaryTitle']");
		
	}
	
	public By All_Cards_List_inte(int count) {
		return By.xpath("(//h3[@class='summaryTitle'])["+count+"]");
		
	}
	
	public By All_Accounts_Label_For_Balance(String Label) {
		return By.xpath("(//h3[@class='summaryTitle' and contains(text(),'"+Label+"')]/../div/ul/li/div/div/p[contains(text(),'Balance') or contains(text(),'Amount')])[1]");
		
	}
	
	public By All_Accounts_Available_Balance(String Label) {
		return By.xpath("(//h3[@class='summaryTitle' and contains(text(),'"+Label+"')]/../div/ul/li/div/div/span)[1]");
		
	}
	
	public By All_Accounts_Acc_Number(String Label) {
		return By.xpath("(//h3[@class='summaryTitle' and contains(text(),'"+Label+"')]/../div/ul/li/div/div)[1]/p");
		
	}
	
	public By View_Less() {
		return By.xpath("//a[contains(text(),'VIEW LESS')]");
		
	}
	
	public By View_More() {
		return By.xpath("//li[@class='extra  text-right']/a");
		
	}

	public By Next_Button() {
		return By.xpath("//button[.='Next']");
		
	}
	
	
	//Jun-14
	
	public By Amount_In_You_Have() {
		return By.xpath("//span[.='You have']/../p");
		
	}
	
	public By Amount_In_You_Owe() {
		return By.xpath("//span[.='You owe']/../p");
		
	}
	
	//Jun-15
	
	public By Next_Button_In_Portfolio_Summary() {
		return By.xpath("//button[.='Next']");
		
	}
	
	public By Cards_label() {
		return By.xpath("//h3[@class='summaryTitle' and text()='Cards']");
	}
	
	public By Cards_All_Available_Cards() {
		return By.xpath("//h3[.='Cards']/../div[1]//li//span");
		
	}
	
	
	//Connect with us
	
	public By Connect_withus_text() {
		return By.xpath("//p[text()='Connect with us']");
	}
	
	public By We_are_available_to_support_you() {
		return By.xpath("//h4[text()='We are available to support you']");
	}
	
	public By Giveus_a_callon_text() {
		return By.xpath("//p[contains(text(),'Give us a call on')]");
	}
	
	public By Sendus_a_email_text() {
		return By.xpath("//p[text()='Send us an e-mail with your inquiry']");
	}
	
	
	public By Find_your_nearest_ATM_text() {
		return By.xpath("//p[text()='Find your nearest ATM / Branch']");
	}
	
	public By Giveus_a_callon_img() {
		return By.cssSelector("img[src='iportal/images/client/pl/icn_phone.svg']");
	}
	
	public By Sendus_a_email_img() {
		return By.cssSelector("img[src='iportal/images/client/pl/icn_Mail.svg']");
	}
	
	public By Find_your_nearest_ATM_img() {
		return By.cssSelector("img[src='iportal/images/client/pl/icn_map.svg']");
	}
	
	//Aswini June-23 
	
	public By Sendus_a_email_MailBox_All_Menu(String options) {
		return By.xpath("//h3[.='"+options+"']");
	}
	
	public By Sendus_a_email_MailBox_Label() {
		return By.xpath("//h3[.='Mailbox']");
	}
	
	
	
	
	
	//Purna*********************************
		//Burger Menu
		
		public By Home_Main_Burger_Menu() {
			return By.xpath("//button[@data-item-id='dfXmenu_toggler']");
		}
		
		
		// All Module Links
		public By Home_Main_Burger_Menu_Modules(String ModuleName) {
			return By.xpath("//a[text()='"+ModuleName+"']");
		}
		
		public By Logout_Link() {
			return By.xpath("//a[@data-item-id='dfXmenu_logout']");
		}
		public By Logout_PopUp_Yes() {
			return By.xpath("//div[contains(text(),'Are you sure you want to logout')]/..//following-sibling::div[1]//a[.='Yes']");
		}
		
		public By Logout_FeedBack_Skip_Btn() {
	            return By.xpath("//a[.='SKIP']");
	        }

		
	
	//Aswini may-08
		
		public By QuickLinks_FundmyWallet() {
			return By.xpath("//div[text()='Fund my Wallet']");
		}
	
		public By QuickLinks_SendMoney() {
			return By.xpath("//div[text()='Send Money']");
		}
	
		public By QuickLinks_CardPayment() {
			return By.xpath("//div[text()='Card Payment']");
		}
	
		public By QuickLinks_AddBeneficiary() {
			return By.xpath("//div[text()='Add Beneficiary']");
		}
		
		public By QuickLinks_BillPayments() {
			return By.xpath("//div[text()='Bill Payment']");
		}
		
		public By QuickLinks_ChequeBookRequest() {
			return By.xpath("//div[text()='Cheque Book Request']");
		}
		
		
		public By Login_Histoyr() {
			return By.xpath("//small[text()='Your Last Login: ']//span");
		}
		
		
		//Favorite transfers
		
		public By Favorite_Transfers_label() {
			return By.xpath("//h3[text()='Favourite Transfers']");
		}
		

		public By Favorite_Transfers_1st_Record() {
			return By.xpath("((//div[@class='slick-track'])[2]//div)[1]");
		}
		

		public By Favorite_Transfers_1st_Record_NickName() {
			return By.xpath("((((//div[@class='slick-track'])[2]//div)[1]//div//div//div//ul//li)[1]//div//div//p)[1]");
		}
		
		public By Favorite_Transfers_1st_Record_BankName() {
			return By.xpath("((((//div[@class='slick-track'])[2]//div)[1]//div//div//div//ul//li)[1]//div//div//p)[2]");
		}

		public By Favorite_Transfers_1st_Record_LastTransferDate() {
			return By.xpath("((((//div[@class='slick-track'])[2]//div)[1]//div//div//div//ul//li)[2]//div//div//p)[2]");
		}
		
		public By Favorite_Transfers_1st_Repeat_Button() {
			return By.xpath("(//button[text()='Repeat'])[1]");
		}
		
		
		//Aswini June-24 
		
		public By MailBox_All_Menu(String menu) {
			return By.xpath("//div[@class='app-title' and contains(text(),'"+menu+"')]");
		}	
		
		public By MailBox_CheckBox_To_Select_All_Msgs() {
			return By.xpath("//p[.='Category']/../../div[1]/span/input");
		}	
		
		public By MailBox_Delete_Button() {
			return By.xpath("(//a[contains(text(),'Delete')])[1]");
		}	

		public By MailBox_1st_Record() {
			return By.xpath("//div[@name='ARCHIVE_WGT']/div/div[1]/div/div/div[2]/div[1]/table/tbody/div[1]/div[2]");
		}	
        
		public By MailBox_Archive_DetViewScreen_Header() {
			return By.xpath("//h3[text()='View Message Details']");
		}	
		
		public By MailBox_Archive_DetView_All_Label(String str) {
			return By.xpath("//span[.='"+str+"']");
			
		}
		
		public By MailBox_DetView_All_Field_Values(String str) {
			return By.xpath("(//span[.='"+str+"']//following::div[1]/div/span)[1]");
		}
		
		public By MailBox_Archive_DetView_Attachment_FileName() {
			return By.xpath("//img[@src='iportal/images/file-attach-paperclip.png']/following-sibling::a");
		}
		
		public By MailBox_Archive_DetView_1st_Record_CheckBox() {
			return By.xpath("//div[@name='ARCHIVE_WGT']/div/div[1]/div/div/div[2]/div[1]/table/tbody/div[1]/div[2]/div[1]/span/input");
		}
		
		
		
		public By MailBox_Archive_DetView_Delete_Confirm_Label() {
			return By.xpath("//div[contains(text(),'Are you sure you want to delete the record?')]");
		}
		
		public By MailBox_Archive_DetView_Yes_Button() {
			return By.xpath("//a[.='Yes']");
		}
		
		//Aswini June-25
		
		public By MailBox_Inbox_1st_Record() {
			return By.xpath("//div[@name='VW_RETAIL_INBOX']/table/tbody/div[1]/div[2]");
		}	
		
		public By MailBox_Inbox_CheckBox_To_Select_All_Msgs() {
			return By.xpath("//div[@name='VW_RETAIL_INBOX']/table/tbody/div[1]/div[1]/div[1]/span/input");
		}
		
		public By MailBox_Inbox_Views_Msg_Over_Last_Month() {
			return By.xpath("//div[.='Messages over the last month are available. If you wish to save messages for your reference, you can use the archive option.']");
		}
		
		public By MailBox_Inbox_Reply_Button() {
			return By.xpath("(//a[contains(text(),'Reply')])[1]");
		}
		
		public By MailBox_Inbox_DatenContent_Previous_Msg() {
			//return By.xpath("//span[@name='MESSAGES_EDIT']");
			return By.xpath("//div[@name='MAIL_REPLY_BODY_WGT']");
			
		}
		
		public By MailBox_Inbox_Note_Max_2000_Char() {
			return By.xpath("//span[.=' Note: A maximum of 2000 characters can be entered here']");
		}
		
		
		public By MailBox_Inbox_Text_Field_To_Type_Msg() {
			return By.xpath("//textarea[@name='MESSAGES_EDIT_2']");
		}
		
		public By MailBox_Inbox_Send_Button() {
			return By.xpath("(//a[contains(text(),'Send')])[1]");
		}
		
		public By MailBox_Inbox_Confirmation_Header() {
			return By.xpath("//h3[.='Confirmation']");
		}
		
		
		public By MailBox_Sent_CheckBox_To_Select_All_Msgs() {
			return By.xpath("//div[@name='VW_RETAIL_SENT']/table/tbody/div[1]/div[1]/div[1]/span/input");
		}
		
		public By MailBox_Sent_1st_Record() {
			return By.xpath("//div[@name='VW_RETAIL_SENT']/table/tbody/div[1]/div[2]");
		}
		
//Aswini July-08 ###########Qatari Id#################
		
		public By Qatari_Id_90Days_Expiry() {
			return By.xpath("//p[contains(text(),'Please note that the Expiry date of your registered Qatari ID Card is 21/06/2020. You will not be able to login to your Online Banking after 90 days of expiry. Kindly visit any Ahlibank branch to update your Qatari ID.')]");
		}
		
		public By Qatari_Id_You_Have_Label() {
			return By.xpath("//span[contains(text(),'You have')]");
		}
		
		public By Qatari_Id_Verification_Code_OTP_Text_Text() {
			return By.xpath("//p[contains(text(),'A verification code (OTP) has been sent to you on +974 XXXX 0014 and jxxxxxxxxxxxxxn@maveric-systems.com ')]");
		}
		
		public By Qatari_Id_90Days_Expiry_DialogBox_Ok_Button() {
			return By.xpath("//a[@data-item-id='dialogBtnOk']");
		}
		
//Aswini July-08 #########MailBox###################
		
		public By MailBox_Archive_Button() {
			return By.xpath("(//a[contains(text(),'Archive')])[1]");
		}
		
//Aswini July-12 #################### Connect with us #########################
		
		public By HomePage_Advertisement() {
			return By.xpath("(//h3[.='Recommended For You']/../../../following::div[1]//li//a//img)[1]");
		}
		
		public By HomePage_BulletInBoard() {
			return By.xpath("//div[@data-widgetid='WGT_BULLETIN']/div/div/div/marquee/span[1]");
		}

//Aswini July-13
		
		public By Mailbox_Compose_all_DropDown(String str) {
			return By.xpath("//select[@name='"+str+"']");
		}	
		
		public By Mailbox_Compose_all_Editable_Text_Fields(String str) {
			return By.xpath("//input[@name='"+str+"']");
		}	
		
		public By Mailbox_Compose_Date(String str) {
			return By.xpath("//span[contains(text(), 'Date')]/../../following::div[1]/div/span");
		}	
		
		public By Mailbox_Compose_Mssage_Content() {
			return By.xpath("//textarea[@name='MAIL_CONTENT']");
		}
		
		public By Mailbox_Archive_Button() {
			return By.xpath("(//a[contains(text(),'Archive')])[1]");
		}
		
		public By Mailbox_Verification_Subject(String str) {
			return By.xpath("(//input[@type='checkbox'])[3]/../../following::div[2]/h3[contains(text(),'"+str+"')]");
		}
		

		public By MailBox_Inbox_DetView_1st_Record_CheckBox() {
			return By.xpath("//div[@name='MAIL_INBOX_WGT']/div/div[1]/div/div/div[2]/div[1]/table/tbody/div[1]/div[2]/div[1]/span/input");
		}
		
		public By MailBox_Archive_Confirmation_Ok_Button() {
			return By.xpath("//a[@data-item-id='dialogBtnOk']");
		}
			
		
}
