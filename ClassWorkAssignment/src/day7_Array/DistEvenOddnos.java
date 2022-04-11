package day7_Array;

public class DistEvenOddnos {

	public static void main(String[] args) {

		int a[]= {1,23,45,67,4,8,89,88};
		
		int even[]=new int[20];
		int odd[]=new int[20];
		
		int p=0;
		int q=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[p]=a[i];
				p++;
				
			}
			else
			{
				odd[q]=a[i];
				q++;
			}
				
		}
		System.out.println("Even nos are:");
		for(int i=0;i<p;i++)
		{
			System.out.println(even[i]);
		}
		System.out.println("Odd nos are:");
		for(int i=0;i<q;i++)
		{
			System.out.println(odd[i]);
		}

	}

}
