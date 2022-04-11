package day4_MethodQuestion;

public class factor {
	
	public int method1(int no)
	{
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
	            sum=sum+i; 
		}
			
		return sum;
	}
	

	public static void main(String[] args) {
		factor f=new factor();
		
		System.out.println(f.method1(9));
	}

}
