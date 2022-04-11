package JavaTest7;

import java.util.ArrayList;

public class RemoveDuplicateElementFromArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(89);
		a.add(5);
		a.add(11);
		a.add(99);
		a.add(2);
		a.add(17);
		a.add(11);
		a.add(89);
		a.add(17);
		
		System.out.println("Before:"+a);
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i).equals(a.get(j)))
				{
					a.remove(j);
					//j--;
				}
			}
		}
		System.out.println(a);

	}

}
