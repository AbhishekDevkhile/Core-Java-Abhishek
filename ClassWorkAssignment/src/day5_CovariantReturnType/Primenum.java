package day5_CovariantReturnType;

public class Primenum {
	
	boolean isCheckvalid(int num)
	{
		boolean flag;
		int i=2;
		int temp=0;
		for( ;i<=num-1;i++)
		{
			if(num % i==0)
			{
				temp=temp+1;
			}	
		}
		if(temp>0)
		{
			flag=false;
			return flag;
		}
		else
		{
			flag=true;
			return flag;
		}
		
	}

	public static void main(String[] args) {
		Primenum p=new Primenum();
		System.out.println(p.isCheckvalid(3));

	}

}
