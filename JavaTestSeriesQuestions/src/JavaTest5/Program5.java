package JavaTest5;
/*5.	How to sort String on their length.
E.g. I Love UK Country
Output -Country Love UK I
*/
public class Program5 
{
	public static void main(String[] args) 
	{
		String str="I Love UK Country";
	     
		String arr[]=str.split(" ");
	
	
	for(int i=0;i<arr.length;i++)
	{
		String temp=" ";
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i].length()>(arr[j].length()) && i!=j  )
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	}
	System.out.println("Sorted String::");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"  ");
	}

  }
}
