package Day7_Array;

import java.util.Scanner;

/*9.WAP to find and count total number of duplicate elements in an array.*/
public class Program9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		System.out.println("Enter element: ");
		int a[]=new int[size];
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		int counter=0;
		for(int i=0;i<a.length;i++)
		{
			boolean isflag=false;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] )
				{
					isflag=true;
					count++;                                //if same that time count increace 
				}
			}
			if(count>1)                       
			{
				counter++;                                  //if count>1 then actual counter increase
				System.out.println(a[i]+"    "+count);
				
			}
			
		}
		System.out.println("Count total number of duplicate elements: "+counter);
		
	

	}

}
