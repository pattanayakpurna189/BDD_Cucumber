package MB.Page;

import org.openqa.selenium.By;

import managers.DataManager;

public class ToolsPage {
	
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
	
	public By Utility_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//a[.='Utilities']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Maturity_Calculator_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Deposit Maturity Calculator']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Maturity_Calculator_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Deposit Maturity Calculator']");
        	
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
        	ele = By.xpath("//label[@for='DEP_RATE_CAL_FORM-ACC_TYPE' or @for='DEP_RATES_FORM-ACC_TYPE']/../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Type_Selection(String dep_type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='DEP_RATE_CAL_FORM-ACC_TYPE' or @for='DEP_RATES_FORM-ACC_TYPE']/../following-sibling::div//select/option[.='"+dep_type+"']");
        	
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
        	ele = By.xpath("//label[@for='DEP_RATE_CAL_FORM-ACC_CURR']/../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Currency_Selection(String currency) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='DEP_RATE_CAL_FORM-ACC_CURR']/../following-sibling::div//select/option[.='"+currency+"']");
        	
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
        	ele = By.xpath("//label[@for='DEP_RATE_CAL_FORM-TENOR']/../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Tenure_Selection(String tenure) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//label[@for='DEP_RATE_CAL_FORM-TENOR']/../following-sibling::div//select/option[.='"+tenure+"']");
        	
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
        	ele = By.xpath("//label[@for='DEP_RATE_CAL_FORM-AMOUNT']/../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Calculate_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//button[.='Calculate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Interest_Rate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Interest Rate (%)']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Interest_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Interest Amount']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Maturity_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Maturity Amount']/../../following-sibling::div//span[1])[1]");
        	
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
	
	public By Amount_Error_Message() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Please enter the Amount'])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	
	//Exchange rate calculator
	public By EXchange_Rate_Button() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Currency Converter']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EXchange_Rate_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Currency Converter']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EXchange_Rate_From_Currency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_FROM_CURR']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EXchange_Rate_From_Currency_Selection(String frm_cur) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_FROM_CURR']/../../following-sibling::div//select/option[.='"+frm_cur+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EXchange_Rate_To_Currency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_TO_CURR']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EXchange_Rate_To_Currency_Selection(String to_cur) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_TO_CURR']/../../following-sibling::div//select/option[.='"+to_cur+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EXchange_Rate_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_AMOUNT']/../../following-sibling::div//input");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EXchange_Rate_Result() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Result']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EXchange_Rate_Calculation() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Calculation']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	
	//Loan Calculator
	public By Loan_Calculator_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='EMI Calculator']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='EMI Calculator']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Product_Type() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_ITEM_SELECTOR184']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Product_Type_Selection(String produt_type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_ITEM_SELECTOR184']/../../following-sibling::div//select/option[.='Mortgage Loan']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Nationality() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_ITEM_SELECTOR529']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Nationality_Selection(String nationality) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_ITEM_SELECTOR529']/../../following-sibling::div//select/option[.='"+nationality+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Interest_Rate_Src() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("//span[@id='lbl_SLIDER_FIELD943']/../../following-sibling::div//div[@class='pointer point-0']");
        	ele = By.xpath("(//div[@class='back-bar']/div[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Interest_Rate_Dest(String val) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@class='back-bar']/div[1])[1]/../following-sibling::div/span/ins[.='"+val+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Loan_Amount_Src() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("//span[@id='lbl_SLIDER_FIELD804']/../../following-sibling::div//div[@class='pointer point-0']");
        	ele = By.xpath("(//div[@class='back-bar']/div[1])[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Loan_Amount_Dest(String val) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@class='back-bar']/div[1])[2]/../following-sibling::div/span/ins[.='"+val+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Months_Src() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//        	ele = By.xpath("//span[@id='lbl_SLIDER_FIELD495']/../../following-sibling::div//div[@class='pointer point-0']");
        	ele = By.xpath("(//div[@class='back-bar']/div[1])[3]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By EMI_Calculator_Months_Dest(String val) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//div[@class='back-bar']/div[1])[3]/../following-sibling::div/span/ins[.='"+val+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Monthly_Payment() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Monthly Payment']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Total_Interest_Payable() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Total Interest Repayable']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Total_Repayment_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("(//span[.='Total Repayment Amount']/../../following-sibling::div//span[1])[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//FX rates
	public By FX_Rates_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='FX Rates']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By FX_Rates_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='FX Rates']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By FX_Rate_Currency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Currency']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By FX_Rate_Buy_Rate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Buy Rate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By FX_Rate_Sell_Rate() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Sell Rate']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By FX_Rate_Currency_Val1() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Currency']/../../following-sibling::div/div[1]/h3[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By FX_Rate_Currency_Val2() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Currency']/../../following-sibling::div/div[1]/h3[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By FX_Rate_Buy_Rate_Val() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Currency']/../../following-sibling::div/div[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By FX_Rate_Sell_Rate_Val() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Currency']/../../following-sibling::div/div[3]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	//Deposit Rates
	public By Deposits_Rates_Menu() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//div[.='Deposit Rates']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposits_Rates_Heading() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//h3[.='Deposit Rates']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Rates_Deposit_Type() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_ACC_TYPE']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Rates_Deposit_Type_Selection(String type) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_ACC_TYPE']/../../following-sibling::div//select/option[.='"+type+"']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Rates_Currency() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_ACC_CURR']/../../following-sibling::div//select");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Rates_Currency_Selection(String currency) {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//span[@id='lbl_ACC_CURR']/../../following-sibling::div//select/option[.='"+currency+"']");
        	
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
        	ele = By.xpath("//button[.='Search']");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Rates_Tenure() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Tenure']/../../following-sibling::div/div[1]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Rates_Interest() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Interest (%)']/../../following-sibling::div/div[2]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposit_Rates_Amount() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//p[.='Amount (up to)']/../../following-sibling::div/div[3]");
        	
        }else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
           
            ele = By.xpath("");
        }else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
           
            ele = By.xpath("");
        }
        return ele;
	}
	
	public By Deposits_Rates_Load_More() {
		By ele = null;
        if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
        	ele = By.xpath("//em[.='-- Load More --']");
        	
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
