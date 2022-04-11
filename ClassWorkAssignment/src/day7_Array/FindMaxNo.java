package day7_Array;

public class FindMaxNo {

	public static void main(String[] args) {
		int a[]= {45,12,47,58,96,62,54,82};
//		int temp=0;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		System.out.println(a[a.length-1]);
	
	////////////////////////OR///////////////////////////
		
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(max);
	
	}

}
