package Day12_Collection_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MapAsValue {

	public static void main(String[] args) {
		HashMap<String,HashMap<String,String>> m=new HashMap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of keys");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter key for map");
			String sk=sc.next();
			HashMap<String,String> m1=new HashMap();
			System.out.println("Enter number of keys of inner hashmap:");
			int mn=sc.nextInt();
			for(int j=0;j<mn;j++) {
				System.out.println("Enter key for inner hashmap:");
				String sk1=sc.next();
				System.out.println("Enter value for inner hashmap:");
				String sv=sc.next();
				m1.put(sk1, sv);
			}
			m.put(sk, m1);
		}
		System.out.println(m);


	}

}
