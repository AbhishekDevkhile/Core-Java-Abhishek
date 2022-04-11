package Day16_Collection_Set;
import java.util.HashSet;
/*create a integer type of set and take one integer from user .if the input is present
 in the set then display its alternate value.if the alternate number is not present then display null*/
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class IfInputIsMatch_DisplayAlternateNumber_ {

	public static void main(String[] args) {
		HashSet<Integer>lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		lhs.add(60);
		lhs.add(70);
		lhs.add(90);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input:");
		int i=sc.nextInt();
		
		Iterator<Integer>itr=lhs.iterator();
		while(itr.hasNext())
		{
			Integer j=itr.next();
			if(i==j)
			{
				if(itr.hasNext())
				{
					itr.next();
					if(itr.hasNext())
					{
						System.out.println(itr.next());
					}
					else
					{
						System.out.println("null");
					}
				}
				else
				{
					System.out.println("Null");
				}
			}
		}

	}
}


