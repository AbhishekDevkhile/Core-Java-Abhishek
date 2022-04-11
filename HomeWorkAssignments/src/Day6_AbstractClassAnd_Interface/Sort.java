package Day6_AbstractClassAnd_Interface;

public class Sort {
	public static void main(String[] args) {
		int a[]= {5,4,12,8,9,10,43,7,3,1};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
				    a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[i]);
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i<=a.length-3)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
		
	}
}