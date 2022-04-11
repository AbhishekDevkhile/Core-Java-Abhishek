package Day16_Collection_Set;
/*\
 create two set of integer which maintain order take input from user and check that value 
 present in both set or not.
 1.if the number is present in both set then find out its position either same or not.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckValueInTwoSet_FindPostion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Integer>s1=new LinkedHashSet();
		s1.add(101);
		s1.add(102);
		s1.add(103);
		s1.add(104);
		s1.add(105);
		s1.add(106);
		
		Set<Integer>s2=new LinkedHashSet();
		s2.add(111);
		s2.add(112);
		s2.add(103);
		s2.add(114);
		s2.add(115);
		s2.add(101);
		System.out.println("First set:"+s1);
		System.out.println("Second set:"+s2);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter user input:");
		int n=s.nextInt();
		
		boolean b1=false;
		
		
		int count1=1;
		Iterator<Integer>itr1=s1.iterator();
		
		while(itr1.hasNext())
		{
			Integer i=itr1.next();
			if(i==n)
			{
				b1=true;
				break;
			}
			else 
			{
				count1++;
			}
		}
	//	System.out.println(""+count1);
		
		
		boolean b2=false;
		int count2=1;
		Iterator<Integer>itr2=s2.iterator();
		
		while(itr2.hasNext())
		{
			Integer i=itr2.next();
			if(i==n)
			{
				b2=true;
				break;
			}
			else 
			{
				count2++;
			}
		}
	//	System.out.println(""+count2);
		
		if(b1==true && b2==true)
		{
			if(count1==count2)
			{
				System.out.println("Element present in both set in same position");
			}
			else
			{
				System.out.println("Element present in both set in different position");
			}
		}
		else
		{
			System.out.println("Element not present to another set");
			
		}
		

	}

}
