package MB.Page;

import org.openqa.selenium.By;

import managers.DataManager;

public class PaymentsPage {
	DataManager data = new DataManager();

	public By More_Icon() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//li[@class='dropup pull-right tabdropWs' or @class ='dropup pull-right tabdropWs show']/a");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By BillPayments_Selection() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//a[.='Bill Payments']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Heading() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("(//div[text()='Bill Payments'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	/*
	 * Add Biller Manage / Edit Biller Pay a Biller Top-up and Recharge Pay Bills
	 */
	public By Payments_Select_Function(String function) {
//TODO
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//li//div[text()='" + function + "']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// Add Biller
	public By Payments_DataEntry_Heading(String function) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//div[text()='" + function + "']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// h3[text()='Manage Biller']
	// Add Biller - Biller Name
	// Top up - Recharge type, Which plan,
	public By Payments_DataEntry_Dropdown(String fieldname) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//span[text()='" + fieldname + "']/../../following-sibling::div//child::select");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// Add Biller - Qatari ID, Utility Number, Biller Nick Name
	// Top up - Mobile number
	public By Payments_DataEntry_InputField(String fieldname) {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='" + fieldname + "']/../../following-sibling::div/div/child::input");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	public By Payments_DataEntry_Input(String fieldname) {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[contains(text(),'" + fieldname + "')]/../../following-sibling::div/div/child::input");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	public By BackArrow() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//h3[.='Add Biller']/../../../../following-sibling::button");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_UtilityNumber() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[@id='lbl_UTILITY_ACCOUNT_NUMBER']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	public By AddBiller_AccountNumber() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[@id='lbl_UTILITY_ACCOUNT_NUMBER']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	public By SaveBiller_Button() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='SAVE_BILL'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	public By Cancel_Button() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='CANCEL'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	// Add Biller - Biller Details,
	public By Payments_ReviewDetails_BillerDetails(String fieldname1, String fieldname2) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			;
			ele = By.xpath("(//span[text()='" + fieldname1 + "']/../../following-sibling::div//child::p[text()='"
					+ fieldname2 + "'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	// Biller Name, Qatari ID, Utility Number, Biller Nick Name
	public By Payments_ReviewDetails_Fields(String fieldname1, String fieldname2) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			
			ele = By.xpath("(//span[contains(text(),'"+fieldname1+"')]/../../following-sibling::div//child::span[contains(text(),'"+fieldname2+"')])[1]");
//(//span[contains(text(),'Biller Nick Name')]/../../following-sibling::div//child::span[text()='kahramapay1'])[1]
		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	public By Payments_Review_Utility_Number() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			;
			ele = By.xpath(
					"//span[@id='lbl_UTILITY_ACCOUNT_NUMBER']/../../following-sibling::div[1]//span[@name='UTILITY_ACCOUNT_NUMBER']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	public By Payments_Review_Account_Number() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			;
			ele = By.xpath("//span[@id='lbl_ACCOUNT_NUMBER']/../../following-sibling::div[1]//span");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	public By OTP_Static_Label() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele = By.xpath("//android.view.View[@text='Please enter your One Time
			// Password (OTP)']");
			ele = By.xpath("//span[text()=' Please enter your One Time Password (OTP)']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By OTP_Field() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele =
			// By.xpath("(//android.view.View[@text='OTP']/../../../following-sibling::android.view.View//child::android.widget.EditText)[1]");
			ele = By.xpath("(//span[text()='OTP']/../../following-sibling::div/div/div/input)[1]");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By OTP_Field(int itr) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele =
			// By.xpath("(//android.view.View[@text='OTP']/../../../following-sibling::android.view.View//child::android.widget.EditText)[1]");
			ele = By.xpath("(//span[text()='OTP']/../../following-sibling::div/div/div/input)[" + itr + "]");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Submit_button() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//a[.='Submit']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Back_button() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele = By.xpath("//android.view.View[@text='BACK']");
			ele = By.xpath("(//a[@data-item-id='BACK'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// Confirmation screen
	public By Confirmation_Screen() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//form[@data-item-id='CONFIRMATION_FORM']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Confirmation_Tick_Symbol() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele = By.xpath("//android.widget.Image[@text='success']");
			ele = By.xpath("//form[@data-item-id='CONFIRMATION_FORM']//div[@data-item-id='OD_SUCCESS_IMG']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By AddBiller_Confirmation_Success_Message() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//label[contains(text(),'You have added your biller successfully.')]");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Confirmation_BillerName(String name) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele =
			// By.xpath("//android.view.View[@text='"+fieldname+"']/../../following-sibling::android.view.View//android.view.View//android.view.View");
			ele = By.xpath("//p[text()='" + name + "']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Confirmation_Number(String number) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele =
			// By.xpath("//android.view.View[@text='"+fieldname+"']/../../following-sibling::android.view.View//android.view.View//android.view.View");
			ele = By.xpath("//p[text()='" + number + "']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// Date / Time, Reference Number
	public By Confirmation_Date() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele =
			// By.xpath("//android.view.View[@text='"+fieldname+"']/../../following-sibling::android.view.View//android.view.View//android.view.View");
			ele = By.xpath("//span[.='Date / Time']/../../following-sibling::div//span[@name='DATE_TIME']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Confirmation_Reference() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[.='Reference Number']/../../following-sibling::div//span[@name='OD_REF_NO']");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Confirmation_Note() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele = By.xpath("//android.view.View[@text='Note: Please quote the above
			// reference number in all communications with Ahli Bank.']");
			ele = By.xpath(
					"//span[contains(text(),'Note: Please quote the above reference number in all communications with Ahli Bank.')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Confirmation_Done_Button() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele = By.xpath("//android.widget.Button[@text='DONE. GO BACK']");
			ele = By.xpath("//button[@name='GO_TO_HOME' and contains(text(),'DONE. GO BACK')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayBills_Button() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//button[contains(text(),'Pay Bills')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// Manage Biller
	public By ManageBiller_RecentBillersList() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//div[contains(@class,'MANAGE_RECENTBILLERS_WGT ')]/following-sibling::div//div//div[contains(@class,'renderedRecords')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By ManageBiller_AllBillersList() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//div[@name='MANAGE_ALLBILLERS_VIEW']/table//tbody//div[contains(@class,'renderedRecords')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By All_Billers_List1(String Biller_Nick_Name) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//h3[.='All Billers']/../../../following-sibling::div[1]//tbody//p[.='" + Biller_Nick_Name + "']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By ManageBiller_AllBillersList_BillerNickName(int itr) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"(//div[@name='MANAGE_ALLBILLERS_VIEW']/table//tbody//div[contains(@class,'renderedRecords')])["
							+ itr + "]//p[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Manage_Biller_NickName() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//input[@name='NICK_NAME']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Recent_Biller_Header() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//h3[.='Recent Billers']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By All_Biller_Header() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//h3[.='All Billers']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By ManageBiller_NickName() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Biller Nick Name']/../../following-sibling::div/div/child::span[@name='NICK_NAME']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By ManageBiller_UtilityAcc_Number(String fieldname) {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[contains(text(),'" + fieldname + "')]/../../following-sibling::div/div/child::input");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Next_Button() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='NEXT'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Back_Button() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='BACK'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Submit_Button() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='SUBMIT'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By EditBiller_BackArrow() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//h3[.='Edit Biller']/../../../../following-sibling::button)[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By EditBiller_Confirmation_Message() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//label[.='Your modification to your biller was successful.']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Biller_Name(String name) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[@name='MANAGE_ALLBILLERS_VIEW']//p[.='" + name + "']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By DeleteBiller_Confirmation_Message() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//label[.='Biller has been successfully deleted.']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Delete(String name) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//h3[.='All Billers']/../../../following-sibling::div[1]//tbody//p[.='" + name
					+ "']/../../../../following-sibling::span//button[@data-context-id='BILLER_DELETE']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_Edit(String name) {
		// h3[.='All
		// Billers']/../../../following-sibling::div[1]//tbody//p[.='ooredo']/../../../following-sibling::div/button[.='edit']
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//h3[.='All Billers']/../../../following-sibling::div[1]//tbody//p[.='" + name
					+ "']/../../../../preceding-sibling::span//button[@data-context-id='BILLER_EDIT']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Pay(String name) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//h3[.='All Billers']/../../../following-sibling::div[1]//tbody//p[.='" + name
					+ "']/../../../../following-sibling::span//button[@data-context-id='PAYNOW']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_More(String name) {
		// h3[.='All
		// Billers']/../../../following-sibling::div[1]//tbody//p[.='ooredo']/../../../following-sibling::div/button[.='edit']
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//h3[.='All Billers']/../../../following-sibling::div[1]//tbody//p[.='" + name
					+ "']/../../../following-sibling::div//span[1][contains(@class,'flaticon-more-icon grid')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Delete_Confirmation() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[contains(text(),'Are you sure to terminate all the future dated payment?')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Delete_PopupYes() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='dialogBtnYes'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Review_Biller_Name() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[@id='lbl_SERVICE_PROVIDER_CODE']/../../following-sibling::div[1]//span[@name='SERVICE_PROVIDER_CODE']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Review_Qatari_Id() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[@id='lbl_NATIONALID']/../../following-sibling::div[1]//span[@name='NATIONALID']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Review_utility_Number() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[@id='lbl_UTILITY_ACCOUNT_NUMBER']/../../following-sibling::div[1]//span[@name='UTILITY_ACCOUNT_NUMBER']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Review_Account_Number() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[@id='lbl_ACCOUNT_NUMBER']/../../following-sibling::div[1]//span");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Review_Biller_Nick_Name() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[@id='lbl_NICK_NAME']/../../following-sibling::div[1]//span[@name='NICK_NAME']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_Delete_Button() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='DELETE'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	// Pay a Biller
	public By Payments_Register_Biller_chkbx() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//input[@name='REG_BILLER']/..//span");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_Proceed_Button() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='PROCEED'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_PayTo_BillerName(String details) {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Pay To']/../../following-sibling::div//child::p[contains(text(),'" + details
					+ "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_PayTo_Number(String details) {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Pay To']/../../following-sibling::div//child::p[contains(text(),'" + details
					+ "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Howmuch_BillAmount() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[@id='lbl_BILLER_AMOUNT']/../../following-sibling::div//child::input[contains(@value,'BILLAMT')]/following-sibling::span[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_Howmuch_OtherAmount() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[@id='lbl_BILLER_AMOUNT']/../../following-sibling::div//child::input[contains(@value,'OTHERAMT')]/following-sibling::span[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_Kahramaa_Howmuch_DepositAmount() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[@id='lbl_BILLER_AMOUNT']/../../following-sibling::div//child::input[contains(@value,'DEPOSITAMT')]/following-sibling::span[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Kahramaa_DepositAmount() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[.='Amount']/../../following-sibling::div//span[@name='SERVICE_AMT']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Biller_Icon() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[.='Pay To']/../../following-sibling::div//child::img");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PaymentMode_Account() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Payment Mode']/../../following-sibling::div[1]//child::input[contains(@value,'ACCOUNT')]/following-sibling::span[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PaymentMode_Card() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Payment Mode']/../../following-sibling::div[1]//child::input[contains(@value,'CARD')]/following-sibling::span[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Carousel_Dots() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//ul[@class='slick-dots']/li/button");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Carousel_Dots(int itr) {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//ul[@class='slick-dots']/li/button)[" + itr + "]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Account_Numbers(String cardnum) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//div[@name='ACCOUNT_CAROUSEL_VIEW']/table/tbody/div[1]/div[1]/div//span[text()='"
					+ cardnum + "'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By All_Accounts(int itr) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"(//div[@name='ACCOUNT_CAROUSEL_VIEW']/table/tbody/div[1]/div[1]/div//span[contains(@class,'pr-2')])["+ itr + "]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Accounts_In_Carousel_Account_Type(String accNum) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[@name='ACCOUNT_CAROUSEL_VIEW']//span[.='" + accNum + "']//preceding-sibling::h4");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Accounts_In_Carousel_Account_Status(String accNum) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//div[@name='ACCOUNT_CAROUSEL_VIEW']//span[.='" + accNum + "']//preceding-sibling::span[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Accounts_In_Carousel_Account_Number(String accNum) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[@name='ACCOUNT_CAROUSEL_VIEW']//span[.='" + accNum + "']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Accounts_In_Carousel_Available_Balance(String accNum) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[.='" + accNum
					+ "']/../../following-sibling::div//p[.='Available Balance']/../child::p[@class='amount']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Accounts_In_Carousel_HolderName(String accNum) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[@name='ACCOUNT_CAROUSEL_VIEW']//span[.='" + accNum + "']/following-sibling::span[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_PayNow() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[@id='lbl_PAYMENT_TYPE']/../../following-sibling::div//input[@value='PAY_NOW']/following-sibling::span[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_PayLater() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[@id='lbl_PAYMENT_TYPE']/../../following-sibling::div//input[@value='PAY_LATER']/following-sibling::span[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_AutoPay() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[@id='lbl_PAYMENT_TYPE']/../../following-sibling::div//input[@value='AUTOPAY']/following-sibling::span[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_PaymentDate() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Payment Date']/../../following-sibling::div//input[@name='FIRST_PYMNT_DATE']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_PaymentDate_Label() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[@data-item-id='FIRST_PYMNT_DATE']//span[text()='Payment Date']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_PayLater_Datepicker() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//input[@name='FIRST_PYMNT_DATE']/../child::span//i[@class='flaticon-calendar-new']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_Date_Set() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele =
			// By.xpath("//android.widget.EditText[@resource-id='FORM_CARD_STATEMENT-TO_DATE']/following-sibling::android.view.View");
			ele = By.xpath("//a[text()='Set']");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	public By Payments_Selected_Year() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath(
					"//android.view.View[@resource-id='ap-component-2']/android.view.View/android.widget.ListView/android.view.View[@selected='true']");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		}

		return ele;
	}

	public By Payments_ConfirmPayment() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='CON_PAY'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_Review_DebitFrom_AccCard_Number(String name) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Debit From']/../../following-sibling::div//child::p[contains(text(),'" + name
					+ "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Review_DebitFrom_Acc_Card_HolderName() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Debit From']/../../following-sibling::div//child::p[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Review_PayTo_BillerName_Number(String name) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Pay To']/../../following-sibling::div//child::p[text()='" + name + "']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Review_PaymentType() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Payment Type']/../../following-sibling::div//child::span[@name='PAYMENT_OPTION']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By PayABiller_Review_Detail_Fields(String fieldname, String value) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='" + fieldname
					+ "']/../../following-sibling::div//child::span[contains(text(),'" + value + "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By PayABiller_Review_PaymentDate_PayNowLater() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Payment Date']/../../following-sibling::div//child::span[@name='FIRST_PYMNT_DATE']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By PayABiller_Review_PaymentDate_AutoPay() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Payment Date']/../../following-sibling::div//child::span[@name='AUTOPAY_DATE']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By PayAbiller_Review_PaymentMode() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Payment Mode']/../../following-sibling::div//child::span[@name='PAYMENT_MODE']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayABiller_ConfirmationTick() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//form[@data-item-id='CONFIRMATION_FORM']//img[@name='OD_SUCCESS_IMG']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By PayABiller_ConfirmationSuccess_Message() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//label[contains(text(),'Your Bill Payment transaction was successful.')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By PayABiller_PayOther_Amount(String amount) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[@name='TRANSFER_AMT' and contains(text(),'" + amount + "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayABiller_Confirmation_AccountCardNumber(String number) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Pay From']/../../following-sibling::div//child::p[contains(text(),'" + number
					+ "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayABiller_Confirmation_AccountCardHolderName() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Pay From']/../../following-sibling::div//child::p[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayAbiller_MakeAnotherPayment() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//button[text()='Make Another Payment']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By PayAbiller_Confirmation_FavButton() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//button[@id='CONFIRMATION_FORM-FAV_BTN']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayAbiller_Confirmation_ShareButton() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//button[@id='CONFIRMATION_FORM-SHARE_BTN']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayAbiller_Confirmation_DownloadButton() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//button[@id='CONFIRMATION_FORM-DLD_BTN']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By All_Cards_In_Carousel() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//div[@name='CARD_CAROUSEL_VIEW']/table/tbody/div[1]/div[1]/div//p[contains(@class,'crdNumber')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By All_Cards_Carousel_CardNumber(int itr) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"(//div[@name='CARD_CAROUSEL_VIEW']/table/tbody/div[1]/div[1]/div//p[contains(@class,'crdNumber')])["
							+ itr + "]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By All_Cards_Carousel_Status(String cardnumber) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[@name='CARD_CAROUSEL_VIEW']//p[.='" + cardnumber
					+ "']/following-sibling::span[contains(@class,'status')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By All_Cards_Carousel_ExpiryDate(String cardnumber) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[@name='CARD_CAROUSEL_VIEW']//p[.='" + cardnumber
					+ "']/following-sibling::span[contains(@class,'pl-5')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By All_Cards_Carousel_CardHolderName(String cardnumber) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[@name='CARD_CAROUSEL_VIEW']//p[.='" + cardnumber
					+ "']/following-sibling::p[contains(@class,'cedName')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Review_Pay() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='pay' or text()='Pay']/../../following-sibling::div//span[@name='PAYMENT_TYPE']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	// Top up and Recharge
	public By Topup_Note() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[@name='CODE_NOTE']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Topup_TermsConditions() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//input[@name='TERMS_COND']/following-sibling::span");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Confirm_Payment_Button() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='CONFIRM'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payment_Amount() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Payment Amount']/../../following-sibling::div//child::span[@name='TXN_AMT']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_Review_PayFrom_AccNumber(String num) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Pay From']/../../following-sibling::div//child::p[contains(text(),'" + num + "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Review_PayFrom_AccCardHolderName() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Pay From']/../../following-sibling::div//child::p[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Payments_Review_Topup_PlanNumber(String name) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//span[text()='Recharge Details']/../../following-sibling::div//child::p[text()='" + name + "']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Topup_Review_Detail_Fields(String fieldname, String value) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='" + fieldname
					+ "']/../../following-sibling::div//child::span[contains(text(),'" + value + "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Topup_ConfirmationTick() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//form[@data-item-id='CONFIRMATION_FORM']//img[@name='OD_SUCCESS_IMG']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Topup_Confirmation_Success_Message() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//label[contains(text(),'successful')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Topup_Confirmation_Amount(String amount) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[@name='TRANSFER_AMT' and contains(text(),'" + amount + "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Topup_MakeAnotherTopup() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//button[text()='Make Another Top Up']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Topup_Confirmation_PayTo(String details) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Pay To']/../../following-sibling::div//child::p[contains(text(),'" + details
					+ "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// Pay Bills
	public By PayBills_AllBillers_List() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//div[@name='PAYMENTS_ALL_BILLER_VIEW']/table//tbody[1]//div[contains(@class,'renderedRecords')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By PayBills_AllBillers_BillerIcon(String billernickname) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[@name='PAYMENTS_ALL_BILLER_VIEW']//p[.='" + billernickname
					+ "']/../../../preceding-sibling::div//img");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayBills_AllBillers_Number(String billernickname) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//div[@name='PAYMENTS_ALL_BILLER_VIEW']//p[.='" + billernickname + "']/following-sibling::p[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayBills_Notes() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[@name='PAY_BILLS_NOTES']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By PayBills_Confirmation_Success_Message() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//label[contains(text(),'successful')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By AllBillers_Biller_Nick_Name(int itr) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"(//div[@name='PAYMENTS_ALL_BILLER_VIEW']/table//tbody[1]//div[contains(@class,'renderedRecords')])["
							+ itr + "]//p[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Payments_PayBills_Review_Pay() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Pay']/../../following-sibling::div//span[@name='PAYMENT_TYPE']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By PayBills_Confirmation_PayTo(String details) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//span[text()='Pay To']/../../following-sibling::div//child::p[contains(text(),'" + details
					+ "')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// Due Bills
	public By DueBills_Header() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//h3[.='Due Bills']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By DueBills_List() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("//div[@name='DUE_BILLERS_VIEW']/table//tbody[1]//div[contains(@class,'renderedRecords')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By DueBills_BillerIcon(String status) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"(//div[@name='DUE_BILLERS_VIEW']//p[contains(text(),'" + status + "')])[1]/../../..//child::img");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By DueBills_Biller_Nickname(String status) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//div[@name='DUE_BILLERS_VIEW']//p[contains(text(),'" + status
					+ "')])[1]/../../preceding-sibling::div//div[contains(@class,'m-grid-description')]//p[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By DueBills_Biller_Number(String status) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//div[@name='DUE_BILLERS_VIEW']//p[contains(text(),'" + status
					+ "')])[1]/../../preceding-sibling::div//div[contains(@class,'m-grid-description')]//p[2]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By DueBills_Amount(String status) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//div[@name='DUE_BILLERS_VIEW']//p[contains(text(),'" + status
					+ "')])[1]/preceding-sibling::p[2]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By DueBills_Date(String status) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//div[@name='DUE_BILLERS_VIEW']//p[contains(text(),'" + status
					+ "')])[1]/preceding-sibling::p[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By DueBills_Status(String status) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//div[@name='DUE_BILLERS_VIEW']//p[contains(text(),'" + status + "')])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Pay_Bills_BackArrow() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//h3[.='Pay Bills']/../../../../following-sibling::button)[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// Delete Biller
	public By DeleteBiller_BillerNumber(String number) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//android.view.View[@text='All Billers']/../following-sibling::android.view.View[1]//android.view.View[@text='"
							+ number + "']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By DeleteBiller_Options(String number) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//android.view.View[@text='All Billers']/../following-sibling::android.view.View[1]//android.view.View[@text='"
							+ number + "']/../following-sibling::android.view.View[1]");

			////android.view.View[@text='All Billers']/../following-sibling::android.view.View[1]//android.view.View[@text='1190876']/../following-sibling::android.view.View[1]
			
		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By DeleteBiller_Pay(String number) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//android.view.View[@text='All Billers']/../following-sibling::android.view.View[1]//android.view.View[@text='"
							+ number + "']/../../following-sibling::android.widget.Button[@text='Pay']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By DeleteBiller_Delete(String number) {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//android.view.View[@text='All Billers']/../following-sibling::android.view.View[1]//android.view.View[@text='"
							+ number + "']/../../following-sibling::android.widget.Button[@text='Delete']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// android.view.View[@text='All
	// Billers']/../following-sibling::android.view.View[1]//android.view.View[@text='1190874']/../../following-sibling::android.widget.Button[@text='Delete']

	// android.view.View[@text='All
	// Billers']/../following-sibling::android.view.View[1]//android.view.View[@text='1190874']/../../following-sibling::android.widget.Button[@text='Pay']

	// android.view.View[@text='All
	// Billers']/../following-sibling::android.view.View[1]//android.view.View[@text='1190874']/../following-sibling::android.view.View[1]

	public By Nick_Name_Error() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//div[@data-item-id='ct-modal-content']//textarea[contains(text(),'Nick name already exists')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Biller_Registered_Error() {

		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath(
					"//div[@data-item-id='ct-modal-content']//textarea[contains(text(),'This Biller is registered already')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By OTP_Screen_Back_Button() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {

			ele = By.xpath("(//a[@data-item-id='BACK'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;

	}

	public By Resend_OTP() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele = By.xpath("//android.view.View[@text='Resend OTP']");
			ele = By.xpath("//a[.=' Resend OTP ']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By OTP_Manadate_error() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			// ele = By.xpath("//android.view.View[@text='Resend OTP']");
			ele = By.xpath("(//span[.='Please enter the OTP'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By OTP_Invalid_error() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//span[.='OTP entered is incorrect. Please try again']/span");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By OTP_error() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//span[.=' Please enter your One Time Password (OTP)']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Exeed_OTP_Attempt() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//div[contains(text(),'exceeded')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By Popup_OK() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//div[@data-item-id='ct-modal-content']//a[contains(text(),'Ok')]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// Manage Billers 17th Aug
	// 2020************************************************************************************************************

	public By ManageBillers_AllBillers_Heading() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//h3[.='All Billers']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By ManageBillers_AllBillers_FirstName() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//div[@name='MANAGE_ALLBILLERS_VIEW']/table//tbody/child::div[1]//p[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By ManageBillers_AllBillers_FirstAccountNumber() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//div[@name='MANAGE_ALLBILLERS_VIEW']/table//tbody/child::div[1]//p[2]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// Pay a bill

	public By PayBill_Kahrama_DepositAmount_RadioBtn() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//input[@value='DEPOSITAMT']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayBill_OtherAmount_Blank_ErrorMsg() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("(//span[.='This field is mandatory'])[1]");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayBill_MakeAnotherPayment_FInalScreen() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//button[.='Make Another Payment']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayBill_AutoPay_Drpdown() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//span[text()='Payment Date']/../../following-sibling::div//select");
			// Dropdown contains - On Due date,16th of Every Month

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By PayBill_POP_Up_OK() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//a[@data-item-id='dialogBtnOk']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	// From Jayashree

	public By ResendOTP_Morethan3() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath(
					"//div[text()='You have exceeded the maximum number of attempts for this session and this transaction has been cancelled.']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By OTP_NotEntered() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//span[text()='This field is mandatory']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By OTP_Invalid() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//span[text()='OTP entered is incorrect. Please try again']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

			ele = By.xpath("");
		}
		return ele;
	}

	public By OTP_InvalidThrice() {
		By ele = null;
		if (data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//div[text()='You have exceeded maximum number of attempts and this transaction has been cancelled. Please initiate the transaction again']");

		} else if (data.getData_Env().get("Device_Type").equals("IOS_MOB")) {

			ele = By.xpath("");
		} else if (data.getData_Env().get("Device_Type").equals("IOS_TAB")) {

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
