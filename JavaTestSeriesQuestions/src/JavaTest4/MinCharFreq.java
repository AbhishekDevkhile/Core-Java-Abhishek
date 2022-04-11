
package JavaTest4;

public class MinCharFreq {

	public static void main(String[] args) {
		char arr[]={'a','b','b','c','c','b'};
		for(int  i=0;i<arr.length;i++) 
		{	
			int count=1;
			boolean isvisited=false;            //flag initialization 
			
			for(int k=i-1;k>=0;k--)            //check previous element of array
			{
				if(arr[i]==arr[k])                 //if previous element are same then break loop
				{
					isvisited=true;            //previous num is same then break loop
					break;
				}
			}
			if(isvisited==false)               //flag is false then check condition in loop
			{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])              //check frequency
				{
					count++;                       //if same = counter++
				}
			}
			if(count==1)
			{
				System.out.println(arr[i]+"  "+count+"  times");
			}

			
			}
			
	   
		         
 
		}}}		
	
	


