package Day7_Array;
/*13. Write a program to sort array of string in descending order of 
 string length. If two strings have same length sort them in ascending 
 order of alphabets.
E.g. String [] sarr = {“hi”, “how”, “are”, “you”, “doing”}*/


public class Program13
{

	public static void main(String[] args)
	{
		String [] arr = {"hi","how","are","you","doing"};
		
		for(int i=0;i<arr.length;i++)
		{
			String temp=" ";
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])<0 && i!=j  )
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("Sorted element::");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		

	}

}
