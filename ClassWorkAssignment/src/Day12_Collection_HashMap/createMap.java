package Day12_Collection_HashMap;

import java.util.HashMap;

public class createMap {

	public static void main(String[] args) 
	{
		
		HashMap<Integer,String>hm=new HashMap();
		
//		hm.put(101, "Abhishek");
//		hm.put(500, "Chaitanya");
//		hm.put(445, "Nikhil");
//		hm.put(105, "Yuvraj");
//		hm.put(458, "Abhishek");
//		hm.put(123, "Siddhant");
		
		
//		System.out.println(hm.put(1, "pune"));
//		
//		System.out.println(hm.put(3, "mumbai"));
//		
//		System.out.println(hm.put(1,"Nasik"));
		
		
		
		String s=hm.put(2, "pune");
		
		System.out.println(s);
		
		String s1=hm.put(1, "mumbai");
		System.out.println(s1);
		
		String s2=hm.put(1, "Goa");
		System.out.println(s2);
		
		
		
		System.out.println(hm);
		
//		
//		HashMap<String,Float> m=new HashMap();
//		m.put("i", 45.6f);
//		
		
	}

}
