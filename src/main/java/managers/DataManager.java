package managers;

import java.util.HashMap;

import org.json.simple.JSONObject;

import Reusable_Methods.Utility;

public class DataManager {
	public static ThreadLocal<JSONObject> Pre_Environment = new ThreadLocal<JSONObject>();
	public static ThreadLocal<JSONObject> Environment = new ThreadLocal<JSONObject>();
	public static ThreadLocal<JSONObject> Data_Login = new ThreadLocal<JSONObject>();
	public static ThreadLocal<JSONObject> Data = new ThreadLocal<JSONObject>();
	Utility util =new Utility();
	JsonFileBuilder jb = new JsonFileBuilder();
	
	//Environment*******************************
	public final void setData_Env(String databinding) throws Exception {
		try {
			JSONObject jsonObject = (JSONObject)JsonFileBuilder.readJsonFile_Env(databinding);
			Environment.set(jsonObject);
		}catch(Exception e) {
			//util.Fail_WithOut_SS("Please verify the Data bindings, in driver and test data sheet");
			util.ThrowException_DataSetUp();
		}
	}
	
	@SuppressWarnings("unchecked")
	public HashMap<String,String> getData_Env() {
		return Environment.get();
	}
	
	//Login Test data*******************************
	public final void setData_Login(String databinding) throws Exception {
		try {
			JSONObject jsonObject = (JSONObject)JsonFileBuilder.readJsonFile_LoginData(databinding);
			Data_Login.set(jsonObject);
		}catch(Exception e) {
			util.ThrowException_DataSetUp();
		}
	}
	
	@SuppressWarnings("unchecked")
	public HashMap<String,String> getData_Login() {
		return Data_Login.get();
	}
	
	//Test data*******************************
	public final void setData(String databinding, String SheetName) throws Exception {
		try {
			JSONObject jsonObject = (JSONObject)JsonFileBuilder.readJsonSimpleDemo(databinding+"_"+SheetName);
			Data.set(jsonObject);
		}catch(Exception e) {
			util.ThrowException_DataSetUp();
		}
	}
	
	@SuppressWarnings("unchecked")
	public HashMap<String,String> getData() {
		return Data.get();
	}
	
	//Environment before Access of BDDRunner*******************************
		public final void Set_Environment(String databinding) throws Exception {
			try {
				JSONObject jsonObject = (JSONObject)JsonFileBuilder.readJsonFile_Env(databinding);
				Pre_Environment.set(jsonObject);
			}catch(Exception e) {
				util.ThrowException_DataSetUp();
			}
		}
		
		@SuppressWarnings("unchecked")
		public HashMap<String,String> Get_Environment() {
			return Pre_Environment.get();
		}
}
