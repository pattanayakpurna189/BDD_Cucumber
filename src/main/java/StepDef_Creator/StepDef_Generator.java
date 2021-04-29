package StepDef_Creator;

import java.io.IOException;
import org.testng.annotations.Test;
import Reusable_Methods.Utility;
import cucumber.runtime.ClassFinder;
import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.RuntimeOptionsFactory;
import cucumber.runtime.io.MultiLoader;
import cucumber.runtime.io.ResourceLoader;
import cucumber.runtime.io.ResourceLoaderClassFinder;
import managers.DataManager;
import managers.DriverManager;


public class StepDef_Generator {
	DriverManager driver =new DriverManager();
	DataManager data = new DataManager();
	private cucumber.runtime.Runtime runtime;
	
	@Test
	public void Generate() {
		String Application_Name = Utility.readProperty("Application");
	     ClassLoader classLoader = getClass().getClassLoader();
	     ResourceLoader resourceLoader = new MultiLoader(classLoader);
	     RuntimeOptionsFactory roFactory = new RuntimeOptionsFactory(getClass());
	     RuntimeOptions ro = roFactory.create();
	     ro.getGlue().clear();
	     ro.getGlue().add(Application_Name+"/StepDefinations/Accounts");
	     ro.getFeaturePaths().add("FeatureFiles/"+Application_Name+"/IB_Accounts.feature");
	     ClassFinder classFinder = new ResourceLoaderClassFinder(resourceLoader, classLoader);
	     runtime = new cucumber.runtime.Runtime(resourceLoader, classFinder, classLoader, ro);
	     try {
			runtime.run();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
