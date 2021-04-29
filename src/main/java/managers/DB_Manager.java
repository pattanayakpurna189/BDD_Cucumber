package managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Manager {

	
public static String getOTP(String Phone) throws InterruptedException
{
	Connection con = null;
	Statement stmt = null;
	//String DB_URL = "jdbc:sqlserver://HOSQLCONS-TST/SQL2012DEV:58247\\SMSGW";
	String DB_URL = "jdbc:sqlserver://HOSQLCONS-TST:58247;instance=SQL2012DEV";
	String otp="";
	//String DB_URL = "jdbc:sqlserver://HOSQLCONS-TST/SQL2012DEV\\SMSGW";
	String User_ID = "smstester1";
	String Password = "smstest$1007";
	String value="";
	String beforeotp = beforeOTP(Phone);
	System.out.println(beforeotp);
	try {
		
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con = DriverManager.getConnection(DB_URL, User_ID, Password);
		
		stmt = con.createStatement();
		String sql = "SELECT * from SMS_OUT";
		ResultSet rs = stmt.executeQuery(sql);
		
		//ResultSetMetaData rsmd = rs.getMetaData();
		
		
		//int columnsNumber =rsmd.getColumnCount();
		Thread.sleep(10000);
		for(int i=0;i<10;i++) {
				while(rs.next()) {
					if (rs.getString("DESTINATION").contains(Phone)) {
					
						if(rs.getString("MSGTEXT").contains("One-Time Password")) {
							value=rs.getString("MSGTEXT");
						}
					}
				}
			
			String[] x=value.split(",");
			otp = x[1].substring(0, 7).trim();
			System.out.println(otp);
			if(!otp.equals(beforeotp)) {
				break;
			}else {
				Thread.sleep(5000);
			}
		}
		
		return otp;
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		//con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return Password;
	
}	




public static String getOTP(String Phone,String oldOTP) throws InterruptedException
{
Connection con = null;
Statement stmt = null;
//String DB_URL = "jdbc:sqlserver://HOSQLCONS-TST/SQL2012DEV:58247\\SMSGW";
String DB_URL = "jdbc:sqlserver://HOSQLCONS-TST:58247;instance=SQL2012DEV";
String otp="";
//String DB_URL = "jdbc:sqlserver://HOSQLCONS-TST/SQL2012DEV\\SMSGW";
String User_ID = "smstester1";
String Password = "smstest$1007";
String value="";
String beforeotp = oldOTP;
System.out.println(beforeotp);
try {
	
	DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
	
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	con = DriverManager.getConnection(DB_URL, User_ID, Password);
	
	stmt = con.createStatement();
	String sql = "SELECT * from SMS_OUT";
	ResultSet rs = stmt.executeQuery(sql);
	
	//ResultSetMetaData rsmd = rs.getMetaData();
	
	
	//int columnsNumber =rsmd.getColumnCount();
	Thread.sleep(10000);
	for(int i=0;i<8;i++) {
			while(rs.next()) {
				if (rs.getString("DESTINATION").contains(Phone)) {
				
					if(rs.getString("MSGTEXT").contains("One-Time Password")) {
						value=rs.getString("MSGTEXT");
						
					}
				}
			}
		
		String[] x=value.split(",");
		otp = x[1].substring(0, 7).trim();
		System.out.println(otp);
		if(!otp.equals(beforeotp)) {
			break;
		}else {
			Thread.sleep(5000);
		}
		
	}
	
	return otp;
	
} catch (ClassNotFoundException e) {
	e.printStackTrace();
	//con.close();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	
	//con.close();
	e.printStackTrace();
}
return Password;

}
	public static void main(String[] args) throws SQLException, InterruptedException {
		
		/*String otp=getOTP("+97400000015");
		System.out.println(otp);*/
		
		
	}	
	public static String beforeOTP(String Phone) throws InterruptedException
	{
		Connection con = null;
		Statement stmt = null;
		//String DB_URL = "jdbc:sqlserver://HOSQLCONS-TST/SQL2012DEV:58247\\SMSGW";
		String DB_URL = "jdbc:sqlserver://HOSQLCONS-TST:58247;instance=SQL2012DEV";
		String otp;
		//String DB_URL = "jdbc:sqlserver://HOSQLCONS-TST/SQL2012DEV\\SMSGW";
		String User_ID = "smstester1";
		String Password = "smstest$1007";
		String value="";
		try {
			
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(DB_URL, User_ID, Password);
			
			stmt = con.createStatement();
			String sql = "SELECT * from SMS_OUT";
			ResultSet rs = stmt.executeQuery(sql);
			
			//ResultSetMetaData rsmd = rs.getMetaData();
			
			
			//int columnsNumber =rsmd.getColumnCount();
			while(rs.next()) {
				
				if (rs.getString("DESTINATION").contains(Phone)) {
					
					if(rs.getString("MSGTEXT").contains("One-Time Password")) {
						value=rs.getString("MSGTEXT");
						
					}
				}
			}
			
			String[] x=value.split(",");
			otp = x[1].substring(0, 7).trim();
			System.out.println(x[1].substring(0, 7).trim());
			return otp;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			//con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			//con.close();
			e.printStackTrace();
		}
		return Password;
		
	}
	

}


