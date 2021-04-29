package Test_Functions;




import java.util.Arrays;
import java.util.HashSet;
import org.testng.annotations.Test;
import Reusable_Methods.Utility;
import managers.DataManager;
import managers.DriverManager;

public class Test1 extends BaseTest {
	Test2 t=new Test2();
	DriverManager driver =new DriverManager();
	DataManager data = new DataManager();
	Utility util = new Utility();
	/*
	@Test(priority = -1)
	public void m1() {
		System.out.println("m1");			
	}
	@Test(priority = 0)
	public void m2() {
		System.out.println("m2");			
	}
	@Test
	public void m3() {
		System.out.println("m3");			
	}
	@Test
	public void abc() {
		System.out.println("abc");			
	}
	
	
	*/
	
	
	/*@Test
	public void abc() {
		System.out.println("abc");	
		String s = "2a5b6s";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;) {
			char v = ch[i];
			
			int number = Integer.valueOf(String.valueOf(v));
			char a = ch[i+1];
			for(int j=1;j<=number;j++) {
				System.out.print(a+" ");
			}
			i=i+2;
		}
	}*/
	
	/*@Test
	public void abc() {
		System.out.println("abc");	
		String s = "2a5b6s2f";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char v = ch[i];
			
			int number = Integer.valueOf(String.valueOf(v));
			char a = ch[i+1];
			for(int j=1;j<=number;j++) {
				System.out.print(a+" ");
			}
			System.out.println();
			i++;
		}
	}*/
	
	
	@Test
	public void abc() {
		//Convert array to hashset and again from collection to array
		String[] ar = {"Ele1", "Ele2"};
		
		
		 HashSet<String> hset = new HashSet<String>(Arrays.asList(ar));
		
	     //add elements to HashSet
		 hset.add("Ele2");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating an Array
	     String[] array = new String[hset.size()];
	     hset.toArray(array);
	     for(String x:array) {
	    	 System.out.println(x);
	     }
	}
	
	
	
	
	
	

}
