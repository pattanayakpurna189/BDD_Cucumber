 package Test_Functions;




import Reusable_Methods.Utility;
import managers.DataManager;

public class TestNG_Executor {
	static DataManager data = new DataManager();
	Utility util = new Utility();
	// String app_name = JsonFileBuilder.Application_Name;
//	@SuppressWarnings({ "unchecked" })
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("./JsonData/IB/Output/AA.json");
//		
//		JSONParser jsonParser = new JSONParser();
//		Object obj = jsonParser.parse(new FileReader(file));
//		JSONArray jsonArray1 = (JSONArray)obj;
//		
//		//String 
//		JSONObject jsonObject =new JSONObject(jsonArray1.toString());
//		JSONArray jsonArray = jsonObject.getJSONArray("accountNumbers");
//		
//	//	
//		//.get("IB_Accounts_TC_001_0_CHROME");
//		
//		System.out.println(jsonArray.toString());
//		//Object main = (Object) jsonParser.parse(jsonArray.toString());
//		
//		//System.out.println(main);
//		
//		/*HashMap<String,String> map = new HashMap<String,String>();
//		JSONObject main = new JSONObject(map);
//		main.putAll(map);
//		System.out.println(main);*/
//		
//		/*JSONObject child = (JSONObject)jsonArray.get("IB_Accounts_TC_001_0_CHROME");
//		System.out.println(child.get("Reference"));*/
//		
//		/*FileReader reader = new FileReader("./JsonData/IB/Output/AA.json");
//	    JSONParser jsonParser1 = new JSONParser();
//	    
//	    
//	    
//	    JsonFileBuilder jb = new JsonFileBuilder();
//		JSONObject jsonObject = (JSONObject)jsonParser1.parse(reader);
//		
//		JSONObject main = new JSONObject();
//		
//		//main.add(jsonObject.get("IB_Accounts_TC_001_0_CHROME"));
//		System.out.println(jsonObject.get("IB_Accounts_TC_001_0_CHROME"));*/
//	    
//		/*JSONArray jsonArray = new JSONArray();
//		jsonArray.add(obj);
//		System.out.println(jsonArray.g);
//		JSONObject main = new JSONObject();*/
//		
//		
//		
//		
//		/*File  path = new File("./JsonData/IB/Output");
//		
//		if(!(path.exists())) {
//			path.mkdirs();
//		}
//		
//		
//		
//		File file = new File("./JsonData/IB/Output/AA.json");
//
//		
//			if(file.length()==0) {
//				System.out.println("File is empty");
//					try {
//						file.createNewFile();
//						JSONObject main = new JSONObject();
//						JSONObject child = new JSONObject();
//						child.put("Reference", "ab1234");
//						child.put("Debit_Acc", "501010");
//						main.put("Case1", child);
//						
//						FileWriter fw = new FileWriter(file);
//						fw.write(main.toJSONString());
//						fw.flush();
//						System.out.println("Done");
//					} catch (IOException e) {
//						System.out.println("Exception");
//						e.printStackTrace();
//					}
//				
//			}else {
//				System.out.println("File is having data");
//				JSONParser jsonParser = new JSONParser();
//				Object obj = jsonParser.parse(new FileReader(file));
//				JSONArray jsonArray = new JSONArray();
//				jsonArray.add(obj);
//				System.out.println(jsonArray);
//				JSONObject main = new JSONObject();
//				JSONObject child = new JSONObject();
//				child.put("Reference", "ab56789");
//				child.put("Debit_Acc", "1111111");
//				main.put("Case2", child);
//				jsonArray.add(main);
//				FileWriter fileoutput = new FileWriter(file);
//				fileoutput.write(jsonArray.toJSONString());
//				fileoutput.flush();
//				fileoutput.close();
//			}*/
//		
//		//System.out.println("Time : "+name);
//		
//	}
//	
//	 
//	
//	
//	
//	
	
	public synchronized String WriteValue(String key) {
		String value = null;
		try{
			//ArrayList<String>  a  = new ArrayList<String>();
			
			/*Parameters params = new Parameters();
			FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
			    new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
			    .configure(params.properties()
			        .setFileName("file.properties"));
			Configuration config = builder.getConfiguration();
			config.setProperty("somekey", "somevalue");
			//builder.save();
*/			
		}catch(Exception e) {
			
		}
		
		return value;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
