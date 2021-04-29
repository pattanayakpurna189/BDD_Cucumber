package Reusable_Methods;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import managers.ExtentManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Utility {
	public static ThreadLocal<ExtentTest> parentTest=new ThreadLocal<ExtentTest>();
	public static ThreadLocal<String> DataBinding = new ThreadLocal<String>();
	public static ThreadLocal<String> SheetName = new ThreadLocal<String>();
	public static ThreadLocal<RemoteWebDriver> webdriver = new ThreadLocal<RemoteWebDriver>();
	public static ThreadLocal<AppiumDriver<MobileElement>> appiumDriver = new ThreadLocal<AppiumDriver<MobileElement>>();
	
	public static ThreadLocal<String> Environment = new ThreadLocal<String>();
	public static ThreadLocal<String> Login_DataBinding = new ThreadLocal<String>();
	public static ThreadLocal<String> output_Array_Name = new ThreadLocal<String>();
	public static ThreadLocal<String> JIRA = new ThreadLocal<String>();
	
	//DataManager data = new DataManager();
	ExtentManager ext_man = new ExtentManager();
	//DataManager data = new DataManager();
	String Output_Data_File = ExtentManager.OutPut_File_Name;
	String Result_Date = ExtentManager.resultdate;
	//LoginPage login = new LoginPage();
	
	public static synchronized String readProperty(String key) {
		String value = null;
		try{
			FileInputStream stream = new FileInputStream(".//ProjectSetting.properties");
			Properties pro = new Properties();
			pro.load(stream);
			value = pro.getProperty(key);
		}catch(Exception e) {
			
		}
		return value;
	}
	
	public synchronized void Press_Enter() {   
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}catch(Exception e) {
			
		}
		
	}
	
	public void ThrowException(String MethodName, RemoteWebDriver driver,By locator) throws Exception {
		
		
		Fail(driver, "Failed : As Element not found "+locator.toString());
		Fail_WithOut_SS("Failed in the Step : "+MethodName);
		driver.quit();
		String CaseName = output_Array_Name.get();
		System.out.println("Case Name is : "+CaseName);
		JIRA.set(CaseName);
		throw new Exception();


}
	
	
	//Web Application Utilies***************************************************************************************************************************************
	
	
	
	public synchronized WebElement get_Element(RemoteWebDriver driver,By locator) {
		WebElement ele = null;
		try {
			 ele = driver.findElement(locator);
			
		}catch(Exception e ) {
			
		}
		
		return ele;
	}
	
	public synchronized boolean Contains_Text(String MethodName, RemoteWebDriver driver,By locator, String Expected_Text, int timeToWait) throws Exception {
		int my_time = 0;
		boolean flag = false;
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							String Text = ele.getText();
							if(Text!=null) {
								if(!Text.trim().isEmpty()) {
									if(Text.trim().contains(Expected_Text)) {
										flag = true;
									}
								}
							}
							break;
							
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return flag;
	}
	
	public synchronized void Click(String MethodName, RemoteWebDriver driver,By locator, int timeToWait) throws Exception {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							ele.click();
							break;
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public synchronized void Sendkeys(String MethodName, RemoteWebDriver driver,By locator,String data, int timeToWait) throws Exception  {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							ele.click();
							Thread.sleep(100);
							ele.clear();
							Thread.sleep(100);
							ele.sendKeys(data);
							break;
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					Thread.sleep(1000);
				}
			}
			
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public synchronized void wait_for_Element(String MethodName, RemoteWebDriver driver,By locator, int timeToWait) throws Exception {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							break;
							
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
				/*driver.quit();
				Fail_WithOut_SS("Failed : As Element not found "+locator.toString());
				Fail_WithOut_SS("Failed in the Step : "+MethodName);
				throw new Exception();*/
				
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public synchronized void wait_for_Element_WithOutThrowing_Exception(RemoteWebDriver driver,By locator, int timeToWait) throws Exception {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							break;
							
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public synchronized boolean isDisplayed(RemoteWebDriver driver,By locator) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		boolean flag = false;
			WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {							
							flag = true;
						}
					}
					
				}catch(Exception e) {
					
				}
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return flag;
	}
	
	public synchronized String getText(RemoteWebDriver driver,By locator) throws Exception {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String Data = "";
		WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							String text = ele.getText();
							if(text!=null) {
								if(!text.trim().isEmpty()) {
									Data = text.trim(); 
								}
							}
							
						}
					}
					
				}catch(Exception e) {
					driver.quit();
					throw new Exception();
					
				}
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return Data;
	}
	
	
	//Mobile Application Utilies***************************************************************************************************************************************
	
	public synchronized MobileElement get_AppiumElement(AppiumDriver<MobileElement> driver,By locator) {
		MobileElement ele = null;
		try {
			 ele = driver.findElement(locator);
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		return ele;
	}
	
	public synchronized void Click(String MethodName, AppiumDriver<MobileElement> driver,By locator, int timeToWait) throws Exception {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			boolean flag = true;
			while(my_time<=timeToWait) {
				my_time = my_time+1;
				MobileElement ele = null;
				try {
					ele = get_AppiumElement(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							ele.click();
							flag = false;
							break;
							
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			if(flag) {
				ThrowException(MethodName, driver, locator);
			}
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public synchronized void Tap_On_Element(String MethodName, AppiumDriver<MobileElement> driver,By locator, int timeToWait) throws Exception {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				MobileElement ele = null;
				try {
					ele = get_AppiumElement(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							ele.click();
							break;
							
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
				
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public boolean Contains_Text(String MethodName, AppiumDriver<MobileElement> driver,By locator, String Expected_Text, int timeToWait) throws Exception {
		int my_time = 0;
		boolean flag = false;
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				MobileElement ele = null;
				try {
					ele = get_AppiumElement(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							String Text = ele.getText();
							if(Text!=null) {
								if(!Text.trim().isEmpty()) {
									if(Text.trim().contains(Expected_Text)) {
										flag = true;
									}
								}
							}
							break;
							
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return flag;
	}	
	
	public synchronized void Sendkeys(String MethodName, AppiumDriver<MobileElement> driver,By locator,String data, int timeToWait) throws Exception  {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				MobileElement ele = null;
				try {
					ele = get_AppiumElement(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							ele.click();
							Thread.sleep(100);
							ele.clear();
							Thread.sleep(100);
							ele.sendKeys(data);
							break;
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					Thread.sleep(1000);
				}
			}
			
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	
	
	public synchronized void wait_for_Element(String MethodName, AppiumDriver<MobileElement> driver,By locator, int timeToWait) throws Exception {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				MobileElement ele = null;
				try {
					ele = get_AppiumElement(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							break;
							
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
				
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public synchronized void wait_for_Element_WithOutThrowing_Exception(AppiumDriver<MobileElement> driver,By locator, int timeToWait) throws Exception {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				MobileElement ele = null;
				try {
					ele = get_AppiumElement(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							break;
							
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public synchronized boolean isDisplayed(AppiumDriver<MobileElement> driver,By locator) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		boolean flag = false;
		MobileElement ele = null;
				try {
					ele = get_AppiumElement(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							flag = true;
						}
					}
					
				}catch(Exception e) {
					
				}
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return flag;
	}
	
	public synchronized String getText(AppiumDriver<MobileElement> driver,By locator) throws Exception {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String Data = "";
		MobileElement ele = null;
				try {
					ele = get_AppiumElement(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							String text = ele.getText();
							if(text!=null) {
								if(!text.trim().isEmpty()) {
									Data = text.trim(); 
								}
							}
							
						}
					}
					
				}catch(Exception e) {
					driver.quit();
					throw new Exception();
					
				}
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return Data;
	}
	
	public synchronized void Scroll_With_Coordinates(AppiumDriver<MobileElement> driver,String DeviceType,int startx,int starty,int endx,int endy) throws Exception {
		try {
			if(DeviceType.equals("ANDROID_MOB")) {
				 new TouchAction<>(driver).press(new PointOption<>().withCoordinates(startx, starty)).waitAction(new WaitOptions().withDuration(Duration.ofSeconds(5))).moveTo(new PointOption<>().withCoordinates(endx, endy)).release().perform();
				
			}else if(DeviceType.equals("IOS_MOB")) {
				 new TouchAction<>(driver).press(new PointOption<>().withCoordinates(startx, starty)).waitAction(new WaitOptions().withDuration(Duration.ofSeconds(5))).moveTo(new PointOption<>().withCoordinates(endx, endy)).release().perform();
			}
			
			
		}catch(Exception e) {
			driver.quit();
			throw new Exception();
			
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	//FRAMEWORK CORE FUNCTIONS*******************************************************************************************************************************8
	
   	public ArrayList<String> get_Driver_TestCaseID(String SheetName) throws FilloException {
		
		
		String Application = readProperty("Application");
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(".//Database//"+Application+"//Driver.xlsx");
		String TestCases_Query = "SELECT * FROM "+SheetName+" Where Control ='1' Order By Sno";
		Recordset TestCases_Rs = connection.executeQuery(TestCases_Query);
		ArrayList<String> columns = new ArrayList<String>();
		while(TestCases_Rs.next()) {
			columns.add(TestCases_Rs.getField("TestCase_ID").toString());
		}
		
		connection.close();
		return columns;
	}
	
	public ArrayList<String> getTestData_SeqNos(String Databinder,String SheetName) throws FilloException
	{
		String Application = readProperty("Application");
		Fillo fillo=new Fillo();
		Connection connection = fillo.getConnection(".//Database//"+Application+"//Driver.xlsx");
		String DataQuery="SELECT * FROM "+SheetName+" Where  Control ='1' and TestCaseID='"+Databinder+"'";
		Recordset Data_RS=connection.executeQuery(DataQuery);
		ArrayList<String> columns=new ArrayList<String>();
		
		while(Data_RS.next()) {
			columns.add(Data_RS.getField("Sl_No").toString());
		}
		connection.close();
		return columns;
		
	}
	
	public Hashtable<String,String> get_Keywords_Databindings(String TestCase_ID,String SheetName,String Seq_No) throws FilloException
	{
			String Application = readProperty("Application");
			Fillo fillo=new Fillo();
			Connection connection=fillo.getConnection(".//Database//"+Application+"//Driver.xlsx");
			Hashtable<String,String> data_values=new Hashtable<String,String>();
			String DataQuery="SELECT * FROM "+SheetName+" Where TestCaseID='"+TestCase_ID+"' and Sl_No='"+Seq_No+"'";
			Recordset Data_RS=connection.executeQuery(DataQuery);
			ArrayList<String> columns=new ArrayList<String>();
			columns=Data_RS.getFieldNames();
			//System.out.println("columns:"+columns);
			for(int i=1 ;i<columns.size();i++) {
				Data_RS.next();
				String columnName=columns.get(i);
				String columnValue=Data_RS.getField(columnName);
				data_values.put(columnName.trim().toString(), columnValue.trim().toString());
			
			}
			connection.close();
			return data_values;
	}
	
	public ArrayList<String> TestCase_Control_DataBindings() throws FilloException
	{
		String Application = readProperty("Application");
		Fillo fillo=new Fillo();
		Connection connection = fillo.getConnection(".//Database//"+Application+"//Driver.xlsx");
		String DataQuery="SELECT * FROM TestCase_Control Where  Control ='1'";
		Recordset Data_RS=connection.executeQuery(DataQuery);
		ArrayList<String> columns=new ArrayList<String>();
		String Data = "";
		String Sheet = "";
		
		while(Data_RS.next()) {
			try {
				if(Data_RS.getField("DataBindings").toString()!=null) {
					if(!Data_RS.getField("DataBindings").toString().isEmpty()) {
						Data = Data_RS.getField("DataBindings").toString();
						Sheet =  Data_RS.getField("SheetName").toString();
						columns.add(Data+"-"+Sheet);
					}
				}
			}catch(Exception e ) {
				
			}
			
		}
		connection.close();
		return columns;
		
	}  
	
	public ArrayList<String> TestData_Control_Envi_Login(String sheetname) throws FilloException
	{
		String Application = readProperty("Application");
		Fillo fillo=new Fillo();
		Connection connection = fillo.getConnection(".//Database//"+Application+"//TestData.xlsx");
		String DataQuery="SELECT * FROM "+sheetname+" Where  Control ='1'";
		Recordset Data_RS=connection.executeQuery(DataQuery);
		ArrayList<String> columns=new ArrayList<String>();
		String Data = "";
		
		while(Data_RS.next()) {
			try {
				if(Data_RS.getField("DataBinding").toString()!=null) {
					if(!Data_RS.getField("DataBinding").toString().isEmpty()) {
						Data = Data_RS.getField("DataBinding").toString();
						columns.add(Data);
					}
				}
			}catch(Exception e ) {
				
			}
			
		}
		connection.close();
		return columns;
		
	}  
	
	public ArrayList<String> TestCase_Control_DataBindings(String DataBinding) throws FilloException
	{
		String Application = readProperty("Application");
		Fillo fillo=new Fillo();
		Connection connection = fillo.getConnection(".//Database//"+Application+"//Driver.xlsx");
		String DataQuery="SELECT * FROM Settings Where  DataBinding ='"+DataBinding+"'";
		Recordset Data_RS=connection.executeQuery(DataQuery);
		ArrayList<String> columns=new ArrayList<String>();
		String Data = "";
		
		while(Data_RS.next()) {
			try {
				if(Data_RS.getField("Values").toString()!=null) {
					if(!Data_RS.getField("Values").toString().isEmpty()) {
						Data = Data_RS.getField("Values").toString();
						columns.add(Data);
					}
				}
			}catch(Exception e ) {
				
			}
		}
		connection.close();
		return columns;
	}
	
	public Hashtable<String,String> get_TestData(String DataBinding, String SheetName) throws FilloException
	{
			String Application = readProperty("Application");
			Fillo fillo=new Fillo();
			Connection connection=fillo.getConnection(".//Database//"+Application+"//TestData.xlsx");
			Hashtable<String,String> data_values=new Hashtable<String,String>();
			String DataQuery="SELECT * FROM "+SheetName+" Where DataBinding='"+DataBinding+"'";
			Recordset Data_RS=connection.executeQuery(DataQuery);
			ArrayList<String> columns=new ArrayList<String>();
			columns=Data_RS.getFieldNames();
			//System.out.println("columns:"+columns);
			for(int i=1 ;i<columns.size();i++) {
				Data_RS.next();
				String columnName=columns.get(i);
				String columnValue=Data_RS.getField(columnName);
				data_values.put(columnName.trim().toString(), columnValue.trim().toString());
			
			}
			connection.close();
			return data_values;
	}
	
	
	public synchronized String CaptureScreenshot(RemoteWebDriver driver)
	{
		SimpleDateFormat formatter =new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss.SSS");
		Date date=new Date();
		//File SrcFile= null;
		String imageName="img"+formatter.format(date)+".png";
		//System.out.println(ExtentManager.resultPath);
		String screenshot_path = ExtentManager.resultPath+"\\Screenshots";
		//String screenshot_path ="./Screenshots";
		File file = new File(screenshot_path);
		if(!(file.exists())) {
			file.mkdirs();
		}
		try{
			
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File screenshot = new File(screenshot_path+"\\"+imageName);
			 FileUtils.copyFile(SrcFile, screenshot);
			 
			/*TakesScreenshot scrShot =((TakesScreenshot)driver);
			 //File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			SrcFile=scrShot.getScreenshotAs(OutputType.BASE64);*/
			
		}catch(Exception e) {
			e.printStackTrace();	
		}
		
		return ".\\Screenshots\\"+imageName;
		//return SrcFile;
	}
	
	
	
	public synchronized String CaptureScreenshot(AppiumDriver<MobileElement> driver)
	{
		SimpleDateFormat formatter =new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss.SSS");
		Date date=new Date();
		//File SrcFile= null;
		String imageName="img"+formatter.format(date)+".png";
		//System.out.println(ExtentManager.resultPath);
		String screenshot_path = ExtentManager.resultPath+"\\Screenshots";
		//String screenshot_path ="./Screenshots";
		File file = new File(screenshot_path);
		if(!(file.exists())) {
			file.mkdirs();
		}
			try {
				
				
				/*String current_view = driver.getContext();
				if(current_view.contains("WEB")) {
					switchAppiumContext("NATIVE", driver);
				}*/
				
				 TakesScreenshot scrShot =((TakesScreenshot)driver);
				 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
				 File screenshot = new File(screenshot_path+"\\"+imageName);
				 FileUtils.copyFile(SrcFile, screenshot);
				 
				/* if(current_view.contains(current_view)) {
						switchAppiumContext("WEB", driver);
				}*/
				 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		
		return ".\\Screenshots\\"+imageName;
	}
	
	public synchronized void Pass(RemoteWebDriver driver,String Details) {
		try {
			//System.out.println("Path of screenshot Inside Pass :- "+CaptureScreenshot(driver));
			parentTest.get().pass(Details,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshot(driver)).build());
			//parentTest.get().pass(Details,MediaEntityBuilder.createScreenCaptureFromBase64String(CaptureScreenshot(driver)).build());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void Pass(AppiumDriver<MobileElement> driver,String Details) {
		try {
			//System.out.println("Path of screenshot Inside Pass :- "+CaptureScreenshot(driver));
			parentTest.get().pass(Details,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshot(driver)).build());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void Pass_WithOut_SS(String Details) {
		try {
			parentTest.get().pass(Details);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void Fail(RemoteWebDriver driver,String Details) {
		try {
			//System.out.println(CaptureScreenshot(driver));
			parentTest.get().fail(Details,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshot(driver)).build());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void Fail(AppiumDriver<MobileElement> driver,String Details) {
		try {
			//System.out.println(CaptureScreenshot(driver));
			parentTest.get().fail(Details,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshot(driver)).build());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void Fail_WithOut_SS(String Details) {
		try {
			parentTest.get().fail(Details);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void Info(RemoteWebDriver driver,String Details) {
		try {
			//System.out.println("Path of screenshot Inside Info :- "+CaptureScreenshot(driver));
			parentTest.get().info(Details,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshot(driver)).build());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void Info_WithOut_SS(String Details) {
		try {
			//System.out.println("Path of screenshot Inside Info :- "+CaptureScreenshot(driver));
			parentTest.get().info(Details);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void Info(AppiumDriver<MobileElement> driver,String Details) {
		try {
			//System.out.println("Path of screenshot Inside Info :- "+CaptureScreenshot(driver));
			parentTest.get().info(Details,MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreenshot(driver)).build());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public synchronized RemoteWebDriver getDriver() {
		return webdriver.get();
	}
	
	public synchronized AppiumDriver<MobileElement> getAppiumDriver() {
		return appiumDriver.get();
	}
	
	public synchronized String GetOutput_ArrayName() {
		return output_Array_Name.get().toString();
	}
	
	@SuppressWarnings({ "unchecked", "resource" })
	public synchronized String Write_To_Json(String Reference,String DebitAccountNumber, String DebitAmount,String CreditAccountNumber, String CreditAmount) {
		String Application = readProperty("Application");
		File  path = new File("./JsonData/"+Application+"/Output/"+Result_Date);
		if(!(path.exists())) {
			path.mkdirs();
		}
		File file = new File("./JsonData/"+Application+"/Output/"+Result_Date+"/"+Output_Data_File+".json");

			if(file.length()==0) {
				System.out.println("File is empty");
					try {
						file.createNewFile();
						JSONObject main = new JSONObject();
						JSONObject child = new JSONObject();
						child.put("Reference", Reference);
						
						if(DebitAccountNumber!=null) {
							if(!DebitAccountNumber.trim().isEmpty()) {
								if(DebitAccountNumber.contains(";")) {
									String[] DebitAcc = DebitAccountNumber.split(";");
									String[] DebitAmt = DebitAmount.split(";");
									for(int itr = 0;itr<DebitAcc.length;itr++) {
										child.put("Debit_Account_Number_"+itr, DebitAcc[itr]);
										child.put("Debit_Amount_"+itr, DebitAmt[itr]);
									}
									
								}else {
									child.put("Debit_Account_Number_0", DebitAccountNumber);
									child.put("Debit_Amount_0", DebitAmount);
									
								}
							}
						}
						
						
						if(CreditAccountNumber!=null) {
							if(!CreditAccountNumber.trim().isEmpty()) {
								if(CreditAccountNumber.contains(";")) {
									String[] CreditAcc = CreditAccountNumber.split(";");
									String[] CreditAmt = CreditAmount.split(";");
									for(int itr = 0;itr<CreditAcc.length;itr++) {
										child.put("Credit_Account_Number_"+itr, CreditAcc[itr]);
										child.put("Credit_Amount_"+itr, CreditAmt[itr]);
									}
								}else {
									child.put("Credit_Account_Number_0", CreditAccountNumber);
									child.put("Credit_Amount_0", CreditAmount);
								}
							}
						}
						
						main.put(output_Array_Name.get().toString(), child);
						FileWriter fw = new FileWriter(file);
						fw.write(main.toJSONString());
						fw.flush();
						System.out.println("Done");
					} catch (IOException e) {
						System.out.println("Exception");
						e.printStackTrace();
					}
				
			}else {
				try {
					System.out.println("File is having data");
					JSONParser jsonParser = new JSONParser();
					Object obj = jsonParser.parse(new FileReader(file));
					JSONArray jsonArray = new JSONArray();
					jsonArray.add(obj);
					System.out.println(jsonArray);
					JSONObject main = new JSONObject();
					JSONObject child = new JSONObject();
					child.put("Reference", Reference);
					
					if(DebitAccountNumber!=null) {
						if(!DebitAccountNumber.trim().isEmpty()) {
							if(DebitAccountNumber.contains(";")) {
								String[] DebitAcc = DebitAccountNumber.split(";");
								String[] DebitAmt = DebitAmount.split(";");
								for(int itr = 0;itr<DebitAcc.length;itr++) {
									child.put("Debit_Account_Number_"+itr, DebitAcc[itr]);
									child.put("Debit_Amount_"+itr, DebitAmt[itr]);
								}
								
							}else {
								child.put("Debit_Account_Number_0", DebitAccountNumber);
								child.put("Debit_Amount_0", DebitAmount);
								
							}
						}
					}
					
					
					if(CreditAccountNumber!=null) {
						if(!CreditAccountNumber.trim().isEmpty()) {
							if(CreditAccountNumber.contains(";")) {
								String[] CreditAcc = CreditAccountNumber.split(";");
								String[] CreditAmt = CreditAmount.split(";");
								for(int itr = 0;itr<CreditAcc.length;itr++) {
									child.put("Credit_Account_Number_"+itr, CreditAcc[itr]);
									child.put("Credit_Amount_"+itr, CreditAmt[itr]);
								}
							}else {
								child.put("Credit_Account_Number_0", CreditAccountNumber);
								child.put("Credit_Amount_0", CreditAmount);
							}
						}
					}
					
					main.put(output_Array_Name.get().toString(), child);
					jsonArray.add(main);
					FileWriter fileoutput = new FileWriter(file);
					fileoutput.write(jsonArray.toJSONString());
					fileoutput.flush();
					fileoutput.close();
					
				}catch(Exception e) {
					
				}
				
			
				
			}
		
		return output_Array_Name.get().toString();
	}
	
	
	//For executor***************************************************
	
	
	public ArrayList<String> RemoveDuplicateString(ArrayList<String> al){
		 
		Object[] st = al.toArray();
	      for (Object s : st) {
	        if (al.indexOf(s) != al.lastIndexOf(s)) {
	        	al.remove(al.lastIndexOf(s));
	         }
	      }
	      return al;
	}
	
	public ArrayList<String> TestCase_Control_Get_ScenarioID() throws FilloException
	{
		String Application = readProperty("Application");
		String Execution_Type = readProperty("Execution_Type");
		Fillo fillo=new Fillo();
		Connection connection = fillo.getConnection(".//Database//"+Application+"//Driver.xlsx");
		String DataQuery = "";
		if(Execution_Type.equalsIgnoreCase("NORMAL")) {
			DataQuery = "SELECT * FROM TestCase_Control Where  Control ='1'";
			
		}else if(Execution_Type.equalsIgnoreCase("REGRESSION")) {
			DataQuery = "SELECT * FROM TestCase_Control Where  Regression ='YES'";
			
		}else if(Execution_Type.equalsIgnoreCase("SANITY")) {
			DataQuery = "SELECT * FROM TestCase_Control Where  Sanity ='YES'";
		}
		
		
		
		Recordset Data_RS=connection.executeQuery(DataQuery);
		ArrayList<String> columns=new ArrayList<String>();
		
		while(Data_RS.next()) {
			try {
				if(Data_RS.getField("Scenario_ID").toString()!=null) {
					if(!Data_RS.getField("Scenario_ID").toString().isEmpty()) {
						columns.add(Data_RS.getField("Scenario_ID").toString());
					}
				}
				
			}catch(Exception e ) {
				
			}
			
		}
		columns = RemoveDuplicateString(columns);
		
		connection.close();
		return columns;
		
	}
	
	public ArrayList<String> TestCase_Control_Get_TestCaseID(String ScenarioID) throws FilloException
	{
		String Application = readProperty("Application");
		String Execution_Type = readProperty("Execution_Type");
		Fillo fillo=new Fillo();
		Connection connection = fillo.getConnection(".//Database//"+Application+"//Driver.xlsx");
		
		String DataQuery = "";
		
		if(Execution_Type.equalsIgnoreCase("NORMAL")) {
			DataQuery = "SELECT * FROM TestCase_Control Where  Control ='1' and Scenario_ID = '"+ScenarioID+"'";
			
		}else if(Execution_Type.equalsIgnoreCase("REGRESSION")) {
			DataQuery = "SELECT * FROM TestCase_Control Where  Regression ='YES' and Scenario_ID = '"+ScenarioID+"'";
					
			
		}else if(Execution_Type.equalsIgnoreCase("SANITY")) {
			DataQuery = "SELECT * FROM TestCase_Control Where  Sanity ='YES' and Scenario_ID = '"+ScenarioID+"'";
					
		}
		
		
		Recordset Data_RS=connection.executeQuery(DataQuery);
		ArrayList<String> columns=new ArrayList<String>();
		
		while(Data_RS.next()) {
			try {
				if(Data_RS.getField("TestCase_ID").toString()!=null) {
					if(!Data_RS.getField("TestCase_ID").toString().isEmpty()) {
						columns.add(Data_RS.getField("TestCase_ID").toString());
					}
				}
				
			}catch(Exception e ) {
				
			}
			
		}
		connection.close();
		return columns;
		
	}
	
	public Hashtable<String,String> TestCase_Control_Get_Driver_Details(String TestCase_ID) throws FilloException
	{
			String Application = readProperty("Application");
			String Execution_Type = readProperty("Execution_Type");
			Fillo fillo=new Fillo();
			Connection connection=fillo.getConnection(".//Database//"+Application+"//Driver.xlsx");
			Hashtable<String,String> data_values=new Hashtable<String,String>();
			
			String DataQuery = "";
			
			if(Execution_Type.equalsIgnoreCase("NORMAL")) {
				DataQuery="SELECT * FROM TestCase_Control Where Control ='1' and TestCase_ID='"+TestCase_ID+"'";
				
			}else if(Execution_Type.equalsIgnoreCase("REGRESSION")) {
				DataQuery = "SELECT * FROM TestCase_Control Where Regression ='YES' and TestCase_ID='"+TestCase_ID+"'";
						
			}else if(Execution_Type.equalsIgnoreCase("SANITY")) {
				DataQuery = "SELECT * FROM TestCase_Control Where Sanity ='YES' and TestCase_ID='"+TestCase_ID+"'";
						
			}
			
			
			
			
			Recordset Data_RS=connection.executeQuery(DataQuery);
			ArrayList<String> columns=new ArrayList<String>();
			columns=Data_RS.getFieldNames();
			for(int i=1 ;i<columns.size();i++) {
				Data_RS.next();
				String columnName=columns.get(i);
				String columnValue=Data_RS.getField(columnName);
				data_values.put(columnName.trim().toString(), columnValue.trim().toString());
			
			}
			connection.close();
			return data_values;
	}
	
	public static void clearSuites() {
		File Suites_Flolder = new File("./Suites");
		try {
			FileUtils.cleanDirectory(Suites_Flolder);
			System.out.println("directory has been cleaned");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
//Jovita
	
	public synchronized String getAttribute(RemoteWebDriver driver,By locator, String AttributeName) throws Exception {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Data = "";
		WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							String text = ele.getAttribute(AttributeName);
							if(text!=null) {
								if(!text.trim().isEmpty()) {
									Data = text.trim(); 
								}
							}
							
						}
					}
					
				}catch(Exception e) {
					driver.quit();
					throw new Exception();
					
				}
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return Data;
	}
	
	public synchronized void Scroll_To_A_Element(RemoteWebDriver driver, By locator){

		try {
			
			WebElement ele = get_Element(driver, locator);
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView();", ele);
			
		}catch(Exception e) {
			
		}
		

	}
	
	
	
	
	
	
	

	//Purna
	
	public synchronized void Select_Dropdown(String MethodName, RemoteWebDriver driver,By locator,String Data, int timeToWait) throws Exception {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isDisplayed()) {
							Select s=new Select(ele);
							s.selectByVisibleText(Data);
							
							break;
							
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
		
	public synchronized List<WebElement> getAll_Element(RemoteWebDriver driver,By locator) {
		List<WebElement> ele = null;
		try {
			 ele = driver.findElements(locator);
			
		}catch(Exception e ) {
			
		}
		
		return ele;
	}
	
	
	public synchronized String FUll_Page_Screenshot(RemoteWebDriver driver) {

		SimpleDateFormat formatter =new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss.SSS");
		Date date=new Date();
		//File SrcFile= null;
		String imageName="img"+formatter.format(date)+".png";
		//System.out.println(ExtentManager.resultPath);
		String screenshot_path = ExtentManager.resultPath+"\\Screenshots";
		//String screenshot_path ="./Screenshots";
		File file = new File(screenshot_path);
		if(!(file.exists())) {
			file.mkdirs();
		}
		try{
			
			File screenshot = new File(screenshot_path+"\\"+imageName);
			 
			 Screenshot screenshots =new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);             
			  try {                 
			  ImageIO.write(screenshots.getImage(),"PNG",screenshot);             
			} catch (IOException e) {                           
			  e.printStackTrace();  
			 }    
			 
			 
			 
			 
			 
		}catch(Exception e) {
			e.printStackTrace();	
		}
		
		return ".\\Screenshots\\"+imageName;
		
		
	}
	
	
	public synchronized void Info_Full_Page_SS_Old(RemoteWebDriver driver,String Details) {
		try {
			parentTest.get().info(Details,MediaEntityBuilder.createScreenCaptureFromPath(FUll_Page_Screenshot(driver)).build());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//jayashree
	public synchronized void Scroll_Down(RemoteWebDriver driver,By locator) throws Exception {
		try {
			
			WebElement ele = get_Element(driver, locator);
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView();", ele);
			
		}catch(Exception e) {
			
		}
	}
	
	
	
	//date picker
	
	public synchronized String getDate_MM_DD_YYYY(String Date) {
		String value;
		String day ;
		String month = "01" ;
		String year ;
		String[] date = Date.replace("/", "-").split("-");
		day = date[0].trim();
		if(day.length()==1) {
			day="0"+day;
		}
		
		year = date[2].trim();
		int mo = Integer.parseInt(date[1]);
		String first = Month.of(mo).name().toLowerCase().substring(0,1);
		String last = Month.of(mo).name().toLowerCase().substring(1);
		System.out.println(first.toUpperCase()+last);
		String Month = first.toUpperCase()+last;
		
		switch(Month) {
		
			case"January":
				month="01";
				break;
			case"February":
				month="02";
				break;
			case"March":
				month="03";
				break;
			case"April":
				month="04";
				break;
			case"May":
				month="05";
				break;
			case"June":
				month="06";
				break;
			case"July":
				month="07";
				break;
			case"August":
				month="08";
				break;
			case"September":
				month="09";
				break;
			case"October":
				month="10";
				break;
			case"November":
				month="11";
				break;
			case"December":
				month="12";
				break;
			
		}
		
		
		//value = day+"/"+month+"/"+year;
		value = month+"/"+day+"/"+year;
		return value;
		
		
	}
	
	public synchronized String getDate_MMM_YYYY(String Date) {
		String value;
		String year ;
		String[] date = Date.replace("/", "-").split("-");
		year = date[2].trim();
		int mo = Integer.parseInt(date[1]);
		String first = Month.of(mo).name().toLowerCase().substring(0,1);
		String last = Month.of(mo).name().toLowerCase().substring(1);
		String Month = first.toUpperCase()+last;
		
		
		value = Month+" "+year;
		return value;
		
		
	}
	
	public synchronized int getDate_YYYY_From_TestData(String Date) {
		String year ;
		String[] date = Date.replace("/", "-").split("-");
		year = date[2].trim();
		int yr = Integer.parseInt(year);
		return yr;
		
	}
	
	public synchronized int getDate_YYYY_From_Application(String AppDate) {
		String year ;
		String[] date = AppDate.split(" ");
		year = date[1].trim();
		int yr = Integer.parseInt(year);
		return yr;
		
	}
	
	public synchronized int getDate_MM_From_TestData(String Date) {
		String month ;
		String[] date = Date.replace("/", "-").split("-");
		month = date[1].trim();
		int mm = Integer.parseInt(month);
		return mm;
		
	}

	public synchronized int getDate_MM_From_Applicaiton(String MMM) {
		
		int month=0 ;
		
			switch(MMM) {
			
				case"January":
					month=1;
					break;
				case"February":
					month=2;
					break;
				case"March":
					month=3;
					break;
				case"April":
					month=4;
					break;
				case"May":
					month=5;
					break;
				case"June":
					month=6;
					break;
				case"July":
					month=7;
					break;
				case"August":
					month=8;
					break;
				case"September":
					month=9;
					break;
				case"October":
					month=10;
					break;
				case"November":
					month=11;
					break;
				case"December":
					month=12;
					break;
			
		  }
	
		
		return month;
		
	}
	
	
	
	
	
	
	
	//Priya
		public synchronized void Slider_movement(RemoteWebDriver driver, By locator,int x, int y){

			 

	        try {
	            WebElement ele = get_Element(driver, locator);
	            org.openqa.selenium.Dimension dim=ele.getSize();
	            x=dim.getWidth();
	            
	            Actions action = new Actions(driver);
	            action.clickAndHold(ele).moveByOffset(x-350,y).release().build().perform();;
	            
	        }catch(Exception e) {
	            
	        }
	    }
		
		
		public synchronized boolean isEnabled(RemoteWebDriver driver,By locator) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			boolean flag = false;
				WebElement ele = null;
				
				try {
						ele = get_Element(driver, locator);
						if(ele!=null) {
						
						
							if(ele.isEnabled()){
								//ele.click();
								flag = true;
							}
						}
						
					}catch(Exception e) {
						
					}
				
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				return flag;
		}
		
		
		public synchronized void SetInnerText(String MethodName, RemoteWebDriver driver,By locator,String data, int timeToWait) throws Exception  {
			int my_time = 0;
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				while(my_time<timeToWait) {
					my_time = my_time+1;
					WebElement ele = null;
					try {
						ele = get_Element(driver, locator);
						if(ele!=null) {
							if(ele.isEnabled()) {
								JavascriptExecutor js = ((JavascriptExecutor)driver);
								js.executeScript("arguments[0].innerText = '"+data+"';", ele);
								
								break;
							}else {
								Thread.sleep(1000);
							}
						}else {
							Thread.sleep(1000);
						}
						
					}catch(Exception e) {
						Thread.sleep(1000);
					}
				}
				
				if(my_time>=timeToWait) {
					ThrowException(MethodName, driver, locator);
				}
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		
		
		
	//Mobile Application
	//Jovita
		public synchronized void Sendkeys_Clear(String MethodName, AppiumDriver<MobileElement> driver,By locator,String data, int timeToWait) throws Exception  {
			int my_time = 0;
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				while(my_time<timeToWait) {
					my_time = my_time+1;
					MobileElement ele = null;
					try {
						ele = get_AppiumElement(driver, locator);
						if(ele!=null) {
							if(ele.isEnabled()) {
								ele.click();
								Thread.sleep(100);
								//ele.clear();
								Thread.sleep(100);
								ele.sendKeys(data);
								break;
							}else {
								Thread.sleep(1000);
							}
						}else {
							Thread.sleep(1000);
						}
						
					}catch(Exception e) {
						Thread.sleep(1000);
					}
				}
				
				if(my_time>=timeToWait) {
					ThrowException(MethodName, driver, locator);
				}
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		
		public synchronized List<MobileElement> getAll_Element(AppiumDriver<MobileElement> driver,By locator) {
			List<MobileElement> ele = null;
			try {
				 ele = driver.findElements(locator);
				
			}catch(Exception e ) {
				
			}
			
			return ele;
		}
	
		
		public synchronized MobileElement get_Element(AppiumDriver<MobileElement> driver,By locator) {
			MobileElement ele = null;
			try {
				 ele = driver.findElement(locator);
				
			}catch(Exception e ) {
				
			}
			
			return ele;
		}
		public synchronized void Select_Dropdown(String MethodName, AppiumDriver<MobileElement> driver,By locator,String Data, int timeToWait) throws Exception {
			int my_time = 0;
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				while(my_time<timeToWait) {
					my_time = my_time+1;
					MobileElement ele = null;
					try {
						ele = get_Element(driver, locator);
						if(ele!=null) {
							if(ele.isDisplayed()) {
								Select s=new Select(ele);
								s.selectByVisibleText(Data);
								
								break;
								
							}else {
								Thread.sleep(1000);
							}
						}else {
							Thread.sleep(1000);
						}
						
					}catch(Exception e) {
						System.out.println("Exception in catch block");
						Thread.sleep(1000);
					}
				}
				if(my_time>=timeToWait) {
					ThrowException(MethodName, driver, locator);
				}
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
	
	
	
	
	public synchronized void Scroll_To_A_Element(AppiumDriver<MobileElement> driver, By locator){

		try {
			
			MobileElement ele = get_Element(driver, locator);
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView();", ele);
			
		}catch(Exception e) {
			
		}
	}

	public synchronized String FUll_Page_Screenshot(AppiumDriver<MobileElement> driver) {

		SimpleDateFormat formatter =new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss.SSS");
		Date date=new Date();
		//File SrcFile= null;
		String imageName="img"+formatter.format(date)+".png";
		//System.out.println(ExtentManager.resultPath);
		String screenshot_path = ExtentManager.resultPath+"\\Screenshots";
		//String screenshot_path ="./Screenshots";
		File file = new File(screenshot_path);
		if(!(file.exists())) {
			file.mkdirs();
		}
		try{
			
			File screenshot = new File(screenshot_path+"\\"+imageName);
			 
			 Screenshot screenshots =new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);             
			  try {                 
			  ImageIO.write(screenshots.getImage(),"PNG",screenshot);             
			} catch (IOException e) {                           
			  e.printStackTrace();  
			 }    
			 
			 
			 
			 
			 
		}catch(Exception e) {
			e.printStackTrace();	
		}
		
		return ".\\Screenshots\\"+imageName;
		
		
	}
	
	
	
		

// Added By Purna
	
	public synchronized void Navigate_Back(AppiumDriver<MobileElement> driver,String TypeOfDevice) throws Exception {
		try {
			if(TypeOfDevice.contains("ANDROID")) {
				driver.navigate().back();
			}else if(TypeOfDevice.contains("IOS")) {
				//util.get_AppiumElement(driver, login.Done_Btn()).click();
			}
			
		}catch(Exception e) {
			driver.quit();
			throw new Exception();
			
		}
			
	}
	
	
	
	
	
	//Added for IB
	
	public synchronized void Drag_and_Drop(RemoteWebDriver driver, By src,By  desc){

		 

        try {
        	 
     	   Actions moveSlider = new Actions(driver);

     	 //  moveSlider.dragAndDropBy(sliderElement, xOffset, yOffset).release().build();
     	   WebElement ele = get_Element( driver, src);
     	   WebElement ele1 = get_Element( driver,desc);
     	    moveSlider.dragAndDrop(ele,ele1).build().perform();

            
        }catch(Exception e) {
            
        }
    }	
	
	
	public synchronized void doubleClick(RemoteWebDriver driver, By locator){
		try {
        	 WebElement ele = get_Element(driver, locator);
    		//Create object 'action' of an Actions class
    		Actions action = new Actions(driver);
    		//Mouseover on an element
    		action.doubleClick(ele).build().perform();
            
        }catch(Exception e) {
        	System.out.println(e);
            
        }
		   
	}	
	
	public synchronized void ClearText(String MethodName, RemoteWebDriver driver,By locator, int timeToWait) throws Exception  {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							ele.click();
							Thread.sleep(100);
							ele.clear();
							Thread.sleep(100);
							//ele.sendKeys(data);
							break;
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					Thread.sleep(1000);
				}
			}
			
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	
	public synchronized void SendKeys_WithoutClearing_Text(String MethodName, RemoteWebDriver driver,By locator,String data, int timeToWait) throws Exception  {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							ele.click();
							Thread.sleep(100);
							/*ele.clear();
							Thread.sleep(100);*/
							ele.sendKeys(data);
							break;
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					Thread.sleep(1000);
				}
			}
			
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	
	
	

	
	
	public synchronized void Move_To_element(RemoteWebDriver driver, By locator){

		 try {
        	 WebElement ele = get_Element(driver, locator);
    		//Create object 'action' of an Actions class
    		Actions action = new Actions(driver);
    		//Mouseover on an element
    		action.moveToElement(ele).build().perform();
            
        }catch(Exception e) {
        	System.out.println(e);
            
        }
        
	}
	
	
	public synchronized boolean isDisplayedSuccess(RemoteWebDriver driver,By locator) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean flag = false;
			WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isDisplayed()) {
							
							flag = true;
						}
					}
					
				}catch(Exception e) {
					
				}
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return flag;
	}
	
	
	
	public synchronized void Write_Runtime_Data(String Key,String Value) {
			String Application = readProperty("Application");
			File  path = new File("./JsonData/"+Application+"/Output/"+Result_Date);
			if(!(path.exists())) {
				path.mkdirs();
			}
			String[] val = GetOutput_ArrayName().split("::");
			String outputArray = val[0]+"_"+val[1];
			File file = new File("./JsonData/"+Application+"/Output/"+Result_Date+"/"+outputArray+".properties");
			if(!(file.exists())) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
					Properties props = new Properties();
					InputStream input = new FileInputStream(file);
					if(input!=null) {
						 props.load(input);
						 props.setProperty(Key, Value);
						 OutputStream out = new FileOutputStream(file);
						 props.store(out, "Save");
					 }
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	}
	
	public synchronized String Read_Runtime_Data(String Key) {
		
		
		String Application = readProperty("Application");
		String[] val = GetOutput_ArrayName().split("::");
		String outputArray = val[0]+"_"+val[1];
		
		
		File file = new File("./JsonData/"+Application+"/Output/"+Result_Date+"/"+outputArray+".properties");

		
		
		String value = null;
		try{
			FileInputStream stream = new FileInputStream(file);
			Properties pro = new Properties();
			pro.load(stream);
			value = pro.getProperty(Key);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return value;
		
	}
	
	
	
	public synchronized void Drag_and_Drop_By_Coordinates(AppiumDriver<MobileElement> driver, By src, int coordinates){

        try {
        	
        	WebElement ele = get_Element(driver, src);
        	
        	Point location = ele.getLocation();
		    int x = location.getX()+coordinates;
		    int y = location.getY();
		    
            Actions moveSlider = new Actions(driver);
            
            moveSlider.dragAndDropBy(ele, x, y).build().perform();
            
        }catch(Exception e) {
            
        }
    }
	
	
	
	
	
	
	
	
	public synchronized String Full_CaptureScreenshot(RemoteWebDriver driver)
	{
		SimpleDateFormat formatter =new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss.SSS");
		Date date=new Date();
		String imageName="img"+formatter.format(date)+".png";
		String screenshot_path = ExtentManager.resultPath+"\\Screenshots";
		File file = new File(screenshot_path);
		if(!(file.exists())) {
			file.mkdirs();
		}
		try{
			
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			 File screenshot = new File(screenshot_path+"\\"+imageName);
			 FileUtils.copyFile(SrcFile, screenshot);
			 
		}catch(Exception e) {
			e.printStackTrace();	
		}
		
		return screenshot_path+"\\"+imageName;
	}
	
	public synchronized String Full_Page_Scroll(RemoteWebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		long Actual_Height =  (long) ((js.executeScript("return document.body.scrollHeight")));
		System.out.println("Actual Scrollable Height : "+Actual_Height);
		long height = Actual_Height;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		js.executeScript("window.scrollTo(0,0)");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long time = height/650;
		System.out.println("Number of Times to scroll : "+time);
		
		if(Actual_Height>350) {
			if(time==0) {
				time = 1;
			}
		}
		long from = 0;
		long to = from+650;
		String name = Full_CaptureScreenshot(driver);
		
		for(long itr = 0;itr<time;itr++) {
			js.executeScript("window.scrollTo("+from+","+to+")");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			String Local_name = Full_CaptureScreenshot(driver);
			name = name+";"+Local_name;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Name of screenshot : "+name);
			from = from+650;
			to = to+650;
			System.out.println("Iterator is  : "+itr);
			System.out.println("From is : "+from);
			System.out.println("To is  : "+to);
		}
		
		js.executeScript("window.scrollTo(0,0)");
		return name;
		
	}
	
	public synchronized String Integrate_Image(RemoteWebDriver driver) {
		
		ArrayList<BufferedImage> A_Image = new ArrayList<BufferedImage>();
		String Full = Full_Page_Scroll(driver);
		String[] All_Img = Full.split(";");
		//String img = "";
		//int itr = 0;
		for(String each:All_Img) {
			System.out.println("each  : "+each);
			try {
				BufferedImage imgsss = ImageIO.read(new File(each));
				A_Image.add(imgsss);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		int array_Size = A_Image.size();
		int width = A_Image.get(0).getWidth();
		int height = 0;
		for(int newitr = 0;newitr<array_Size;newitr++) {
			int tem_height = A_Image.get(newitr).getHeight();
			height = height+tem_height;
		}
		
		BufferedImage Final_img = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = Final_img.createGraphics();
		Color oldColor = g2.getColor();
		g2.setPaint(Color.white);
		g2.fillRect(0, 0, width, height);
		g2.setColor(oldColor);
		
		g2.drawImage(A_Image.get(0), null, 0, 0);
		int temp_Height = 0;
		for(int newitr = 1;newitr<array_Size;newitr++) {
			temp_Height = temp_Height+A_Image.get(newitr-1).getHeight();
			g2.drawImage(A_Image.get(newitr), null, 0,temp_Height);
		}
		
		g2.dispose();
		
		
		SimpleDateFormat formatter =new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss.SSS");
		Date date=new Date();
		//File SrcFile= null;
		String imageName="img"+formatter.format(date)+".png";
		//System.out.println(ExtentManager.resultPath);
		String screenshot_path = ExtentManager.resultPath+"\\Screenshots";
		//String screenshot_path ="./Screenshots";
		File file = new File(screenshot_path);
		if(!(file.exists())) {
			file.mkdirs();
		}
		
		String directory = screenshot_path+"\\"+imageName;
		try{
			
			ImageIO.write(Final_img, "png", new File(directory));
		}catch(Exception e) {
			e.printStackTrace();	
		}
		
		System.out.println("Final Image name : "+imageName);
		return ".\\Screenshots\\"+imageName;
		
	}
	
	public synchronized void Info_Full_Page_SS(RemoteWebDriver driver,String Details) {
		try {
			parentTest.get().info(Details,MediaEntityBuilder.createScreenCaptureFromPath(Integrate_Image(driver)).build());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
    public synchronized void Move_To_element_Coordinates(RemoteWebDriver driver, By locator,int x,int y){
    	try {
        	 WebElement ele = get_Element(driver, locator);
    		//Create object 'action' of an Actions class
    		Actions action = new Actions(driver);
    		//Mouseover on an element
    		action.moveToElement(ele).build().perform();
            
        }catch(Exception e) {
        	System.out.println(e);
            
        }
        
	}
   
     
     
//Aswini Jul-20

     
     


     public synchronized void Move_To_Top_of_The_Page(RemoteWebDriver driver){

         try {
        	 JavascriptExecutor js = (JavascriptExecutor) driver;
             //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        	 js.executeScript("window.scrollTo(0, 0)");
        }catch(Exception e) {
        System.out.println(e);
        }
     }
     
     public synchronized void Move_To_Buttom_of_The_Page(RemoteWebDriver driver){

         try {
        	 JavascriptExecutor js = ((JavascriptExecutor) driver);
             js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
             Thread.sleep(5000);
        }catch(Exception e) {
        System.out.println(e);
        }
     }
     
	
	
	
     public synchronized void CLose_Window() {
 		try {
 			Robot robot = new Robot();
 			robot.keyPress(KeyEvent.VK_ALT);
 			robot.keyPress(KeyEvent.VK_F4);
 			
 			robot.keyRelease(KeyEvent.VK_F4);
 			robot.keyRelease(KeyEvent.VK_ALT);
 		}catch(Exception e) {
 			
 		}
 		
 	}
	
	
     
	
     public synchronized boolean isDisplayed_Without_isEnabled(AppiumDriver<MobileElement> driver,By locator) throws InterruptedException {
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         boolean flag = false;
         MobileElement ele = null;
                 try {
                     ele = get_AppiumElement(driver, locator);
                     if(ele!=null) {
                         if(ele.isDisplayed()) {
                             flag = true;
                         }
                     }
                    
                 }catch(Exception e) {
                    
                 }
            
             driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
             return flag;
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     //Merged Code 03_Aug *********************************************************************************************
     

 	//jayashree 19-07-2020
 	public synchronized void Slider_movement(AppiumDriver<MobileElement> driver, By locator,int x, int y){

         try {
             WebElement ele = get_Element(driver, locator);
             org.openqa.selenium.Dimension dim=ele.getSize();
             x=dim.getWidth();
             
             Actions action = new Actions(driver);
             action.clickAndHold(ele).moveByOffset(x-350,y).release().build().perform();;
             
         }catch(Exception e) {
             
         }
         
     }
 	
 	// jayashree 23-07-2020
 	public synchronized void Drag_and_Drop(AppiumDriver<MobileElement> driver, By src,By  desc){

         try {
              
             Actions moveSlider = new Actions(driver);

           //  moveSlider.dragAndDropBy(sliderElement, xOffset, yOffset).release().build();
             WebElement ele = get_Element( driver, src);
             WebElement ele1 = get_Element( driver,desc);
              moveSlider.dragAndDrop(ele,ele1).build().perform();
//             moveSlider.dragAndDropBy(src, xOffset, yOffset);
             
         }catch(Exception e) {
             
         }
     } 
 	
 	//Jovita 19-07
	public synchronized void doubleClick(AppiumDriver<MobileElement> driver, By locator){

		 

        try {
        	 MobileElement ele = get_Element(driver, locator);
    		//Create object 'action' of an Actions class
    		Actions action = new Actions(driver);
    		//Mouseover on an element
    		action.doubleClick(ele).build().perform();
            
        }catch(Exception e) {
        	System.out.println(e);
            
        }
		    }	
	
	public synchronized void Press_Tab() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}catch(Exception e) {
			
		}
		
	}

	public synchronized void wait_for_Element_isDisplayed(String MethodName, AppiumDriver<MobileElement> driver,By locator, int timeToWait) throws Exception {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				MobileElement ele = null;
				try {
					ele = get_AppiumElement(driver, locator);
					if(ele!=null) {
						if(ele.isDisplayed()) {
							break;
							
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					System.out.println("Exception in catch block");
					Thread.sleep(1000);
				}
			}
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
				
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public synchronized String getText_isDisplayed(AppiumDriver<MobileElement> driver,By locator) throws Exception {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String Data = "";
		WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isDisplayed()) {
							String text = ele.getText();
							if(text!=null) {
								if(!text.trim().isEmpty()) {
									Data = text.trim(); 
								}
							}
							
						}
					}
					
				}catch(Exception e) {
					driver.quit();
					throw new Exception();
					
				}
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return Data;
	}
	
 	public void ThrowException(String MethodName, AppiumDriver<MobileElement> driver,By locator) throws Exception {
 			
 			
 			Fail(driver, "Failed : As Element not found "+locator.toString());
 			Fail_WithOut_SS("Failed in the Step : "+MethodName);
 			driver.quit();
 			String CaseName = output_Array_Name.get();
 			System.out.println("Case Name is : "+CaseName);
 			JIRA.set(CaseName);
 			throw new Exception();


 	}
 	
 	public synchronized void Click_isDisplayed(String MethodName, AppiumDriver<MobileElement> driver,By locator, int timeToWait) throws Exception {
 		int my_time = 0;
 			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 			while(my_time<timeToWait) {
 				my_time = my_time+1;
 				MobileElement ele = null;
 				try {
 					ele = get_AppiumElement(driver, locator);
 					if(ele!=null) {
 						if(ele.isDisplayed()) {
 							ele.click();
 							break;
 							
 						}else {
 							Thread.sleep(1000);
 						}
 					}else {
 						Thread.sleep(1000);
 					}
 					
 				}catch(Exception e) {
 					System.out.println("Exception in catch block");
 					Thread.sleep(1000);
 				}
 			}
 			if(my_time>=timeToWait) {
 				ThrowException(MethodName, driver, locator);
 				
 			}
 			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 	}
     
     
     
     //jayashree*********************
 	
 	public synchronized void Scroll_To_A_MobileElement(AppiumDriver<MobileElement> driver, MobileElement ele){

		try {
			
			///MobileElement ele = get_Element(driver, locator);
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView();", ele);
			
		}catch(Exception e) {
			
		}
	}
 	
     
 	public synchronized void ClearText(String MethodName, AppiumDriver<MobileElement> driver,By locator, int timeToWait) throws Exception  {
		int my_time = 0;
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			while(my_time<timeToWait) {
				my_time = my_time+1;
				WebElement ele = null;
				try {
					ele = get_Element(driver, locator);
					if(ele!=null) {
						if(ele.isEnabled()) {
							ele.click();
							Thread.sleep(100);
							ele.clear();
							Thread.sleep(100);
							//ele.sendKeys(data);
							break;
						}else {
							Thread.sleep(1000);
						}
					}else {
						Thread.sleep(1000);
					}
					
				}catch(Exception e) {
					Thread.sleep(1000);
				}
			}
			
			if(my_time>=timeToWait) {
				ThrowException(MethodName, driver, locator);
			}
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
 	
 	

    public void ThrowException_DataSetUp() throws Exception {
    	Fail_WithOut_SS("Please varify the Databindings, in driver and test data sheet");
			String CaseName = output_Array_Name.get();
			System.out.println("Case Name is : "+CaseName);
			JIRA.set(CaseName);
			throw new Exception();
    }
    
    public synchronized String getAlphaNumericString(int n) 
    { 
       
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
        

    }
    
	
	public synchronized void switchAppiumContext(String context, AppiumDriver<MobileElement> driver) {
		int num =  getAppiumDriver().getContextHandles().size();
		System.out.println("Num is"+ num);
		
		if(num > 1) {
		
			for(Object contextName : getAppiumDriver().getContextHandles()) {
				System.out.println(contextName.toString());
				if(contextName.toString().toUpperCase().contains(context)) {
					getAppiumDriver().context(contextName.toString());
					
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
		System.out.println(getAppiumDriver().getContext().toString());
		
	}
   

    /**
     * method to long press on specific element by passing locator
     *
     * @param locator element to be long pressed
     */
    public void longPress(By locator,AppiumDriver<MobileElement> driver) {
        try {
            WebElement element = driver.findElement(locator);

            @SuppressWarnings("rawtypes")
			TouchAction touch = new TouchAction((MobileDriver) driver);
            LongPressOptions longPressOptions = new LongPressOptions();
            longPressOptions.withElement(ElementOption.element(element));
            touch.longPress(longPressOptions).release().perform();
           
        } catch (NoSuchElementException e) {
           throw e;
        }

    }
    /**
     * method to long press on specific x,y coordinates
     *
     * @param x x offset
     * @param y y offset
     */
    public void longPress(AppiumDriver<MobileElement> driver,int x, int y) {
        @SuppressWarnings("rawtypes")
		TouchAction touch = new TouchAction((MobileDriver) driver);
        @SuppressWarnings("rawtypes")
		PointOption pointOption = new PointOption();
        pointOption.withCoordinates(x, y);
        touch.longPress(pointOption).release().perform();
       // Log.info("Long press successful on coordinates: " + "( " + x + "," + y + " )");

    }
    
    
    /**
     * method to swipe on the screen on provided coordinates
     *
     * @param startX   - start X coordinate to be tapped
     * @param endX     - end X coordinate to be tapped
     * @param startY   - start y coordinate to be tapped
     * @param endY     - end Y coordinate to be tapped
     * @param duration duration to be tapped
     */

    public void swipe(AppiumDriver<MobileElement> driver,double startX, double startY, double endX, double endY, double duration) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        // swipeObject.put("touchCount", 1.0);
        swipeObject.put("startX", startX);
        swipeObject.put("startY", startY);
        swipeObject.put("endX", endX);
        swipeObject.put("endY", endY);
        swipeObject.put("duration", duration);
        js.executeScript("mobile: swipe", swipeObject);
    }
    
    
}// Class ends*************************

	
	
	
	
	

