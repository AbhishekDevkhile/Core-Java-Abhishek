package Day12_Collection_ArrayList;
/*Create string type of ArrayList and remove only those element which length ia > 5*/
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveThoseLengthMoreThanFive {

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
		System.out.println("Before removing:"+s);
		
		//using Forloop
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).length()>5)
			{
				s.remove(i);
				i--;
			}
			
		}
		System.out.println("After removing:"+s);
		
	/*	
		//Using Iterator
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
		   if(itr.next().length() >= 5)
		   {
		    it.remove();
		   }
		}
		System.out.println("After removing:"+s);
*/
	}

}
