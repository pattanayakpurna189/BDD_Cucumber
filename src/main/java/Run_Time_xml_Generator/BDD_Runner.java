package Run_Time_xml_Generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import org.testng.xml.XmlSuite.ParallelMode;

import Reusable_Methods.Utility;



public class BDD_Runner  {
	
	public void Suite_Generator() throws Exception {
		//TestNG testng = new TestNG();
		Utility util = new Utility();
		//BDD_Runner exe = new BDD_Runner();
	    Utility.clearSuites();
	    List<String> files = new ArrayList<String>();
	    
	    
	    String Application_Name = "";
	    if(Utility.readProperty("Application")!=null) {
			if(!Utility.readProperty("Application").isEmpty()) {
				Application_Name = Utility.readProperty("Application");
			}else {
				throw new Exception("Please provide an ApplicationUnderTest Name in ProjectSetting");
			}
		}else {
			throw new Exception("Please provide an ApplicationUnderTest Name in ProjectSetting");
		}
	    
	    String Threadcount = "";
		String Suite_Name = "";
		String TestClass = "Run_Time_xml_Generator.BDD_TestNG_Runner";
		String TestMethod = "runner_SetUp";
		String TestCase_Name = "";
		//String Module_Name = "";
		
		try{
			if(Utility.readProperty("ThreadCount")!=null) {
				if(!Utility.readProperty("ThreadCount").isEmpty()) {
					Threadcount = Utility.readProperty("ThreadCount");
				}else {
					Threadcount = "1";
				}
			}else {
				Threadcount = "1";
			}
		}catch(Exception e) {
			Threadcount = "1";
		}
		ArrayList<String> getScenarioID =new ArrayList<String>();
		ArrayList<String> getTestcaseID =new ArrayList<String>();
		Hashtable<String,String> DriverDetails=new Hashtable<String,String>();
		
		
		getScenarioID = util.TestCase_Control_Get_ScenarioID();
		
		for(String ScenarioID:getScenarioID) {
			 XmlSuite suite = new XmlSuite();
			Suite_Name = ScenarioID;
			suite.setName(Suite_Name);
			suite.setParallel(ParallelMode.TESTS);
			suite.setThreadCount(Integer.parseInt(Threadcount.trim()));
			//suite.setThreadCount(5);
			//List<XmlSuite> All_tests = new ArrayList<XmlSuite>();
			getTestcaseID = util.TestCase_Control_Get_TestCaseID(ScenarioID);
			try {
				for(String TestCaseID:getTestcaseID) {
					 
					 TestCase_Name=TestCaseID;
					 DriverDetails =util.TestCase_Control_Get_Driver_Details(TestCase_Name);
					
					     if(DriverDetails.get("Environment_DataBindings").contains(";")) {
								String[] Browsers = DriverDetails.get("Environment_DataBindings").split(";");
								String[] Login_DataBindings = DriverDetails.get("Login_DataBindings").split(";");
								String[] DataBindings = DriverDetails.get("DataBindings").split(";");
								
								for(int itr=0;itr<Browsers.length;itr++) {
									
									List<XmlInclude> Inc = new ArrayList<XmlInclude>();
									List<XmlClass> clss = new ArrayList<XmlClass>();
									XmlTest test = new XmlTest();
									XmlClass xc = new XmlClass();
									
									test.setName("ExecuteOn : "+itr+"_"+Browsers[itr]+" || "+TestCase_Name+" : "+DriverDetails.get("TestCase_Description"));//--------------------------------------------------------------
									test.addParameter("Environment", Browsers[itr]);
									test.addParameter("Login_DataBindings", Login_DataBindings[itr]);
									test.addParameter("DataBinding", DataBindings[itr]);
									test.addParameter("SheetName", DriverDetails.get("SheetName"));
									test.addParameter("Feature_File", DriverDetails.get("Feature_File"));
									test.addParameter("Feature_File_Tag", DriverDetails.get("Feature_File_Tag"));
									test.addParameter("StepDefinations", DriverDetails.get("StepDefinations"));
									xc.setName(TestClass);	
									XmlInclude ae = new XmlInclude(TestMethod);
									Inc.add(ae);
									xc.setIncludedMethods(Inc);
									clss.add(xc);
									test.setClasses(clss);
									suite.addTest(test);
									
								}
								
								
							}else {
								List<XmlInclude> Inc = new ArrayList<XmlInclude>();
								List<XmlClass> clss = new ArrayList<XmlClass>();
								XmlTest test = new XmlTest();
								XmlClass xc = new XmlClass();
								
								test.setName("ExecuteOn : "+ DriverDetails.get("Environment_DataBindings")+" || "+TestCase_Name+" : "+DriverDetails.get("TestCase_Description"));//--------------------------------------------------------------
								test.addParameter("Environment", DriverDetails.get("Environment_DataBindings"));
								test.addParameter("Login_DataBindings", DriverDetails.get("Login_DataBindings"));
								test.addParameter("DataBinding", DriverDetails.get("DataBindings"));
								test.addParameter("SheetName", DriverDetails.get("SheetName"));
								test.addParameter("Feature_File", DriverDetails.get("Feature_File"));
								test.addParameter("Feature_File_Tag", DriverDetails.get("Feature_File_Tag"));
								test.addParameter("StepDefinations", DriverDetails.get("StepDefinations"));
								xc.setName(TestClass);	
								XmlInclude ae = new XmlInclude(TestMethod);
								Inc.add(ae);
								xc.setIncludedMethods(Inc);
								clss.add(xc);
								test.setClasses(clss);
								suite.addTest(test);
							}
					    
						
						
					}//Tests for each
				
				//Application_Name
				//File file = new File("./Suites//" + Suite_Name + ".xml");
				File file_Path = new File("./Suites//"+Application_Name);
				if(!file_Path.exists()) {
					file_Path.mkdirs();
				}
				
				File file = new File("./Suites//"+Application_Name+"//" + Suite_Name + ".xml");
				FileWriter writer = new FileWriter(file);
				writer.write(suite.toXml().toString());
				writer.flush();
				writer.close();
				System.out.println("File : "+file.getName());
				files.add("Suites//"+Application_Name+"//" + file.getName());
				
					
					
			}catch(Exception e ) {
				File file_Path = new File("./Suites//"+Application_Name);
				if(!file_Path.exists()) {
					file_Path.mkdirs();
				}
				File file = new File("./Suites//"+Application_Name+"//" + Suite_Name + ".xml");
				FileWriter writer = new FileWriter(file);
				writer.write(suite.toXml().toString());
				writer.flush();
				writer.close();
				System.out.println("File : "+file.getName());
				//files.add("Suites//" + file.getName());
				//files.add("Suites//" + file.getName());
				files.add("Suites//"+Application_Name+"//" + file.getName());
				
			}
			
			     
				
			}//Suite for each
		XmlSuite Final_Suite = new XmlSuite();
		Final_Suite.setName("All_Suites");
		Final_Suite.setSuiteFiles(files);
		File file = new File("./TestNG.xml");
		FileWriter writer = new FileWriter(file);
		writer.write(Final_Suite.toXml().toString());
		writer.flush();
		writer.close();
			
		}//main methods
		
		
		
	//Not used currently***********
	 public void createXmlFile(XmlSuite mSuite, String suite_Name,List<String> files) 
	    { 
	       FileWriter writer; 
	       try { 
	    	   File Suites_Folder = new File(".//Suites");
		   		if(!(Suites_Folder.exists())) {
		   			Suites_Folder.mkdirs();
		   		}
	    	   File file = new File("./Suites//"+suite_Name+".xml");
				
	            writer = new FileWriter(file); 
	            writer.write(mSuite.toXml().toString()); 
	            writer.flush(); 
	            writer.close(); 
	            files.add("Suites/" + suite_Name+".xml");
	         } catch (IOException e)
	            {
	              e.printStackTrace(); 
	            }
	    }
}

