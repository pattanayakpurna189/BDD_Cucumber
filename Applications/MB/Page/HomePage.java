package MB.Page;

import org.openqa.selenium.By;

import managers.DataManager;

public class HomePage {
	
	DataManager data = new DataManager();	
	
	//workspace
	
	public By Workspace(String workspace) {
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
//			ele = By.xpath("//android.view.View[@text='"+workspace+"']");
			//ele = By.xpath("//android.widget.TextView[@text='"+workspace+"']");
            ele = By.xpath("//android.view.View[@content-desc='"+workspace+"']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		
		return ele;
	}
	public By Logout_Link() {
		
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//a[@data-item-id='mobMenu_logout']//icon");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}
	
public By Logout_Confirmation() {
		
		By ele = null;
		if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
			ele = By.xpath("//div[contains(text(),'Are you sure you want to logout')]/..//following-sibling::div[1]//a[.='Yes']");
			
		}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
			
			ele = By.xpath("");
		}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
			
			ele = By.xpath("");
		}
		return ele;
	}

public By Signin_Button() {
	
	By ele = null;
	if(data.getData_Env().get("Device_Type").equals("ANDROID_MOB")) {
		ele = By.xpath("//button[.=' Sign In ']");
		
	}else if(data.getData_Env().get("Device_Type").equals("IOS_MOB")) {
		
		ele = By.xpath("");
	}else if(data.getData_Env().get("Device_Type").equals("IOS_TAB")) {
		
		ele = By.xpath("");
	}
	return ele;
}
}
