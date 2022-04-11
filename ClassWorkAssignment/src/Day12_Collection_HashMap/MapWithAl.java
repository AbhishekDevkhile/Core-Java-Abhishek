package Day12_Collection_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapWithAl {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
//		al.add("Suraj");
//		al.add("Abhi");
//		ArrayList<String> al1=new ArrayList();
//		al1.add("Sid");
//		al1.add("Prashant");
//		al1.add("Jayesh");
//		HashMap<Integer,ArrayList<String>> m=new HashMap();
//		m.put(1, al);
//		m.put(2, al1);
		HashMap<Integer,ArrayList<String>> m1=new HashMap();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of keys:");
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			System.out.println("Enter key:");
			int key=sc.nextInt();
			ArrayList<String> al1=new ArrayList();
			System.out.println("Enter number of elements in AL:");
			int n=sc.nextInt();
			for(int j=0;j<n;j++) {
				System.out.println("Enter value:");
				al1.add(sc.next());
			}
			m1.put(key, al1);
		}
		
		
		System.out.println(m1);
		Set s=m1.entrySet();
		Iterator<Map.Entry<Integer, ArrayList<String>>> it=s.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, ArrayList<String>> m2=it.next();
			System.out.println("Key="+m2.getKey());
			System.out.println("Value"+m2.getValue());
		}


	}

}
