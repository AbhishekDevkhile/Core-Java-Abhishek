package Day7_Array;
/*15. Integer type array contains values like {72, 69, 76, 76, 79}. Write a code to replace 
 each array element by 0 if it ends with 9. So, above array would look 
 like {72, 0, 76, 76, 0}.*/
public class Program15
{

	public static void main(String[] args)
	{
		int arr[]={72,69,76,99,79,56};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%10==9)
			{
				arr[i]=0;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
}
