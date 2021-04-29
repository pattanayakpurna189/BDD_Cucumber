package managers;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Reusable_Methods.Utility;

public class ExtentManager {

	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlreporter;
	
	static Utility util = new Utility();
	public static String  resultPath = "";
	public static String  resultdate = "";
	public static String  OutPut_File_Name = "";
	public static String getPath() {
		return Utility.readProperty("Application");
	}

	public static String readCSS() throws IOException {
		return FileUtils.readFileToString(new File(".\\SupportFiles\\Final_Support\\extent.css"), "utf-8");
	}

	public static String readJS() throws IOException {
		return FileUtils.readFileToString(new File(".\\SupportFiles\\Final_Support\\Jquery.js"), "utf-8");
	}
	
	
	
	public static  synchronized ExtentReports ExtentReports_CreateInstance(String Scenario_ID) throws IOException {
		OutPut_File_Name = ExtentManager.Current_Time_Details();
		String Scenario_id= Scenario_ID.trim().toString();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MMM_YYYY");
		Date date = new Date();
		String name = sdf.format(date);
		resultdate = name;
		//resultPath = System.getProperty("user.home")+"\\Results\\"+getPath()+"\\"+name+"\\"+Scenario_id;
		resultPath =".\\Results\\"+getPath()+"\\"+name+"\\"+Scenario_id;
		//System.out.println(resultPath);
		File file = new File(resultPath);
		if(!(file.exists())) {
			file.mkdirs();
		}
		
		file = new File(resultPath+"\\SupportFiles\\flUhRq6tzZclQEJ-Vdg-IuiaDsNa.woff");
		if(!file.exists()) {
			System.out.println(resultPath+"\\SupportFiles\\flUhRq6tzZclQEJ-Vdg-IuiaDsNa.woff");
			System.out.println(".\\SupportFiles\\Final_Support\\flUhRq6tzZclQEJ-Vdg-IuiaDsNa.woff");
			File src = new File(System.getProperty("user.dir")+"\\SupportFiles\\Final_Support\\flUhRq6tzZclQEJ-Vdg-IuiaDsNa.woff");
			//File src = new File(System.getProperty("user.home")+"\\SupportFiles\\Final_Support\\flUhRq6tzZclQEJ-Vdg-IuiaDsNa.woff");
			FileUtils.copyFile(src, file);
			
		}
		
		file = new File(resultPath+"\\SupportFiles\\6xK3dSBYKcSV-LCoeQqfX1RYOo3qOK7j.woff");
		if(!file.exists()) {
			System.out.println(resultPath+"\\SupportFiles\\6xK3dSBYKcSV-LCoeQqfX1RYOo3qOK7j.woff");
			File src = new File(System.getProperty("user.dir")+"\\SupportFiles\\Final_Support\\6xK3dSBYKcSV-LCoeQqfX1RYOo3qOK7j.woff");
			//File src = new File(System.getProperty("user.home")+"\\SupportFiles\\Final_Support\\6xK3dSBYKcSV-LCoeQqfX1RYOo3qOK7j.woff");
			FileUtils.copyFile(src, file);
		}
		
		file = new File(resultPath+"\\SupportFiles\\6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwlxdo.woff");
		if(!file.exists()) {
			System.out.println(resultPath+"\\SupportFiles\\6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwlxdo.woff");
			File src = new File(System.getProperty("user.dir")+"\\SupportFiles\\Final_Support\\6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwlxdo.woff");
			//File src = new File(System.getProperty("user.home")+"\\SupportFiles\\Final_Support\\6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwlxdo.woff");
			FileUtils.copyFile(src, file);
		}
		
		//System.out.println(resultPath);
		htmlreporter = new ExtentHtmlReporter(resultPath+"\\Execution_Report.html");
		htmlreporter.config().setReportName("Automation Execution Report");
		htmlreporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlreporter.config().setChartVisibilityOnOpen(false);
		htmlreporter.config().setTheme(Theme.DARK);
		htmlreporter.config().setEncoding("utf-8");
		htmlreporter.config().setCSS(ExtentManager.readCSS());
		htmlreporter.config().setJS(ExtentManager.readJS());
		htmlreporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		return extent;
	}

	
	
	
	public static String Current_Time_Details() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH_mm_ssss");
		Date date = new Date();
		String name = sdf.format(date);
		return name;
	}
	
	
	
	
	
	
	
	
}
