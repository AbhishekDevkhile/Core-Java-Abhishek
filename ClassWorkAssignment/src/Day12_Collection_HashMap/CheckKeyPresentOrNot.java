 package Day12_Collection_HashMap;
/*create a map which contain string as a key and string as a value.take the input from user and check is input is present 
 * in a map as a key or not . if it is present then display it value.*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CheckKeyPresentOrNot {

	public static void main(String[] args) {
		HashMap<String,String> m=new HashMap();
		m.put("a", "dev");
		m.put("b", "hr");
		m.put("c", "technical");
		m.put("d", "bms");
		m.put("e", "it");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to check");
		String s=sc.next();
		System.out.println("Value associated to "+s+" key is:");
//		for(Map.Entry<String, String> m1:m.entrySet()) {
//			if(s.equalsIgnoreCase(m1.getKey())) {
//				System.out.println(m1.getValue());
//			}
//		}
		
		Set s1=m.entrySet();
		int count=0;
		String str=" ";
		Iterator<Map.Entry<String,String>> it=s1.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> m2=it.next();
			if(s.equalsIgnoreCase(m2.getKey())){
				count++;
				str=m2.getValue();
			}
		}
	
	if(count==1) {
		System.out.println(str);
	}
	else
	{
		System.out.println("key not present in map");
	}
		

	}

}
