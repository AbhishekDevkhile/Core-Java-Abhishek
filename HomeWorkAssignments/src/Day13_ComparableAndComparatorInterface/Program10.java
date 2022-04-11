package Day13_ComparableAndComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

/*10. Create ArrayList<String> and sort in descending order in different 3 ways*/
public class Program10 {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList();
		s.add("Abhishek");
		s.add("Pratik");
		s.add("Nainesh");
		s.add("Chaitanya");
		s.add("Yuvraj");
		s.add("Pruthviraj");
		s.add("Sanjay");
		s.add("Anil");
		System.out.println("Before Sorting"+s);
		
		Collections.sort(s);
		System.out.println("After Sorting"+s);

	}

}
