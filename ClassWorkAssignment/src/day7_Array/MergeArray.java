package day7_Array;
/*Create int typr of array and it merge in third array*/
public class MergeArray {

	public static void main(String[] args) {
		int temp=0;
		int a[]= {1,2,11,4,13,6};
		int b[]= {10,11,12,13,14,15,16};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			//c[a.length]=b[i];
			c[a.length+i]=b[i];
		}
		
		
		System.out.println("Merge array::");
		for(int p:c)
		{
			System.out.print(p+" ");
		}
		


	}

}
