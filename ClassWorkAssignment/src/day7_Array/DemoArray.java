package day7_Array;

public class DemoArray {
	
	

	public static void main(String[] args) 
	{	
		int[] a;                       //Declaration
		a=new int[3];                  //Creation
		a[0]=45;                       //initialization
		a[1]=56;
		a[2]=78;
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+"  ");
		}
		
		
		System.out.println("");
		int[] b={1,2,3,4,5};       //Declaration creation and initialization
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
			
		}
		
		
		System.out.println();
		
		
		int[] c=new int[4];
		c[0]=1;
		c[1]=2;
		c[2]=3;
		c[3]=4;
		
		for(int j=0;j<4;j++)
		{
			System.out.print(c[j]+" ");
		}
		
		
		System.out.println(" ");
		System.out.println("Array declaration using foreach loop ");
			int[] d= {34,56,78,25,36,14};
			
			for(int i:d)
			{
				System.out.print(i+" ");
			}
		
		
	}

}
