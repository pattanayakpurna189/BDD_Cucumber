package Run_Time_xml_Generator;



import cucumber.runtime.ClassFinder;
import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.RuntimeOptionsFactory;
import cucumber.runtime.io.MultiLoader;
import cucumber.runtime.io.ResourceLoader;
import cucumber.runtime.io.ResourceLoaderClassFinder;
import managers.DataManager;
import managers.DriverManager;
import managers.ExtentManager;
import java.io.IOException;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import Reusable_Methods.Utility;



public class BDD_TestNG_Runner {
	
	DriverManager driver =new DriverManager();
	DataManager data = new DataManager();
	private cucumber.runtime.Runtime runtime;
	private static ExtentReports extent=null;
	Utility util = new Utility();
	public static String  CaseName ;
	 
	 
		
		@BeforeSuite
		public synchronized void onSuiteStart(ITestContext context) throws IOException {
			extent = ExtentManager.ExtentReports_CreateInstance(context.getCurrentXmlTest().getSuite().getName());
		}
		
		@SuppressWarnings("static-access")
		@BeforeTest
		public synchronized void onTestStart(ITestContext context) throws IOException {
			System.out.println(context.getName());
			//System.out.println(context.getCurrentXmlTest().getSuite().getName());
			String[] Full = context.getName().toString().split("\\|\\|");
			String Execute_On = Full[0];
			String[] Exe = Execute_On.split(":");
			String Browser = Exe[1].trim();
			String[] des = Full[1].split(":");
			String TestCase_ID = des[0].trim();
			String TestCase_Description = des[1];
			util.output_Array_Name.set(TestCase_ID+"::"+Browser);
			ExtentTest parent= extent.createTest("Scenario ID : <b>"+context.getCurrentXmlTest().getSuite().getName()+"</b><br>TestCase ID : <b>"+TestCase_ID+"</b><br>Description : <b>"+TestCase_Description+"</b>","<b>"+Execute_On+"</b>");
			util.parentTest.set(parent);
			 
		 }
		
		@AfterTest
		public synchronized void onFinish(ITestContext context) { 

			extent.flush();
			
			/*System.out.println("Result is : "+context.getFailedTests().toString());
			  IResultMap failedTests = context.getFailedTests();
			  System.out.println("Failed Test " + failedTests.getAllResults());*/
			
			//if()
			 
			/*if((util.JIRA.get())!=null) {
				String[] xx = util.JIRA.get().split("::");
				System.out.println("Failed Test case in onFinidh Test" +xx[0]);
				if(CaseName!=null) {
					if(!CaseName.trim().isEmpty()) {
						CaseName =CaseName+";"+ xx[0];
					}else {
						CaseName = xx[0];
					}
				}else {
					CaseName = xx[0];
				}
				
				System.out.println("Final : "+CaseName);
			}*/
			
			
		 }
	 
	 
		
	 
	 @Test
	 @Parameters({"DataBinding", "SheetName","Feature_File", "Feature_File_Tag","StepDefinations","Environment","Login_DataBindings"})
	public synchronized void runner_SetUp(String DataBinding, String SheetName,String Feature_File, String Feature_File_Tag,String StepDefinations, String Environment, String Login_DataBindings) throws IOException {
		try {
			 String Application_Name = Utility.readProperty("Application");
		     ClassLoader classLoader = getClass().getClassLoader();
		     ResourceLoader resourceLoader = new MultiLoader(classLoader);
		     RuntimeOptionsFactory roFactory = new RuntimeOptionsFactory(getClass());
		     RuntimeOptions ro = roFactory.create();
		     ro.getGlue().clear();
		     ro.getGlue().add(Application_Name+"/"+StepDefinations);
		     
		     //ro.getGlue().add("Applications/IB/StepDefinations/Accounts");
		     ro.getFeaturePaths().add("./FeatureFiles/"+Application_Name+"/"+Feature_File);
		     ro.getFilters().add(Feature_File_Tag);
		    
		     ClassFinder classFinder = new ResourceLoaderClassFinder(resourceLoader, classLoader);
		     runtime = new cucumber.runtime.Runtime(resourceLoader, classFinder, classLoader, ro);
		     
		     Utility.DataBinding.set(DataBinding);
		     Utility.SheetName.set(SheetName);
		     Utility.Environment.set(Environment);
		     Utility.Login_DataBinding.set(Login_DataBindings);
		     runtime.run();
		     
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception in BDD Dynamic Runner");
			util.Fail_WithOut_SS("Unable to execute the Case : <b>"+Feature_File_Tag+"</b>");
			util.getDriver().quit();
		}
	}
	 
	 
	 
	
}
