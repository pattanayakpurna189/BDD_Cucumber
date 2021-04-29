package managers;

import java.io.File;
import Reusable_Methods.Utility;
import Runner.Executor;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumManager {

	//public AppiumDriver driver;
	public AppiumDriverLocalService server;
	Utility util = new Utility();
	Executor executor = new Executor();
	DataManager dataManager = new DataManager();
	JsonFileBuilder jsonFileBuilder = new JsonFileBuilder();
	
	public void startAppiumServer(String IPAddress,String PortNumber) {
		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
		// Use any port, in case the default 4723 is already taken (maybe by another Appium server)
		//serviceBuilder.usingAnyFreePort();
		
		// Tell serviceBuilder where node is installed. Or set this path in an environment variable named NODE_PATH
		if(Utility.readProperty("NodeJS_Path")!=null) {
			if(!Utility.readProperty("NodeJS_Path").isEmpty()) {
				serviceBuilder.usingDriverExecutable(new File(Utility.readProperty("NodeJS_Path").toString()));
			}else {
				serviceBuilder.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"));
			}
		}else {
			serviceBuilder.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"));
		}
		
		// Tell serviceBuilder where Appium is installed. Or set this path in an environment variable named APPIUM_PATH
		if(Utility.readProperty("Appium_Desktop_Path")!=null) {
			if(!Utility.readProperty("Appium_Desktop_Path").isEmpty()) {
				serviceBuilder.withAppiumJS(new File(Utility.readProperty("Appium_Desktop_Path").toString()));
			}else {
				serviceBuilder.withAppiumJS(new File("C:\\Program Files\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js"));
			}
		}else {
			serviceBuilder.withAppiumJS(new File("C:\\Program Files\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js"));
		}
		serviceBuilder.withIPAddress(IPAddress);
		int Port = Integer.parseInt(PortNumber);
		serviceBuilder.usingPort(Port);
		server = AppiumDriverLocalService.buildService(serviceBuilder);
		server.start();
		executor.appiumService.add(server);
	}
	
	
	
	/*public void stopAppiumServer(AppiumDriverLocalService server) {
		server.stop();
	
	}*/
	
	
	
	public void StartServer_For_AllDevices() {
		
		String[] All_Devices = JsonFileBuilder.Environment_Name.toString().split(";");
		for(String env : All_Devices ) {
			try {
				System.out.println(env.split("\\.")[0]);
				dataManager.Set_Environment(env.split("\\.")[0]);
				System.out.println(dataManager.Get_Environment().get("IP_Address"));
				System.out.println(dataManager.Get_Environment().get("Port_Number"));
				startAppiumServer(dataManager.Get_Environment().get("IP_Address"), dataManager.Get_Environment().get("Port_Number"));
				System.out.println("Server started for ......"+env.split("\\.")[0]);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public void StopServer_For_AllDevices() {
		
		for(AppiumDriverLocalService env : executor.appiumService ) {
			try {
				//stopAppiumServer(env);
				env.stop();
				System.out.println("Stopped Appium Server");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	

	
	
	
	
	
	
}
