package managers;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.codoid.products.exception.FilloException;
import Reusable_Methods.Utility;

public class JsonFileBuilder {
	Utility util =new Utility();
	Hashtable<String,String> map = new Hashtable<String,String>();
	public static String Application_Name = "";	
	public static String Environment_Name = "";	
	
	
	@SuppressWarnings({ "unchecked", "resource" })
	public void Json_Builder() throws IOException, FilloException {
		Application_Name = Utility.readProperty("Application");
		String Json_Folder = ".//JsonData//"+Application_Name+"//TestData";
		
		File  file = new File(Json_Folder);
		
		if(!(file.exists())) {
			file.mkdirs();
		}
		
		ArrayList<String> All_DB = util.TestCase_Control_DataBindings();
		
		for(String each:All_DB) {
			try {
				if(each!=null) {
					if(!each.isEmpty()) {
						String[] raw = each.split("-");
						String DataBinding = raw[0];
						String SheetName = raw[1];
						
						if(DataBinding.contains(";")) {
							String[] DataBindings = DataBinding.split(";");
							
							for(int itr=0;itr<DataBinding.length();itr++) {
								file = new File(Json_Folder+"//"+DataBindings[itr]+"_"+SheetName+".json");
								if(file.exists()) {
									System.out.println("File Existed....");
								}else {
									try {
										file.createNewFile();
										JSONObject json = new JSONObject();
										map = util.get_TestData(DataBindings[itr], SheetName);
										json.putAll(map);
										System.out.println("Map is :"+map);
										FileWriter fw = new FileWriter(file);
										fw.write(json.toJSONString());
										fw.flush();
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
								
								
							}
							
						}else {
							file = new File(Json_Folder+"//"+DataBinding+"_"+SheetName+".json");
							if(file.exists()) {
								System.out.println("File Existed....");
							}else {
								try {
									file.createNewFile();
									JSONObject json = new JSONObject();
									map = util.get_TestData(DataBinding, SheetName);
									json.putAll(map);
									System.out.println("Map is :"+map);
									FileWriter fw = new FileWriter(file);
									fw.write(json.toJSONString());
									fw.flush();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
							
						}
						
						Thread.sleep(100);
					}
				}
			}catch(Exception e ) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	  
	public static Object readJsonSimpleDemo(String filename) throws Exception {
		String Json_Folder = ".//JsonData//"+Application_Name+"//TestData";
	    FileReader reader = new FileReader(Json_Folder+"//"+filename+".json");
	    JSONParser jsonParser = new JSONParser();
	    return jsonParser.parse(reader);
	}
	
	@SuppressWarnings({ "unchecked", "resource" })
	public void Json_Builder_Environment() throws IOException, FilloException {
		Application_Name = Utility.readProperty("Application");
		String Json_Folder = ".//JsonData//"+Application_Name+"//Environment";
		
		File  file = new File(Json_Folder);
		
		if(!(file.exists())) {
			file.mkdirs();
		}
		
		ArrayList<String> All_DB = util.TestData_Control_Envi_Login("Environment");
		
		for(String each:All_DB) {
			try {
				if(!each.isEmpty()) {
					String DataBinding = each;
					String Sheetname = "Environment";
					
					file = new File(Json_Folder+"//"+DataBinding+".json");
					if(file.exists()) {
						System.out.println("File Existed....");
					}else {
						try {
							file.createNewFile();
							JSONObject json = new JSONObject();
							map = util.get_TestData(DataBinding, Sheetname);
							json.putAll(map);
							System.out.println("Map is :"+map);
							FileWriter fw = new FileWriter(file);
							fw.write(json.toJSONString());
							fw.flush();
							Thread.sleep(100);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
					System.out.println("Environment file name is : "+file.getName());
					if(!Environment_Name.isEmpty()) {
						Environment_Name = Environment_Name+";"+file.getName();
					}else {
						Environment_Name = file.getName();
					}
					
					
				};
			}catch(Exception e ) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	@SuppressWarnings({ "unchecked", "resource" })
	public void Json_Builder_Login() throws IOException, FilloException {
		Application_Name = Utility.readProperty("Application");
		String Json_Folder = ".//JsonData//"+Application_Name+"//Login";
		
		File  file = new File(Json_Folder);
		
		if(!(file.exists())) {
			file.mkdirs();
		}
		
		ArrayList<String> All_DB = util.TestData_Control_Envi_Login("Login");
		
		for(String each:All_DB) {
			try {
				if(!each.isEmpty()) {
					String DataBinding = each;
					String Sheetname = "Login";
					
					file = new File(Json_Folder+"//"+DataBinding+".json");
					if(file.exists()) {
						System.out.println("File Existed....");
					}else {
						try {
							file.createNewFile();
							JSONObject json = new JSONObject();
							map = util.get_TestData(DataBinding, Sheetname);
							json.putAll(map);
							System.out.println("Map is :"+map);
							FileWriter fw = new FileWriter(file);
							fw.write(json.toJSONString());
							fw.flush();
							Thread.sleep(100);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
				};
			}catch(Exception e ) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	
	public static Object readJsonFile_Env(String filename) throws Exception {
		String Json_Folder = ".//JsonData//"+Application_Name+"//Environment";
		
	    FileReader reader = new FileReader(Json_Folder+"//"+filename+".json");
	    JSONParser jsonParser = new JSONParser();
	    return jsonParser.parse(reader);
	}
	
	public static Object readJsonFile_LoginData(String filename) throws Exception {
		String Json_Folder = ".//JsonData//"+Application_Name+"//Login";
	    FileReader reader = new FileReader(Json_Folder+"//"+filename+".json");
	    JSONParser jsonParser = new JSONParser();
	    return jsonParser.parse(reader);
	}
	
	public void clean_Json_Data() {
		Application_Name = Utility.readProperty("Application");
		String Json_Folder = ".//JsonData//"+Application_Name+"//TestData";
		File file = new File(Json_Folder);
		if(file.isDirectory()) {
			try {
				FileUtils.cleanDirectory(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Clean");
		}
		
		
		Json_Folder =".//JsonData//"+Application_Name+"//Login";
		file = new File(Json_Folder);
		if(file.isDirectory()) {
			try {
				FileUtils.cleanDirectory(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Clean");
		}
		
		Json_Folder = ".//JsonData//"+Application_Name+"//Environment";
		file = new File(Json_Folder);
		//System.out.println(file);
		if(file.isDirectory()) {
			try {
				FileUtils.cleanDirectory(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Clean");
		}
		
		Json_Folder = ".//JsonData//"+Application_Name+"//Output";
		file = new File(Json_Folder);
		//System.out.println(file);
		if(file.isDirectory()) {
			try {
				FileUtils.cleanDirectory(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Clean");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
