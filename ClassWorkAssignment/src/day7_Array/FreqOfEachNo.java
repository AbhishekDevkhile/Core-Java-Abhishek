package day7_Array;

public class FreqOfEachNo {

	public static void main(String[] args) {
		int a[]= {1,2,4,8,6,3,4,7,5,2,1,4,8,9,4,1};
		for(int  i=0;i<a.length;i++) 
		{	
			int count=1;
			boolean isvisited=false;            //flag initialization 
			
			for(int k=i-1;k>=0;k--)            //check previous element of array
			{
				if(a[i]==a[k])                 //if previous element are same then break loop
				{
					isvisited=true;            //previous num is same then break loop
					break;
				}
			}
			if(isvisited==false)               //flag is false then check condition in loop
			{
			  for(int j=i+1;j<a.length;j++)
			  {
				if(a[i]==a[j])              //check frequency
				{
					count++;                       //if same = counter++
				}
			  }

			  System.out.println(a[i]+"  "+count+"  times");
			}
		
		}
	}
}


