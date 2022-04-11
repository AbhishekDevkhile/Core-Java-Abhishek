package Day12_Collection_ArrayList;
/*Write a java code to create arrayList and check its frequency and display its count.*/
import java.util.ArrayList;

public class FrequencyOfString 
{
	public static void main(String[] args) {
			ArrayList<String> s=new ArrayList();
			s.add("Nokia");
			s.add("Samsung");
			s.add("Nokia");
			s.add("Realmi");
			s.add("Oppo");
			s.add("Vivo");
			s.add("One+");
			s.add("Oppo");
			System.out.println("Actual ArrayList:"+s);
		
		
		for(int i=0;i<s.size();i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int j=i-1;j>=0;j--)
			{
				if(s.get(i).equals((s).get(j)))
				{
					isvisited=true;  
					break;
				}
			}
			
			if(isvisited==false)             
			{
			for(int k=i+1;k<s.size();k++)
			{
				if(s.get(i).equals((s).get(k)))              
				{
					count++;                       
				}
			}

			System.out.println(s.get(i)+"  "+count+"  times");
			}
			
		}
		
		
	}

}
