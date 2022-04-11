package Day12_Collection_ArrayList;
/*Create one integer type of arraylist and perform the sorting without using sort method.*/
import java.util.ArrayList;

public class SortingWithoutSortMethod 
{
	

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList();
		a.add(89);
		a.add(5);
		a.add(16);
		a.add(99);
		a.add(2);
		a.add(17);
		a.add(11);
		a.add(71);
		a.add(81);
		
		System.out.println("Before sorting:"+a);
		int temp=0;
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i)>a.get(j))
				{
					temp=a.get(i);
					a.set(i,a.get(j));
					a.set(j,temp);
					
				}
			}
			
		}
		System.out.println("After Sorting:"+a);

	}

}
