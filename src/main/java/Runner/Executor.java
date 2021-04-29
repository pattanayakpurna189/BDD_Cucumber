package Runner;

import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.annotations.Test;
import com.codoid.products.exception.FilloException;
import Run_Time_xml_Generator.BDD_Runner;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import managers.ExtentManager;
import managers.JsonFileBuilder;

public class Executor {
	
	public  ArrayList<AppiumDriverLocalService > appiumService = new ArrayList<AppiumDriverLocalService >();
	
	@Test
	public void A() throws Exception {
		//AppiumManager appManager = new AppiumManager();
		/*ExtentManager extent_manager = new ExtentManager();
		Utility util = new Utility();
		String Application_Type = Utility.readProperty("Application_Type");
		*/
				
		//Excel data to Json file converter****************************************************
		
		JsonFileBuilder js = new JsonFileBuilder();
		try {
			//Clean all Json data files 
			js.clean_Json_Data();
			//Creating Json file from Test Data
			js.Json_Builder_Environment();
			js.Json_Builder_Login();
			js.Json_Builder();
			
		} catch (FilloException e) {
			e.printStackTrace();
		}
		
		//if App type is MOBILE_APP ,then start the appium server as per the devices controlled 1 in TestData file, in Environment sheet*******
		/*if(Application_Type.equalsIgnoreCase("MOBILE_APP")) {
			appManager.StartServer_For_AllDevices();
		}*/
		
		
		//Dynamic Suite creation and Execution*************************************************
		try {
			BDD_Runner runner = new BDD_Runner();
			runner.Suite_Generator();
			TestNG testng = new TestNG();
			List<String> files = new ArrayList<String> ();
			files.add("./TestNG.xml");
			testng.setTestSuites(files);
			testng.run();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception in Executor");
		}
		
		//if App type is MOBILE_APP ,then Stop the running Appium Server****************************************************************
		/*if(Application_Type.equalsIgnoreCase("MOBILE_APP")) {
			appManager.StopServer_For_AllDevices();
		}
		*/
		//Open Execution report**************************************************************
		try {
			//galen.Galen_Dump_Reporting();
			Runtime.getRuntime().exec("taskkill /f /im chrome.exe");
			Runtime.getRuntime().exec("taskkill /f /im msedge.exe");
			 Runtime.getRuntime().exec("taskkill /f /im firefox.exe");
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
			Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");
			
		}catch(Exception e) {
			
		}
		
		try {
			String pp = ExtentManager.resultPath.toString().replace(".", "");
			String path = pp+"\\Execution_Report.html";
			
			String execution = System.getProperty("user.dir")+path;
			System.out.println("Path : "+execution);
			Desktop.getDesktop().browse(new File(execution).toURI());
			System.out.println("Execution completed");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception in Opening Extent Report..........");
		}
		
		
	
	}
	
	/*public static void main(String[] args) throws  IOException, FilloException {
		
		//AppiumManager appManager = new AppiumManager();
		ExtentManager extent_manager = new ExtentManager();
		Utility util = new Utility();
		String Application_Type = Utility.readProperty("Application_Type");
		
				
		//Excel data to Json file converter****************************************************
		
		JsonFileBuilder js = new JsonFileBuilder();
		try {
			//Clean all Json data files 
			js.clean_Json_Data();
			//Creating Json file from Test Data
			js.Json_Builder_Environment();
			js.Json_Builder_Login();
			js.Json_Builder();
			
		} catch (FilloException e) {
			e.printStackTrace();
		}
		
		//if App type is MOBILE_APP ,then start the appium server as per the devices controlled 1 in TestData file, in Environment sheet*******
		if(Application_Type.equalsIgnoreCase("MOBILE_APP")) {
			appManager.StartServer_For_AllDevices();
		}
		
		
		//Dynamic Suite creation and Execution*************************************************
		try {
			BDD_Runner runner = new BDD_Runner();
			runner.Suite_Generator();
			TestNG testng = new TestNG();
			List<String> files = new ArrayList<String> ();
			files.add("./TestNG.xml");
			testng.setTestSuites(files);
			testng.run();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception in Executor");
		}
		
		//if App type is MOBILE_APP ,then Stop the running Appium Server****************************************************************
		if(Application_Type.equalsIgnoreCase("MOBILE_APP")) {
			appManager.StopServer_For_AllDevices();
		}
		
		//Open Execution report**************************************************************
		try {
			//galen.Galen_Dump_Reporting();
			Process pro = Runtime.getRuntime().exec("taskkill /f /im chrome.exe");
			Process pro3 = Runtime.getRuntime().exec("taskkill /f /im msedge.exe");
			Process pro4 = Runtime.getRuntime().exec("taskkill /f /im firefox.exe");
			Process pro1 = Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
			Process pro2 = Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");
			
		}catch(Exception e) {
			
		}
		
		try {
			String pp = ExtentManager.resultPath.toString().replace(".", "");
			String path = pp+"\\Execution_Report.html";
			
			String execution = System.getProperty("user.dir")+path;
			System.out.println("Path : "+execution);
			Desktop.getDesktop().browse(new File(execution).toURI());
			System.out.println("Execution completed");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception in Opening Extent Report..........");
		}
		
		
	}//Main method ending*************************
	
	*/
	
	
	
	
	
	
	
}
