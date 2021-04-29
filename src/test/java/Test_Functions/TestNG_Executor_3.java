package Test_Functions;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.ParallelMode;
import org.testng.xml.XmlTest;

public class TestNG_Executor_3 {

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		 List<XmlSuite> All_Suites = new ArrayList<XmlSuite>();
		TestNG_Executor_3 exe = new TestNG_Executor_3();
		XmlSuite suite = new XmlSuite();
		
		String[] testclass = "Runner.BDD_TestNG_Runner;Runner.Runner1".split(";");
		String[] testMethods = "AAAAAA;BBBBBB".split(";");
		for(int i = 0;i<testclass.length;i++) {
			List<XmlInclude> Inc = new ArrayList<XmlInclude>();
			List<XmlClass> clss = new ArrayList<XmlClass>();
			XmlTest test = new XmlTest();
			XmlClass xc = new XmlClass();
			test.setName(testMethods[i]);//--------------------------------------------------------------
			test.addParameter("DataBinding", "Card2");
			test.addParameter("SheetName", "Transfer");
			xc.setName(testclass[i]);	
			
			XmlInclude ae = new XmlInclude(testMethods[i]);
			Inc.add(ae);
			xc.setIncludedMethods(Inc);
			clss.add(xc);
			test.setClasses(clss);
			suite.addTest(test);
		}
		suite.setName("BDD_sUITE");
		All_Suites.add(suite);
		suite.setParallel(ParallelMode.TESTS);
		
		    
		    exe.createXmlFile(suite);
		    testng.setXmlSuites(All_Suites);	  
		   testng.run();
		     
		    System.out.println("Done");
		    
	}
	
	
	 public void createXmlFile(XmlSuite mSuite) 
	    { 
	       FileWriter writer; 
	       try { 
	            writer = new FileWriter(new File(".//Suites//myTemp.xml")); 
	            writer.write(mSuite.toXml()); 
	            writer.flush(); 
	            writer.close(); 
	                   
	         } catch (IOException e)
	            {
	              e.printStackTrace(); 
	            }
	    }

}
