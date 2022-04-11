package Day16_Collection_Set;
/*create two set of integer which maintain order take input from user and check that value 
 present in both set or not.
 
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class TwoSetInteger_CheckValuePresentOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Integer>s1=new HashSet();
		s1.add(101);
		s1.add(102);
		s1.add(103);
		s1.add(104);
		s1.add(105);
		s1.add(106);
		
		Set<Integer>s2=new HashSet();
		s2.add(111);
		s2.add(112);
		s2.add(103);
		s2.add(114);
		s2.add(115);
		s2.add(116);
		System.out.println("First set:"+s1);
		System.out.println("Second set:"+s2);
		
		
		
		
		System.out.println("Take input from user:");
		int n=sc.nextInt();
		
	//	System.out.println("Contain all:"+s1.containsAll(s2));
		
		
		//method:1
		/*
		int count1=0;
		Iterator<Integer> itr1=s1.iterator();
		while(itr1.hasNext())
		{
			Integer j=itr1.next();
			if(n==j)
			{
				count1++;
				
			}
		}
		
		int count2=0;
		Iterator<Integer> itr2=s2.iterator();
		while(itr2.hasNext())
		{
			Integer j=itr2.next();
			if(n==j)
			{
				count2++;
			}
		}
		
		
		if(count1==count2)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not match");
		}
       */
		
		//using boolean(flag) 
		
		boolean ispresents1=false;
		
		Iterator<Integer> itr1=s1.iterator();
		while(itr1.hasNext())
		{
			Integer j=itr1.next();
			if(n==j)
			{
				ispresents1=true;
				break;
			}
		}
		boolean ispresents2=false;
		Iterator<Integer> itr2=s2.iterator();
		while(itr2.hasNext())
		{
			Integer j=itr2.next();
			if(n==j)
			{
				ispresents2=true;
				break;
			}
		}
		
		if(ispresents1==ispresents2)
		{
			System.out.println("Element present in both set");
		}
		else
		{
			System.out.println("Element not present to another set");
		}
		
		
	}

}
